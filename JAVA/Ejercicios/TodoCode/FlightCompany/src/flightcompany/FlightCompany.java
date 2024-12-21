package flightcompany;

import java.util.Scanner;

public class FlightCompany {

    public static void main(String[] args) {
        int[][] vuelos = new int[6][3];
        String[] destinos = {"Rio de Janeiro", "Cancun", "Madrid", "Roma", "Bogota", "Sincelejo"};
        String[] horarios = {"Mañana", "Tarde", "Noche"};

        try (Scanner userInput = new Scanner(System.in)) {
            //Cargar Cantidad de asientos para cada vuelo
            for (int destino = 0; destino < destinos.length; destino++) {
                separador();
                for (int horario = 0; horario < horarios.length; horario++) {
                    vuelos[destino][horario] = cargarAsientos(userInput, "- Cantidad de asientos para el vuelo a " + destinos[destino] + " en el horario de " + horarios[horario] + ": ");
                }
            }

            //Cargar Compra de boletos
            String op = "";

            while (!"finish".equals(op)) {
                // Seleccionar destino
                int destino = compraBoletos(userInput, destinos, "Elija su destino (Seleccione la posición): ");

                // Seleccionar horario
                int horario = compraBoletos(userInput, horarios, "Elija su horario (Seleccione la posición): ");

                // Cargar asientos para ese destino
                int asientos = cargarAsientos(userInput, "Ingrese la cantidad de asientos para " + destinos[destino] + ": ");
                separador();

                if (asientos > vuelos[destino][horario] || asientos < 0) {
                    mensajeError("No se ha podido realizar la compra - VALOR FUERA DE RANGO");
                    userInput.next();
                } else {
                    System.out.println("Compra realizada exitosamente!");
                    vuelos[destino][horario] -= asientos;
                    System.out.println("Nueva Cantidad de asientos disponibles: " + vuelos[destino][horario]);
                }
                userInput.nextLine();
                System.out.print("Si no desea realizar otra compra, escriba la palabra finish, de lo contrario escriba cualquier otra letra:  ");
                op = userInput.nextLine();
            }
        }
    }

    public static int cargarAsientos(Scanner userInput, String mensaje) {
        int asientos;
        if (mensaje == null || mensaje.isEmpty()) {
            mensaje = "Ingrese la cantidad de asientos: ";
        }
        while (true) {
            System.out.print(mensaje);
            if (userInput.hasNextInt()) {
                asientos = userInput.nextInt();

                if (asientos >= 0 && asientos < 300) { // Valida el rango dinámicamente
                    return asientos; // Retorna el número válido
                } else {
                    mensajeError("El número debe estar entre 0 y 299.");
                }
            } else {
                mensajeError("Entrada no válida. Por favor, ingrese un número entero.");
                userInput.next(); // Descarta entrada no válida
            }
        }
    }

    public static int compraBoletos(Scanner userInput, String[] array, String mensaje) {
        separador();
        int seleccion;
        System.out.println(mensaje);
        while (true) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + ": " + array[i]); // Muestra las opciones con índice
            }

            if (userInput.hasNextInt()) {
                seleccion = userInput.nextInt();
                if (seleccion >= 0 && seleccion < array.length) {
                    System.out.println("Destino seleccionado: " + array[seleccion]);
                    return seleccion;
                } else {
                    mensajeError("Seleccione un destino válido entre 0 y " + (array.length - 1) + ".");
                }
            } else {
                mensajeError("Entrada no válida. Por favor, seleccione un número entero.");
                userInput.next(); // Descarta entrada no válida
            }
        }
    }

    public static void mensajeError(String mensaje) {
        separador();
        System.out.println("ERROR! " + mensaje);
        separador();
    }

    public static void separador() {
        for (int i = 0; i < 70; i++) {
            System.out.print('-');
        }
        System.out.println(); // Salto de línea al final
    }

}
