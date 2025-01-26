package biblioteca.service;

import biblioteca.dao.LibroDAO;
import biblioteca.dao.UsuarioDAO;
import biblioteca.model.Libro;
import biblioteca.model.Usuario;
import java.sql.*;

public class BibliotecaService {
    private LibroDAO libroDAO;
    private UsuarioDAO usuarioDAO;

    public BibliotecaService() {
        this.libroDAO = new LibroDAO();
        this.usuarioDAO = new UsuarioDAO();
    }
    
    public void agregarUsuario(Connection conn, Usuario usuario){
        usuarioDAO.agregarUsuario(conn, usuario);
    }
    
    public void actualizarUsuario(Connection conn, Usuario usuario){
        usuarioDAO.actualizarUsuario(conn, usuario);
    }
    
    public void eliminarUsuario(Connection conn, Usuario usuario) {
        usuarioDAO.eliminarUsuario(conn, usuario);
    }
    
    public void listarUsuario(Connection conn, Usuario usuario) {
        usuarioDAO.listarUsuario(conn, usuario);
    }
    
    public void listarUsuarios(Connection conn) {
        usuarioDAO.listarUsuarios(conn);
    }
    
    public void agregarLibro(Connection conn, Libro libro){
        libroDAO.agregarLibro(conn, libro);
    }
    
    public void actualizarLibro(Connection conn, Libro libro){
        libroDAO.actualizarLibro(conn, libro);
    }
    
    public void eliminarLibro(Connection conn, Libro libro) {
        libroDAO.eliminarLibro(conn, libro);
    }
    
    public void listarLibro(Connection conn, Libro libro) {
        libroDAO.listarLibro(conn, libro);
    }
    
    public void listarLibros(Connection conn) {
        libroDAO.listarLibros(conn);
    }
}
