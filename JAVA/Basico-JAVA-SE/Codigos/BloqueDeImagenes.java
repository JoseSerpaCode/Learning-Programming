import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class BloqueDeImagenes extends JFrame {

    private List<ImageIcon> imagenes;
    private JLabel imagenLabel;
    private int indiceActual;

    public BloqueDeImagenes() {
        setTitle("Cambio de Imágenes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ruta de las imágenes
        String[] nombresImagenes = {"principal1.jpg", "principal2.jpg", "principal3.jpg"};
        imagenes = new ArrayList<>();

        for (String nombre : nombresImagenes) {
            ImageIcon imagen = new ImageIcon(nombre);
            imagenes.add(imagen);
        }

        // Configuración del JLabel para mostrar las imágenes
        imagenLabel = new JLabel();
        imagenLabel.setHorizontalAlignment(JLabel.CENTER);
        add(imagenLabel);

        // Configuración del temporizador para cambiar las imágenes cada 2000 milisegundos (2 segundos)
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarSiguienteImagen();
            }
        });
        timer.start();

        // Mostrar la primera imagen al iniciar la aplicación
        mostrarSiguienteImagen();

        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void mostrarSiguienteImagen() {
        if (imagenes.isEmpty()) {
            return;  // No hay imágenes para mostrar
        }

        // Cambiar la imagen en el JLabel
        imagenLabel.setIcon(imagenes.get(indiceActual));

        // Incrementar el índice para la próxima imagen
        indiceActual = (indiceActual + 1) % imagenes.size();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BloqueDeImagenes();
        });
    }
}
