package dosw.bitacora.semana2.patrones.Adapter;

public class Main {

    public static void main(String[] args) {

        MessagePrinter printer1 = new SimplePrinter();
        printer1.print("Impresora simple: Hola.");

        MessagePrinter printer2 =
                new DetailedPrinterAdapter(
                        new DetailedPrinter(),
                        "Andrés",
                        java.time.LocalDate.now()
                );

        printer2.print("Impresora detallada: Hola.");
    }
}

