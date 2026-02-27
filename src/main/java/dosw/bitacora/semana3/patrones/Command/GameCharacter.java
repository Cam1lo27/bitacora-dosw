package dosw.bitacora.semana3.patrones.Command;

public class GameCharacter {

    public void walk() {
        System.out.println("El personaje está caminando");
    }

    public void jump() {
        System.out.println("El personaje saltó");
    }

    public void attack() {
        System.out.println("El personaje atacó");
    }

    public void defend() {
        System.out.println("El personaje se defendió");
    }
}
