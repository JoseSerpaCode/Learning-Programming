import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class RoundButtonExample extends JFrame {

    public RoundButtonExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JButton roundedButton = new RoundButton("Presionar");

        // Puedes ajustar el tamaño del botón redondeado según tus preferencias
        roundedButton.setPreferredSize(new Dimension(150, 40));

        JPanel panel = new JPanel();
        panel.add(roundedButton);

        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RoundButtonExample());
    }
}

class RoundButton extends JButton {

    public RoundButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.gray);
        } else {
            g.setColor(getBackground());
        }

        // Dibujar un botón redondeado
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        // Dibujar el borde del botón redondeado
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(new RoundRectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1, 20, 20));
    }
}
