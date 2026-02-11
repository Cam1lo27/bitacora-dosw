package dosw.bitacora.semana3.patrones.Decorate;

public class AdvancedRadarDecorator extends ShipDecorator {

    public AdvancedRadarDecorator(Ship wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription() + " + RadarAvanzado";
    }

    @Override
    public int getAttack() {
        return wrappee.getAttack() + 10;
    }
}
