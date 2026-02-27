package dosw.bitacora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BitacoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitacoraApplication.class, args);
	}

}

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
//
//
//
//2) Adapter
//¿Qué es?
//Convierte la interfaz de una clase en otra esperada por el cliente, sin modificar código existente.
//¿Para qué problemas sirve?
//Integración de código legado o de terceros; migraciones graduales donde las interfaces no coinciden.
//
//Ejemplo en Java
//interface USB_C { void conectar(); }
//class MicroUSB { void conectarMicroUSB() { System.out.println("MicroUSB conectado"); } }
//class MicroUSBToUSBCAdapter implements USB_C {
//    private MicroUSB device;
//    MicroUSBToUSBCAdapter(MicroUSB d) { device = d; }
//    public void conectar() { device.conectarMicroUSB(); }
//}
//public class AdapterDemo {
//    public static void main(String[] args) {
//        USB_C cable = new MicroUSBToUSBCAdapter(new MicroUSB());
//        cable.conectar();
//    }
//}
//
//
//
//
//3) Bridge
//¿Qué es?
//Separa la abstracción de su implementación para que ambas evolucionen independientemente.
//¿Para qué problemas sirve?
//Problemas N × M (por ejemplo, formas x APIs de dibujo); necesidad de cambiar implementaciones en tiempo de
//ejecución.
//
//
//interface Dibujador { void dibujarCirculo(); }
//class DibujadorRaster implements Dibujador {
//    public void dibujarCirculo() { System.out.println("Raster círculo"); }
//}
//class DibujadorVector implements Dibujador {
//    public void dibujarCirculo() { System.out.println("Vector círculo"); }
//}
//abstract class Forma {
//    protected Dibujador dib;
//    Forma(Dibujador d) { dib = d; }
//    abstract void dibujar();
//}
//class Circulo extends Forma {
//    Circulo(Dibujador d) { super(d); }
//    void dibujar() { dib.dibujarCirculo(); }
//}
//public class BridgeDemo {
//    public static void main(String[] args) {
//        Forma f = new Circulo(new DibujadorVector());
//        f.dibujar();
//    }
//}
//
//
//
//
//
//
//4) Builder
//¿Qué es?
//Facilita la construcción paso a paso de objetos complejos o con muchos parámetros opcionales.
//        ¿Para qué problemas sirve?
//Evitar constructores con demasiados parámetros; mejorar legibilidad e inmutabilidad.
//
//
//class Usuario {
//    String nombre; String email; String telefono;
//    Usuario(Builder b) { nombre = b.nombre; email = b.email; telefono = b.telefono; }
//    static class Builder {
//        String nombre, email, telefono;
//        Builder(String nombre, String email) { this.nombre = nombre; this.email = email; }
//        Builder telefono(String t) { this.telefono = t; return this; }
//        Usuario build() { return new Usuario(this); }
//    }
//}
//public class BuilderDemo {
//    public static void main(String[] args) {
//        Usuario u = new Usuario.Builder("Camilo", "camilo@mail.com").telefono("301123123").build();
//        System.out.println(u.nombre);
//    }
//}
//
//
//
//
//
//
//
//5) Chain of Responsibility
//¿Qué es?
//Pasa una petición por una cadena de manejadores hasta que uno la procese o la rechace.
//        ¿Para qué problemas sirve?
//Validaciones en secuencia; filtros; autorización; procesamiento donde el emisor no conoce al receptor concreto.
//
//
//class Request { int monto; }
//abstract class Handler {
//    protected Handler next;
//    Handler setNext(Handler n){ next = n; return n; }
//    void handle(Request r) { if (process(r) && next != null) next.handle(r); }
//    abstract boolean process(Request r);
//}
//class ValidadorMonto extends Handler {
//    boolean process(Request r) {
//        System.out.println("Validando monto...");
//        return r.monto < 1000;
//    }
//}
//class ProcesadorPago extends Handler {
//    boolean process(Request r) {
//        System.out.println("Procesando pago...");
//        return true;
//    }
//}
//public class ChainDemo {
//    public static void main(String[] args) {
//        Handler chain = new ValidadorMonto();
//        chain.setNext(new ProcesadorPago());
//        Request req = new Request();
//        req.monto = 500;
//        chain.handle(req);
//    }
//}
//
//
//
//
//
//
//
//
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
//
//
//
//
//
//
//
//
//
//
//7) Composite
//¿Qué es?
//Permite tratar objetos individuales y compuestos de forma uniforme en estructuras árbol.
//        ¿Para qué problemas sirve?
//Menús, carpetas/archivos, escenas gráficas; operaciones recursivas.
//
//
//import java.util.*;
//interface Componente { void mostrar(); }
//class Archivo implements Componente {
//    public void mostrar(){ System.out.println("Archivo"); }
//}
//class Carpeta implements Componente {
//    List<Componente> hijos = new ArrayList<>();
//    void add(Componente c){ hijos.add(c); }
//    public void mostrar(){
//        System.out.println("Carpeta:");
//        for (Componente c : hijos) c.mostrar();
//    }
//}
//public class CompositeDemo {
//    public static void main(String[] args) {
//        Carpeta root = new Carpeta();
//        root.add(new Archivo());
//        root.add(new Archivo());
//        root.mostrar();
//    }
//}
//
//
//
//
//
//
//
//
//8) Decorator
//¿Qué es?
//Agrega comportamiento adicional a un objeto dinámicamente sin modificar su clase.
//¿Para qué problemas sirve?
//Combinación de responsabilidades opcionales como logging, encriptación, compresión.
//
//
//interface Notificador { void enviar(String msg); }
//class NotificadorBase implements Notificador {
//    public void enviar(String msg){ System.out.println("Enviando: " + msg); }
//}
//class NotificadorDecorador implements Notificador {
//    protected Notificador wrappee;
//    NotificadorDecorador(Notificador n){ wrappee = n; }
//    public void enviar(String msg){ wrappee.enviar(msg); }
//}
//class NotificadorConLog extends NotificadorDecorador {
//    NotificadorConLog(Notificador n){ super(n); }
//    public void enviar(String msg){
//        System.out.println("LOG: enviando mensaje");
//        super.enviar(msg);
//    }
//}
//public class DecoratorDemo {
//    public static void main(String[] args) {
//        Notificador n = new NotificadorConLog(new NotificadorBase());
//        n.enviar("Hola");
//    }
//}
//
//
//
//
//
//
//
//
//
//9) Factory Method
//¿Qué es?
//La superclase define un método de fábrica y las subclases deciden qué clase concreta instanciar.
//¿Para qué problemas sirve?
//Extender con nuevas variantes sin tocar el cliente; cuando la clase base no conoce los productos concretos.
//
//
//abstract class Documento { abstract void abrir(); }
//class PDF extends Documento { void abrir(){ System.out.println("Abrir PDF"); } }
//abstract class App {
//    abstract Documento crearDocumento();
//    void nuevo() { Documento d = crearDocumento(); d.abrir(); }
//}
//class PDFApp extends App { Documento crearDocumento(){ return new PDF(); } }
//public class FactoryMethodDemo {
//    public static void main(String[] args) { new PDFApp().nuevo(); }
//}
//
//
//
//
//
//
//
//
//
//
//10) Iterator
//¿Qué es?
//Proporciona una forma secuencial de recorrer una colección sin exponer su representación interna.
//¿Para qué problemas sirve?
//Recorridos personalizados; encapsular colecciones no estándar.
//
//
//interface MiIterador { boolean hasNext(); String next(); }
//class Nombres {
//    String[] lista = { "Ana", "Luis", "Camilo" };
//    MiIterador iterador(){
//        return new MiIterador(){
//            int i=0;
//            public boolean hasNext(){ return i < lista.length; }
//            public String next(){ return lista[i++]; }
//        };
//    }
//}
//public class IteratorDemo {
//    public static void main(String[] args) {
//        MiIterador it = new Nombres().iterador();
//        while(it.hasNext()) System.out.println(it.next());
//    }
//}
//
//
//
//
//
//
//
//11) Strategy
//¿Qué es?
//Define una familia de algoritmos intercambiables y permite cambiarlos en tiempo de ejecución.
//¿Para qué problemas sirve?
//Evitar condicionales extensos; seleccionar comportamiento según contexto.
//
//
//interface EstrategiaPrecio { double calcular(double base); }
//class SinDescuento implements EstrategiaPrecio { public double calcular(double base){ return base; } }
//class Descuento10 implements EstrategiaPrecio { public double calcular(double base){ return base * 0.9; } class Carrito {
//    EstrategiaPrecio estrategia;
//    Carrito(EstrategiaPrecio e){ estrategia = e; }
//    double pagar(double subtotal){ return estrategia.calcular(subtotal); }
//}
//    public class StrategyDemo {
//        public static void main(String[] args) {
//            Carrito c = new Carrito(new SinDescuento());
//            System.out.println(c.pagar(100));
//            c.estrategia = new Descuento10();
//            System.out.println(c.pagar(100));
//        }
//    }