package dosw.bitacora.semana3.patrones.Decorate;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Ship base = new BasicShip("Submarino", 50, 70);

        Map<String, Function<Ship, Ship>> decorators = Map.of(
                "Armor", ship -> new ReinforcedArmorDecorator(ship),
                "Radar", ship -> new AdvancedRadarDecorator(ship),
                "Missiles", ship -> new MissilesDecorator(ship),
                "AntiTorpedos", ship -> new AntiTorpedoDecorator(ship)
        );

        List<String> config1 = List.of("Radar", "Missiles", "Armor");

        Ship configured1 = config1.stream()
                .map(decorators::get)
                .reduce(base,
                        (ship, deco) -> deco.apply(ship),
                        (s1, s2) -> s1);

        System.out.println("=== Configuración 1 ===");
        System.out.println("Descripción: " + configured1.getDescription());
        System.out.println("Ataque total: " + configured1.getAttack());
        System.out.println("Defensa total: " + configured1.getDefense());
        System.out.println();

        List<String> config2 = List.of("Armor", "AntiTorpedos");

        Ship configured2 = config2.stream()
                .map(decorators::get)
                .reduce(base, (ship, deco) -> deco.apply(ship), (s1, s2) -> s1);

        System.out.println("=== Configuración 2 ===");
        System.out.println("Descripción: " + configured2.getDescription());
        System.out.println("Ataque total: " + configured2.getAttack());
        System.out.println("Defensa total: " + configured2.getDefense());
        System.out.println();

        List<List<String>> escenarios = List.of(
                List.of("Missiles"),
                List.of("Radar", "AntiTorpedos"),
                List.of("Armor", "Radar", "Missiles", "AntiTorpedos")
        );

        for (int i = 0; i < escenarios.size(); i++) {
            List<String> cfg = escenarios.get(i);
            Ship ship = cfg.stream()
                    .map(decorators::get)
                    .reduce(base, (acc, deco) -> deco.apply(acc), (s1, s2) -> s1);

            System.out.println("=== Escenario " + (i + 1) + " " + cfg + " ===");
            System.out.println("Descripción: " + ship.getDescription());
            System.out.println("Ataque total: " + ship.getAttack());
            System.out.println("Defensa total: " + ship.getDefense());
            System.out.println();
        }
    }
}
