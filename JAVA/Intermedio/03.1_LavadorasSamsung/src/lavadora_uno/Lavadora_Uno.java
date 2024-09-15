package lavadora_uno;
import Libreria.Lavadora;
import java.util.Scanner;


public class Lavadora_Uno {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Tipo de ropa a depositar: ");
        System.out.println("Ropa blanca (1) / Ropa de Color (2)");
        int tipoR = entrada.nextInt();  // Variable que almacena el tipo de ropa
        
        System.out.println("Kilos de ropa a depositar: ");
        int kilos = entrada.nextInt();  // Variable que almacena el peso de la ropa
        
        Lavadora mensajero = new Lavadora(kilos, tipoR);    // mensajero --> Variable de tipo Lavadora (constructor)
        mensajero.setTipoR(2);
        mensajero.setKilos(12);
        System.out.println("El tipo de ropa es: " + mensajero.getTipoR());
        System.out.println("Simpre serán " + mensajero.getKilos() + " kilos");
        mensajero.CicloFinalizado();
    }
    
}
