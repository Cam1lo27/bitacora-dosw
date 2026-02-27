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

package dosw.bitacora.semana3.patrones.Strategy;

import java.util.stream.Stream;

public class CheapestRoute implements RouteStrategy {

    @Override
    public void calculateRoute() {
        System.out.println("Calculando la ruta más económica...");

        Stream.of("Evitar peajes", "Menor consumo de gasolina", "Tiempo estimado: 30 min")
                .forEach(System.out::println);
    }
}
