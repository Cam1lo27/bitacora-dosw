package dosw.bitacora.semana3.patrones.Factory;

public class BankTransferProcessor extends PaymentProcessor {
    @Override
    protected Payment createPayment() {
        return new BankTransferPayment();
    }
}

