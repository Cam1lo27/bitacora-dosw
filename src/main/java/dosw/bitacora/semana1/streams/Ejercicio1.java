//Dada una lista de numeros enteros, necesitamos
//obtener una nueva lista solo con los numeros pares
//mayores a diez.
package dosw.bitacora.semana1.streams;
import java.util.List;
public class Ejercicio1 {

    private List<Integer> numbers = List.of(3,8,10,12,15,18,20);

    List result = numbers.stream()
            .filter(n -> n % 2 == 0)
            .filter(n -> n > 10)
            .toList();
}
