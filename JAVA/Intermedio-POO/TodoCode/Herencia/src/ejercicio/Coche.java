package ejercicio;

public class Coche extends Vehiculo{
    
    int numeroPuertas;
    boolean maleteroAbierto = false;

    public Coche(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }
    
    public void abrirMaletero(){
        if (enMovimiento) {
            System.out.println("No puede abrir el maletero mientras esté en movimiento");
            maleteroAbierto = false;
        } else if (!maleteroAbierto) {
            System.out.println("El maletero del vehiculo " + modelo + " se ha abierto");
            maleteroAbierto = true;
        } else {
            System.out.println("El maletero del vehiculo " + modelo + " ya se encuentra abierto");
        }
    }
    
    public void cerrarMaletero(){
        if (maleteroAbierto) {
            System.out.println("El maletero del vehiculo " + modelo + " se ha cerrado");
            maleteroAbierto = false;
        } else {
            System.out.println("El maletero del vehiculo " + modelo + " ya se encuentra cerrado");
        }
    }
    
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de puertas: " + numeroPuertas);
    }
}
