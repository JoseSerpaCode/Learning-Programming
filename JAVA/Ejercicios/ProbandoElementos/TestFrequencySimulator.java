package probandoElementos;

public class TestFrequencySimulator {
    public static void main(String[] args) {
        FrequencySimulator frequencySimulator = new FrequencySimulator();
        MidiSimulator midiSimulator;

        try {
            midiSimulator = new MidiSimulator();

            for (int i = 0; i < 10; i++) { // Generar 10 muestras
                // Simular frecuencia
                double frequency = frequencySimulator.simulateFrequency();
                System.out.println("Frecuencia simulada: " + frequency + " Hz");

                // Convertir frecuencia a nota MIDI
                int midiNote = frequencySimulator.convertFrequencyToMidi(frequency);
                System.out.println("Nota MIDI generada: " + midiNote);

                // Enviar mensaje MIDI (Note On / Note Off)
                midiSimulator.simulateNoteOn(midiNote, 100); // Intensidad 100
                Thread.sleep(500); // Reproduce la nota por 500ms
                midiSimulator.simulateNoteOff(midiNote);
            }

            midiSimulator.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
