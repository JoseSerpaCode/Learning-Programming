package ejercicio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());
        
        for (Animal animal : animales) {
            animal.hacerSonido();
            System.out.println("-".repeat(50));
        }
    }
}
