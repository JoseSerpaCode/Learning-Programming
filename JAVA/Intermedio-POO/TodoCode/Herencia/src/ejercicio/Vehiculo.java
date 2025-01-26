package ejercicio;

public class Vehiculo {

    String marca, modelo;
    int anio;
    boolean enMovimiento = false;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void arrancar() {
        System.out.println("El vehiculo " + modelo + " ha arrancado");
        enMovimiento = true;
    }

    public void detener() {
        System.out.println("El vehiculo " + modelo + " se ha detenido");
        enMovimiento = false;
    }

    public void mostrarInformacion() {
        System.out.println("Informacion basica del vehiculo: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }

}
