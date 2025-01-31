import java.util.*;

public class ListPerformanceTest {
    public static void main(String[] args) {
        int size = 100000; // Tamaño de la lista
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Llenar las listas
        fillList(arrayList, size);
        fillList(linkedList, size);

        // Medir acceso
        measureAccessTime(arrayList, "ArrayList");
        measureAccessTime(linkedList, "LinkedList");

        // Medir inserción en el medio
        measureInsertionTime(arrayList, "ArrayList");
        measureInsertionTime(linkedList, "LinkedList");

        // Medir eliminación en el medio
        measureDeletionTime(arrayList, "ArrayList");
        measureDeletionTime(linkedList, "LinkedList");
    }

    private static void fillList(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
    }

    private static void measureAccessTime(List<Integer> list, String type) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            int index = (int) (Math.random() * list.size());
            list.get(index);
        }
        long endTime = System.nanoTime();
        System.out.println(type + " acceso: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    private static void measureInsertionTime(List<Integer> list, String type) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.add(list.size() / 2, -1);
        }
        long endTime = System.nanoTime();
        System.out.println(type + " inserción en el medio: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    private static void measureDeletionTime(List<Integer> list, String type) {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.remove(list.size() / 2);
        }
        long endTime = System.nanoTime();
        System.out.println(type + " eliminación en el medio: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
