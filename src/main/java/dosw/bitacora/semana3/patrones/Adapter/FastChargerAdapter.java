//2) Adapter
//¿Qué es?
//Convierte la interfaz de una clase en otra esperada por el cliente, sin modificar código existente.
//¿Para qué problemas sirve?
//Integración de código legado o de terceros; migraciones graduales donde las interfaces no coinciden.
//
//Ejemplo en Java
//interface USB_C { void conectar(); }
//class MicroUSB { void conectarMicroUSB() { System.out.println("MicroUSB conectado"); } }
//class MicroUSBToUSBCAdapter implements USB_C {
//    private MicroUSB device;
//    MicroUSBToUSBCAdapter(MicroUSB d) { device = d; }
//    public void conectar() { device.conectarMicroUSB(); }
//}
//public class AdapterDemo {
//    public static void main(String[] args) {
//        USB_C cable = new MicroUSBToUSBCAdapter(new MicroUSB());
//        cable.conectar();
//    }
//}
//


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
