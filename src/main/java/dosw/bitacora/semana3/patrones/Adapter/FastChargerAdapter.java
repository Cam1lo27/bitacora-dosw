package dosw.bitacora.semana3.patrones.Adapter;

public class FastChargerAdapter implements FuelService {

    private final FastElectricCharger charger;

    public FastChargerAdapter(FastElectricCharger charger) {
        this.charger = charger;
    }

    @Override
    public void supply(int liters) {
        validate(liters);
        double kWh = liters * 8.0;
        System.out.println("Equivalencia (rápido): " + liters + " litros -> " + kWh + " kWh");
        charger.fastChargekWh(kWh);
    }

    private void validate(int liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Los litros deben ser mayores que 0");
        }
    }
}
