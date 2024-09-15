import java.util.Scanner;

public class Suma{
  public static void main(String args[]){

   Scanner leer = new Scanner(System.in);
   String nombre = "";
   int num1 = 0, num2 = 0, resultado = 0;

   System.out.println("¿Cuál es tu nombre?");
   nombre = leer.nextLine();

   System.out.println("Introduce el primer valor para la suma:");
   num1 = leer.nextInt();

   System.out.println("Introduce el segundo valor para la suma:");
   num2 = leer.nextInt();

   resultado = num1 + num2;

   System.out.println("Hola " + nombre + ", el resultado de la suma es: " + resultado);
 }
}