/*  
    Crea un programa que pida dos números enteros al usuario y calcule su suma. 
    Asegúrate de manejar posibles errores si el usuario ingresa algo que no sea un número.
 */
package sumaenteros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CicloFor {

    static void sumaNumeros() {
        Scanner entrada = new Scanner(System.in);
        int menu = 0;
        do {
            try {
                int suma = 0;
                System.out.println("Bienvenido al sistema de números enteros \n");

                System.out.print("¿Cuántos números desea sumar?: ");
                int cantNum = entrada.nextInt();

                //Si queremos que sean solo números positivos
                if (cantNum <= 0) {
                    System.out.println("Error: La cantidad de números debe ser mayor a cero.\n");
                    continue; // Volver al inicio del `do-while`
                }

                for (int i = 0; i < cantNum; i++) {
                    System.out.print("Ingrese el valor del número " + (i + 1) + ": ");
                    int num = entrada.nextInt();

                    suma += num;
                }

                System.out.println("La suma total es: " + suma);

            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero válido.\n");
                entrada.nextLine(); // Limpiar el buffer
            } finally {
                System.out.println("¿Desea realizar otra suma?: Si (1)  No (2)");
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

    public static void main(String[] args) {
        sumaNumeros();
    }
}
