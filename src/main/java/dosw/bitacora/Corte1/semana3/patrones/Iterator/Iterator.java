//10) Iterator
//¿Qué es?
//Proporciona una forma secuencial de recorrer una colección sin exponer su representación interna.
//¿Para qué problemas sirve?
//Recorridos personalizados; encapsular colecciones no estándar.
//
//
//interface MiIterador { boolean hasNext(); String next(); }
//class Nombres {
//    String[] lista = { "Ana", "Luis", "Camilo" };
//    MiIterador iterador(){
//        return new MiIterador(){
//            int i=0;
//            public boolean hasNext(){ return i < lista.length; }
//            public String next(){ return lista[i++]; }
//        };
//    }
//}
//public class IteratorDemo {
//    public static void main(String[] args) {
//        MiIterador it = new Nombres().iterador();
//        while(it.hasNext()) System.out.println(it.next());
//    }
//}


package dosw.bitacora.semana3.patrones.Iterator;

public class Iterator {
}
