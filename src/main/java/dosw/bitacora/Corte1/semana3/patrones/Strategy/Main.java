package dosw.bitacora.semana3.patrones.Strategy;

public class Main {

    public static void main(String[] args) {

        NavigationApp app = new NavigationApp(new FastestRoute());
        app.startNavigation();

        app.setRouteStrategy(new ScenicRoute());
        app.startNavigation();

        app.setRouteStrategy(new CheapestRoute());
        app.startNavigation();


        app.setRouteStrategy(() ->
                System.out.println("Ruta personalizada")
        );
        app.startNavigation();
    }
}
