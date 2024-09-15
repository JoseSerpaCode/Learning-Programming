import java.util.Scanner;

public class Strings_{
  public static void main(String args[]){

   Scanner leer = new Scanner(System.in);
   String nombre1 = "", nombre2 = "";

   System.out.println("");
   System.out.println("¿Cuál es el primer nombre?");
   nombre1 = leer.nextLine();

   System.out.println("");
   System.out.println("¿Cuál es el segundo nombre?");
   nombre2 = leer.nextLine();

   if(nombre1.equals(nombre2)){
     System.out.println("Los nombres son iguales");
   } else{
     System.out.println("Los nombres son diferentes");
   }
 }
}