package concecionario;

import java.text.NumberFormat;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public void mostrarDetalles() {
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance();
        System.out.println("\t***Información del Vehículo***");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: " + formatoMoneda.format(getPrecio()));
        System.out.println("Impuesto: " + formatoMoneda.format(calcularImpuesto()));
    }
    
    public double obtenerPorcentajeImpuesto(){
        return 0.10;
    }
    
    public double calcularImpuesto(){
        return getPrecio() * obtenerPorcentajeImpuesto();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
