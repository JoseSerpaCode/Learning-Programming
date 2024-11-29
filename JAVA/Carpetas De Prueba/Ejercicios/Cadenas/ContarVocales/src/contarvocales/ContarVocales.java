package contarvocales;

import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String palabra, letra;
        int ContadorVocales = 0;
        
        System.out.print("Escribe una palabra o frase: ");
        palabra = entrada.nextLine();
        
        palabra = palabra.toUpperCase();
        
        for (int i = 0; i < palabra.length(); i++) {
            
            letra = palabra.substring(i, i+1);
            
            if ("A".equals(letra) || "E".equals(letra)  || "I".equals(letra)  || "O".equals(letra)  || "U".equals(letra) ) {
                ContadorVocales += 1;
            }
        }
        
        System.out.println("El número de vocales es: " + ContadorVocales);
    }
}
