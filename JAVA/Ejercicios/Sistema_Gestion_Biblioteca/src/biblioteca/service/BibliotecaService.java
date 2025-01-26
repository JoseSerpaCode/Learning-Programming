package biblioteca.service;

import biblioteca.dao.LibroDAO;
import biblioteca.model.Libro;
import java.sql.*;

public class BibliotecaService {
    private LibroDAO libroDAO;

    public BibliotecaService() {
        this.libroDAO = new LibroDAO();
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
