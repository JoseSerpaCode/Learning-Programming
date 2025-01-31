package linkedlists;

import otros.Persona;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        List<Persona> lista = new LinkedList<Persona>();

        //Agregar Elementos al final de la lista
        lista.add(new Persona(1, "Juan", 18));
        lista.add(new Persona(2, "Andres", 20));

        //Agregar al principio
        lista.add(0, new Persona(3, "Jose", 90));

        for (Persona persona : lista){
            System.out.println(persona.getNombre());
        }
    }
}
