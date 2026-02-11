package dosw.bitacora.semana3.patrones.AbstractFactory;

public class XboxFactory implements ConsoleFactory {
    @Override
    public Controller createController() {
        return new XboxController();
    }

    @Override
    public Game createGame() {
        return new XboxGame();
    }

    @Override
    public GameUI createUI() {
        return new XboxUI();
    }
}
