package ejercicio;

import java.time.LocalDate;
import java.util.Date;

public class Tarea {
    private String descripcion;
    private LocalDate fechaEntrega;

    public Tarea(String descripcion, LocalDate fechaEntrega) {
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "Descripcion='" + descripcion + '\'' +
                ", fechaEntrega=" + fechaEntrega +
                '}';
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
