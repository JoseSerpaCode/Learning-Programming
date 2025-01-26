package biblioteca;

import biblioteca.menus.MenuLibro;
import biblioteca.menus.MenuUsuario;
import biblioteca.util.DatabaseManager;
import biblioteca.util.ValidarOpcion;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ValidarOpcion validarOpcion = new ValidarOpcion();
        Scanner scanner = new Scanner(System.in);

        DatabaseManager databaseManager = DatabaseManager.getInstancia();
        Connection conn = databaseManager.getConn();

        System.out.println("\tBienvenido al sistema de la biblioteca municipal xyz\n");
        System.out.println("(1) Ir al menu de Libros");
        System.out.println("(2) Ir al menu de Prestamos");
        System.out.println("(3) Ir al menu de Usuarios");
        System.out.println("(4) Salir");
        System.out.print("Seleccione una opcion (numerica): ");
        int op = validarOpcion.isNumber(scanner, 1, 4);
        validarOpcion.separador();

        boolean bandera = true;
        while (bandera) {
            switch (op) {
                case 1 -> {
                    MenuLibro menuLibro = new MenuLibro(conn);
                }
                
                case 3 -> {
                    MenuUsuario menuUsuario = new MenuUsuario(conn);
                }
                case 4 -> { 
                    bandera = false;
                    System.out.println("Gracias por utilizar el servicio! Saliendo...");
                }
                default ->
                    throw new AssertionError();
            }
        }

    }
}
