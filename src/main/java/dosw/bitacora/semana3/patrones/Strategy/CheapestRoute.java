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
