package palabrasunicas;

import java.util.Scanner;

public class PalabrasUnicas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String frase, palabraNueva, palabraAnterior = "";
        int cantidadPalabrasUnicas = 0;
        
        System.out.print("Escribe una frase: ");
        frase = entrada.nextLine();
        
        int i = 0;
        while (i < frase.length()) {
            int indiceEspacio = frase.indexOf(" ", i);

            if (indiceEspacio == -1) {
                indiceEspacio = frase.length();
            }

            palabraNueva = frase.substring(i, indiceEspacio);

            if (!palabraNueva.equalsIgnoreCase(palabraAnterior)) {
                cantidadPalabrasUnicas++;
            }

            palabraAnterior = palabraNueva;
            i = indiceEspacio + 1;
        }

        System.out.println("La cantidad de palabras únicas es: " + cantidadPalabrasUnicas);
    }
    
}
