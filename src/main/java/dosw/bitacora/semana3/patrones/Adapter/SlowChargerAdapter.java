package dosw.bitacora.semana3.patrones.Adapter;

public class SlowChargerAdapter implements FuelService {

    private final SlowElectricCharger charger;

    public SlowChargerAdapter(SlowElectricCharger charger) {
        this.charger = charger;
    }

    @Override
    public void supply(int liters) {
        validate(liters);
        double kWh = liters * 7.0;
        System.out.println("Equivalencia (lento): " + liters + " litros -> " + kWh + " kWh");
        charger.slowChargekWh(kWh);
    }

    private void validate(int liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Los litros deben ser mayores que 0");
        }
    }
}
