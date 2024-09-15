package clases;

public class Recursividad {
    
    //forma 1
    
    private int a = 1;
    
    public void Contador(){
        if(a <= 5){
            System.out.print(a + " ");
            a += 1;
            Contador();
        }
    }
    
    //forma 2
    
    public void Contador2(int x){
        if(x <= 5){
            System.out.print(x + " ");
            Contador2(x + 1);
        }
    }
}
