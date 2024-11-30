import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioSesionConFondo extends JFrame {

    public InicioSesionConFondo() {
        // Configuración del JFrame
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar en la pantalla

        // Establecer el diseño del JFrame como BorderLayout para que la imagen de fondo ocupe todo el contenedor
        setLayout(new BorderLayout());

        // Crear un panel con una imagen de fondo
        JPanel panelFondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo
                Image imagenFondo = new ImageIcon("Fondo.png").getImage();
                // Dibujar la imagen de fondo
                g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Configuración del panel de fondo
        panelFondo.setLayout(new GridBagLayout());

        // Crear componentes de inicio de sesión
        JLabel etiquetaUsuario = new JLabel("Usuario:");
        JTextField campoUsuario = new JTextField(15);
        JLabel etiquetaContrasena = new JLabel("Contraseña:");
        JPasswordField campoContrasena = new JPasswordField(15);
        JButton botonIniciarSesion = new JButton("Iniciar Sesión");

        // Configurar el diseño del panel de inicio de sesión
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5); // Márgenes

        panelFondo.add(etiquetaUsuario, gbc);
        gbc.gridy++;
        panelFondo.add(campoUsuario, gbc);
        gbc.gridy++;
        panelFondo.add(etiquetaContrasena, gbc);
        gbc.gridy++;
        panelFondo.add(campoContrasena, gbc);
        gbc.gridy++;
        panelFondo.add(botonIniciarSesion, gbc);

        // Manejador de eventos para el botón de inicio de sesión
        botonIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica de autenticación aquí
                JOptionPane.showMessageDialog(null, "Iniciando sesión como " + campoUsuario.getText());
            }
        });

        // Agregar el panel de fondo al JFrame
        add(panelFondo);

        // Hacer visible el JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase InicioSesionConFondo
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InicioSesionConFondo();
            }
        });
    }
}
