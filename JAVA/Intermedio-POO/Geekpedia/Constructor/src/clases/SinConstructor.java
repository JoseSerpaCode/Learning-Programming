package clases;

import java.util.Scanner;

public class SinConstructor {

    String nombre;
    private Scanner entrada = new Scanner(System.in);
    
    public void PedirNombre(){
        System.out.print("Escribre tu nombre: ");
        nombre = entrada.nextLine();
    }
    
    public void Imprimir(){
        System.out.println("Tu nombre es: " + nombre);
    }
}
