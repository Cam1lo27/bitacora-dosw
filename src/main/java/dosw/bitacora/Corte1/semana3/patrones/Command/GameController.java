package dosw.bitacora.semana3.patrones.Command;

public class GameController {

    public void pressButton(Command command) {
        command.execute();
    }
}
