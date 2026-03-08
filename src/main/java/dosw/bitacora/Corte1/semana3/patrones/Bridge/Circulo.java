package dosw.bitacora.semana3.patrones.Bridge;

public class Circulo extends Forma {

    public Circulo(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Círculo con color " + color.nombreColor());
    }
}