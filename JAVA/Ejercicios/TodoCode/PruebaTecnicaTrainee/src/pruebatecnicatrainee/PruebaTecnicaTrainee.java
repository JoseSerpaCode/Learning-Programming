package pruebatecnicatrainee;

import java.util.Scanner;

public class PruebaTecnicaTrainee {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[][] asientosTeatro = new int[10][10];
        int menu;

        do {
            System.out.println("");
            for (int filas = 0; filas < 10; filas++) {

                System.out.print("Fila " + (filas + 1) + ": ");

                for (int columnas = 0; columnas < 10; columnas++) {
                    System.out.print("[");

                    if (asientosTeatro[filas][columnas] == 0) {
                        System.out.print("L");
                    } else {
                        System.out.print("X");
                    }
                    System.out.print("] ");
                }
                System.out.println("");
            }

            System.out.print("Elija la fila: ");
            int fila = entrada.nextInt() - 1;

            System.out.print("Elija la columna: ");
            int columna = entrada.nextInt() - 1;

            if (asientosTeatro[fila][columna] == 0) {
                System.out.println("Asiento Seleccionado Correctamente!");
                asientosTeatro[fila][columna] = 1;
            } else {
                System.out.println("No se ha podido seleccionar el asiento. ESTADO: OCUPADO");
            }

            System.out.print("Desea seleccionar otro asiento? (1) Si   (2) No: ");
            menu = entrada.nextInt();
        } while (menu == 1);
    }
}
