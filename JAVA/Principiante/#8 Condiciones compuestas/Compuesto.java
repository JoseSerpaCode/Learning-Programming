import java.util.Scanner;

public class Compuesto{
  public static void main(String args[]){

   Scanner leer = new Scanner(System.in);
   String nombre = "";
   int ant = 0, clave = 0;

   System.out.println("");
   System.out.println(" *Bienvenido al sistema vacacional de Coca-Cola Company*");
   System.out.println("");

   System.out.print("¿Cuál es el nombre del trabajador?: ");
   nombre = leer.nextLine();
   System.out.println("");

   System.out.print("¿Cuantos años tiene de servicio?: ");
   ant = leer.nextInt();
   System.out.println("");

   System.out.print("¿Cuál es la clave del departamento?: ");
   clave = leer.nextInt();
   System.out.println("");

   if(clave == 1){
    if(ant == 1){
     System.out.println("Hola " + nombre + ", recibirás 6 dias de vacaciones");

    } else  if(ant >= 2 && ant <= 6){
     System.out.println("Hola " + nombre + ", recibirás 14 dias de vacaciones");

    } else  if(ant >= 7){
     System.out.println("Hola " + nombre + ", recibirás 20 dias de vacaciones");

    } else  if(ant == 0){
     System.out.println("Hola " + nombre + ", aún no tienes derecho a vacaciones");
    }
   }

   if(clave == 2){
    if(ant == 1){
     System.out.println("Hola " + nombre + ", recibirás 7 dias de vacaciones");

    } else  if(ant >= 2 && ant <= 6){
     System.out.println("Hola " + nombre + ", recibirás 15 dias de vacaciones");

    } else  if(ant >= 7){
     System.out.println("Hola " + nombre + ", recibirás 22 dias de vacaciones");

    } else  if(ant == 0){
     System.out.println("Hola " + nombre + ", aún no tienes derecho a vacaciones");
    }
   }

   if(clave == 3){
    if(ant == 1){
     System.out.println("Hola " + nombre + ", recibirás 10 dias de vacaciones");

    } else  if(ant >= 2 && ant <= 6){
     System.out.println("Hola " + nombre + ", recibirás 20 dias de vacaciones");

    } else  if(ant >= 7){
     System.out.println("Hola " + nombre + ", recibirás 30 dias de vacaciones");

    } else  if(ant == 0){
     System.out.println("Hola " + nombre + ", aún no tienes derecho a vacaciones");
    }

   } else  if(clave < 1 || clave > 3){
    System.out.println("Error, la clave del departamento no existe");
   }
 }
}