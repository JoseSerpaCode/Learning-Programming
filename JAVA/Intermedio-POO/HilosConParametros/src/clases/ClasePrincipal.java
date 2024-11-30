package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Proceso hilo1 = new Proceso(" Hilo1");
        Proceso hilo2 = new Proceso(" Hilo2");
        Proceso hilo3 = new Proceso(" Hilo3");
        
        hilo1.ValorDeLaCondicion(5);
        hilo2.ValorDeLaCondicion(10);
        hilo3.ValorDeLaCondicion(5);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();        
    }
}
