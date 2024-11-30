package reversocadena;

import java.util.Scanner;

public class ReversoCadena {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String palabra, palabraAlReves = "";
        
        System.out.print("Escribe una palabra: ");
        palabra = entrada.nextLine();
        
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraAlReves += palabra.charAt(i);
        }
        
        System.out.println("El reverso de la palabra " + palabra + " es: " + palabraAlReves);
        
        
    // Utilizar StringBuilder para construir la palabra al revés
    
        StringBuilder reversoBuilder = new StringBuilder(palabra);
        reversoBuilder.reverse();
        palabraAlReves = reversoBuilder.toString();
        
        System.out.println("El reverso de la palabra " + palabra + " es: " + palabraAlReves);
    }
    
}
