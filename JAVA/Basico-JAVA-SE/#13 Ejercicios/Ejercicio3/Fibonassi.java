public class Fibonassi{
  public static void main(String args[]){

   int a = 1, b = 0, c = 0, i = 0;

   System.out.println("");
   System.out.println("Serie con for: ");

   for(i=1; i<= 8; i++){
    if(c<21){
      System.out.print("" + c + ",");
      c = a + b;
      b = a;
      a = c;
    }else{
     System.out.println(c);
    }
   }

   System.out.println("");
   System.out.println("Serie con while: ");

   a = 1; b = 0; c = 0; i = 0;

   while(i<=7){
    if(c<21){
      System.out.print("" + c + ",");
      c = a + b;
      b = a;
      a = c;
    }else{
     System.out.println(c);
    }
    i++;
   }

   System.out.println("");
   System.out.println("Serie con do-while: ");

   a = 1; b = 0; c = 0; i = 0;

   do{
    if(c<21){
      System.out.print("" + c + ",");
      c = a + b;
      b = a;
      a = c;
    }else{
     System.out.println(c);
    }
    i++;
   } while(i<=7);

 }
}