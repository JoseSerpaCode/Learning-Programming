package almacenandonombres;

import java.util.Scanner;

public class AlmacenandoNombres {

    public static void main(String[] args) {

        try (Scanner userInput = new Scanner(System.in)) {
            int size = cantidadElementos(userInput, "¿Cuántos nombres desea que tenga la lista?: ");
            String[] names = new String[size];
            
            // Capturar nombres
            for (int i = 0; i < names.length; i++) {
                System.out.print("Digite un nombre: ");
                names[i] = userInput.nextLine();
            }
            
            // Mostrar nombres
            System.out.println("\nLos nombres ingresados son:");
            for (String name : names) {
                System.out.println(name);
            }
        }
    }

    public static int cantidadElementos(Scanner userInput, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (userInput.hasNextInt()) {
                int cantidad = userInput.nextInt();
                if (cantidad > 0) {
                    userInput.nextLine(); // Limpia el búfer para evitar problemas con nextLine()
                    return cantidad;
                } else {
                    System.out.println("El número debe ser mayor que 0.");
                }
            } else {
                System.out.println("Por favor, digite un número válido.");
                userInput.next(); // Limpiar entrada inválida
            }
        }
    }
}
