package dosw.bitacora.semana2.patrones.Adapter;

import java.time.LocalDate;

public class DetailedPrinter {

    public void printDetailed(String message, String author, LocalDate date) {
        System.out.println("Mensaje: " + message);
        System.out.println("Autor: " + author);
        System.out.println("Fecha: " + date);
    }
}

