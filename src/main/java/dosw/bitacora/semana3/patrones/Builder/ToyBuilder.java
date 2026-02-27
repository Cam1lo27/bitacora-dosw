package dosw.bitacora.semana3.patrones.Builder;

public abstract class ToyBuilder {
    protected ToyDoll doll;

    public void reset() {
        doll = new ToyDoll();
    }

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArms();
    public abstract void buildLegs();
    public abstract void buildAccessories();

    public ToyDoll getResult() {
        return doll;
    }
}
