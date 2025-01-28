package logica;

public class Pikachu extends Pokemon implements IElectrico{
    
    public Pikachu(int num_pokedex, int temporadaAparece, String nombrePokemon, double pesoPokemon, TipoPokemon tipo, Sexo sexo) {
        super(num_pokedex, temporadaAparece, nombrePokemon, pesoPokemon, tipo, sexo);
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola! Soy " + getNombrePokemon() + " y estoy utilizando atacarPlacaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Hola! Soy " + getNombrePokemon() + " y estoy utilizando atacarArañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola! Soy " + getNombrePokemon() + " estoy utilizando atacarMordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola! Soy " + getNombrePokemon() + " estoy utilizando atacarImpactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola! Soy " + getNombrePokemon() + " estoy utilizando atacarPunioTrueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Hola! Soy " + getNombrePokemon() + " y estoy utilizando atacarRayo");
    }
    
    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola! Soy " + getNombrePokemon() + " y estoy utilizando atacarRayoCarga");
    }
    
}
