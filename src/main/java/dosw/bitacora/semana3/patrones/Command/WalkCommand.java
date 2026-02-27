package dosw.bitacora.semana3.patrones.Command;

public class WalkCommand implements Command {

    private GameCharacter character;

    public WalkCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.walk();
    }
}
