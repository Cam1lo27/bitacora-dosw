package dosw.bitacora.Corte1.semana2.patrones.Factory;

public class SmsNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}