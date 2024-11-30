import java.util.Scanner;

public class Matrices_dinamicas{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   int filas = 0, columnas= 0, contador = 1;

   System.out.print("¿Cuántas Filas?:");
   filas = in.nextInt();

   System.out.print("¿Cuántas Columnas?:");
   columnas = in.nextInt();

   int numeros[][] = new int [filas][columnas];

   for(int j=0; j < filas; j++){
    for(int i=0; i < columnas; i++){

      numeros[j][i] = contador;
      contador++;
      System.out.print("["+numeros[j][i]+"]");
    }
     System.out.println("");
   }

 }
}