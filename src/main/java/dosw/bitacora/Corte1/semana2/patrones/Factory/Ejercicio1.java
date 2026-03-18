package dosw.bitacora.Corte1.semana2.patrones.Factory;

public class Ejercicio1 {
    public static void main(String[] args) {
        sendWelcome(new EmailNotificationFactory(), "andres.vivas-b@mail.escuelaing.edu.co");
        sendWelcome(new SmsNotificationFactory(), "+57 3115132344");
        sendWelcome(new PushNotificationFactory(), "user-123");
    }

    private static void sendWelcome(NotificationFactory factory, String to) {
        Notification notification = factory.createNotification();
        notification.send(to, "¡Bienvenido!");
    }
}