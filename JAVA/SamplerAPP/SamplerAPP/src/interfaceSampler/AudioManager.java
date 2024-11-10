package interfaceSampler;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class AudioManager {
    private File[] audioFiles;
    private Clip[] audioClips;

    public AudioManager(int padCount) {
        audioFiles = new File[padCount];
        audioClips = new Clip[padCount];
    }

    public void selectAudioFile(int padNumber, JFrame parentFrame) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Audio Files (MP3, WAV)", "mp3", "wav"));
        int result = fileChooser.showOpenDialog(parentFrame);
        if (result == JFileChooser.APPROVE_OPTION) {
            audioFiles[padNumber - 1] = fileChooser.getSelectedFile();
            System.out.println("Archivo asignado al pad " + padNumber + ": " + audioFiles[padNumber - 1].getName());
        }
    }

    public void playAudio(int padNumber) {
        File audioFile = audioFiles[padNumber - 1];
        if (audioFile == null) {
            System.out.println("No se ha asignado un sonido al pad: " + padNumber);
            return;
        }
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            audioClips[padNumber - 1] = AudioSystem.getClip();
            audioClips[padNumber - 1].open(audioStream);
            audioClips[padNumber - 1].start();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al reproducir el audio.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}