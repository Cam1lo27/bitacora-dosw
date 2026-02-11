package dosw.bitacora.semana3.patrones.Decorate;

import java.util.List;
import java.util.stream.Collectors;

public class BasicShip implements Ship {

    private final String type;
    private final int baseAttack;
    private final int baseDefense;

    public BasicShip(String type, int baseAttack, int baseDefense) {
        this.type = type;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
    }

    @Override
    public String getDescription() {
        return type + " (base)";
    }

    @Override
    public int getAttack() {
        return baseAttack;
    }

    @Override
    public int getDefense() {
        return baseDefense;
    }

    public String summary() {
        return List.of(
                "Tipo: " + type,
                "Ataque: " + getAttack(),
                "Defensa: " + getDefense(),
                "Mods: " + getDescription()
        ).stream().collect(Collectors.joining(" | "));
    }
}

