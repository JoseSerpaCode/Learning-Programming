package probandoElementos;

public class TestMidiSimulator {
    public static void main(String[] args) {
        try {
            // Crear instancia del simulador MIDI
            MidiSimulator simulator = new MidiSimulator();

            // Simular una nota ON (Do medio, intensidad 127)
            simulator.simulateNoteOn(60, 127);
            Thread.sleep(500); // Espera 500ms

            // Simular una nota OFF (Do medio)
            simulator.simulateNoteOff(60);

            // Cerrar el simulador MIDI
            simulator.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
