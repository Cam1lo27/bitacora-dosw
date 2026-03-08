package dosw.bitacora.semana3.patrones.AbstractFactory;

public class XboxController implements Controller {
    @Override
    public void connect() {
        System.out.println("Conectando control de Xbox...");
    }
}
