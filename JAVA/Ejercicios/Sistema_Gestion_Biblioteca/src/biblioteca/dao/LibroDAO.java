package biblioteca.dao;

import biblioteca.model.Libro;
import java.sql.*;

public class LibroDAO {

    public void agregarLibro(Connection conn, Libro libro) {
        String sql = "INSERT INTO libro (titulo, autor, anoPublicacion, disponible) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setInt(3, libro.getAnoPublicacion());
            ps.setBoolean(4, libro.isDisponible());
            ps.executeUpdate();
            System.out.println("El libro se ha agregado correctamente!");
        } catch (SQLException e) {
            System.out.println("ERROR AL AGREGAR LIBRO: " + e.getMessage());
        }
    }

    public void actualizarLibro(Connection conn, Libro libro) {
        String sql = "UPDATE libro SET titulo = ?, autor = ?, anoPublicacion = ?, disponible = ? WHERE id_libro = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setInt(3, libro.getAnoPublicacion());
            ps.setBoolean(4, libro.isDisponible());
            ps.setInt(5, libro.getIdLibro());
            ps.executeUpdate();
            System.out.println("El libro se ha actualizado correctamente!");
        } catch (SQLException e) {
            System.out.println("ERROR AL ACTUALIZAR LIBRO: " + e.getMessage());
        }
    }

    public void eliminarLibro(Connection conn, Libro libro) {
        String sql = "DELETE FROM libro WHERE id_libro = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, libro.getIdLibro());
            ps.executeUpdate();
            System.out.println("El libro se ha eliminado correctamente!");
        } catch (SQLException e) {
            System.out.println("ERROR AL ELIMINAR LIBRO: " + e.getMessage());
        }
    }

    public void listarLibro(Connection conn, Libro libro) {
        String sql = "SELECT id_libro, titulo, autor, anoPublicacion, disponible FROM libro WHERE id_libro = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, libro.getIdLibro());

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    imprimirLibro(rs);
                }
            }
        } catch (SQLException e) {
            System.out.println("ERROR AL MOSTRAR EL LIBRO: " + e.getMessage());
        }
    }

    public void listarLibros(Connection conn) {
        String sql = "SELECT id_libro, titulo, autor, anoPublicacion, disponible FROM libro";

        try (PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                imprimirLibro(rs);
            }
        } catch (SQLException e) {
            System.out.println("ERROR AL LISTAR LIBROS: " + e.getMessage());
        }
    }

    private void imprimirLibro(ResultSet rs) throws SQLException {
        System.out.println("ID del libro: " + rs.getInt("id_libro")
                + "\t| Titulo: " + rs.getString("titulo")
                + "\t| Autor: " + rs.getString("autor")
                + "\t| Año de Publicacion: " + rs.getInt("anoPublicacion")
                + "\t| Disponibilidad: " + (rs.getBoolean("disponible") ? "Disponible" : "Agotado"));
    }
}