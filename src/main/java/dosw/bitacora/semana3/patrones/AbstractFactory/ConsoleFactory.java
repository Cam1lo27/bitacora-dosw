package dosw.bitacora.semana3.patrones.AbstractFactory;

public interface ConsoleFactory {
    Controller createController();
    Game createGame();
    GameUI createUI();
}
