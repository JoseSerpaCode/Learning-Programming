package clases;

public class Recursividad {
    
    int resultado = 1;
    
    public void Contador(int x){
        if(x > 0){
            resultado = resultado* x;
            Contador(x-1);
        }
    }
    
    public void Resultado(){
        System.out.println("El factorial del numero es: " + resultado);
    }
}
