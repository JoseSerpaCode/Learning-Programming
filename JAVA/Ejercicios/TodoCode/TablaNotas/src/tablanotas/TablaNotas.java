package tablanotas;

import java.util.Scanner;

public class TablaNotas {
    
    // Matriz para almacenar las notas y los promedios
    static double[][] tablaNotas = new double [4][4];

    public static void main(String[] args) {
        // Llama al método para ingresar las notas de los estudiantes
        ingresarNotas();
        System.out.println("-------------------------------------------------------------------");
        // Llama al método para mostrar las notas y los promedios
        mostrarNotas();
    }
    
    public static void ingresarNotas() {
        // Crear Scanner para recibir entrada del usuario
        Scanner userInput = new Scanner(System.in);
        
        // Recorre cada fila (estudiante)
        for (int fila = 0; fila < 4; fila++) {
            System.out.println("- Notas del estudiante " + (fila + 1));
            // Recorre las tres columnas de notas
            for (int columna = 0; columna < 3; columna++) {
                tablaNotas[fila][columna] = validarNota(userInput, "Escriba la nota #" + (columna + 1) + ": ");
            }
        }
        
        // Cierra el Scanner después de usarlo
        userInput.close();
    }
    
    public static void mostrarNotas() {
        // Recorre cada fila (estudiante)
        for (int fila = 0; fila < 4; fila++) {
            double sumaNotas = 0; // Variable para acumular las notas del estudiante
            
            System.out.println("- Notas del estudiante " + (fila + 1) + " son:");
            // Recorre las tres columnas de notas
            for (int columna = 0; columna < 3; columna++) {
                System.out.println("Nota #" + (columna + 1) + ": " + tablaNotas[fila][columna]);
                sumaNotas += tablaNotas[fila][columna];
            }
            // Calcula el promedio y lo almacena en la última columna
            tablaNotas[fila][3] = (sumaNotas / 3);
            // Muestra el promedio con dos decimales
            System.out.printf("El promedio del estudiante es: %.2f%n", tablaNotas[fila][3]);
        }
    }
    
    public static double validarNota(Scanner userInput, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            // Verifica si la entrada es un número válido
            if (userInput.hasNextDouble()) {
                double nota = userInput.nextDouble();
                // Verifica que la nota esté en el rango de 0 a 10
                if (nota >= 0 && nota <= 10) {
                    return nota;
                } else {
                    System.out.println("La nota debe estar entre 0 y 10.");
                }
            } else {
                // Maneja entradas inválidas no numéricas
                System.out.println("Digite un número válido.");
                userInput.next(); // Limpia la entrada inválida
            }
        }
    }
}
