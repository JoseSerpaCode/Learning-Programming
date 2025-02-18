package com.mycompany.pruebamaven;

import java.sql.*;

public class PruebaMaven {

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("", "", "")) {
            
        } catch (SQLException e) {
        }
    }
}
