package dosw.bitacora.semana3.patrones.Factory;

public abstract class PaymentProcessor {

    // Factory Method: cada subclase crea su Payment concreto
    protected abstract Payment createPayment();

    // Plantilla de proceso: valida y delega en el Payment
    public final void processPayment(double amount) {
        validate(amount);
        Payment payment = createPayment();
        payment.pay(amount);
    }

    private void validate(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que cero.");
        }
    }
}

