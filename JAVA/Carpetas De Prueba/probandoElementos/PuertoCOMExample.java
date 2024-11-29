package probandoElementos;

import com.fazecast.jSerialComm.SerialPort;

import javax.swing.*;

public class PuertoCOMExample {
    private JComboBox<String> comboBoxCOM;

    public PuertoCOMExample() {
        // Inicializa el ComboBox
        comboBoxCOM = new JComboBox<>();

        // Llama a la función para buscar puertos COM
        detectarPuertosCOM();

        // Agrega el ComboBox a tu interfaz
        JFrame frame = new JFrame("Seleccionar Puerto COM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.add(comboBoxCOM);
        frame.setVisible(true);
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

    public static void main(String[] args) {
        new PuertoCOMExample();
    }
}
