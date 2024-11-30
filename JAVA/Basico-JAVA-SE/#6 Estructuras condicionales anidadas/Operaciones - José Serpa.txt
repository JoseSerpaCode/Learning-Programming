public class Operaciones{
  public static void main(String args[]){

   int operacion = 4;
   int num1 = 5;
   int num2 = 8;
   float resultado = 0;

   if(operacion == 1){
    resultado = num1 + num2;
    System.out.println("El resultado de la suma es " + resultado);

   } else  if(operacion == 2){
    resultado = num1 - num2;
    System.out.println("El resultado de la resta es " + resultado);

   } else  if(operacion == 3){
    resultado = num1 * num2;
    System.out.println("El resultado de la multiplicación es " + resultado);

   } else  if(operacion == 4){
    resultado = num1 / num2;
    System.out.println("El resultado de la división es " + resultado);

   } else {
    System.out.println("La opción elegida no es posible");
   }
 }
}