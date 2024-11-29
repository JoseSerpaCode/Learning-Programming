package probandoElementos;

import com.fazecast.jSerialComm.SerialPort;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class MidiMonitorUI extends JFrame {
    private JComboBox<String> comboBoxCOM;
    private JLabel labelEstado;
    private SerialPort puerto;
    private Thread lecturaHilo;

    public MidiMonitorUI() {
        // Configuración básica de la ventana
        setTitle("Monitor MIDI");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Componentes de la UI
        comboBoxCOM = new JComboBox<>();
        JButton btnDetectar = new JButton("Detectar Puertos");
        JButton btnConectar = new JButton("Conectar");
        JButton btnDesconectar = new JButton("Desconectar");
        labelEstado = new JLabel("Estado: Desconectado", JLabel.CENTER);
        labelEstado.setForeground(Color.RED);

        // Añadir componentes a la ventana
        JPanel panelSuperior = new JPanel();
        panelSuperior.add(new JLabel("Puerto COM:"));
        panelSuperior.add(comboBoxCOM);
        panelSuperior.add(btnDetectar);
        panelSuperior.add(btnConectar);
        panelSuperior.add(btnDesconectar);
        add(panelSuperior, BorderLayout.NORTH);
        add(labelEstado, BorderLayout.CENTER);

        // Listeners
        btnDetectar.addActionListener(e -> detectarPuertosCOM());
        btnConectar.addActionListener(e -> conectarPuerto());
        btnDesconectar.addActionListener(e -> desconectarPuerto());

        // Detectar puertos inicialmente
        detectarPuertosCOM();
    }

    private void detectarPuertosCOM() {
        // Obtiene los puertos COM disponibles
        SerialPort[] puertos = SerialPort.getCommPorts();
        
        // Limpia el ComboBox (en caso de que lo llames varias veces)
        comboBoxCOM.removeAllItems();

        // Añade los nombres de los puertos al ComboBox
        for (SerialPort puerto : puertos) {
            comboBoxCOM.addItem(puerto.getSystemPortName()); // Ejemplo: "COM3"
        }

        // Si no hay puertos disponibles, muestra un mensaje
        if (comboBoxCOM.getItemCount() == 0) {
            comboBoxCOM.addItem("No hay puertos disponibles");
        }
    }

    private void conectarPuerto() {
        String puertoSeleccionado = (String) comboBoxCOM.getSelectedItem();

        if (puertoSeleccionado == null || puertoSeleccionado.equals("No hay puertos disponibles")) {
            JOptionPane.showMessageDialog(this, "Selecciona un puerto válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (puerto != null && puerto.isOpen()) {
            JOptionPane.showMessageDialog(this, "El puerto ya está conectado.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        puerto = SerialPort.getCommPort(puertoSeleccionado);
        puerto.setComPortParameters(9600, 8, SerialPort.ONE_STOP_BIT, SerialPort.NO_PARITY);
        puerto.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);

        if (puerto.openPort()) {
            JOptionPane.showMessageDialog(this, "Conexión exitosa con " + puertoSeleccionado, "Conectado", JOptionPane.INFORMATION_MESSAGE);
            actualizarIndicadorEstado(true);

            // Iniciar lectura de datos
            iniciarLecturaDatos();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo conectar al puerto " + puertoSeleccionado, "Error", JOptionPane.ERROR_MESSAGE);
            actualizarIndicadorEstado(false);
        }
    }

    private void desconectarPuerto() {
        if (puerto != null && puerto.isOpen()) {
            puerto.closePort();
            JOptionPane.showMessageDialog(this, "Puerto desconectado.", "Desconectado", JOptionPane.INFORMATION_MESSAGE);
            actualizarIndicadorEstado(false);

            // Detener hilo de lectura
            if (lecturaHilo != null && lecturaHilo.isAlive()) {
                lecturaHilo.interrupt();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay un puerto conectado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarIndicadorEstado(boolean conectado) {
        if (conectado) {
            labelEstado.setText("Estado: Conectado");
            labelEstado.setForeground(Color.GREEN);
        } else {
            labelEstado.setText("Estado: Desconectado");
            labelEstado.setForeground(Color.RED);
        }
    }

    private void iniciarLecturaDatos() {
        lecturaHilo = new Thread(() -> {
            try (Scanner serialScanner = new Scanner(puerto.getInputStream())) {
                while (!Thread.currentThread().isInterrupted() && serialScanner.hasNextLine()) {
                    String linea = serialScanner.nextLine();

                    // Filtrar datos MIDI
                    if (linea.startsWith("Note On enviada")) {
                        int velocityIndex = linea.lastIndexOf("velocidad: ");
                        if (velocityIndex != -1) {
                            int velocity = Integer.parseInt(linea.substring(velocityIndex + 11).trim());
                            if (velocity >= 5) {
                                System.out.println(linea); // Imprime si cumple el filtro
                            }
                        }
                    } else if (linea.startsWith("Note Off enviada")) {
                        System.out.println(linea); // Imprime todas las notas apagadas
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        lecturaHilo.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MidiMonitorUI ventana = new MidiMonitorUI();
            ventana.setVisible(true);
        });
    }
}
