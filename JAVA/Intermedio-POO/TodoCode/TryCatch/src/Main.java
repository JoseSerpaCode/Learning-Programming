import java.util.Scanner;

public class Main {

    public static void dividir(int a, int b) throws ArithmeticException {
        System.out.println("Resultado: " + (a/b));
    }

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(500);

        try {
            cuenta.retirar(600); // Esto generará una excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error al retirar dinero: " + e.getMessage());
        }

        /*
        try {
            dividir(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error en la división: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int a = 10;
                int b = 0;
                int resultado = a / b; // Esto genera una excepción
                System.out.println("El resultado es: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir por cero.");
            } finally {
                System.out.println("Desea volver a ejecutar? y/n");
                String opcion = scanner.nextLine();

                if (opcion.equals("n")) {
                    return;
                }
            }
        }
         */
    }
}