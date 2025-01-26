package sobreEscritura;

public class Main {
    public static void main(String[] args) {
        Perro moana = new Perro();
        moana.hacerSonido();
        
        Gato andres = new Gato();
        andres.hacerSonido();
        
        //Al crear un objeto directamente de una clase abstracta, se debe implmentar el método en su creacion
        Animal abstracto = new Animal() {
            @Override
            public void hacerSonido() {
                System.out.println("Esto es una modificacion desde un objeto");
            }
        };
        
        abstracto.hacerSonido();
        
        Pez pez = new Pez();
        pez.nadar();
    }
}
