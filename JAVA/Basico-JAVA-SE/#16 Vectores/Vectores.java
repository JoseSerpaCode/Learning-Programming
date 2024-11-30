import java.util.Scanner;

public class Vectores{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   int longitud = 0, i = 0;

   System.out.print("¿Cuántos números desea ingresar?");
   longitud = in.nextInt();

   int vector[] = new int [longitud];

   for(i=0; i < vector.length; i++){

     System.out.print("Escribe el número de la posición " + (i+1) + ": ");
     vector[i] = in.nextInt();
   }

   for(i=0; i < vector.length; i++){
     System.out.println("El número de la posición " + (i+1) + " es: " + vector[i]);
     System.out.println("");
   }

 }
}