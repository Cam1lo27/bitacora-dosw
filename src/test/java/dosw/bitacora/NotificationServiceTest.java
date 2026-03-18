package dosw.bitacora;

import dosw.bitacora.Corte2.semana2.Ejercicio1.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {

    @Test
    void testSingletonInstance() {

        NotificationService s1 = NotificationService.getInstance();
        NotificationService s2 = NotificationService.getInstance();

        assertSame(s1, s2);
    }

    @Test
    void testEmailStrategy() {

        NotificationService service = NotificationService.getInstance();
        service.setStrategy(new EmailNotification());

        service.sendNotification("Mensaje Email");
    }

    @Test
    void testSMSStrategy() {

        NotificationService service = NotificationService.getInstance();
        service.setStrategy(new SMSNotification());

        service.sendNotification("Mensaje SMS");
    }

    @Test
    void testPushStrategy() {

        NotificationService service = NotificationService.getInstance();
        service.setStrategy(new PushNotification());

        service.sendNotification("Mensaje Push");
    }

    @Test
    void testStrategyChangeMultipleTimes() {

        NotificationService service = NotificationService.getInstance();

        service.setStrategy(new EmailNotification());
        service.sendNotification("email");

        service.setStrategy(new SMSNotification());
        service.sendNotification("sms");

        service.setStrategy(new PushNotification());
        service.sendNotification("push");

        service.setStrategy(new EmailNotification());
        service.sendNotification("otro email");
    }

    @Test
    void testMultipleMessagesStream() {

        NotificationService service = NotificationService.getInstance();
        service.setStrategy(new EmailNotification());

        List<String> mensajes = List.of("A","B","C","D","E");

        mensajes.stream().forEach(service::sendNotification);
    }

    @Test
    void testWithoutStrategy() {

        NotificationService service = NotificationService.getInstance();

        service.setStrategy(null);

        service.sendNotification("mensaje sin estrategia");
    }

    @Test
    void testMultipleInstancesSameObject() {

        NotificationService s1 = NotificationService.getInstance();
        NotificationService s2 = NotificationService.getInstance();
        NotificationService s3 = NotificationService.getInstance();

        assertSame(s1, s2);
        assertSame(s2, s3);
    }

    @Test
    void testSendManyNotifications() {

        NotificationService service = NotificationService.getInstance();
        service.setStrategy(new EmailNotification());

        for(int i=0;i<10;i++){
            service.sendNotification("msg "+i);
        }
    }

    @Test
    void testSwitchStrategiesRepeatedly() {

        NotificationService service = NotificationService.getInstance();

        service.setStrategy(new EmailNotification());
        service.sendNotification("1");

        service.setStrategy(new SMSNotification());
        service.sendNotification("2");

        service.setStrategy(new PushNotification());
        service.sendNotification("3");

        service.setStrategy(new SMSNotification());
        service.sendNotification("4");

        service.setStrategy(new EmailNotification());
        service.sendNotification("5");
    }

    @Test
    void testStrategyNullThenSet() {

        NotificationService service = NotificationService.getInstance();

        service.setStrategy(null);
        service.sendNotification("sin estrategia");

        service.setStrategy(new EmailNotification());
        service.sendNotification("con estrategia");
    }

    @Test
    void testEmailDirect() {

        EmailNotification email = new EmailNotification();
        email.send("mensaje");

        assertNotNull(email);
    }

    @Test
    void testSMSDirect() {

        SMSNotification sms = new SMSNotification();
        sms.send("mensaje");

        assertNotNull(sms);
    }

    @Test
    void testPushDirect() {

        PushNotification push = new PushNotification();
        push.send("mensaje");

        assertNotNull(push);
    }

    @Test
    void testServiceWithDifferentStrategies() {

        NotificationService service = NotificationService.getInstance();

        service.setStrategy(new EmailNotification());
        service.sendNotification("A");

        service.setStrategy(new SMSNotification());
        service.sendNotification("B");

        service.setStrategy(new PushNotification());
        service.sendNotification("C");
    }

}