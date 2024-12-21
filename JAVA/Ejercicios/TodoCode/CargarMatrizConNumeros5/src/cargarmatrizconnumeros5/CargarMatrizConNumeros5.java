package cargarmatrizconnumeros5;

public class CargarMatrizConNumeros5 {

    public static void main(String[] args) {
        // Inicializamos una matriz de 4 filas y 5 columnas
        int[][] matriz = new int[4][5];

        // Asignamos el valor 5 a cada elemento de la matriz
        for (int[] fila : matriz) {
            for (int columna = 0; columna < fila.length; columna++) {
                fila[columna] = 5; // Asignar 5 a cada posición en la fila
            }
        }

        // Imprimimos la matriz fila por fila
        for (int[] fila : matriz) {
            for (int columna = 0; columna < fila.length; columna++) {
                System.out.print("[" + fila[columna] + "]"); // Imprime cada elemento de la fila
            }
            System.out.println(""); // Salto de línea después de cada fila
        }
    }

}
