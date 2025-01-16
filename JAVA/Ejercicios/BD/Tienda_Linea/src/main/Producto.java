package main;

import java.sql.*;
import java.util.Scanner;

/**
 * La clase Producto contiene métodos para gestionar productos en la base de datos.
 * Permite agregar productos, mostrar información de los productos y calcular el valor total del inventario.
 */
public class Producto {

    /**
     * Agrega un nuevo producto a la base de datos.
     * Solicita al usuario el nombre, precio y cantidad del producto, y lo inserta en la tabla "productos".
     *
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     * @param conn    La conexión a la base de datos.
     */
    public static void agregarProducto(Scanner scanner, Connection conn) {

        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        String sql = ("INSERT INTO productos(nombre, precio, cantidad) VALUES (?, ?, ?)");

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setDouble(2, precio);
            ps.setInt(3, cantidad);
            ps.executeUpdate();
            System.out.println("Producto agregado correctamente");
        } catch (SQLException e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }
    }

    /**
     * Muestra la información de todos los productos en la base de datos.
     * Recupera y muestra el ID, nombre, precio y cantidad de cada producto.
     *
     * @param conn La conexión a la base de datos.
     */
    public static void mostrarInformacion(Connection conn) {
        String sql = ("SELECT producto_id, nombre, precio, cantidad FROM productos");
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            System.out.println("\n---- Lista de Productos ----\n");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("producto_id")
                        + "\t| Nombre: " + rs.getString("nombre")
                        + "\t| Precio: $" + rs.getDouble("precio")
                        + "\t| Cantidad: " + rs.getInt("cantidad"));
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar la informacion del producto: " + e.getMessage());
        }
    }

    /**
     * Calcula el valor total del inventario.
     * Suma el valor de todos los productos (precio * cantidad) y muestra el resultado.
     *
     * @param conn La conexión a la base de datos.
     */
    public static void calcularValorTotal(Connection conn) {
        String sql = ("SELECT SUM(cantidad * precio) AS valorTotal FROM productos");
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("Valor total del inventario: $" + rs.getDouble("valorTotal"));
            }
        } catch (SQLException e) {
            System.out.println("Error al calcular el valor total: " + e.getMessage());
        }
    }
}