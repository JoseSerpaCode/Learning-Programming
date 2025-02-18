package main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de números: ");
            int sizeVector = scanner.nextInt();
            int[] vector = new int[sizeVector];

            for (int i = 0; i < sizeVector; i++) {
                System.out.print("Ingrese un número: ");
                vector[i] = scanner.nextInt();
            }

            System.out.println("Vector original: " + Arrays.toString(vector));
            ordenarVector(vector);
            System.out.println("Vector Ordenado: " + Arrays.toString(vector));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void ordenarVector(int[] vec) {
        for (int i = 1; i < vec.length; i++) {
            int key = vec[i]; // Guardamos el valor actual
            int j = i - 1;

            // Mover los elementos mayores a la derecha
            while (j >= 0 && vec[j] > key) {
                vec[j + 1] = vec[j];
                j--;
            }
            vec[j + 1] = key; // Insertamos el valor en su posición correcta
            System.out.println(Arrays.toString(vec));
        }
    }


    /*
    [2, 3, 8, 1, 6]
    [1, 2, 3, 6, 8]
     */
}
