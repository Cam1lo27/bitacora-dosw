package dosw.bitacora.semana3.patrones.Decorate;

public class ReinforcedArmorDecorator extends ShipDecorator {

    public ReinforcedArmorDecorator(Ship wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription() + " + BlindajeReforzado";
    }

    @Override
    public int getDefense() {
        return wrappee.getDefense() + 30;
    }
}
