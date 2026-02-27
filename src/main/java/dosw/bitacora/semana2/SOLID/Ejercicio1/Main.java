package dosw.bitacora.semana2.SOLID.Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double sum = calculator.calculate(new Addition(), 10, 3);
        double res = calculator.calculate(new Subtraction(), 30, 10);
        double mul = calculator.calculate(new Multiplication(), 7, 4);
        double div = calculator.calculate(new Division(), 45, 5);

        System.out.println(sum);
        System.out.println(res);
        System.out.println(mul);
        System.out.println(div);
    }
}

