import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVsLinkedList {

    public static final int LIM = 10_000_000;

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

        // Comparamos accesos en distintas posiciones
        compare(arr, ll, 0);
        compare(arr, ll, LIM / 4);
        compare(arr, ll, LIM / 2);
        compare(arr, ll, 3 * LIM / 4);
        compare(arr, ll, LIM - 1);
    }

    public static void compare(List<Integer> arrayList, List<Integer> linkedList, int posicion) {
        System.out.println("\nComparando acceso en posición: " + posicion);

        long inicio = System.nanoTime();
        arrayList.get(posicion);
        long fin = System.nanoTime();
        System.out.println("ArrayList -> " + (fin - inicio) + " ns");

        inicio = System.nanoTime();
        linkedList.get(posicion);
        fin = System.nanoTime();
        System.out.println("LinkedList -> " + (fin - inicio) + " ns");
    }
}
