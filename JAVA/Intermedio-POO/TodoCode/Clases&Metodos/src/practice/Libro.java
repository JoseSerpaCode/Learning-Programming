package practice;

public class Libro {

    String titulo, autor;
    int anioPublicacion;
    boolean disponible = true;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
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

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestarLibro() {
        if (!disponible) {
            System.out.println("El libro no se encuentra DISPONIBLE");
        } else {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        }
    }

    public void devolverLibro() {
        if (disponible) {
            System.out.println("El libro ya se encuentra en la Biblioteca");
        } else {
            disponible = true;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Información del libro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println("-----------------------------");
    }
}
