import javax.swing.*;
import java.awt.*;

public class JLabelAdaptableExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JLabel Adaptable");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Crear un JLabel con un texto largo
            JLabel label = new JLabel("Este es un texto largo que se adapta al tamaño de la página.");

            // Configurar el diseño del contenedor principal
            frame.setLayout(new GridBagLayout());

            // Configurar los parámetros para que el JLabel se expanda
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1.0; // El JLabel puede expandirse horizontalmente
            gbc.weighty = 1.0; // El JLabel puede expandirse verticalmente
            gbc.fill = GridBagConstraints.BOTH; // Expansión en ambas direcciones

            // Agregar el JLabel al contenedor
            frame.add(label, gbc);

            frame.setVisible(true);
        });
    }
}
