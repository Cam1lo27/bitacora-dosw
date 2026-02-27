package dosw.bitacora.semana2.patrones.Memento;

public class Main {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();
        History history = new History();

        editor.setText("Versión 1");
        history.add(editor.save());

        editor.setText("Versión 2");
        history.add(editor.save());

        editor.setText("Versión 3");

        editor.restore(history.get(0));

        System.out.println(editor.getText());
    }
}
