package calcularsueldo;

import java.util.Scanner;

public class CalcularSueldo {

    public static void main(String[] args) {
        CalcularSueldo mensajero = new CalcularSueldo();
        mensajero.menu();
    }

    float sueldoFijo;
    double total;
    static String sueldoMensaje = "Sueldo total: $";
    static String menuText = """
                         ****Bienvenido a la Empresa***
                             
                         (1) - Repositor
                         (2) - Cajero
                         (3) - Supervisor
                             
                         Seleccione su categoria:
                         """;

    Scanner entrada = new Scanner(System.in);

    public void menu() {
        System.out.print(menuText);
        int select = entrada.nextInt();

        switch (select) {
            case 1 -> repositor();
            case 2 -> cajero();
            case 3 -> supervisor();
            default -> menu();
        }

        System.out.println("Desea regresar al menu?: (1) SI / (2) NO");
        int op = entrada.nextInt();

        if (op == 1) {
            menu();
        }
    }

    public void repositor() {
        sueldoFijo = 15890F;
        double bonif = (sueldoFijo * 0.10);
        total = sueldoFijo + bonif;

        System.out.println("Sueldo Fijo: $" + sueldoFijo);
        System.out.println("Bonificación (10%): $" + bonif);
        System.out.println(sueldoMensaje + total);
    }

    public void cajero() {
        total = 15890.20F;
        System.out.println(sueldoMensaje + total);
    }

    public void supervisor() {
        sueldoFijo = 15890F;
        double descuento = (sueldoFijo * 0.11);
        total = sueldoFijo - descuento;
        System.out.println(sueldoMensaje + total);
    }

}
