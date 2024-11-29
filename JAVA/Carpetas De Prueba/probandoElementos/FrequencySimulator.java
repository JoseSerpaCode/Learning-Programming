package probandoElementos;

import java.util.Random;

public class FrequencySimulator {
    private Random random;

    public FrequencySimulator() {
        random = new Random();
    }

    // Simula la captura de frecuencia de un sensor (en Hz)
    public double simulateFrequency() {
        // Rango típico de frecuencia para tambores: 40Hz a 400Hz
        double minFrequency = 40.0;
        double maxFrequency = 400.0;

        return minFrequency + (maxFrequency - minFrequency) * random.nextDouble();
    }

    // Convierte una frecuencia en una nota MIDI
    public int convertFrequencyToMidi(double frequency) {
        // Fórmula para convertir frecuencia (Hz) a número de nota MIDI
        return (int) (69 + 12 * Math.log(frequency / 440.0) / Math.log(2));
    }
}
