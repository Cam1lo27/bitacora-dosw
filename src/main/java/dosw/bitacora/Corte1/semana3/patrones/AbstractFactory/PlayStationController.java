package dosw.bitacora.semana3.patrones.AbstractFactory;

public class PlayStationController implements Controller {
    @Override
    public void connect() {
        System.out.println("Conectando control de PlayStation...");
    }
}
