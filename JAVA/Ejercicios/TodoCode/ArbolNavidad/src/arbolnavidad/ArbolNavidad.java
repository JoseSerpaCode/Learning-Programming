package arbolnavidad;

import java.util.Scanner;

public class ArbolNavidad {

    public static void main(String[] args) {

        int tamArbol;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("De que tamaño quieres que sea el arbol? (Min. altura 3): ");
            tamArbol = entrada.nextInt();
        } while (tamArbol < 3);

        //Bucle para cada fila del arbol
        for (int fila = 0; fila <= tamArbol - 1; fila++) {

            //bucle para los espacios
            for (int espacios = 0; espacios < (tamArbol - fila - 1); espacios++) {
                System.out.print(" ");
            }

            //bucle para los asteriscos
            for (int asterisco = 0; asterisco < (fila * 2) + 1; asterisco++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        //Crear tronco
        int largoTronco = tamArbol - 2;
        for (int base = 0; base < largoTronco; base++) {
            
            //Espacios
            for (int espacios = 0; espacios < (tamArbol - 2); espacios++) {
                System.out.print(" ");
            }
            
            //Barritas
            for (int barritas = 0; barritas < 3; barritas++) {
                System.out.print("|");
            }
            
            System.out.println("");
        }
    }

}
