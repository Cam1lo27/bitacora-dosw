package dosw.bitacora.Corte2.semana2.Ejercicio2;

public class PayPalAdapter implements PaymentAdapter {

    private PayPalAPI paypal = new PayPalAPI();

    @Override
    public void pay(double amount) {
        paypal.makePayment(amount);
    }
}
