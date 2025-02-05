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

        System.out.println(lista);

        for (Persona persona : lista) {
            System.out.println(persona.getNombre());
            System.out.println("-".repeat(50));
        }

        /*
        Eliminar un elemento en una LinkedList
        lista.remove(1); // Posición
        lista.remove(""); // letra/palabra que contiene alguna posición el array
        lista.clear();  // Elimina todos los elementos

        --

        numbers.removeFirst(); // Elimina el primer elemento
        numbers.removeLast();  // Elimina el último elemento
         */

        lista.remove(0);
        lista.removeIf(persona -> persona.getNombre().equals("Juan"));
        System.out.println(lista);
    }

}
