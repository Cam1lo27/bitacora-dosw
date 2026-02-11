package dosw.bitacora.semana3.patrones.AbstractFactory;

public class PlayStationFactory implements ConsoleFactory {
    @Override
    public Controller createController() {
        return new PlayStationController();
    }

    @Override
    public Game createGame() {
        return new PlayStationGame();
    }

    @Override
    public GameUI createUI() {
        return new PlayStationUI();
    }
}

