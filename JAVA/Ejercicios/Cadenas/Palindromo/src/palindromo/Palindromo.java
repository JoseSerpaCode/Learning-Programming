package palindromo;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String palabra, palabraAlReves = "";

        System.out.print("Escribe una palabra: ");
        palabra = entrada.nextLine();

        if (palabra.contains(" ")) {
            System.out.println("La palabra contiene espacios");
        } else {
            for (int i = palabra.length() - 1; i >= 0; i--) {
                palabraAlReves += palabra.charAt(i);
            }

            if (palabra.equals(palabraAlReves)) {
                System.out.println("La palabra es palindroma: " + palabra);
            } else {
                System.out.println("La palabra no es palindroma: " + palabra + ", " + palabraAlReves);
            }
        }
    }

}
