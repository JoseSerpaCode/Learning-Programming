package contarocurrenciasvector;

import java.util.Scanner;

public class ContarOcurrenciasVector {

    public static void main(String[] args) {
        //Inicializar variable userInput
        Scanner userInput = new Scanner(System.in);
        int saveNumberTree = 0;
        
        int[] numIntVector = new int [15];
        
        for (int index = 0; index < numIntVector.length; index++) {
            System.out.print("Enter a number in position " + index + ": ");
            numIntVector[index] = userInput.nextInt();
            
            if (numIntVector[index] == 3) {
                saveNumberTree += 1;
            }
        }
        
        System.out.println("Number 3 was loaded a total of " + saveNumberTree + " times");
        
        //Cerrar el Scanenr
        userInput.close();
    }
}
