//Dado un listado de Usuarios y utilizando los mismo atributos
// anteriores, filtrar las personas mayores de edad y obtener
// sus nombres. (NUEVO)

package dosw.bitacora.semana1.streams;

import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args){
        List<User> users = List.of(
                new User(11, "Laura", 10, true),
                new User(12, "Natalia", 21, true),
                new User(13, "Claudia", 45, true),
                new User(14, "Fidel", 65, true)
        );

        List<String> result = users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .toList();
        result.forEach(System.out::println);
    }
}
