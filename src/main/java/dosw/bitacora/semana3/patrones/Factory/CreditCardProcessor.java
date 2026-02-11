package dosw.bitacora.semana3.patrones.Factory;

public class CreditCardProcessor extends PaymentProcessor {
    @Override
    protected Payment createPayment() {
        return new CreditCardPayment();
    }
}
