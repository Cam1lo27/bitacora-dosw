package dosw.bitacora.Corte2.semana2.Ejercicio2;

public class FraudValidation extends ValidationHandler {

    @Override
    public boolean validate(double amount) {

        System.out.println("Validando fraude");

        return next == null || next.validate(amount);
    }
}
