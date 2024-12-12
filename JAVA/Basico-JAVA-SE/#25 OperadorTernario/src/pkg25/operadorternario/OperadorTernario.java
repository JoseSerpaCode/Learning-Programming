package pkg25.operadorternario;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double total = 0;

        System.out.println("Bienvenido al Sistema Educativo: XYZ");
        System.out.print("Por favor ingrese su nombre: ");
        String name = leer.nextLine();

        for (int i = 0; i < 3; i++) {
            double nota = lecturaNota(leer, "Ingrese su nota #" + (i + 1));
            total += nota;
        }

        double promedio = (total / 3);
        String estado = (promedio >= 3) ? "Aprobado" : "Desaprobado";

        System.out.printf("Nombre del estudiante: %s - Promedio: %.2f - Estado: %s%n", name, promedio, estado);

    }

    public static double lecturaNota(Scanner leer, String text) {
        double nota;
        System.out.println(text);
        while (true) { //Siempre va a ser true, por lo tanto la única forma de que se acabe el ciclo, es que el método culmine --> Culmina cuando aparece el return
            if (leer.hasNextDouble()) {
                nota = leer.nextDouble();
                if (nota >= 0 && nota <= 5) {
                    return nota;
                }
            } else {
                leer.next();
            }
            System.out.println("Ingresa un valor válido (entre 0 y 5).");
            System.out.println(text);
        }
    }
}
