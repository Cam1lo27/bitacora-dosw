package dosw.bitacora.semana3.patrones.Strategy;

import java.util.stream.Stream;

public class FastestRoute implements RouteStrategy {

    @Override
    public void calculateRoute() {
        System.out.println("Calculando la ruta más rápida...");

        Stream.of("Autopista", "Evitar tráfico", "Tiempo estimado: 20 min")
                .forEach(System.out::println);
    }
}