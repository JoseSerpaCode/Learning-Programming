package matrices;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {

        //Declaración
        
        int matriz[][] = new int [3][3];
        
        Scanner entrada = new Scanner(System.in);
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor de la matriz con indice de fila " + f + " y columna " + c);
                matriz[f][c] = entrada.nextInt();
            }
        }
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la matriz con indice de fila " + f + 
                        " y columna " + c + " es: " + matriz[f][c]);
            }
        }
    }
    
}
