package vectores;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        
        //Declaración
        int vector[] = new int [4], vector2 [] = new int[4];
        
        //Asiganción (Manual)
        
        vector[0] = 1;
        vector[1] = 5;
        vector[2] = 2;
        vector[3] = 8;
        
        //Mostrar por pantalla el vector 1 mediante un bucle
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Que contiene el numero: " + vector[i]);
            System.out.println("");
        }
        
        //Asignación del Usuario
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Ingresa el valor del indice " + i + " del vector 2: ");
            vector2[i] = entrada.nextInt();
        }
        
        //Mostrar por pantalla el vector 2 mediante un bucle
        
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Que contiene el numero: " + vector2[i]);
            System.out.println("");
        }
    }
    
}
