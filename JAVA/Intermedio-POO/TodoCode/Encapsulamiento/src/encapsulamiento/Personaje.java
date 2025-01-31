package encapsulamiento;

public class Personaje {
    
    protected String nombre;
    protected double danio;
    protected double vida;

    public Personaje() {
    }
    
    public Personaje(String nombre, double danio, double vida) {
        this.nombre = nombre;
        this.danio = danio;
        this.vida = vida;
    }

    protected double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDanio() {
        return danio;
    }

    public void setDanio(double danio) {
        this.danio = danio;
    }
    
    
    
}
