package clases;

public class Clase_Uno {
    public static void main(String[] args) {
        
        int aleatorio = 0;
        
        aleatorio =(int) (Math.random() * 5 + 1); // (int) <-- el metodo Math.random genera un numero aleatorio de tipo Double, el int lo convierte a entero
        System.out.println(aleatorio);
    }
}
