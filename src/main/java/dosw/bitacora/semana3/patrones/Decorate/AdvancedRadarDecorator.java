//8) Decorator
//¿Qué es?
//Agrega comportamiento adicional a un objeto dinámicamente sin modificar su clase.
//¿Para qué problemas sirve?
//Combinación de responsabilidades opcionales como logging, encriptación, compresión.
//
//
//interface Notificador { void enviar(String msg); }
//class NotificadorBase implements Notificador {
//    public void enviar(String msg){ System.out.println("Enviando: " + msg); }
//}
//class NotificadorDecorador implements Notificador {
//    protected Notificador wrappee;
//    NotificadorDecorador(Notificador n){ wrappee = n; }
//    public void enviar(String msg){ wrappee.enviar(msg); }
//}
//class NotificadorConLog extends NotificadorDecorador {
//    NotificadorConLog(Notificador n){ super(n); }
//    public void enviar(String msg){
//        System.out.println("LOG: enviando mensaje");
//        super.enviar(msg);
//    }
//}
//public class DecoratorDemo {
//    public static void main(String[] args) {
//        Notificador n = new NotificadorConLog(new NotificadorBase());
//        n.enviar("Hola");
//    }
//}


package dosw.bitacora.semana3.patrones.Decorate;

public class AdvancedRadarDecorator extends ShipDecorator {

    public AdvancedRadarDecorator(Ship wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription() + " + RadarAvanzado";
    }

    @Override
    public int getAttack() {
        return wrappee.getAttack() + 10;
    }
}
