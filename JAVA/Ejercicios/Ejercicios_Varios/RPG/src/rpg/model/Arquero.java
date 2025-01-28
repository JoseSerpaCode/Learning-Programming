package rpg.model;

public class Arquero extends Personaje {
    
    private final double precision;
    private final double DANIO_BASE = 0.8;

    public Arquero(double precision) {
        this.precision = precision;
    }
    
    public Arquero(String nombre, int nivel, double vida, double precision) {
        super(nombre, nivel, vida);
        this.precision = precision;
    }
       

    @Override
    public void atacar(Personaje personaje) {
        double danio = this.precision * getNivel() * DANIO_BASE;
        personaje.setVida(getVida() - danio);
        System.out.println(personaje.getNombre() + "ha recibido " + danio + " daño.");
        
        if (personaje.getVida() <= 0) {
            System.out.println(personaje.getNombre() + " ha muerto.");
        }
    }
}
