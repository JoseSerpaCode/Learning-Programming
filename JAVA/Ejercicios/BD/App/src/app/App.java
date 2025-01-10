package app;

import java.sql.*;
import java.util.Scanner;

public class App {

    // Configuración de conexión
    private static final String URL = "jdbc:mysql://localhost:3306/ejemplo_java";
    private static final String USER = "root"; // Cambia según tu usuario
    private static final String PASSWORD = ""; // Cambia según tu contraseña

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Conexión exitosa a la base de datos.");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\n--- Menú ---");
                System.out.println("1. Insertar usuario");
                System.out.println("2. Listar usuarios");
                System.out.println("3. Buscar usuario por ID");
                System.out.println("4. Simular API (mostrar datos en JSON)");
                System.out.println("5. Salir");
                System.out.print("Selecciona una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        insertarUsuario(conn, scanner);
                        break;
                    case 2:
                        listarUsuarios(conn);
                        break;
                    case 3:
                        buscarUsuarioPorID(conn, scanner);
                        break;
                    case 4:
                        simularAPI(conn);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        conn.close();
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }

    private static void insertarUsuario(Connection conn, Scanner scanner) {
        try {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            String sql = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, email);
            ps.executeUpdate();

            System.out.println("Usuario insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar usuario: " + e.getMessage());
        }
    }

    private static void listarUsuarios(Connection conn) {
        try {
            String sql = "SELECT * FROM usuarios";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\n--- Lista de Usuarios ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Nombre: " + rs.getString("nombre") +
                                   ", Email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println("Error al listar usuarios: " + e.getMessage());
        }
    }

    private static void buscarUsuarioPorID(Connection conn, Scanner scanner) {
        try {
            System.out.print("ID del usuario: ");
            int id = scanner.nextInt();

            String sql = "SELECT * FROM usuarios WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Nombre: " + rs.getString("nombre") +
                                   ", Email: " + rs.getString("email"));
            } else {
                System.out.println("Usuario no encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar usuario: " + e.getMessage());
        }
    }

    private static void simularAPI(Connection conn) {
        try {
            String sql = "SELECT * FROM usuarios";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\n--- Simulación de API (JSON) ---");
            System.out.print("[");
            boolean first = true;
            while (rs.next()) {
                if (!first) System.out.print(", ");
                System.out.print("{\"id\": " + rs.getInt("id") +
                                 ", \"nombre\": \"" + rs.getString("nombre") + "\"" +
                                 ", \"email\": \"" + rs.getString("email") + "\"}");
                first = false;
            }
            System.out.println("]");
        } catch (SQLException e) {
            System.out.println("Error al simular API: " + e.getMessage());
        }
    }
}
