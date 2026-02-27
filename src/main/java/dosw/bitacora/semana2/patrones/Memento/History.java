package dosw.bitacora.semana2.patrones.Memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private final List<TextMemento> states = new ArrayList<>();

    public void add(TextMemento memento) {
        states.add(memento);
    }

    public TextMemento get(int index) {
        return states.get(index);
    }
}
