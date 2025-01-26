package biblioteca.model;

public class Libro {
    private int idLibro, anoPublicacion;
    private String titulo, autor;
    private boolean disponible;

    public Libro(String titulo, String autor, int anoPublicacion, boolean disponible) {
        this.anoPublicacion = anoPublicacion;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public Libro(int idLibro) {
        this.idLibro = idLibro;
    }
          
    public int getIdLibro() {
        return idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
    
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
}
