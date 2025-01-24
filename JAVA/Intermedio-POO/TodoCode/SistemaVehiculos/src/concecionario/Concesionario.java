package concecionario;

import java.sql.*;
import java.util.Scanner;

public class Concesionario {

    public static void main(String[] args) {

        ConexionBD conexionbd = ConexionBD.getInstancia();
        Connection conn = conexionbd.getConn();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Menu administrativo del concecionario");
                System.out.println("(1) Agregar Vehiculo");
                System.out.println("(2) Actualizar Vehiculo");
                System.out.println("(3) Eliminar Vehiculo");
                System.out.println("(4) Listar Vehiculo");
                System.out.println("(5) Salir");
                int op = ingresarOpcion(scanner, "Elija una opcion (numerica): ", 1, 5);

                switch (op) {
                    case 1 ->
                        CRUD.agregarVehiculo(scanner, conn);
                    case 2 ->
                        CRUD.actualizarVehiculo(scanner, conn);
                    case 3 ->
                        CRUD.eliminarVehiculo(scanner, conn);
                    case 4 ->
                        CRUD.listarVehiculos(conn);
                    case 5 -> {
                        System.out.println("Saliendo...");
                        scanner.close();
                        return;
                    }
                    default ->
                        System.out.println("Seleccione una opcion correcta");
                }
            }
        } catch (Exception e) {
            System.out.println("Error con la clase Scanner: " + e.getMessage());
        } finally {
            conexionbd.cerrarConexion();
        }
    }

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
        }
    }
}
