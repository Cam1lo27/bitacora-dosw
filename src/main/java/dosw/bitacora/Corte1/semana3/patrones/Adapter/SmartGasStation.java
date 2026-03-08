package dosw.bitacora.semana3.patrones.Adapter;

public class SmartGasStation {
    public static void main(String[] args) {

        FuelService gasolinePump = new GasPump();

        FuelService fastElectricPump = new FastChargerAdapter(new FastElectricCharger());

        FuelService slowElectricPump = new SlowChargerAdapter(new SlowElectricCharger());

        gasolinePump.supply(3);
        fastElectricPump.supply(10);
        slowElectricPump.supply(20);
    }
}
