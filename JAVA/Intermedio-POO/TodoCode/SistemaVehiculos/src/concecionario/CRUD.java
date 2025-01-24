package concecionario;

import java.util.Scanner;
import java.sql.*;

public class CRUD {

    public static void agregarVehiculo(Scanner scanner, Connection conn) {
        try {
            // Solicitar los datos del vehículo
            scanner.nextLine();
            System.out.print("Ingrese la marca: ");
            String marca = scanner.nextLine();
            System.out.print("Ingrese el modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Ingrese el precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese el número de puertas: ");
            int numeroPuertas = scanner.nextInt();

            // Crear el objeto Coche
            Coche coche = new Coche(numeroPuertas, marca, modelo, precio);

            // Preparar la consulta SQL
            String sql = "INSERT INTO vehiculo (marca, modelo, precio, impuesto) VALUES (?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, coche.getMarca());
                stmt.setString(2, coche.getModelo());
                stmt.setDouble(3, coche.getPrecio());
                stmt.setDouble(4, coche.calcularImpuesto());

                // Ejecutar la consulta
                stmt.executeUpdate();
                System.out.println("Vehículo agregado exitosamente!");
            }

        } catch (SQLException e) {
            System.out.println("Error al agregar vehículo: " + e.getMessage());
        }
    }

    public static void actualizarVehiculo(Scanner scanner, Connection conn) {
        try {
            scanner.nextLine();
            System.out.print("Ingrese el ID del vehículo a actualizar: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            System.out.print("Ingrese la nueva marca: ");
            String marca = scanner.nextLine();
            System.out.print("Ingrese el nuevo modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Ingrese el nuevo precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese el nuevo número de puertas: ");
            int numeroPuertas = scanner.nextInt();

            // Preparar la consulta SQL
            String sql = "UPDATE vehiculo SET marca = ?, modelo = ?, precio = ?, numeroPuertas = ? WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, marca);
                stmt.setString(2, modelo);
                stmt.setDouble(3, precio);
                stmt.setInt(4, numeroPuertas);
                stmt.setInt(5, id);

                // Ejecutar la consulta
                stmt.executeUpdate();
                System.out.println("Vehículo actualizado exitosamente!");
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar vehículo: " + e.getMessage());
        }
    }

    public static void eliminarVehiculo(Scanner scanner, Connection conn) {
        try {
            scanner.nextLine();
            System.out.print("Ingrese el ID del vehículo a eliminar: ");
            int id = scanner.nextInt();

            String sql = "DELETE FROM vehiculo WHERE id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
                System.out.println("Vehículo eliminado exitosamente!");
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar vehículo: " + e.getMessage());
        }
    }

    public static void listarVehiculos(Connection conn) {
        try {
            String sql = "SELECT * FROM vehiculo";
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    // Obtener los datos de la base de datos
                    String marca = rs.getString("marca");
                    String modelo = rs.getString("modelo");
                    double precio = rs.getDouble("precio");
                    int numeroPuertas = rs.getInt("numeroPuertas");

                    // Crear el objeto Coche (o Motocicleta, según sea necesario)
                    Coche coche = new Coche(numeroPuertas, marca, modelo, precio);

                    // Mostrar los detalles del vehículo
                    coche.mostrarDetalles();
                    System.out.println("-".repeat(60));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al listar vehículos: " + e.getMessage());
        }
    }

}
