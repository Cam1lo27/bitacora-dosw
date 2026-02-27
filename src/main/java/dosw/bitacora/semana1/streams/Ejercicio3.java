package dosw.bitacora.semana1.streams;

import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {

        List<User> users = List.of(
                new User(1, "Andres", 25, true),
                new User(2, "Diana", 30, false),
                new User(3, "Camilo", 28, true),
                new User(4, "Laura", 22, true)
        );

        List<String> result = users.stream()
                .filter(User::isActive)
                .map(User::getName)
                .map(String::toUpperCase)
                .sorted()
                .toList();


        System.out.println("Resultado:");
        result.forEach(System.out::println);

    }
}
