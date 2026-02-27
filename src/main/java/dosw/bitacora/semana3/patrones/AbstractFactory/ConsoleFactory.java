
//1) Abstract Factory
//¿Qué es?
//Permite crear familias de objetos relacionados sin acoplarse a clases concretas.
//¿Para qué problemas sirve?
//Útil cuando existen variantes completas (por ejemplo, estilos Light/Dark) y se necesita garantizar compatibilidad
//entre los objetos de la misma familia o cambiar toda la familia desde un único punto.
//
//Ejemplo
//// Productos abstractos
//interface Button { void paint(); }
//// Light
//class LightButton implements Button {
//    public void paint() { System.out.println("Botón LIGHT"); }
//}
//// Dark
//class DarkButton implements Button {
//    public void paint() { System.out.println("Botón DARK"); }
//}
//// Fábrica abstracta
//interface GUIFactory { Button createButton(); }
//// Fábricas concretas
//class LightFactory implements GUIFactory {
//    public Button createButton() { return new LightButton(); }
//}
//class DarkFactory implements GUIFactory {
//    public Button createButton() { return new DarkButton(); }
//}
//public class AbstractFactoryDemo {
//    public static void main(String[] args) {
//        GUIFactory factory = new DarkFactory();
//        Button b = factory.createButton();
//        b.paint();
//    }
//}
//

package dosw.bitacora.semana3.patrones.AbstractFactory;

public interface ConsoleFactory {
    Controller createController();
    Game createGame();
    GameUI createUI();
}
