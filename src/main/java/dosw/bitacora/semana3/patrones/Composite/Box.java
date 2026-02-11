package dosw.bitacora.semana3.patrones.Composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item {

    private final String name;
    private final List<Item> items = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public void add(Item item) {
        items.add(item);
    }

    public boolean remove(Item item) {
        return items.remove(item);
    }

    @Override
    public double getPrice() {
        return items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }

    public void show(String indent) {
        System.out.println(indent + "- " + name + " (Caja) total: $" + getPrice());
        items.forEach(i -> {
            if (i instanceof Box box) {
                box.show(indent + "  ");
            } else {
                System.out.println(indent + "  " + "- " + i);
            }
        });
    }
}
