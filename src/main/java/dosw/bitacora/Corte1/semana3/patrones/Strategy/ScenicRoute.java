package dosw.bitacora.semana3.patrones.Strategy;

import java.util.stream.Stream;

public class ScenicRoute implements RouteStrategy {

    @Override
    public void calculateRoute() {
        System.out.println("Calculando la ruta más escénica...");

        Stream.of("Carretera panorámica", "Vista a la montaña", "Tiempo estimado: 35 min")
                .forEach(System.out::println);
    }
}
