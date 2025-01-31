package arraylists;

import otros.Persona;

import java.util.List;
import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona> ();
        lista.add(new Persona(1, "Juan", 18));
        lista.add(new Persona(2, "Andres", 20));

        for (Persona perso : lista){
            System.out.println(perso.getNombre());
        }
    }
}
