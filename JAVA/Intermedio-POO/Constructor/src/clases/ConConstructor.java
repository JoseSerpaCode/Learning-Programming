package clases;

import java.util.Scanner;

public class ConConstructor {

    public ConConstructor() {
        String nombre;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribre tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}