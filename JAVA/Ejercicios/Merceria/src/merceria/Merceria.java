package merceria;

import java.util.Scanner;

public class Merceria {

    public static final double VALOR_PRODUCTO = 9.99;
    public static final double DESCUENTO_5 = 0.05;
    public static final double DESCUENTO_10 = 0.10;
    public static final double MONTO_MINIMO_DESCUENTO = 100;
    public static final double MONTO_MAXIMO_DESCUENTO = 300;
    public static final String MENSAJE_COMPRA_ERROR = "No se permiten compras inferiores a 5 productos!",
            MENSAJE_COMPRA_10 = "El costo de envío es de $10 usd",
            MENSAJE_COMPRA_0 = "El costo de envío es de $0 usd";

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido a Merceria xyz");
        int compra = cantPaquetes(leer, "Cuantos productos desea comprar?:");

        descuento(compra);
        String mensaje = (compra < 5) ? MENSAJE_COMPRA_ERROR : ((compra <= 15) ? MENSAJE_COMPRA_10 : MENSAJE_COMPRA_0);
        System.out.println(mensaje);
        separador();
    }

    public static int cantPaquetes(Scanner leer, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (leer.hasNextInt()) {
                return leer.nextInt();
            } else {
                System.out.println("Por favor digite un número correcto!");
                leer.next();
            }
        }
    }

    public static void descuento(int nProductos) {
        double total = nProductos * VALOR_PRODUCTO;
        double descuento = 0;

        separador();
        System.out.printf("Monto: $%.2f usd %n", total);
        if (total < MONTO_MINIMO_DESCUENTO) {
            System.out.println("Debido a que el monto total es menor a $100 usd, NO HAY PROMOCIÓN");
            System.out.printf("Para alcanzar el descuento necesita: $%.2f usd (EL ENVÍO NO ENTRA) %n", (MONTO_MINIMO_DESCUENTO - total));
        } else {
            if (total >= MONTO_MAXIMO_DESCUENTO) {
                descuento = DESCUENTO_10;
            } else if (total >= MONTO_MINIMO_DESCUENTO) {
                descuento = DESCUENTO_5;
            }

            if (descuento > 0) {
                double nuevoMonto = total * (1 - descuento);
                System.out.printf("Tendrá un descuento del %.0f%% %n", descuento * 100);
                System.out.printf("Nuevo monto: $%.2f usd %n", nuevoMonto);
            }
        }
        
        separador();
    }

    public static void separador() {
        System.out.println("-------------------------------------------------------------------");
    }
}
