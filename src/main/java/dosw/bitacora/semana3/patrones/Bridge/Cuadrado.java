package dosw.bitacora.semana3.patrones.Bridge;

public class Cuadrado extends Forma {

    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Cuadrado con color " + color.nombreColor());
    }
}

