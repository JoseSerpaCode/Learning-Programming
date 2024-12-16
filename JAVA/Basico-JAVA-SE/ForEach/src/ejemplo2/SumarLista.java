package ejemplo2;

import java.util.ArrayList;

public class SumarLista {

    public static void main(String[] args) {
        //Lista de números
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        
        //variable para almacenar la suma
        int[] suma = {0}; // Se usa un arreglo para poder modificar su valor dentro del forEach
        
        //Sumar cada número usando ForEach
        numeros.forEach(numero -> {
            suma[0] += numero;
        });
        
        System.out.println("La suma total es: " + suma[0]);
    }
}
