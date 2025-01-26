package biblioteca.util;

import java.util.Scanner;

public class ValidarOpcion {

    public int isNumber(Scanner scanner, int min, int max) {
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= min && number <= max) {
                    return number;
                }
            }
            System.out.println("Debe ser un valor número entre: " + min + " - " + max);
        }
    }
    
    public void separador(){
        System.out.println("-".repeat(80));
    }

}
