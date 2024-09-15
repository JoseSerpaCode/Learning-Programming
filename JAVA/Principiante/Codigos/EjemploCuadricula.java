import java.awt.*;
import javax.swing.*;

public class EjemploCuadricula extends JFrame {
    public EjemploCuadricula() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón 2");
        JButton button3 = new JButton("Botón 3");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(button1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(button2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(button3, gbc);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EjemploCuadricula().setVisible(true));
    }
}
