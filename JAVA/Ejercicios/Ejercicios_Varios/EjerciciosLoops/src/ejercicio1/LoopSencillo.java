package ejercicio1;

import java.util.Scanner;

public class LoopSencillo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un limite: ");
        int limit = entrada.nextInt();
        
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }
    }
}
