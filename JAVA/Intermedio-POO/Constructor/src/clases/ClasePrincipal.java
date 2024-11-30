package clases;

public class ClasePrincipal {

    public static void main(String[] args) {

        SinConstructor mensajero1 = new SinConstructor();
        mensajero1.PedirNombre();
        mensajero1.Imprimir();
        
        System.out.println("");
        
        ConConstructor mensajero2 = new ConConstructor();

    }
}
