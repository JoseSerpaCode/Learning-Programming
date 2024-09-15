package concatenacionsimple;

import java.util.Scanner;

public class ConcatenacionSimple {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String palabra1, palabra2, palabraConcatenada;
        
        System.out.print("Ingresa la palabra 1: ");
        palabra1 = entrada.nextLine();
        
        System.out.print("Ingresa la palabra 2: ");
        palabra2 = entrada.nextLine();
        
        palabraConcatenada = palabra1.concat(palabra2);
        System.out.println("Ejemplo concatenación 1: " + palabraConcatenada);
        
        System.out.println("Ejemplo concatenación 2: " + palabra1 + palabra2);
    }
    
}
