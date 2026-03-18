package dosw.bitacora.Corte1.semana3.patrones.Factory;

public class PaypalProcessor extends PaymentProcessor {
    @Override
    protected Payment createPayment() {
        return new PaypalPayment();
    }
}

