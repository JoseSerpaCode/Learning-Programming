package practice_crud;

import java.sql.*;
import java.util.Scanner;

public class Practice_CRUD {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Obtener la instancia única de DatabaseConnection
            DatabaseConnection dbConnection = DatabaseConnection.getInstancia();
            Connection conn = dbConnection.getConexion();

            // Verificar si la conexión es válida
            if (conn == null) {
                return;
            }

            eliminarSocio(conn, scanner);

            // Cerrar la conexión y el scanner
            dbConnection.cerrarConexion();

        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    public static void agregarSocio(Connection conn, Scanner scanner) {
        String sql = ("INSERT INTO socios (nombre, apellido, dni, fk_codigo) VALUES (?, ?, ?, ?)");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("dni: ");
        int dni = scanner.nextInt();
        System.out.print("Codigo: ");
        int fk_codigo = scanner.nextInt();

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, dni);
            ps.setInt(4, fk_codigo);
            ps.executeUpdate();
            System.out.println("Agregado correctamente");

        } catch (SQLException e) {
            System.out.println("Error al agregar Socio: " + e.getMessage());
        }
    }

    public static void consultarInfo(Connection conn, Scanner scanner) {
        String sql = ("""
                      SELECT d.nombre, COUNT(s.num_socio) AS cantidad
                      FROM socios s
                      INNER JOIN deportes d ON s.fk_codigo = d.codigo
                      GROUP BY d.nombre;""");

        try (PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String nombre = rs.getString("d.nombre");
                int cantidad = rs.getInt("cantidad");
                System.out.println("Nombre: " + nombre + "\t Cantidad: " + cantidad);
            }

        } catch (SQLException e) {
            System.out.println("Error al realizar la consulta: " + e.getMessage());
        }
    }

    public static void actualizarInfo(Connection conn, Scanner scanner) {
        // Consulta SQL con parámetros
        String sql = """
                 UPDATE socios 
                 SET nombre = ?, 
                     apellido = ?, 
                     dni = ?, 
                     fk_codigo = ?
                 WHERE num_socio = ?;""";

        // Solicitar datos al usuario
        System.out.print("ID del usuario que desea cambiar: ");
        int num_socio = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("DNI: ");
        int dni = scanner.nextInt(); // dni es un entero
        System.out.print("Código: ");
        int fk_codigo = scanner.nextInt();

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            // Establecer los parámetros
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, dni); // dni es un entero
            ps.setInt(4, fk_codigo);
            ps.setInt(5, num_socio);

            // Ejecutar la actualización
            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Actualizado correctamente");
            } else {
                System.out.println("No se encontró el socio con ID " + num_socio);
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        }
    }

    public static void eliminarSocio(Connection conn, Scanner scanner) {
        // Consulta SQL con parámetros
        String sql = "DELETE FROM socios WHERE num_socio = ?";

        // Solicitar el ID del usuario a eliminar
        System.out.print("ID del usuario a eliminar: ");
        int id = scanner.nextInt();

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            // Establecer el parámetro
            ps.setInt(1, id);

            // Ejecutar la eliminación
            int filasEliminadas = ps.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Socio eliminado correctamente");
            } else {
                System.out.println("No se encontró el socio con ID " + id);
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar socio: " + e.getMessage());
        }
    }
}
