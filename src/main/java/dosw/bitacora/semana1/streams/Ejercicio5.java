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