package logica;

public abstract class Pokemon {
    private int num_pokedex, temporadaAparece;
    private String nombrePokemon;
    private double pesoPokemon;
    private TipoPokemon tipo;
    private Sexo sexo;

    public Pokemon(int num_pokedex, int temporadaAparece, String nombrePokemon, double pesoPokemon, TipoPokemon tipo, Sexo sexo) {
        this.num_pokedex = num_pokedex;
        this.temporadaAparece = temporadaAparece;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.tipo = tipo;
        this.sexo = sexo;
    }
    
    public enum TipoPokemon{
        ELECTRICO,
        PLANTA,
        FUEGO,
        AGUA
    }
    
    public enum Sexo {
        MASCULINO,
        FEMENINO
    }
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarArañazo();
    protected abstract void atacarMordisco();

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public int getTemporadaAparece() {
        return temporadaAparece;
    }

    public void setTemporadaAparece(int temporadaAparece) {
        this.temporadaAparece = temporadaAparece;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public double getPesoPokemon() {
        return pesoPokemon;
    }

    public void setPesoPokemon(double pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    
}
