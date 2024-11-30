package decimales;

import java.text.DecimalFormat;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        double numero = 2;
        double raiz = Math.sqrt(numero);
        
        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
        
        //Utilizando la clase DecimalFormat
        
        DecimalFormat df = new DecimalFormat("#.00"); // Los cero (0) hacen referencia a la cantidad de decimales que quiero ver
        System.out.println("La raiz cuadrada de " + numero + " es: " + df.format(raiz));
    }
}
