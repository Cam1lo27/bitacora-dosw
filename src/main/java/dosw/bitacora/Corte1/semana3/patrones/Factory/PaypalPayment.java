package dosw.bitacora.Corte1.semana3.patrones.Factory;

public class PaypalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("Pago con PayPal por $" + amount + "%n");
    }
}

