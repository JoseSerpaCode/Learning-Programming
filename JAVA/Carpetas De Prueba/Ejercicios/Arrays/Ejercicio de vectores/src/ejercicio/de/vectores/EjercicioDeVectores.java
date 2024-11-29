package ejercicio.de.vectores;

import java.util.Scanner;

public class EjercicioDeVectores {
    public static void main(String[] args) {
        
        //Declaración
        Scanner entrada = new Scanner(System.in);
        int vector[] = new int [15], aparicionNumeroTres = 0;
        
        //Bucle para rellenar el vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el valor del indice " + i + ": ");
            vector[i] = entrada.nextInt();
            
            //Condición que almacena el número de veces que aparece el 3
            if (vector[i] == 3) {
                aparicionNumeroTres ++;
            }
        }
        
        System.out.println("La cantidad de veces que aparece el numero 3 es: " + aparicionNumeroTres + " veces");
    }
    
}
