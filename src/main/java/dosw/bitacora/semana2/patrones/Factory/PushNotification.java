package dosw.bitacora.semana2.patrones.Factory;

public class PushNotification implements Notification {
    @Override
    public void send(String to, String message) {
        System.out.println("PUSH Enviando a " + to + ": " + message);
    }
}