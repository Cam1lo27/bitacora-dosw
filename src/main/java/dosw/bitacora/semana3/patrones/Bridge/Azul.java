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


package dosw.bitacora.semana3.patrones.Bridge;

public class Azul implements Color {
    @Override
    public String nombreColor() {
        return "Azul";
    }
}
