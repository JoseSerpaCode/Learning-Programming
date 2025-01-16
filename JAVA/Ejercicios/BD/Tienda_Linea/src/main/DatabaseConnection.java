package main;

import java.sql.*;

/**
 * La clase DatabaseConnection maneja la conexión a la base de datos.
 * Utiliza el patrón Singleton para asegurar que solo exista una instancia de la conexión.
 */
public class DatabaseConnection {

    // Instancia única de la clase (patrón Singleton)
    private static DatabaseConnection instancia;

    // Conexión a la base de datos
    private Connection conn;

    // Datos necesarios para la conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/tienda_linea";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    /**
     * Constructor privado para evitar instanciación directa.
     * Establece la conexión a la base de datos.
     */
    private DatabaseConnection() {
        try {
            this.conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }

    /**
     * Obtiene la instancia única de DatabaseConnection.
     * Si la instancia no existe, la crea.
     *
     * @return La instancia única de DatabaseConnection.
     */
    public static DatabaseConnection getInstancia() {
        if (instancia == null) {
            instancia = new DatabaseConnection();
        }
        return instancia;
    }

    /**
     * Obtiene la conexión a la base de datos.
     *
     * @return La conexión a la base de datos.
     */
    public Connection getConexion() {
        return conn;
    }

    /**
     * Cierra la conexión a la base de datos.
     * Si la conexión está abierta, la cierra y muestra un mensaje de confirmación.
     * Si ocurre un error al cerrar la conexión, muestra un mensaje de error.
     */
    public void cerrarConexion() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexión cerrada exitosamente");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión con la base de datos: " + e.getMessage());
            }
        }
    }
}