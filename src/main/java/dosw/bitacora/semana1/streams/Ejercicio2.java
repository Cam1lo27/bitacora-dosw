//Dada una lista de palabras, se requiere:
//
//  - Filtrar las palabras que tengan mas de 4 caracteres.
//  - Convertirlas en Mayusculas.
//  - Ordenarlas alfabeticamente.
//  - Obtener la cantidad total de palabras
//    resultantes.

package dosw.bitacora.semana1.streams;
import java.util.List;

public class Ejercicio2 {

    List<String> words = List.of ("java", "stream", "api", "functional", "code", "git");

    List<String> processed = words.stream()
            .filter(w -> w.length() > 4)
            .map(String::toUpperCase)
            .sorted()
            .toList();
}
