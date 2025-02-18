package cifrado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar mensaje al usuario
        System.out.print("Ingrese el mensaje a cifrar (solo mayúsculas, sin espacios): ");
        String mensaje = scanner.nextLine().toUpperCase();

        // Solicitar clave
        System.out.print("Ingrese los valores del vector clave separados por espacios: ");
        String[] claveStr = scanner.nextLine().split(" ");
        int[] clave = new int[claveStr.length];

        // Convertir clave a enteros
        for (int i = 0; i < claveStr.length; i++) {
            clave[i] = Integer.parseInt(claveStr[i]);
        }

        // Cifrado y descifrado
        String mensajeCifrado = cifrar(mensaje, clave);
        String mensajeDescifrado = descifrar(mensajeCifrado, clave);

        // Mostrar resultados
        System.out.println("Mensaje cifrado: " + mensajeCifrado);
        System.out.println("Mensaje descifrado: " + mensajeDescifrado);

        scanner.close();
    }

    // Método para cifrar el mensaje
    public static String cifrar(String mensaje, int[] clave) {
        StringBuilder cifrado = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++) {
            int letra = mensaje.charAt(i) - 'A'; // Convertimos a índice (A=0, B=1, ..., Z=25)
            int claveValor = clave[i % clave.length]; // Aplicamos clave cíclica
            int nuevaLetra = (letra + claveValor) % 26; // Suma y ajuste módulo 26
            cifrado.append((char) ('A' + nuevaLetra)); // Convertimos de vuelta a char
        }
        return cifrado.toString();
    }

    // Método para descifrar el mensaje
    public static String descifrar(String cifrado, int[] clave) {
        StringBuilder descifrado = new StringBuilder();

        for (int i = 0; i < cifrado.length(); i++) {
            int letra = cifrado.charAt(i) - 'A';
            int claveValor = clave[i % clave.length];
            int nuevaLetra = (letra - claveValor + 26) % 26; // Restamos y ajustamos valores negativos
            descifrado.append((char) ('A' + nuevaLetra));
        }
        return descifrado.toString();
    }
}
