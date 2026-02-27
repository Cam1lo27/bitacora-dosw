package dosw.bitacora.semana3.patrones.AbstractFactory;

public class GameEngine {

    private final Controller controller;
    private final Game game;
    private final GameUI ui;

    public GameEngine(ConsoleFactory factory) {
        this.controller = factory.createController();
        this.game = factory.createGame();
        this.ui = factory.createUI();
    }

    public void run() {
        controller.connect();
        game.start();
        ui.render();
    }
}
