package longitudmayusculas;

import java.util.Scanner;

public class LongitudMayusculas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escribe una palabra: ");
        String palabra = entrada.nextLine();
        
        System.out.println("Longitud de la palabra: " + palabra.length());
        System.out.println("La palabra en mayúscula: " + palabra.toUpperCase());
    }
}
