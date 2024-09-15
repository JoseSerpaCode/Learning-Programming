package suma;
import java.util.Scanner;

public class SumaMain {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame el primer valor: ");
        int ValorUno = entrada.nextInt();
        
        System.out.println("Dame el segundo valor: ");
        int ValorDos = entrada.nextInt();
        
        Suma valores = new Suma(ValorUno, ValorDos);
        valores.Imprimir();
    }
    
}
