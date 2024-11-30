// Escribe un programa que reciba un número entero desde la consola y determine si es par o impar.
package par_impar;

import java.util.Scanner;

/**
 * @author José Serpa Medina
 */
public class ParImpar {

    static void metodoNumero() {
        try {

            Scanner entrada = new Scanner(System.in);
            int num;

            System.out.println("Bienvenido al sistema de reconocimiento de números pares e impares");
            System.out.print("Escriba un número: ");
            num = entrada.nextInt();

            if ((num % 2) == 0) {
                System.out.println("Es un número par");
            } else {
                System.out.println("Es un número impar");
            }

        } catch (Exception e) {
            System.out.println("Escriba un número Correcto \n");
        }
    }

/*       MEJORA:

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número entero válido.\n");
        } 

*/

    public static void main(String[] args) {
        metodoNumero();
    }

}
