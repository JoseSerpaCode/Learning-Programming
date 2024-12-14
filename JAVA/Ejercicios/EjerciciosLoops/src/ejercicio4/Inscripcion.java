package ejercicio4;

import java.util.Scanner;

public class Inscripcion {

    public static final String MENSAJE = "Debe ser inscrito a la categoría ",
            MENOR_A = "Menores A (De 6 a 10 años)",
            MENOR_B = "Menores B (De 11 a 17 años)",
            JUVENILES = "Juveniles (De 18 a 30 años)",
            ADULTOS_A = "Adultos (De 31 a 50 años)",
            ADULTOS_B = "Adultos Mayores (Mayores a 50 años)";

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido al registro de la Maratón del Inmigrante");
        System.out.println("Si desea conocer a qué categoría debe ser inscrito, digite los siguientes datos");

        double dni;
        String nombre;

        while (true) {
            saltoLinea();
            System.out.println("Si desea salir, digite en el DNI el número 0 y en el nombre la palabra Salir");
            saltoLinea();

            System.out.print("Digite su DNI: ");
            dni = entrada.nextDouble();
            entrada.nextLine(); // Limpia la línea pendiente

            System.out.print("Digite su nombre: ");
            nombre = entrada.nextLine();

            if (dni == 0 && nombre.equalsIgnoreCase("Salir")) {
                System.out.println("Programa finalizado.");
                break;
            }

            System.out.print("Digite su edad: ");
            int edad = entrada.nextInt();
            entrada.nextLine(); // Limpia la línea pendiente

            if (edad < 6) {
                System.out.println("Ingrese una edad mayor a 6 años.");
            } else {
                String info = (edad < 11) ? MENOR_A
                        : (edad < 18) ? MENOR_B
                        : (edad < 31) ? JUVENILES
                        : (edad < 51) ? ADULTOS_A
                        : ADULTOS_B;

                saltoLinea();
                System.out.println(MENSAJE + info);
            }
        }
        entrada.close();
    }

    public static void saltoLinea() {
        System.out.println("---------------------------------------------------");
    }
}
