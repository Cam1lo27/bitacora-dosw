//6) Command
//¿Qué es?
//Encapsula una operación como un objeto para permitir deshacer, registrar o encolar acciones.
//        ¿Para qué problemas sirve?
//Necesidad de undo/redo; colas de comandos; registro de operaciones.
//
//
//interface Command { void execute(); }
//class Luz { void encender(){ System.out.println("Luz encendida"); } }
//class EncenderLuzCommand implements Command {
//    Luz luz;
//    EncenderLuzCommand(Luz l){ luz = l; }
//    public void execute(){ luz.encender(); }
//}
//public class CommandDemo {
//    public static void main(String[] args) {
//        Luz l = new Luz();
//        Command c = new EncenderLuzCommand(l);
//        c.execute();
//    }
//}


package dosw.bitacora.semana3.patrones.Command;

public class AttackCommand implements Command {

    private GameCharacter character;

    public AttackCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.attack();
    }
}