package biblioteca.menus;

import biblioteca.model.Usuario;
import biblioteca.service.BibliotecaService;
import biblioteca.util.ValidarOpcion;
import java.sql.*;
import java.util.Scanner;

public class MenuUsuario {
    
    private final ValidarOpcion validarOpcion;
    private final BibliotecaService bibliotecaService;

    public MenuUsuario(Connection conn) {
        this.validarOpcion = new ValidarOpcion();
        this.bibliotecaService = new BibliotecaService();
        iniciarMenu(conn);
    }
    
    private void iniciarMenu(Connection conn) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean bandera = true;
            while (bandera) {
                System.out.println("\tUsted se encuentra en el Menu USUARIOS\n");
                System.out.println("(1) Agregar Usuario");
                System.out.println("(2) Actualizar Usuario");
                System.out.println("(3) Eliminar Usuario");
                System.out.println("(4) Ver un Usuario");
                System.out.println("(5) Ver todos los Usuario");
                System.out.println("(6) Volver al menu principal");
                System.out.print("Seleccione una opcion (numerica): ");
                int op = validarOpcion.isNumber(scanner, 1, 6);
                validarOpcion.separador();
                switch (op) {
                    case 1 ->
                        bibliotecaService.agregarUsuario(conn, agregarUsuario(scanner));
                    case 2 -> {
                        Usuario usuarioActualizar = solicitarIdUsuario(scanner);
                        Usuario nuevosDatos = solicitarDatosActualizacion(scanner);
                        usuarioActualizar.setNombre(nuevosDatos.getNombre());
                        usuarioActualizar.setEmail(nuevosDatos.getEmail());
                        bibliotecaService.actualizarUsuario(conn, usuarioActualizar);
                    }
                    case 3 ->
                        bibliotecaService.eliminarUsuario(conn, solicitarDatosActualizacion(scanner));
                    case 4 ->
                        bibliotecaService.listarUsuario(conn, solicitarIdUsuario(scanner));
                    case 5 ->
                        bibliotecaService.listarUsuarios(conn);
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
    
    private Usuario agregarUsuario(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        return new Usuario(0, nombre, email);
    }

    private Usuario solicitarDatosActualizacion(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Nuevo Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Nuevo Email: ");
        String email = scanner.nextLine();
        System.out.print("Numero de Identificacion: ");
        int idPersona = validarOpcion.isNumber(scanner, 1000, 100000000);

        return new Usuario(idPersona, nombre, email);
    }

    private Usuario solicitarIdUsuario(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Ingrese el ID del Usuario: ");
        int id_usuario = validarOpcion.isNumber(scanner, 1, 1000);
        return new Usuario(id_usuario, "", "");
    }
    
}
