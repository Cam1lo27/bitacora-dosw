package dosw.bitacora.semana2.SOLID.Ejercicio1;

public class Calculator {

    public double calculate(Operation operation, double a, double b) {
        return operation.executeOperation(a, b);
    }
}
