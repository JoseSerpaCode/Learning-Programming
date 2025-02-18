package com.mycompany.pruebamaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class DatabaseConnection {
    private static  final String URL = "";
    private static  final String USERNAME = "";
    private static  final String PASSWORD = "";

    public void obtenerConexion(){
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {


        } catch (SQLException e) {
            System.out.println("Error al conectarse: " + e.getMessage());
        }
    }

}
