package bd_practice_connection;

import java.sql.*;
import java.util.Scanner;

public class BD_Practice_Connection {

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
                int selectMenu = verficarOpcion(scanner);
                scanner.nextLine();
                separador();
                switch (selectMenu) {
                    case 1 ->
                        crearTarea(conn, scanner);
                    case 2 ->
                        listarTarea(conn, scanner);
                    case 3 ->
                        marcarTarea(conn, scanner);
                    case 4 ->
                        eliminarTarea(conn, scanner);
                    case 5 -> {
                        editarTarea(conn, scanner);
                    }
                    case 6 -> {
                        System.out.println("Saliendo...");
                        conn.close();
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

    public static int verficarOpcion(Scanner scanner) {
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

    public static void crearTarea(Connection conn, Scanner scanner) {
        try {
            System.out.print("Titulo: ");
            String titulo = scanner.nextLine();
            System.out.print("Descripción: ");
            String descripcion = scanner.nextLine();

            String sql = ("INSERT INTO tareas (titulo, descripcion) VALUES (?, ?)");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, titulo);
            ps.setString(2, descripcion);
            ps.executeUpdate();

            separador();
            System.out.println("Tarea insertada Correctamente!");

        } catch (SQLException e) {
            System.out.println("Error al insertar Tarea: " + e.getMessage());
        }

    }

    public static void listarTarea(Connection conn, Scanner scanner) {
        
        System.out.println("Desea listar solo las tareas completadas?: s/n");
        String opcion = scanner.nextLine();
        
        try {
            
            String sql = opcion.equals("s") ? "SELECT * FROM tareas WHERE completada = 1" : "SELECT * FROM tareas";
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\n----Lista de tareas----\n");
            while (rs.next()) {
                separador();
                System.out.println("ID: " + rs.getInt("id")
                        + "\t| Titulo: " + rs.getString("titulo")
                        + "\t| Descripcion: " + rs.getString("descripcion"));
                separador();
            }

        } catch (SQLException e) {
            System.out.println("Error al listar Tarea: " + e.getMessage());
        }
    }

    public static void marcarTarea(Connection conn, Scanner scanner) {
        System.out.print("Id de la tarea: ");
        int id = verficarOpcion(scanner);

        String sql = "UPDATE tareas SET completada = 1 WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                separador();
                System.out.println("Tarea marcada correctamente!");
            } else {
                System.out.println("No se encontró una tarea con el ID proporcionado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al marcar tarea: " + e.getMessage());
        }
    }

    public static void eliminarTarea(Connection conn, Scanner scanner) {
        System.out.print("Id de la tarea: ");
        int id = verficarOpcion(scanner);

        String sql = "DELETE FROM tareas WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                separador();
                System.out.println("Tarea eliminada correctamente!");
            } else {
                System.out.println("No se encontró una tarea con el ID proporcionado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar tarea: " + e.getMessage());
        }
    }

    public static void editarTarea(Connection conn, Scanner scanner) {
        System.out.print("Id de la tarea: ");
        int id = verficarOpcion(scanner);
        scanner.nextLine();
        System.out.print("Nuevo titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("Nueva descripción: ");
        String descripcion = scanner.nextLine();

        String sql = "UPDATE tareas SET titulo = ?, descripcion = ? WHERE id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, titulo);
            ps.setString(2, descripcion);
            ps.setInt(3, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                separador();
                System.out.println("Tarea modificada correctamente!");
            } else {
                System.out.println("No se encontró una tarea con el ID proporcionado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al modificadar la tarea: " + e.getMessage());
        }
    }

    public static void separador() {
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
}
