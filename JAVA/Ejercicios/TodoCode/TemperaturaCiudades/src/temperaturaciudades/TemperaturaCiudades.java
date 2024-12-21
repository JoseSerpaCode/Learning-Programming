package temperaturaciudades;

import java.util.Scanner;
import java.util.Arrays;

public class TemperaturaCiudades {

    public static void main(String[] args) {
        final int SIZE = 5; // Número de ciudades a registrar
        double[] tempMin = new double[SIZE], tempMax = new double[SIZE]; // Arreglos para temperaturas mínimas y máximas
        String[] ciudad = new String[SIZE]; // Arreglo para nombres de ciudades

        try (Scanner userInput = new Scanner(System.in);) {
            // Bucle para registrar los datos de cada ciudad
            for (int i = 0; i < ciudad.length; i++) {
                // Registrar el nombre de la ciudad
                ciudad[i] = registrarCiudad(userInput, "- Ingrese una ciudad: ");

                // Registrar temperaturas mínimas y máximas, validando coherencia
                do {
                    tempMin[i] = registrarTemp(userInput, "Ingrese la temperatura Min. alcanzada: ");
                    tempMax[i] = registrarTemp(userInput, "Ingrese la temperatura Max. alcanzada: ");

                    // Validar que la temperatura máxima no sea menor que la mínima
                    if (tempMax[i] < tempMin[i]) {
                        mostrarError("La temperatura Max. no puede ser menor a la temperatura Min. registrada");
                    }
                } while (tempMax[i] < tempMin[i]);

                userInput.nextLine(); // Limpiar el buffer para evitar problemas con entradas posteriores
            }
        }

        // Encontrar los índices de las temperaturas mínimas y máximas
        int indiceMin = buscarIndiceMin(tempMin);
        int indiceMax = buscarIndiceMax(tempMax);

        separador(); // Línea separadora para mejorar la visualización
        // Mostrar las ciudades registradas
        System.out.println("Las ciudades registradas son: " + Arrays.toString(ciudad));
        // Mostrar la ciudad con la temperatura más baja y su valor
        System.out.println("La ciudad con menor temperatura es: " + ciudad[indiceMin] + ", que llego a alcanzar " + tempMin[indiceMin] + " grados.");
        // Mostrar la ciudad con la temperatura más alta y su valor
        System.out.println("La ciudad con mayor temperatura es: " + ciudad[indiceMax] + ", que llego a alcanzar " + tempMax[indiceMax] + " grados.");
    }

    // Método para registrar una temperatura válida
    static double registrarTemp(Scanner userInput, String mensaje) {
        while (true) { // Bucle infinito hasta que se reciba una entrada válida
            System.out.print(mensaje);
            if (userInput.hasNextDouble()) { // Verificar si la entrada es un número válido
                double temperatura = userInput.nextDouble();

                // Validar que la temperatura esté dentro del rango permitido
                if (temperatura > -100 && temperatura < 60) {
                    return temperatura; // Retornar la temperatura válida
                } else {
                    mostrarError("Temperatura fuera de rango");
                }
            } else {
                mostrarError("Registre una temperatura válida");
                userInput.next(); // Limpiar el buffer en caso de entrada inválida
            }
        }
    }

    // Método para registrar el nombre de una ciudad
    static String registrarCiudad(Scanner userInput, String mensaje) {
        while (true) { // Bucle infinito hasta que se reciba una entrada válida
            separador(); // Mostrar línea separadora
            System.out.print(mensaje);
            String entrada = userInput.nextLine().trim(); // Leer y limpiar espacios en blanco
            if (!entrada.isEmpty()) { // Validar que la entrada no esté vacía
                return entrada; // Retornar el nombre válido
            } else {
                mostrarError("Ingrese un nombre válido para la ciudad.");
            }
        }
    }

    // Método para encontrar el índice de la temperatura más baja
    static int buscarIndiceMin(double[] array) {
        int indiceMin = 0; // Inicializar con el primer índice
        for (int i = 1; i < array.length; i++) { // Iterar desde el segundo elemento
            if (array[i] < array[indiceMin]) {
                indiceMin = i; // Actualizar el índice si se encuentra una temperatura más baja
            }
        }
        return indiceMin; // Retornar el índice de la temperatura más baja
    }

    // Método para encontrar el índice de la temperatura más alta
    static int buscarIndiceMax(double[] array) {
        int indiceMax = 0; // Inicializar con el primer índice
        for (int i = 1; i < array.length; i++) { // Iterar desde el segundo elemento
            if (array[i] > array[indiceMax]) {
                indiceMax = i; // Actualizar el índice si se encuentra una temperatura más alta
            }
        }
        return indiceMax; // Retornar el índice de la temperatura más alta
    }

    // Método para mostrar un mensaje de error con formato
    static void mostrarError(String mensaje) {
        separador(); // Mostrar línea separadora
        System.out.println("ERROR! " + mensaje); // Mostrar mensaje de error
    }

    // Método para mostrar una línea separadora
    static void separador() {
        System.out.println("_____________________________________________");
    }
}
