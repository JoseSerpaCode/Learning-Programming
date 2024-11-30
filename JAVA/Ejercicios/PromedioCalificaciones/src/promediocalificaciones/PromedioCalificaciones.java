package promediocalificaciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author José Serpa Medina
 */
public class PromedioCalificaciones {

    public static void main(String[] args) {
        calificaciones();
    }

    static void calificaciones() {

        int menu = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            int cantCalificaciones = 0;
            int totalCalificaciones = 0;

            try {
                System.out.println("Bienvenido al Sistema de calificaciones \n");
                System.out.print("¿Cuantas calificaciones desea ingresar?: ");
                cantCalificaciones = entrada.nextInt();

                if (cantCalificaciones <= 0) {
                    System.out.println("ERROR! La cantidad debe ser mayor a cero");
                } else {

                    for (int i = 0; i < cantCalificaciones; i++) {

                        int calificacion;

                        try {

                            System.out.println("Ingrese la calificación de la materia número " + (i + 1));
                            calificacion = entrada.nextInt();

                            if (calificacion >= 0 && calificacion <= 100) {
                                totalCalificaciones += calificacion;
                            } else {
                                System.out.println("Recuerde que las calificaciones deben ser números enteros entre 0 y 100");
                                i--;
                            }

                        } catch (InputMismatchException e) {

                            System.out.println("Error: Ingrese un número válido.\n");
                            entrada.nextLine();
                            i--;

                        }
                    }

                    float promedio = totalCalificaciones / cantCalificaciones;
                    System.out.println("El promedio de notas es: " + promedio);
                    System.out.print("Tu calificación es: ");

                    if (promedio >= 90 && promedio <= 100) {
                        System.out.println("EXCELENTE");
                    } else if (promedio >= 80 && promedio < 90) {
                        System.out.println("MUY BUENO");
                    } else if (promedio >= 70 && promedio < 80) {
                        System.out.println("BUENO");
                    } else if (promedio >= 60 && promedio < 70) {
                        System.out.println("REGULAR");
                    } else {
                        System.out.println("INSUFICIENTE");
                    }

                }

            } catch (Exception e) {
                System.out.println("Error: Ingrese un número entero válido.\n");
                entrada.nextLine();
            } finally {
                System.out.println("Desea volver al inicio? (1) Si   (2) No");

                while (true) { // Bucle infinito hasta que se reciba una entrada válida
                    if (entrada.hasNextInt()) { // Verifica si la entrada es un número
                        menu = entrada.nextInt();
                        if (menu == 1 || menu == 2) { // Verifica si el número es válido (1 o 2)
                            break; // Sal del bucle si la entrada es válida
                        } else {
                            System.out.println("Por favor ingrese 1 o 2.");
                        }
                    } else {
                        System.out.println("Por favor ingrese 1 o 2.");
                        entrada.nextLine(); // Limpia el buffer
                    }
                }
            }

        } while (menu == 1);
    }

}
