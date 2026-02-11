package dosw.bitacora.semana3.patrones.Builder;

public class ActionDollBuilder extends ToyBuilder {

    @Override
    public void buildHead() {
        doll.setHead("Casco táctico con visera");
    }

    @Override
    public void buildBody() {
        doll.setBody("Armadura ligera");
    }

    @Override
    public void buildArms() {
        doll.setArms("2 brazos articulados reforzados");
    }

    @Override
    public void buildLegs() {
        doll.setLegs("2 piernas reforzadas para combate");
    }

    @Override
    public void buildAccessories() {
        doll.addAccessory("Arma de juguete");
        doll.addAccessory("Radio de comunicación");
        doll.addAccessory("Mochila táctica");
    }
}
