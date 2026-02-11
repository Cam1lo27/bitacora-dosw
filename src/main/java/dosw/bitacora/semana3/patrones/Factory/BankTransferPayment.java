package dosw.bitacora.semana3.patrones.Factory;

public class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("Pago con Transferencia bancaria por $" + amount + "%n");
    }
}

