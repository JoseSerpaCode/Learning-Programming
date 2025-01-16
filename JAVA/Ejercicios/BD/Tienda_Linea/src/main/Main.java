package main;

import java.sql.*;
import java.util.Scanner;

/**
 * La clase Main es el punto de entrada del programa.
 * Gestiona la interacción con el usuario y controla el flujo del programa.
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Obtener la instancia única de DatabaseConnection
            DatabaseConnection dbConnection = DatabaseConnection.getInstancia();
            Connection conn = dbConnection.getConexion();

            // Verificar si la conexión es válida
            if (conn == null) {
                return;
            }

            boolean salir = false;

            // Bucle principal del menú
            while (!salir) {
                switch (menu(scanner)) {
                    case 1 ->
                        Producto.agregarProducto(scanner, conn);
                    case 2 ->
                        Producto.mostrarInformacion(conn);
                    case 3 ->
                        Producto.calcularValorTotal(conn);
                    case 4 -> {
                        System.out.println("Saliendo...");
                        salir = true;
                    }
                    default ->
                        System.out.println("Opción no válida.");
                }
            }

            // Cerrar la conexión y el scanner
            dbConnection.cerrarConexion();

        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    /**
     * Muestra el menú principal y obtiene la opción seleccionada por el usuario.
     *
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     * @return La opción seleccionada por el usuario.
     */
    public static int menu(Scanner scanner) {
        System.out.println("\n\tTienda online - Modo: ADMINISTRADOR");
        separador();
        System.out.println("(1) Agregar producto");
        System.out.println("(2) Mostrar la información de los productos.");
        System.out.println("(3) Calcular el valor total del inventario");
        System.out.println("(4) Salir");

        int op = ingresarOpcion(scanner, "\nSeleccione una opción: ", 1, 4);
        return op;
    }

    /**
     * Valida y obtiene una opción numérica del usuario dentro de un rango específico.
     *
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     * @param mensaje El mensaje que se muestra al usuario para solicitar la entrada.
     * @param min     El valor mínimo permitido.
     * @param max     El valor máximo permitido.
     * @return La opción válida ingresada por el usuario.
     */
    public static int ingresarOpcion(Scanner scanner, String mensaje, int min, int max) {
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                int op = scanner.nextInt();
                if (op >= min && op <= max) {
                    return op;
                } else {
                    System.out.println("ERROR: Seleccione una opción entre " + min + " y " + max);
                }
            } else {
                System.out.println("ERROR: Ingrese un número correcto");
                scanner.next();
            }
            separador();
        }
    }

    /**
     * Imprime un separador en la consola para mejorar la legibilidad.
     */
    public static void separador() {
        System.out.println("-".repeat(60));
    }
}