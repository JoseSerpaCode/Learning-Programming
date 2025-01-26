package clases_metodos;

public class Alumno {

    //Atributos
    int id;
    String nombre, apellido;

    //Constructor
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //Acciones --> Métodos
    //Si el método no retorna se dice que es un procedimiento
    public void mostrarNombre() {
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }

    //Si el método retorna se dice que es una funcion
    public String saberAprovado(double calificacion) {
        return calificacion >= 6 ? "Aprobado" : "Desaprobado";
    }

}
