package clases;

public class ClasePrincipal {

    public static void main(String[] args) {

        Hilo_Proceso hilo1 = new Hilo_Proceso();
        Hilo_Proceso hilo2 = new Hilo_Proceso();

        hilo1.start();

        try {

            hilo1.sleep(1000); //Dormir el parametro por 3000 Milisegundos = 3 Segundos

        } catch (InterruptedException e) {

            System.out.println("Error en el hilo1 " + e);
        }

        hilo2.start();
        hilo2.stop();        //Provocar la muerte de un hilo

        try {

            hilo2.sleep(1000); //Dormir el parametro por 3000 Milisegundos = 3 Segundos

        } catch (InterruptedException e) {

            System.out.println("Error en el hilo1 " + e);
        }
    }
}
