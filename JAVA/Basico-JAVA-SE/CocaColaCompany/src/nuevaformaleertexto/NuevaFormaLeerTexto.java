package nuevaformaleertexto;

import java.util.Scanner;

public class NuevaFormaLeerTexto {

    private static final int CLAVE_INVALIDA = -2;
    private static final int SIN_DERECHO = -1;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido al sistema vacacional de Coca-Cola Company");

        System.out.print("¿Cuál es el nombre del trabajador? ");
        String nombre = leer.nextLine();

        int ant = leerInt(leer, "¿Cuántos años tiene de servicio? ");
        int clave = leerInt(leer, "¿Cuál es la clave del departamento? ");

        int diasVacaciones = calcularVacaciones(clave, ant);

        mostrarResultado(nombre, diasVacaciones);
    }

    public static int leerInt(Scanner leer, String mensaje) {
        System.out.print(mensaje);
        while (!leer.hasNextInt()) {
            System.out.println("Entrada inválida. Intenta de nuevo.");
            System.out.print(mensaje);
            leer.next();
        }
        return leer.nextInt();
    }

    public static int calcularVacaciones(int clave, int ant) {
        if (ant <= 0) {
            return SIN_DERECHO;
        }

        switch (clave) {
            case 1:
                return (ant == 1) ? 6 : (ant <= 6 ? 14 : 20);
            case 2:
                return (ant == 1) ? 7 : (ant <= 6 ? 15 : 22);
            case 3:
                return (ant == 1) ? 10 : (ant <= 6 ? 20 : 30);
            default:
                return CLAVE_INVALIDA;
        }
    }

    public static void mostrarResultado(String nombre, int diasVacaciones) {
        if (diasVacaciones >= 0) {
            System.out.printf("Hola %s, recibirás %d días de vacaciones.%n", nombre, diasVacaciones);
        } else if (diasVacaciones == SIN_DERECHO) {
            System.out.printf("Hola %s, aún no tienes derecho a vacaciones.%n", nombre);
        } else {
            System.out.println("Error, la clave del departamento no existe");
        }
    }
}
