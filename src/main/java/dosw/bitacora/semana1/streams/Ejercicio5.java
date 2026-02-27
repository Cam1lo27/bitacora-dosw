//funciones streams usadas en esta semana
//anyMatch / allMatch / noneMatch
//Validaciones.
//boolean hayPar = List.of(1,3,5,6).stream().anyMatch(n -> n % 2 == 0);
//boolean todosPos = List.of(1,2,3).stream().allMatch(n -> n > 0);
//boolean ningunoNeg = List.of(1,2,3).stream().noneMatch(n -> n < 0);

//forEach
//Acción por elemento.
//List.of("A","B","C")
// .stream()
// .forEach(System.out::println);
//collect
//Convierte a colección.
//List<String> lista = Stream.of("a","b").toList();
//Set<String> set = Stream.of("a","a","b")
// .collect(Collectors.toSet());
//reduce
//Reduce a un valor.
//int suma = Stream.of(1,2,3)
// .reduce(0, Integer::sum);

//filter
//Filtra elementos.
//List<Integer> pares = List.of(1,2,3,4,5,6)
// .stream()
// .filter(n -> n % 2 == 0)
// .toList();
//map
//Transforma elementos.
//List<Integer> largos = List.of("ana","luis","camilo")
// .stream()
// .map(String::length)
// .toList();
//flatMap
//Aplasta listas.
//List<String> palabras = List.of("hola mundo", "java streams")
// .stream()
// .flatMap(f -> Arrays.stream(f.split(" ")))
// .toList();
//distinct
//Elimina duplicados.
//List<Integer> unicos = List.of(1,2,2,3,3)
// .stream()
// .distinct()
// .toList();
//sorted
//Ordena elementos.
//List<String> ordenado = List.of("camilo","ana","luis")
// .stream()
// .sorted()
// .toList();

package dosw.bitacora.semana1.streams;

import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {

        List<Transaction> transaction = List.of(

                new Transaction("Transaccion1", 12000, true),
                new Transaction("Transaccion2", 5000, false),
                new Transaction("Transaccion3", 2000, true),
                new Transaction("Transaccion4", 75000, false),
                new Transaction("Transaccion5", 24000, true)

        );

        List<Transaction> procesada = transaction.stream()

                .peek(p -> System.out.println(p))
                .toList();

        boolean existeNoAprobada  = procesada.stream()
                .anyMatch(p -> !p.isApproved());

        boolean valid = !existeNoAprobada;


    }
}