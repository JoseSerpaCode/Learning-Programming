package rpg.model;

public abstract class Personaje {
    private String nombre;
    private int nivel;
    private double vida;

    public Personaje() {
    }
    
    public Personaje(String nombre, int nivel, double vida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
    }
    
    public abstract void atacar(Personaje personaje);
    
    public void mostrarInformacion(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Vida: " + getVida());
        
        if (getVida() <= 0) {
            System.out.println("MUERTO!");
        }
        System.out.println("-".repeat(60));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 1) {
            this.nivel = nivel;
        } else {
            System.out.println("El nivel debe ser mayor a cero");
        }
    }

    public double getVida() {
        if (this.vida <= 0) {
            setVida(0);
        }
        return vida;
    }

    public void setVida(double vida) {
        if (nivel >= 1) {
            this.vida = vida;
        } else {
            System.out.println("El nivel debe ser mayor a cero");
        }
    }
}
