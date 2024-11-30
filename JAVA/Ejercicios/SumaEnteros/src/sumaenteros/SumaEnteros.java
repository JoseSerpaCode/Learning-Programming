/*  
    Crea un programa que pida dos números enteros al usuario y calcule su suma. 
    Asegúrate de manejar posibles errores si el usuario ingresa algo que no sea un número.
 */
package sumaenteros;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author joses
 */
public class SumaEnteros {

    static void sumaNumeros() {
        
        Scanner entrada = new Scanner(System.in);
        
        try {
            int num1, num2;

            System.out.println("Bienvenido al sistema de números enteros \n");

            System.out.print("Escriba el valor del número 1: ");
            num1 = entrada.nextInt();

            System.out.print("\n Escriba el valor del número 2: ");
            num2 = entrada.nextInt();

            int suma = num1 + num2;
            System.out.println("\n La suma de los números es: " + suma);

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número entero válido.\n");
        }
    }

    public static void main(String[] args) {
        sumaNumeros();
    }

}
