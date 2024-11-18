package probandoElementos;

import javax.sound.midi.*;

public class MidiSimulator {
    private Synthesizer synthesizer;
    private Receiver receiver;

    public MidiSimulator() throws MidiUnavailableException {
        // Inicializar sintetizador y receptor MIDI
        synthesizer = MidiSystem.getSynthesizer();
        synthesizer.open();
        receiver = synthesizer.getReceiver();
    }

    // Enviar un mensaje MIDI (Note On / Note Off)
    public void sendMidiMessage(int command, int note, int velocity) {
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(command, note, velocity);
            receiver.send(message, -1);
            System.out.println("Mensaje MIDI enviado: Command = " + command + ", Note = " + note + ", Velocity = " + velocity);
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

    // Método para simular una nota ON
    public void simulateNoteOn(int note, int velocity) {
        sendMidiMessage(144, note, velocity); // 144 = Note On
    }

    // Método para simular una nota OFF
    public void simulateNoteOff(int note) {
        sendMidiMessage(128, note, 0); // 128 = Note Off
    }

    // Cerrar recursos
    public void close() {
        if (receiver != null) receiver.close();
        if (synthesizer != null) synthesizer.close();
    }
}
