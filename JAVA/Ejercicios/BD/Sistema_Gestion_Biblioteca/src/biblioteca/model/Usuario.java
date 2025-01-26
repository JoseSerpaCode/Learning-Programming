package biblioteca.model;

public class Usuario extends Persona{
    private String librosPrestados = "";

    public Usuario(int idPersona, String nombre, String email) {
        super(0, nombre, email);
    }

    public String getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(String librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
    
}
