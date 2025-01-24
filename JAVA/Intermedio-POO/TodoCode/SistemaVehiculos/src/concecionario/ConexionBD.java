package concecionario;

import java.sql.*;
        
public class ConexionBD {
    
    private static final String URL = ("jdbc:mysql://localhost:3306/concesionario");
    private static final String USERNAME = ("root");
    private static final String PASSWORD = ("");
    private static ConexionBD instancia;
    private Connection conn;
    
    private ConexionBD(){
        try {
            this.conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error al establecer la conexion con la base de datos: " + e.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }
    
    public static ConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }
    
    public void cerrarConexion(){
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexion cerrada exitosamente!");
            } catch (SQLException e) {
                System.out.println("Error al cerra la conexion: " + e.getMessage());
            }
        }
    }
}
