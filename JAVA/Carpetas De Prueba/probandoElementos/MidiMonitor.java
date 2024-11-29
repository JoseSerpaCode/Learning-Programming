package probandoElementos;

import com.fazecast.jSerialComm.SerialPort;
import java.util.Scanner;

public class MidiMonitor {
    public static void main(String[] args) {
        // Lista todos los puertos serie disponibles
        SerialPort[] ports = SerialPort.getCommPorts();
        System.out.println("Puertos disponibles:");
        for (int i = 0; i < ports.length; i++) {
            System.out.println((i + 1) + ": " + ports[i].getSystemPortName());
        }

        // Selecciona un puerto
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Selecciona el número del puerto que deseas abrir: ");
        int portIndex = inputScanner.nextInt() - 1;

        if (portIndex < 0 || portIndex >= ports.length) {
            System.out.println("Índice de puerto inválido.");
            return;
        }

        SerialPort selectedPort = ports[portIndex];
        selectedPort.setComPortParameters(9600, 8, 1, SerialPort.NO_PARITY); // Configura el puerto
        selectedPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);

        if (selectedPort.openPort()) {
            System.out.println("Conexión al puerto " + selectedPort.getSystemPortName() + " exitosa.");
        } else {
            System.out.println("No se pudo conectar al puerto.");
            return;
        }

        // Lee datos desde el puerto
        Scanner serialScanner = new Scanner(selectedPort.getInputStream());
        while (serialScanner.hasNextLine()) {
            String line = serialScanner.nextLine();

            // Filtrar líneas con "Note On enviada" y velocidad >= 5
            if (line.startsWith("Note On enviada")) {
                int velocityIndex = line.lastIndexOf("velocidad: ");
                if (velocityIndex != -1) {
                    int velocity = Integer.parseInt(line.substring(velocityIndex + 11).trim());
                    if (velocity >= 5) {
                        System.out.println(line); // Imprime el mensaje si cumple el filtro
                    }
                }
            } else if (line.startsWith("Note Off enviada")) {
                System.out.println(line); // Imprime todas las notas apagadas
            }
        }

        // Cierra el puerto al finalizar
        serialScanner.close();
        selectedPort.closePort();
        System.out.println("Puerto cerrado.");
    }
}
