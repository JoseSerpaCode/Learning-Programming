package rpg.model;

public class Mago extends Personaje {
    
    private final double magia;
    private final double DANIO_BASE = 1.5;

    public Mago(double magia) {
        this.magia = magia;
    }

    public Mago(String nombre, int nivel, double vida, double magia) {
        super(nombre, nivel, vida);
        this.magia = magia;
    }
    
    @Override
    public void atacar(Personaje personaje) {
        double danio = this.magia * DANIO_BASE;
        personaje.setVida(getVida() - danio);
        System.out.println(personaje.getNombre() + "ha recibido " + danio + " daño.");
        
        if (personaje.getVida() <= 0) {
            System.out.println(personaje.getNombre() + " ha muerto.");
        }
    }
}
