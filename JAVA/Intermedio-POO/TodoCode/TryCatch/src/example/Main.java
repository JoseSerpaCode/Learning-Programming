package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();

        int max = 10;
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < 5; i++) {
            lists.add((int)(Math.random() * range) + min);
        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese un índice (del 1 al 5): ");

            // Verifica que el usuario ingrese un número
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Debe ingresar un número válido.");
            }

            int indice = scanner.nextInt();
            validarIndice(indice, 1, 5); // Verifica si el índice es válido

            System.out.print("El valor en la posición " + indice + " es: ");
            System.out.println(lists.get(indice - 1));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Proceso Terminado");
        }
    }

    public static void validarIndice(int indice, int min, int max) {
        if (indice < min || indice > max) {
            throw new IllegalArgumentException("Índice fuera de rango. Debe estar entre " + min + " y " + max);
        }
    }
}
