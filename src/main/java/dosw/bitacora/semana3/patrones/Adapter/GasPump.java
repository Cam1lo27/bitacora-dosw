package dosw.bitacora.semana3.patrones.Adapter;

public class GasPump implements FuelService {
    @Override
    public void supply(int liters) {
        validate(liters);
        System.out.println("Suministrando gasolina: " + liters + " litros");
    }

    private void validate(int liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Los litros deben ser mayores que 0");
        }
    }
}