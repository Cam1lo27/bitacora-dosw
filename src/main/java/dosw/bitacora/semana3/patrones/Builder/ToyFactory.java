package dosw.bitacora.semana3.patrones.Builder;

public class ToyFactory {

    public void constructDoll(ToyBuilder builder) {
        builder.reset();
        builder.buildHead();
        builder.buildBody();
        builder.buildArms();
        builder.buildLegs();
        builder.buildAccessories();
    }
}

