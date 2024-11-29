package rectangulo;

import java.util.Scanner;

/**
 * @author José Serpa Medina
 */
public class Rectangulo {

    float largo, ancho;
    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Cálculo del área y perímetro de un rectángulo\n");

            rect.setLargo();
            rect.setAncho();

            System.out.println("\nResultados:");
            System.out.println("Área: " + rect.getArea());
            System.out.println("Perímetro: " + rect.getPerimetro());

            System.out.print("\n¿Desea realizar otro cálculo? Sí (1), No (2): ");
            opcion = entrada.nextInt();
        } while (opcion == 1);

        System.out.println("Gracias por usar el programa.");
    }

    public void setLargo() {
        System.out.print("Escriba el largo del rectángulo: ");
        this.largo = entrada.nextFloat();
    }

    public void setAncho() {
        System.out.print("Escriba el ancho del rectángulo: ");
        this.ancho = entrada.nextFloat();
    }

    public float getPerimetro() {
        return (2 * ancho) + (2 * largo);
    }

    public float getArea() {
        return ancho * largo;
    }
}
