package dosw.bitacora.semana3.patrones.Decorate;

public abstract class ShipDecorator implements Ship {

    protected final Ship wrappee;

    protected ShipDecorator(Ship wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription();
    }

    @Override
    public int getAttack() {
        return wrappee.getAttack();
    }

    @Override
    public int getDefense() {
        return wrappee.getDefense();
    }
}

