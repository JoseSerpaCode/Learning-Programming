package contarocurrenciasvector;

import java.util.Scanner;

public class ContarOcurrenciasVector {

    public static void main(String[] args) {
        //Inicializar variable userInput
        Scanner userInput = new Scanner(System.in);
        int saveNumberTree = 0;
        
        int[] numInt = new int [15];
        
        for (int index = 0; index < numInt.length; index++) {
            System.out.print("Enter a number in position " + index + ": ");
            int readNum = userInput.nextInt();
            
            if (readNum == 3) {
                saveNumberTree += 1;
            }
        }
        
        System.out.println("Number 3 was loaded a total of " + saveNumberTree + " times");
        
        //Cerrar el Scanenr
        userInput.close();
    }
}
