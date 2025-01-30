package escuelamusica;

import java.text.NumberFormat;

abstract class InstrumentoMusical {
    protected String nombreInstrumento;
    protected double precio;

    public InstrumentoMusical(String nombreInstrumento, double precio) {
        this.nombreInstrumento = nombreInstrumento;
        this.precio = precio;
    }

    abstract void tocar();
    abstract void preparar(); // Método para preparar el instrumento (afinar, limpiar, etc.)

    void mostrarInformacion() {
        NumberFormat formatoDinero = NumberFormat.getCurrencyInstance();
        System.out.println("\tInformacion del instrumento\n");
        System.out.println("Nombre: " + getNombreInstrumento());
        System.out.println("Precio: " + formatoDinero.format(getPrecio()));
    }

    public String getNombreInstrumento() {
        return nombreInstrumento;
    }

    public void setNombreInstrumento(String nombreInstrumento) {
        this.nombreInstrumento = nombreInstrumento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}