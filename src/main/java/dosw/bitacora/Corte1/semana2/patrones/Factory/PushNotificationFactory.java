package dosw.bitacora.Corte1.semana2.patrones.Factory;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
