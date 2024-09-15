package hilos;

public class Hilo1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + ": G");

            try {
                Hilo1.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en el Hilo1 " + e);
            }
        }
    }
}
