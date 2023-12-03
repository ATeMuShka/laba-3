import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int numOperations = 1000; // Количество операций

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

// Добавление элементов
        long startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList add: " + numOperations + " операций, время выполнения: " + (endTime - startTime) + " наносекунд.");

        startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList add: " + numOperations + " операций, время выполнения: " + (endTime - startTime) + " наносекунд.");

// Удаление элементов
        startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList remove: " + numOperations + " операций, время выполнения: " + (endTime - startTime) + " наносекунд.");

        startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList remove: " + numOperations + " операций, время выполнения: " + (endTime - startTime) + " наносекунд.");

// Получение элементов
        startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList get: " + numOperations + " операций, время выполнения: " + (endTime - startTime) + " наносекунд.");

        startTime = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList get: " + numOperations + " операций, время выполнения: " + (endTime - startTime) + " наносекунд.");
    }
}