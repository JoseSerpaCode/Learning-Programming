package ejercicio3;

import java.util.Scanner;

public class PalabraSalir {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String keyWord = "Salir";
        String word = "";
        
        while (!word.equals(keyWord)) {            
            System.out.print("Ingrese una palabra: ");
            word = entrada.nextLine();
        }
    }
}
