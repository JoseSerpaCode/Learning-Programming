package chatgpt;

import java.sql.*;
import java.util.Scanner;

public class BD_Practice_Connection_2 {

    public static final String URL = ("jdbc:mysql://localhost:3308/Gestion_Tareas");
    public static final String USER = ("root");
    public static final String PASSWORD = ("");

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("**    Menu    **");
                System.out.println("1. Crear tarea");
                System.out.println("2. Listar tareas");
                System.out.println("3. Marcar tarea como completada");
                System.out.println("4. Eliminar Tarea");
                System.out.println("5. Editar Tarea");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                int selectMenu = verificarOpcion(scanner);
                scanner.nextLine();
                separador();
                switch (selectMenu) {
                    case 1 -> crearTarea(conn, scanner);
                    case 2 -> listarTareas(conn, scanner);
                    case 3 -> marcarTarea(conn, scanner);
                    case 4 -> eliminarTarea(conn, scanner);
                    case 5 -> editarTarea(conn, scanner);
                    case 6 -> {
                        System.out.println("Saliendo...");
                        return;
                    }
                    default -> {
                        separador();
                        System.out.println("Seleccione una opción válida!");
                        separador();
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }

    public static int verificarOpcion(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                separador();
                System.out.print("Ingrese un número correcto!: ");
                scanner.next();
            }
        }
    }

    public static boolean verificarId(Connection conn, int id) {
        String sql = "SELECT COUNT(*) FROM tareas WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar el ID: " + e.getMessage());
        }
        return false;
    }

    public static void crearTarea(Connection conn, Scanner scanner) {
        try {
            System.out.print("Titulo: ");
            String titulo = scanner.nextLine().trim();
            System.out.print("Descripción: ");
            String descripcion = scanner.nextLine().trim();

            if (titulo.isEmpty() || descripcion.isEmpty()) {
                System.out.println("El título y la descripción no pueden estar vacíos.");
                return;
            }

            String sql = ("INSERT INTO tareas (titulo, descripcion) VALUES (?, ?)");
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, titulo);
                ps.setString(2, descripcion);
                ps.executeUpdate();

                separador();
                System.out.println("Tarea insertada correctamente!");
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar tarea: " + e.getMessage());
        }
    }

    public static void listarTareas(Connection conn, Scanner scanner) {
        System.out.println("Desea listar solo las tareas completadas? (s/n): ");
        String opcion = scanner.nextLine().trim().toLowerCase();

        try {
            String sql = opcion.equals("s") ? "SELECT * FROM tareas WHERE completada = 1" : "SELECT * FROM tareas";
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

                System.out.println("\n---- Lista de tareas ----\n");
                while (rs.next()) {
                    separador();
                    System.out.println("ID: " + rs.getInt("id")
                            + "\t| Título: " + rs.getString("titulo")
                            + "\t| Descripción: " + rs.getString("descripcion")
                            + "\t| Completada: " + (rs.getBoolean("completada") ? "Sí" : "No"));
                    separador();
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al listar tareas: " + e.getMessage());
        }
    }

    public static void marcarTarea(Connection conn, Scanner scanner) {
        System.out.print("Id de la tarea: ");
        int id = verificarOpcion(scanner);

        if (!verificarId(conn, id)) {
            separador();
            System.out.println("El ID ingresado no existe.");
            return;
        }

        String sql = "UPDATE tareas SET completada = 1 WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();

            separador();
            System.out.println("Tarea marcada como completada correctamente!");
        } catch (SQLException e) {
            System.out.println("Error al marcar tarea: " + e.getMessage());
        }
    }

    public static void eliminarTarea(Connection conn, Scanner scanner) {
        System.out.print("Id de la tarea: ");
        int id = verificarOpcion(scanner);

        if (!verificarId(conn, id)) {
            separador();
            System.out.println("El ID ingresado no existe.");
            return;
        }

        String sql = "DELETE FROM tareas WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();

            separador();
            System.out.println("Tarea eliminada correctamente!");
        } catch (SQLException e) {
            System.out.println("Error al eliminar tarea: " + e.getMessage());
        }
    }

    public static void editarTarea(Connection conn, Scanner scanner) {
        System.out.print("Id de la tarea: ");
        int id = verificarOpcion(scanner);
        scanner.nextLine();

        if (!verificarId(conn, id)) {
            separador();
            System.out.println("El ID ingresado no existe.");
            return;
        }

        System.out.print("Nuevo título: ");
        String titulo = scanner.nextLine().trim();
        System.out.print("Nueva descripción: ");
        String descripcion = scanner.nextLine().trim();

        if (titulo.isEmpty() || descripcion.isEmpty()) {
            System.out.println("El título y la descripción no pueden estar vacíos.");
            return;
        }

        String sql = "UPDATE tareas SET titulo = ?, descripcion = ? WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, titulo);
            ps.setString(2, descripcion);
            ps.setInt(3, id);
            ps.executeUpdate();

            separador();
            System.out.println("Tarea editada correctamente!");
        } catch (SQLException e) {
            System.out.println("Error al editar la tarea: " + e.getMessage());
        }
    }

    public static void separador() {
        System.out.println("-".repeat(40));
    }
}
