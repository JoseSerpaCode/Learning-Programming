package practice;

public class Main {
    public static void main(String[] args) {
        
        // 1. Crea al menos dos instancias de la clase Libro con diferentes títulos, autores y años de publicación.
        Libro libro1 = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez", 1967);
        Libro libro2 = new Libro("El naufrago", "Gabriel Garcia Marquez", 1994);
        
        // 2. Muestra la información de ambos libros usando el método mostrarInformacion().
        libro1.mostrarInformacion();
        System.out.println("-".repeat(30));
        libro2.mostrarInformacion();
        
        // 3. Prueba a prestar uno de los libros y muestra su información nuevamente para verificar que el estado de disponibilidad ha cambiado.
        System.out.println("-".repeat(30));
        libro1.prestarLibro();
        libro1.mostrarInformacion();
        
        // 4. Intenta prestar el mismo libro otra vez para ver qué sucede.
        System.out.println("-".repeat(30));
        libro1.prestarLibro();
        libro1.mostrarInformacion();
        
        // 5. Devuelve el libro y verifica que su estado de disponibilidad ha vuelto a true.
        System.out.println("-".repeat(30));
        libro1.devolverLibro();
        libro1.mostrarInformacion();
        
        // 6. Intenta devolver el libro otra vez para ver qué sucede.
        System.out.println("-".repeat(30));
        libro1.devolverLibro();
        libro1.mostrarInformacion();
    }
}
