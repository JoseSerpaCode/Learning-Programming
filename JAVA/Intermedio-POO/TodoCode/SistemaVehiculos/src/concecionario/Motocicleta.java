package concecionario;

public class Motocicleta extends Vehiculo{
    private final int cilindraje;

    public Motocicleta(int cilindraje, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.cilindraje = cilindraje;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.printf("El cilindraje de la motocicleta es %dcc%n", getCilindraje());
    }
    
    @Override
    public double obtenerPorcentajeImpuesto(){
        return 0.08;
    }

    public int getCilindraje() {
        return cilindraje;
    }
    
}
