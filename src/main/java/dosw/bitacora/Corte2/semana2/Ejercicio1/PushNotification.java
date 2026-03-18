package dosw.bitacora.Corte2.semana2.Ejercicio1;

public class PushNotification implements NotificationStrategy {

    @Override
    public void send(String message) {
        System.out.println("Enviando Push: " + message);
    }
}
