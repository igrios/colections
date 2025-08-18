
import java.util.*;

public class InterfazCollection {

    public static void pintarElementos(Collection cole) {
        for (Object o : cole) {
            System.out.println(o);
        }
        System.out.println();
    }


    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            lista.add(" lista  " + i);
        }
        pintarElementos(lista);
//
        Deque<Integer> cola = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            cola.addLast(i);
        }
     pintarElementos(cola);


        Collection<Character> conjunto = new HashSet<>();
        String palabra = "collection";
        for(int  i = 0; i < palabra.length() ;i++){
               conjunto.add(palabra.charAt(i));
        }
        pintarElementos(conjunto);


    }





}
