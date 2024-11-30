public class Ejercicios_Practica2_1{
  public static void main(String args[]){

   int i = 0, a = 99;

   System.out.println("Serie con for: ");

   for(i=1; i<= 7; i+=2){
    if(i<7){
     System.out.print(i+",");
     System.out.print(a+",");
     a-=2;
    }else{
     System.out.print(i+",");
     System.out.println(a);
    }
   }

   System.out.println("");
   System.out.println("Serie con while: ");

   i = 1;

   while(i<= 7){
     i+=2
    if(i<7){
     System.out.print(i+",");
     System.out.print(a+",");
     a-=2;
    }else{
     System.out.print(i+",");
     System.out.println(a);
    }
    i++;
   }

   System.out.println("");
   System.out.println("Serie con do-while: ");

   i=1;

   do{
    if(i<7){
     i+=2
     System.out.print(i+",");
     System.out.print(a+",");
     a-=2;
    }else{
     System.out.print(i+",");
     System.out.println(a);
    }
    i++;

  }while(i<=7);

 }
}