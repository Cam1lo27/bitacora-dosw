package dosw.bitacora.semana3.patrones.Builder;

public class ClassicDollBuilder extends ToyBuilder {

    @Override
    public void buildHead() {
        doll.setHead("Cabeza con cabello sintético");
    }

    @Override
    public void buildBody() {
        doll.setBody("Vestido clásico con encajes");
    }

    @Override
    public void buildArms() {
        doll.setArms("2 brazos estándar");
    }

    @Override
    public void buildLegs() {
        doll.setLegs("2 piernas estándar");
    }

    @Override
    public void buildAccessories() {
        doll.addAccessory("Bolso pequeño");
        doll.addAccessory("Zapatos clásicos");
    }
}