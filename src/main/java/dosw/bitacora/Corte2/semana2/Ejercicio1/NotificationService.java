package dosw.bitacora.Corte2.semana2.Ejercicio1;

public class NotificationService {

    private static NotificationService instance;
    private NotificationStrategy strategy;

    private NotificationService(){}

    public static NotificationService getInstance() {
        if(instance == null){
            instance = new NotificationService();
        }
        return instance;
    }

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void sendNotification(String message){
        if(strategy != null){
            strategy.send(message);
        }
    }
}
