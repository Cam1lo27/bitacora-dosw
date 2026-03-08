package dosw.bitacora.semana2.SOLID.Ejercicio1;

public class Division implements Operation {
    @Override
    public double executeOperation(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }
}

