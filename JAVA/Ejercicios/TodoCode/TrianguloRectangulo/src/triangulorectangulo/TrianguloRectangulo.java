package triangulorectangulo;

public class TrianguloRectangulo {

    public static void main(String[] args) {

        int altura = 4;

        //Estableciendo filas
        for (int fila = 0; fila < altura; fila++) {
            // Primera fila o última fila
            if (fila == 0 || fila == (altura -1)) {
                for (int espacios = 0; espacios < (fila*2) + 1; espacios++) {
                    System.out.print("*");
                }
            } else {
                //Pintar primer asterisco de la fila
                System.out.print("*");
                //pintar los espacios
                for (int espacios = 0; espacios < (fila * 2) - 1; espacios++) {
                    System.out.print(" ");
                }
                //pintar último asterisco de la fila
                System.out.print("*");
            }
            //Salto de línea
            System.out.println("");
        }
    }
}