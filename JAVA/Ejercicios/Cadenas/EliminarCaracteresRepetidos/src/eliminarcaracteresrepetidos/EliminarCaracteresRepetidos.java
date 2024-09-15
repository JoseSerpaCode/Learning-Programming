package eliminarcaracteresrepetidos;

import java.util.Scanner;

public class EliminarCaracteresRepetidos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String cadena, cadenaFinal, letra, letraNueva = "";
        StringBuilder stringBuilder = new StringBuilder();
        
        System.out.println("Escribe una palabra o frase: ");
        cadena = entrada.nextLine();
        
        for (int i = 0; i < cadena.length(); i++) {
            
            letra = cadena.substring(i, i+1);
            
            if (!letraNueva.equals(letra)) {
                stringBuilder.append(letra);
            }
            letraNueva = letra;
        }
        
        cadenaFinal = stringBuilder.toString();
        System.out.println(cadenaFinal);
    }
    
}
