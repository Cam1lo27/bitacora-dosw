package dosw.bitacora.semana2.patrones.Adapter;

public class SimplePrinter implements MessagePrinter {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}

