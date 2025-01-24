package concecionario;

public class Coche extends Vehiculo {
    private final int numeroPuertas;

    public Coche(int numeroPuertas, String marca, String modelo, double precio) {
        super(marca, modelo, precio);
        this.numeroPuertas = validarNumeroPuertas(numeroPuertas);
    }

    private int validarNumeroPuertas(int numeroPuertas) {
        if (numeroPuertas <= 0) {
            throw new IllegalArgumentException("El número de puertas debe ser mayor que cero.");
        }
        return numeroPuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + getNumeroPuertas());
    }

    @Override
    public double obtenerPorcentajeImpuesto() {
        return 0.12;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    
}
