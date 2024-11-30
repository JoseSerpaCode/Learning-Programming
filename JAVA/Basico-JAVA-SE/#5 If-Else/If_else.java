public class If_else{
  public static void main(String args[]){

   int mate = 5;
   int bio = 8;
   int qui = 7;
   float promedio = 0;

   promedio = (mate + bio + qui)/3;

   if(promedio >=6){
    System.out.println("El estudiante aprobo con un promedio de " + promedio);
   } else{
     System.out.println("El estudiante reprobo con un promedio de " + promedio);
   }

   if(mate >=6){
    System.out.println("El estudiante aprobo la materia de matematicas con una nota de " + mate);
   } else{
     System.out.println("El estudiante reprobo la materia de matematicas con una nota de " + mate);
   }

   if(bio >=6){
    System.out.println("El estudiante aprobo la materia de biologia con una nota de " + bio);
   } else{
     System.out.println("El estudiante reprobo la materia de biologia con una nota de " + bio);
   }

   if(qui >=6){
    System.out.println("El estudiante aprobo la materia de qui con una nota de " + qui);
   } else{
     System.out.println("El estudiante reprobo la materia de qui con una nota de " + qui);
   }
 }
}