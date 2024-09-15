/*
 * Clase abstracta que sirve como base para las operaciones del cajero automático.
 */
package cajero;

import java.util.Scanner;

/**
 * @author joses
 * Clase base que implementa las operaciones comunes de un cajero automático.
 * Las clases hijas deben proporcionar la lógica específica para el método SaldoTotal.
 */
public abstract class menu {

    // Atributos
    protected int Seleccion_Menu; // Almacena la opción seleccionada por el usuario.
    protected static int saldo; // Almacena el saldo actual del usuario.
    Scanner entrada = new Scanner(System.in); // Objeto Scanner utilizado para la entrada de datos.
    
    /**
     * Implementa el bucle principal del menú, permitiendo al usuario seleccionar diferentes operaciones.
     */
    public void menuCajero() {
        do {
            System.out.println("""
                Por favor seleccione una opcion: 
                    1. Consulta de saldo. 
                    2. Retiro de efectivo. 
                    3. Deposito de efectivo. 
                    4. Salir.""");
            Seleccion_Menu = entrada.nextInt();

            switch (Seleccion_Menu) {
                case 1 -> {
                    ConsultaSaldo mensajeroSaldo = new ConsultaSaldo();
                    mensajeroSaldo.SaldoTotal();
                }

                case 2 -> {
                    RetiroEfectivo mensajeroRetiro = new RetiroEfectivo();
                    mensajeroRetiro.SaldoTotal();
                }

                case 3 -> {
                    DepositoEfectivo mensajeroDeposito = new DepositoEfectivo();
                    mensajeroDeposito.SaldoTotal();
                }

                case 4 -> {
                    System.out.println("Gracias por usar el cajero automatico! Hasta luego.");
                    System.exit(0); // Sale del programa
                }

                default -> { // En caso de elegir cualquier numero diferente entre 1 y 4
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                }
            }
        } while (true); // Bucle infinito para volver a mostrar el menú
    }

    public abstract void SaldoTotal(); //Método abstracto que debe ser implementado por las clases hijas para proporcionar la lógica específica del saldo.

}
