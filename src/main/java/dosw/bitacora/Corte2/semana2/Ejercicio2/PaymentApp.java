package dosw.bitacora.Corte2.semana2.Ejercicio2;

import java.util.List;

public class PaymentApp {

    public static void main(String[] args) {

        ValidationHandler balance = new BalanceValidation();
        ValidationHandler fraud = new FraudValidation();
        ValidationHandler limit = new LimitValidation();

        balance.setNext(fraud);
        fraud.setNext(limit);

        PaymentProcessor processor =
                new PaymentProcessor(new PayPalAdapter(), balance);

        List<Double> pagos = List.of(200.0, 500.0, 1200.0);

        pagos.stream()
                .forEach(processor::processPayment);
    }
}