package dosw.bitacora.semana3.patrones.Bridge;

public abstract class Forma {
    protected final Color color;

    protected Forma(Color color) {
        this.color = color;
    }

    public abstract void dibujar();
}
