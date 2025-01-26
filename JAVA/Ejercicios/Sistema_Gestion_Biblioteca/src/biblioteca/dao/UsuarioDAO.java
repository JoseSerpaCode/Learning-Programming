package biblioteca.dao;

import biblioteca.model.Usuario;
import java.sql.*;

public class UsuarioDAO {
    
        public void agregarUsuario(Connection conn, Usuario usuario) {
        String sql = "INSERT INTO Usuario (nombre, mail) VALUES (?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());
            ps.executeUpdate();
            System.out.println("El Usuario se ha agregado correctamente!");
        } catch (SQLException e) {
            System.out.println("ERROR AL AGREGAR USUARIO: " + e.getMessage());
        }
    }

    public void actualizarUsuario(Connection conn, Usuario usuario) {
        String sql = "UPDATE Usuario SET nombre = ?, email = ? WHERE id_usuario = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getEmail());
            ps.setInt(3, usuario.getIdPersona());
            ps.executeUpdate();
            System.out.println("El Usuario se ha actualizado correctamente!");
        } catch (SQLException e) {
            System.out.println("ERROR AL ACTUALIZAR USUARIO: " + e.getMessage());
        }
    }

    public void eliminarUsuario(Connection conn, Usuario usuario) {
        String sql = "DELETE FROM Usuario WHERE id_susuario = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, usuario.getIdPersona());
            ps.executeUpdate();
            System.out.println("El Usuario se ha eliminado correctamente!");
        } catch (SQLException e) {
            System.out.println("ERROR AL ELIMINAR USUARIO: " + e.getMessage());
        }
    }

    public void listarUsuario(Connection conn, Usuario usuario) {
        String sql = "SELECT id_usuario, nombre, email FROM Usuario WHERE id_usuario = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, usuario.getIdPersona());

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    imprimirUsuario(rs);
                }
            }
        } catch (SQLException e) {
            System.out.println("ERROR AL MOSTRAR EL USUARIO: " + e.getMessage());
        }
    }

    public void listarUsuarios(Connection conn) {
        String sql = "SELECT id_usuario, nombre, email FROM Usuario";

        try (PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                imprimirUsuario(rs);
            }
        } catch (SQLException e) {
            System.out.println("ERROR AL LISTAR USUARIOS: " + e.getMessage());
        }
    }

    private void imprimirUsuario(ResultSet rs) throws SQLException {
        System.out.println("ID del Usuario: " + rs.getInt("id_usuario")
                + "\t| Nombre: " + rs.getString("nombre")
                + "\t| Email: " + rs.getString("email"));
    }
}
