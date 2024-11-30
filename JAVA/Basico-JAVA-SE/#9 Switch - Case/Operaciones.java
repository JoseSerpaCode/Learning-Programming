import java.util.Scanner;

public class Operaciones{
  public static void main(String args[]){

   Scanner leer = new Scanner(System.in);
   int num1 = 0, num2 = 0, resultado = 0, parametro = 0;

   System.out.println("");
   System.out.print("¿Cuál es el primer valor?: ");
   num1 = leer.nextInt();
   System.out.println("");

   System.out.print("¿Cuál es el segundo valor?: ");
   num2 = leer.nextInt();
   System.out.println("");

   System.out.println(" 1: Suma");
   System.out.println("");
   System.out.println(" 2: Resta");
   System.out.println("");
   System.out.println(" 3: Multiplicación");
   System.out.println("");
   System.out.println(" 4: División");
   System.out.println("");

   System.out.print("Seleccione el parametro de la operación: ");
   parametro = leer.nextInt();
   System.out.println("");


   switch(parametro){

    case 1: resultado = num1 + num2;
            System.out.println("El resultado de la suma es " + resultado);
            break;

    case 2: resultado = num1 - num2;
            System.out.println("El resultado de la resta es " + resultado);
            break;

    case 3: resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es " + resultado);
            break;

    case 4: resultado = num1 / num2;
            System.out.println("El resultado de la división es " + resultado);
            break;

    default: System.out.println("Error, la opción no existe");
            break;
   }
 }
}