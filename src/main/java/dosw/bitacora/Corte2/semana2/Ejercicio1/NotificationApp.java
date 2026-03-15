package dosw.bitacora.Corte2.semana2.Ejercicio1;

import java.util.List;

public class NotificationApp {

    public static void main(String[] args) {

        NotificationService service = NotificationService.getInstance();

        List<String> mensajes = List.of(
                "Bienvenido",
                "Su pedido fue enviado",
                "Tiene una nueva promoción"
        );

        service.setStrategy(new EmailNotification());

        mensajes.stream()
                .forEach(m -> service.sendNotification(m));
    }
}
