package arbolnavidad;

import java.util.Scanner;
import java.util.Random;

public class ArbolNavidad {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Obtener datos por consola
        int tamArbol; //Inicializar variable del tamaño del arbol
        String CaracteresDeseados = "#+ox*"; //Caracteres que quiero que se generen
        Random rnd = new Random(); // Variable para generar el valor aleatorio

        //Establecer el tamaño del arbol (Debe ser mayor o igual a 3)
        do {
            System.out.print("¿De qué tamaño desea que sea el arbol? (Altura min: 3): ");
            tamArbol = entrada.nextInt();
        } while (tamArbol < 3);

        //Dibujar cada fila del arbol
        for (int fila = 0; fila < tamArbol; fila++) {

            //Dibujar espacios de cada fila
            for (int espacios = 0; espacios < (tamArbol - fila - 1); espacios++) {
                System.out.print(" ");
            }

            //Dibujar Elementos del arbol (Hojas y Decoraciones)
            for (int elementos = 0; elementos <= (fila * 2); elementos++) {
                if (elementos == 0 || elementos == (fila * 2)) { //Si es el primer elemento del arbol o el último, se pinta como un *
                    System.out.print("*");
                } else { //El resto de elementos se pintan de forma aleatoria entre: #, +, o, x, *
                    char decoracion;
                    //Si el elemento no se encuentra entre los deseados, se vuelve a generar otro de forma aleatoria
                    do {
                        decoracion = (char) (rnd.nextInt(121) + 35);
                    } while (CaracteresDeseados.indexOf(decoracion) < 0);

                    System.out.print(decoracion);
                }
            }
            System.out.println("");
        }

        //Dibujar espacios del tronco
        for (int espaciosTronco = 0; espaciosTronco < (tamArbol - 2); espaciosTronco++) {
            System.out.print(" ");
        }

        //Dibujar Tronco
        for (int Tronco = 0; Tronco < 3; Tronco++) {
            System.out.print("|");
        }
        
        System.out.println("");
    }
}
