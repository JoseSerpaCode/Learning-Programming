package ejercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            List<Tarea> lista = new ArrayList<>();

            crearTarea(scanner, 1, lista);
            recorrerTareas(lista);

            List<Tarea> listaDos = new LinkedList<>();
            crearTarea(scanner, 1, listaDos);
            recorrerTareas(listaDos);

            /*
            List<String> listaTres = new ArrayList<>();
            listaTres.add("ajo");
            listaTres.removeFirst();
            */

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void crearTarea(Scanner scanner, int cantTareas, List<Tarea> lista){
        for (int i = 0; i < cantTareas; i++) {
            try {
                System.out.println("Introduzca la descripcion de la tarea: ");
                String descripcion = scanner.nextLine();

                System.out.println("A continuacion debe ingresar la fecha de entrega de la Tarea: ");
                int ano = validarOpcion(scanner, "Introduce el año (yyyy): ", 2022, 2026);
                int mes = validarOpcion(scanner, "Introduce el mes (1-12): ", 1, 12);
                int dia = validarOpcion(scanner, "Introduce el día (1-31): ", 1, 31);
                scanner.nextLine();
                LocalDate fecha = LocalDate.of(ano, mes, dia);

                lista.add(new Tarea(descripcion, fecha));
                System.out.println("Tarea agregada correctamente");
                System.out.println("-".repeat(40));

            } catch (Exception e) {
                System.out.println("ERROR AL AGREGAR UNA NUEVA TAREA" + e.getMessage());
            }
        }
    }

    public static void recorrerTareas(List<Tarea> lista){
        lista.forEach(System.out::println);
    }

    private static int validarOpcion(Scanner scanner, String mensaje, int min, int max){
        int numeroValido;
        while(true){
            System.out.println(mensaje);
            if (scanner.hasNextInt()){
                numeroValido = scanner.nextInt();

                if (numeroValido >= min && numeroValido <= max){
                    return numeroValido;
                }
            }
            System.out.println("Ingrese un valor válido");
        }
    }

}