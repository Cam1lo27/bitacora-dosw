//7) Composite
//¿Qué es?
//Permite tratar objetos individuales y compuestos de forma uniforme en estructuras árbol.
//        ¿Para qué problemas sirve?
//Menús, carpetas/archivos, escenas gráficas; operaciones recursivas.
//
//
//import java.util.*;
//interface Componente { void mostrar(); }
//class Archivo implements Componente {
//    public void mostrar(){ System.out.println("Archivo"); }
//}
//class Carpeta implements Componente {
//    List<Componente> hijos = new ArrayList<>();
//    void add(Componente c){ hijos.add(c); }
//    public void mostrar(){
//        System.out.println("Carpeta:");
//        for (Componente c : hijos) c.mostrar();
//    }
//}
//public class CompositeDemo {
//    public static void main(String[] args) {
//        Carpeta root = new Carpeta();
//        root.add(new Archivo());
//        root.add(new Archivo());
//        root.mostrar();
//    }
//}


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
