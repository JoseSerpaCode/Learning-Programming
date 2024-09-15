package clases;

public class Hilo_Proceso extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);

            try {
                Hilo_Proceso.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Errror dentro de la clase " + e);
            }
        }
    }
}
