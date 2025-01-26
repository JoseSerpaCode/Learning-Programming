package biblioteca.menus;

import biblioteca.model.Libro;
import biblioteca.service.BibliotecaService;
import biblioteca.util.ValidarOpcion;
import java.sql.Connection;
import java.util.Scanner;

public final class MenuLibro {

    private final ValidarOpcion validarOpcion;
    private final BibliotecaService bibliotecaService;

    public MenuLibro(Connection conn) {
        this.validarOpcion = new ValidarOpcion();
        this.bibliotecaService = new BibliotecaService();
        iniciarMenu(conn);
    }

    private void iniciarMenu(Connection conn) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean bandera = true;
            while (bandera) {
                System.out.println("\tUsted se encuentra en el Menu LIBROS\n");
                System.out.println("(1) Agregar Libro");
                System.out.println("(2) Actualizar Libro");
                System.out.println("(3) Eliminar Libro");
                System.out.println("(4) Ver un Libro");
                System.out.println("(5) Ver todos los Libros");
                System.out.println("(6) Volver al menu principal");
                System.out.print("Seleccione una opcion (numerica): ");
                int op = validarOpcion.isNumber(scanner, 1, 6);
                validarOpcion.separador();
                switch (op) {
                    case 1 ->
                        bibliotecaService.agregarLibro(conn, agregarLibro(scanner));
                    case 2 -> {
                        Libro libroActualizar = solicitarLibro(scanner);
                        Libro nuevosDatos = solicitarDatosActualizacion(scanner);
                        libroActualizar.setTitulo(nuevosDatos.getTitulo());
                        libroActualizar.setAutor(nuevosDatos.getAutor());
                        libroActualizar.setAnoPublicacion(nuevosDatos.getAnoPublicacion());
                        libroActualizar.setDisponible(nuevosDatos.isDisponible());
                        bibliotecaService.actualizarLibro(conn, libroActualizar);
                    }
                    case 3 ->
                        bibliotecaService.eliminarLibro(conn, solicitarLibro(scanner));
                    case 4 ->
                        bibliotecaService.listarLibro(conn, solicitarLibro(scanner));
                    case 5 ->
                        bibliotecaService.listarLibros(conn);
                    case 6 ->
                        bandera = false;
                    default ->
                        System.out.println("Seleccione una opcion correcta");
                }
                validarOpcion.separador();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private Libro agregarLibro(Scanner scanner) {
        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Año publicacion: ");
        int anoPublicacion = validarOpcion.isNumber(scanner, 0, 2025);
        System.out.println("Disponibilidad: (1) True     (2) False");
        int disponibilidad = validarOpcion.isNumber(scanner, 1, 2);
        boolean isDisponible = (disponibilidad == 1);

        return new Libro(titulo, autor, anoPublicacion, isDisponible);
    }

    private Libro solicitarDatosActualizacion(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nuevo título: ");
        String titulo = scanner.nextLine();
        System.out.print("Nuevo autor: ");
        String autor = scanner.nextLine();
        System.out.print("Nuevo año de publicación: ");
        int anoPublicacion = validarOpcion.isNumber(scanner, 0, 2025);
        System.out.println("Nueva disponibilidad: (1) True     (2) False");
        int disponibilidad = validarOpcion.isNumber(scanner, 1, 2);
        boolean isDisponible = (disponibilidad == 1);

        return new Libro(titulo, autor, anoPublicacion, isDisponible);
    }

    private Libro solicitarLibro(Scanner scanner) {
        System.out.print("Ingrese el ID del libro: ");
        int idLibro = validarOpcion.isNumber(scanner, 1, 1000);
        return new Libro(idLibro);
    }
}
