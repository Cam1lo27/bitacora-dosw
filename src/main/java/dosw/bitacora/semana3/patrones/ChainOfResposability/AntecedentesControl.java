//5) Chain of Responsibility
//¿Qué es?
//Pasa una petición por una cadena de manejadores hasta que uno la procese o la rechace.
//        ¿Para qué problemas sirve?
//Validaciones en secuencia; filtros; autorización; procesamiento donde el emisor no conoce al receptor concreto.
//
//
//class Request { int monto; }
//abstract class Handler {
//    protected Handler next;
//    Handler setNext(Handler n){ next = n; return n; }
//    void handle(Request r) { if (process(r) && next != null) next.handle(r); }
//    abstract boolean process(Request r);
//}
//class ValidadorMonto extends Handler {
//    boolean process(Request r) {
//        System.out.println("Validando monto...");
//        return r.monto < 1000;
//    }
//}
//class ProcesadorPago extends Handler {
//    boolean process(Request r) {
//        System.out.println("Procesando pago...");
//        return true;
//    }
//}
//public class ChainDemo {
//    public static void main(String[] args) {
//        Handler chain = new ValidadorMonto();
//        chain.setNext(new ProcesadorPago());
//        Request req = new Request();
//        req.monto = 500;
//        chain.handle(req);
//    }
//}


package dosw.bitacora.semana3.patrones.ChainOfResposability;

public class AntecedentesControl extends ControlMigratorioHandler {

    @Override
    public void procesar(IngresoRequest req) {
        if (req.isAntecedentesOk()) {
            System.out.println("[Antecedentes] Aprobado");
            continuar(req);
        } else {
            System.out.println("[Antecedentes] Rechazado por antecedentes.");
        }
    }
}

