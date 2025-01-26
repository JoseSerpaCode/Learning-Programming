package main;
import operaciones.ClaseHija_Suma;
import operaciones.ClaseHija_Resta;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Suma();
        System.out.print("El resultado de la suma es: ");
        mensajeroSuma.MostrarResultado();
        
        ClaseHija_Resta mensajeroResta = new ClaseHija_Resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.Resta();
        System.out.print("El resultado de la resta es: ");
        mensajeroResta.MostrarResultado();
    }
}
