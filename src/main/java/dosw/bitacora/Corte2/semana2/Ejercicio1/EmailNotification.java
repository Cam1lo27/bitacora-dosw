package dosw.bitacora.Corte2.semana2.Ejercicio1;

public class EmailNotification implements NotificationStrategy {

    @Override
    public void send(String message) {
        System.out.println("Enviando Email: " + message);
    }
}
