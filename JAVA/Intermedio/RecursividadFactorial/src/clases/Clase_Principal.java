package clases;

import java.util.Scanner;

public class Clase_Principal {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Recursividad mensajero = new Recursividad();
        
        System.out.print("Numero con que desea ver su factorial: ");
        mensajero.Contador(entrada.nextInt());
        mensajero.Resultado();
    }
}
