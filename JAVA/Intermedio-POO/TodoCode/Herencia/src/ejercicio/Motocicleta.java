package ejercicio;

public class Motocicleta extends Vehiculo {
    
    int cilindraje;

    public Motocicleta(String marca, String modelo, int anio, int cilindraje) {
        super(marca, modelo, anio);
        this.cilindraje = cilindraje;
    }
    
    public void hacerCaballito(){
        if (enMovimiento) {
            System.out.println("La motocicleta está haciendo un caballito");
        } else {
            System.out.println("Para hacer un caballito, el vehiculo debe estar en movimiento");
        }
        
    }
    
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Cilindraje: " + cilindraje + "cc");
    }
}
