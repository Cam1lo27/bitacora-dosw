package dosw.bitacora.semana3.patrones.Decorate;

public class AntiTorpedoDecorator extends ShipDecorator {

    public AntiTorpedoDecorator(Ship wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription() + " + AntiTorpedos";
    }

    @Override
    public int getAttack() {
        return wrappee.getAttack() + 20;
    }
}

