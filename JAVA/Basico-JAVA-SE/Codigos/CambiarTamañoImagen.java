import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class CambiarTamañoImagen {

    public static void main(String[] args) {
        try {
            // Ruta de la imagen de entrada y salida
            String rutaImagenEntrada = "images/principal1.jpg";
            String rutaImagenSalida = "images/principal1(recortada).jpg";

            // Tamaño deseado de la imagen de salida
            int nuevoAncho = 330;
            int nuevoAlto = 200;

            // Cargar la imagen de entrada
            BufferedImage imagenEntrada = ImageIO.read(new File(rutaImagenEntrada));

            // Crear una imagen de salida con el nuevo tamaño
            BufferedImage imagenSalida = new BufferedImage(nuevoAncho, nuevoAlto, BufferedImage.TYPE_INT_RGB);

            // Escalar la imagen de entrada al nuevo tamaño
            Graphics2D g = imagenSalida.createGraphics();
            g.drawImage(imagenEntrada, 0, 0, nuevoAncho, nuevoAlto, null);
            g.dispose();

            // Guardar la imagen de salida
            ImageIO.write(imagenSalida, "png", new File(rutaImagenSalida));

            System.out.println("Imagen redimensionada con éxito.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
