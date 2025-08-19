import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVsLinkedListDos {

    public static final int LIM = 1_000_000; // Reducido para que no tarde tanto

    public static void main(String[] args) {
        Random aleatorio = new Random();
        List<Integer> arr = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();

        // Llenamos las listas con números aleatorios
        for (int i = 0; i < LIM; i++) {
            Integer numero = aleatorio.nextInt(LIM);
            arr.add(numero);
            ll.add(numero);
        }

        compareAdd(arr,ll,1,-1);
        compareAdd(arr,ll,LIM/4,-3);
        compareAdd(arr,ll,LIM/2,-4);
        compareAdd(arr,ll,3*LIM/4,-5);
        compareAdd(arr,ll,LIM-1,-6);

    }

    public static void compareAdd(List<Integer> arrayList, List<Integer> linkedList, int posicion, int element) {

        System.out.println("\nComparando inserción en posición: " + posicion);

        // Insertar en ArrayList
        long inicio = System.currentTimeMillis();
        arrayList.add(posicion, element); // valor dummy
        long fin = System.currentTimeMillis();
        System.out.println("ArrayList -> " + (fin - inicio) + " ns");

        // Insertar en LinkedList
        inicio = System.currentTimeMillis();
        linkedList.add(posicion, element); // valor dummy
        fin = System.currentTimeMillis();
        System.out.println("LinkedList -> " + (fin - inicio) + " ns");
    }
}
