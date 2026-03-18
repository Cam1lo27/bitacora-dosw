package dosw.bitacora.Corte1.semana2.patrones.Factory;

public class SmsNotification implements Notification {
    @Override
    public void send(String to, String message) {
        System.out.println("SMS Enviando a " + to + ": " + message);
    }
}