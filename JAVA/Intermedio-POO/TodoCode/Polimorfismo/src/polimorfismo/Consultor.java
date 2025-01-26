package polimorfismo;

public class Consultor extends Persona {

    int num_consultor;
    String nombre_consultora;

    public Consultor(int num_consultor, String nombre_consultora, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_consultor = num_consultor;
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    @Override
    public String toString() {
        return "Consultor{"
                + "num_consultor=" + num_consultor
                + ", nombre_consultora=" + nombre_consultora
                + ", id=" + getId()
                + ", dni=" + getDni()
                + ", nombre=" + getNombre()
                + ", apellido=" + getApellido()
                + ", domicilio=" + getDomicilio()
                + ", telefono=" + getTelefono()
                + '}';
    }

}
