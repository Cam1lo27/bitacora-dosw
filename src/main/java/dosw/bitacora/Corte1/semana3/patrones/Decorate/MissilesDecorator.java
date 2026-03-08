package dosw.bitacora.semana3.patrones.Decorate;

public class MissilesDecorator extends ShipDecorator {

    public MissilesDecorator(Ship wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription() + " + Misiles";
    }

    @Override
    public int getAttack() {
        return wrappee.getAttack() + 40;
    }
}
