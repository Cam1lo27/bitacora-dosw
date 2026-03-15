package dosw.bitacora.Corte1.semana3.patrones.Factory;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("Pago con Tarjeta de crédito por $" + amount + "%n");
    }
}

