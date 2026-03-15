package dosw.bitacora.Corte2.semana2.Ejercicio2;

public class BalanceValidation extends ValidationHandler {

    @Override
    public boolean validate(double amount) {

        System.out.println("Validando saldo");

        if(amount < 1000){
            return next == null || next.validate(amount);
        }

        return false;
    }
}
