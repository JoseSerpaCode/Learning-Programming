package polimorfismo;

public class Main {
    public static void main(String[] args) {
        
        Empleado a = new Empleado(1, "Analista", 1312.1231, 9918221, "111.2312.22", "Kid", "Keo", "Cll 25", "123");
        Jefe b = new Jefe(1, "Analisis", 1, "1281828", "Juan", "Alberto", "Carrera 1", "1414244");
        Consultor c = new Consultor(1, "Consultoría IT", 101, "12345678", "Ana", "Gómez", "Calle 10", "5555555");

        Persona vector[] = new Persona [3];
        
        vector[0] = a;
        vector[1] = b;
        vector[2] = c;
        
        for (Persona vector1 : vector) {
            System.out.println("-".repeat(100));
            System.out.println(vector1);
        }
    }
}
