package pruebatecnicatrainee;

import java.util.Scanner;

public class PruebaTecnicaTrainee {

    // Matriz que representa el estado de los asientos del teatro (0 = libre, 1 = ocupado)
    static int[][] asientosTeatro = new int[10][10];
    // Escáner para capturar la entrada del usuario
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // Inicia el menú principal del teatro
        menuTeatro();
    }

    // Método para mostrar el mapa de asientos del teatro
    public static void mostrarAsientos() {
        // Constantes para representar el estado de los asientos
        final char LIBRE = 'L';  // Libre
        final char OCUPADO = 'X';  // Ocupado

        System.out.println("Mapa de asientos:");
        // Recorre las filas de la matriz
        for (int filas = 0; filas < 10; filas++) {
            System.out.print("Fila " + (filas + 1) + ": "); // Muestra el número de fila
            // Recorre las columnas de cada fila
            for (int columnas = 0; columnas < 10; columnas++) {
                System.out.print("[");
                // Determina si el asiento está libre u ocupado
                if (asientosTeatro[filas][columnas] == 0) {
                    System.out.print(LIBRE);
                } else {
                    System.out.print(OCUPADO);
                }
                System.out.print("] ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }

    // Método para reservar un asiento
    public static void reservarAsiento() {
        System.out.print("Elija la fila (1-10): ");
        // Captura y valida la fila seleccionada por el usuario
        int fila = validarAsiento(entrada) - 1;

        System.out.print("Elija la columna (1-10): ");
        // Captura y valida la columna seleccionada por el usuario
        int columna = validarAsiento(entrada) - 1;

        // Verifica si el asiento está libre
        if (asientosTeatro[fila][columna] == 0) {
            System.out.println("Asiento seleccionado correctamente!");
            // Marca el asiento como ocupado
            asientosTeatro[fila][columna] = 1;
        } else {
            System.out.println("No se ha podido seleccionar el asiento. ESTADO: OCUPADO");
        }
    }

    // Método que muestra el menú principal del sistema
    public static void menuTeatro() {
        while (true) { // Bucle infinito hasta que el usuario decida salir
            System.out.println("---------------------------------------------");
            System.out.println("**  Bienvenido al Teatro!   **");
            System.out.println("(1) Mostrar asientos");
            System.out.println("(2) Seleccionar asientos");
            System.out.println("(3) Salir");
            System.out.print("* Por favor seleccione una opción: ");

            // Verifica si el usuario ingresó un número válido
            if (entrada.hasNextInt()) {
                int menu = entrada.nextInt(); // Captura la opción del menú
                System.out.println("---------------------------------------------");

                // Ejecuta la acción correspondiente según la opción seleccionada
                switch (menu) {
                    case 1 -> mostrarAsientos(); // Mostrar el mapa de asientos
                    case 2 -> reservarAsiento(); // Reservar un asiento
                    case 3 -> {
                        // Mensaje de despedida y cierre del programa
                        System.out.println("Muchas gracias por usar el servicio!");
                        System.out.println("Saliendo...");
                        System.exit(0); // Finaliza la ejecución del programa
                    }
                    default -> System.out.println("Opción inválida. Intente nuevamente."); // Opción no válida
                }
            } else {
                // Manejo de entradas no numéricas
                System.out.print("Por favor, ingrese un número válido: ");
                entrada.next(); // Limpia la entrada incorrecta
            }
        }
    }

    // Método para validar las entradas de fila y columna
    public static int validarAsiento(Scanner entrada) {
        int asiento;
        while (true) { // Bucle que se repite hasta que el usuario ingrese un valor válido
            if (entrada.hasNextInt()) {
                asiento = entrada.nextInt(); // Captura la entrada del usuario
                // Verifica si el número ingresado está en el rango permitido
                if (asiento >= 1 && asiento <= 10) {
                    return asiento; // Devuelve el valor válido
                }
            } else {
                entrada.next(); // Limpia la entrada incorrecta
            }
            // Mensaje de error si la entrada no es válida
            System.out.print("Por favor, ingrese un valor válido (entre 1 y 10): ");
        }
    }
}
