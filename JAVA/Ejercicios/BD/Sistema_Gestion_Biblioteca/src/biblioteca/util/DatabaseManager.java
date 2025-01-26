package biblioteca.util;

import java.sql.*;

public class DatabaseManager {
    private static final String URL = ("jdbc:mysql://localhost:3306/Gestion_Biblioteca");
    private static final String USER = ("root"); 
    private static final String PASSWORD = ("");
    private static DatabaseManager instancia;
    private Connection conn;

    public DatabaseManager() {
        try {
            this.conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error al conectarse con la base de datos: " + e.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }
    
    public static DatabaseManager getInstancia(){
        if (instancia == null) {
            instancia = new DatabaseManager();
        }
        return instancia;
    }
    
    public void cerrarConexion(){
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexion cerrada exitosamente!");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion con la base de datos: " + e.getMessage());
            }
        }
    }
    
}
