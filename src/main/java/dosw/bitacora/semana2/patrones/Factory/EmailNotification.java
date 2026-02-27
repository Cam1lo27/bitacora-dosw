package dosw.bitacora.semana2.patrones.Factory;

public class EmailNotification implements Notification {
    @Override
    public void send(String to, String message) {
        System.out.println("EMAIL Enviando a " + to + ": " + message);
    }
}
