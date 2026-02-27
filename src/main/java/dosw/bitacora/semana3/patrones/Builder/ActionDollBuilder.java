//4) Builder
//¿Qué es?
//Facilita la construcción paso a paso de objetos complejos o con muchos parámetros opcionales.
//        ¿Para qué problemas sirve?
//Evitar constructores con demasiados parámetros; mejorar legibilidad e inmutabilidad.
//
//
//class Usuario {
//    String nombre; String email; String telefono;
//    Usuario(Builder b) { nombre = b.nombre; email = b.email; telefono = b.telefono; }
//    static class Builder {
//        String nombre, email, telefono;
//        Builder(String nombre, String email) { this.nombre = nombre; this.email = email; }
//        Builder telefono(String t) { this.telefono = t; return this; }
//        Usuario build() { return new Usuario(this); }
//    }
//}
//public class BuilderDemo {
//    public static void main(String[] args) {
//        Usuario u = new Usuario.Builder("Camilo", "camilo@mail.com").telefono("301123123").build();
//        System.out.println(u.nombre);
//    }
//}


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
