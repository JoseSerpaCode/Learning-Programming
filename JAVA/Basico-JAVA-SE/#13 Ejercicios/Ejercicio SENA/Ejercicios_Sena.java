public class Ejercicios_Sena{
  public static void main(String args[]){

   int i = 1;

   System.out.println("Serie con for: ");

   for(i=1; i<= 10; i++){
       System.out.print(i+", ");
   }

   System.out.println("");
   System.out.println("Serie con while: ");

   i=1;

   while(i< 50){
     System.out.print(i+", ");
     i+=2;
   }

   System.out.println("");
   System.out.println("Serie con do while: ");

   i=1;

   do{

    System.out.print(i+",");
    i+=3;

  }while(i<=100);

 }
}