import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame implements ActionListener {

    private JButton botonNovedades, botonRedesSociales, botonQuejas;

    public Principal() {
        setLayout(new BorderLayout());
        setTitle("IE ANTONIO LENIS");
        getContentPane().setBackground(new Color(0, 40, 50));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configuración de los botones
        botonNovedades = crearBoton("Novedades");
        botonRedesSociales = crearBoton("Redes Sociales");
        botonQuejas = crearBoton("Quejas y Reclamaciones");

        // Panel para los botones en la parte izquierda
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));
        panelBotones.add(botonNovedades);
        panelBotones.add(botonRedesSociales);
        panelBotones.add(botonQuejas);
        add(panelBotones, BorderLayout.LINE_START);

        // Agregar ComponentListener para detectar cambios en el tamaño de la ventana
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ajustarTamanioBotones();
            }
        });

        // Hacer visible la ventana
        setSize(720, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JButton crearBoton(String texto) {
        JButton boton = new JButton(texto);
        boton.setAlignmentX(Component.CENTER_ALIGNMENT);
        boton.addActionListener(this);
        return boton;
    }

    private void ajustarTamanioBotones() {
        int anchoVentana = getWidth();
        int altoVentana = getHeight();

        if (anchoVentana == 1080 && altoVentana == 720) {
            asignarTamanioBotones(150, 50); // Ajusta estos valores según tus necesidades
        } else if (anchoVentana == 786 && altoVentana == 480) {
            asignarTamanioBotones(120, 40);
        } else if (anchoVentana == 720 && altoVentana == 400) {
            asignarTamanioBotones(100, 30);
        }
    }

    private void asignarTamanioBotones(int ancho, int alto) {
        ajustarTamanioBoton(botonNovedades, ancho, alto);
        ajustarTamanioBoton(botonRedesSociales, ancho, alto);
        ajustarTamanioBoton(botonQuejas, ancho, alto);
        // Agregar más botones según sea necesario
    }

    private void ajustarTamanioBoton(JButton boton, int ancho, int alto) {
        if (boton != null) {
            Dimension nuevoTamano = new Dimension(ancho, alto);

            boton.setSize(nuevoTamano);
            boton.setPreferredSize(nuevoTamano);
            boton.setMinimumSize(nuevoTamano);
            boton.setMaximumSize(nuevoTamano);

            // Volver a validar y redibujar el componente
            boton.revalidate();
            boton.repaint();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Agregar acciones para los botones según sea necesario
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Principal());
    }
}
