package dosw.bitacora.semana3.patrones.Factory;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor;

        processor = new CreditCardProcessor();
        processor.processPayment(100);

        processor = new PaypalProcessor();
        processor.processPayment(250);

        processor = new BankTransferProcessor();
        processor.processPayment(500);
    }
}
