package sobreCarga;

public class Animal {
    private int id_animal;
    private String descripcion;

    public Animal(int id_animal, String descripcion) {
        this.id_animal = id_animal;
        this.descripcion = descripcion;
    }
    
    // Métodos setters y getters...
    
    //Otros Métodos
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    
    public void hacerSonido(String nombreAnimal){
        System.out.println("El animla " + nombreAnimal + ", hace un sonido");
    }
    
    public void hacerSonido(String nombreAnimal, String tipoSonido){
        System.out.println("El animla " + nombreAnimal + ", hace un sonido de tipo: " + tipoSonido);
    }
}
