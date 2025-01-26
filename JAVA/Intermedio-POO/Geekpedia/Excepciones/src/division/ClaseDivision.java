package division;

import java.util.Scanner;

public class ClaseDivision {

    public static void main(String[] args) {

        try { //Codigo

            int Valor1, Valor2, resultado;
            Scanner entrada = new Scanner(System.in);

            System.out.print("Dame el primer valor: ");
            Valor1 = entrada.nextInt();

            System.out.print("Dame el segundo valor: ");
            Valor2 = entrada.nextInt();

            resultado = Valor1 / Valor2;

            System.out.println("El resultado de la division es: " + resultado);

        } catch (Exception e) { //Comportamiento si ocurre un error
            System.out.println("Error!" + e);
        } finally {
            System.out.println("Operacion Concluida");
        }
    }
}
