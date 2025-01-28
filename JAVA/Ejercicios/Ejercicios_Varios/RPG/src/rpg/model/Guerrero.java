package rpg.model;

public class Guerrero extends Personaje {
    
    private final double fuerza;

    public Guerrero() {
        this.fuerza = 0;
    }

    public Guerrero(String nombre, int nivel, double vida, double fuerza) {
        super(nombre, nivel, vida);
        this.fuerza = fuerza;
    }

    @Override
    public void atacar(Personaje personaje) {
        double danio = this.fuerza * getNivel();
        personaje.setVida(getVida() - danio);
        System.out.println(personaje.getNombre() + "ha recibido " + danio + " daño.");
        
        if (personaje.getVida() <= 0) {
            System.out.println(personaje.getNombre() + " ha muerto.");
        }
    }
    
}
