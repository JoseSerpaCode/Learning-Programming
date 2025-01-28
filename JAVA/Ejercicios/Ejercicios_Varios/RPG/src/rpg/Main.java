package rpg;

import rpg.model.Arquero;
import rpg.model.Guerrero;
import rpg.model.Mago;

public class Main {
    public static void main(String[] args) {
        // Crear personajes
        Guerrero guerrero = new Guerrero("Arthas", 10, 150.0, 250.0);
        Mago mago = new Mago("Jaina", 8, 100.0, 30.0);
        Arquero arquero = new Arquero("Sylvanas", 9, 120.0, 25.0);

        // Mostrar información inicial
        System.out.println("=== Personajes iniciales ===");
        guerrero.mostrarInformacion();
        mago.mostrarInformacion();
        arquero.mostrarInformacion();

        // Simular combates
        System.out.println("\n=== Combate ===");
        System.out.println(guerrero.getNombre() + " ataca a " + mago.getNombre());
        guerrero.atacar(mago);
        System.out.println(mago.getNombre() + " ataca a " + arquero.getNombre());
        mago.atacar(arquero);
        System.out.println(arquero.getNombre() + " ataca a " + guerrero.getNombre());
        arquero.atacar(guerrero);

        // Mostrar información después del combate
        System.out.println("\n=== Personajes después del combate ===");
        guerrero.mostrarInformacion();
        mago.mostrarInformacion();
        arquero.mostrarInformacion();
    }
}
