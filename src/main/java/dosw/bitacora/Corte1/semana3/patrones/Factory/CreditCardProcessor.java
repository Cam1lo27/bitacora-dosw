package dosw.bitacora.Corte1.semana3.patrones.Factory;

public class CreditCardProcessor extends PaymentProcessor {
    @Override
    protected Payment createPayment() {
        return new CreditCardPayment();
    }
}
