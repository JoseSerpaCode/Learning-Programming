package intercambiovariables;

import java.util.Scanner;

public class IntercambioVariables {
    
    static Scanner entrada = new Scanner(System.in);
    static String mensaje = "Ingrese un valor: ";

    public static void main(String[] args) {
        int var1, var2, almacen;

        System.out.print(mensaje);
        var1 = entrada.nextInt();

        System.out.print(mensaje);
        var2 = entrada.nextInt();

        System.out.println("\nLas variables son: \nVariable 1: " + var1 + "\nVariable 2: " + var2);

        almacen = var1;
        var1 = var2;
        var2 = almacen;

        System.out.println("\nLas variables invertidas son: \nVariable 1: " + var1 + "\nVariable 2: " + var2);

    }

}
