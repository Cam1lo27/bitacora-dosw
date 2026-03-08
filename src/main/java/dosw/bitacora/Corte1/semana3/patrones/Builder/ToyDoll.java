package dosw.bitacora.semana3.patrones.Builder;

import java.util.ArrayList;
import java.util.List;

public class ToyDoll {
    private String head;
    private String body;
    private String arms;
    private String legs;
    private final List<String> accessories = new ArrayList<>();

    public void setHead(String head) {
        this.head = head;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setArms(String arms) {
        this.arms = arms;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public void addAccessory(String accessory) {
        if (accessory != null && !accessory.isBlank()) {
            accessories.add(accessory);
        }
    }

    public List<String> getAccessories() {
        return new ArrayList<>(accessories);
    }

    public void showInfo() {
        System.out.println("=== Muñeco construido ===");
        System.out.println("Cabeza: " + head);
        System.out.println("Cuerpo: " + body);
        System.out.println("Brazos: " + arms);
        System.out.println("Piernas: " + legs);
        if (accessories.isEmpty()) {
            System.out.println("Accesorios: (sin accesorios)");
        } else {
            System.out.println("Accesorios: " + String.join(", ", accessories));
        }
        System.out.println();
    }
}
