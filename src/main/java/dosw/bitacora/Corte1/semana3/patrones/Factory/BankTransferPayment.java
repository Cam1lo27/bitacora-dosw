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


package dosw.bitacora.Corte1.semana3.patrones.Factory;

public class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("Pago con Transferencia bancaria por $" + amount + "%n");
    }
}

