package probandoElementos;

import interfaceSampler.CustomSliderUI;
import javax.swing.*;
import java.awt.*;

public class CustomSongSliderUI extends CustomSliderUI {

    private final int thumbWidth = 20;  // Ancho del thumb (más grande)
    private final int thumbHeight = 30; // Altura del thumb (más grande)
    private final Color sliderBackground = new Color(18, 18, 18); // Fondo del slider
    private final Color trackColor = Color.GRAY; // Color de la pista
    private final Color thumbColor = Color.LIGHT_GRAY; // Color del thumb

    public CustomSongSliderUI(JSlider slider) {
        super(slider);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        // Pinta el fondo del slider
        g.setColor(sliderBackground);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());
        super.paint(g, c);
    }

    @Override
    public void paintTrack(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Cambiar el grosor de la pista
        int trackWidth = 8; // Más gruesa
        int x = trackRect.x + (trackRect.width - trackWidth) / 2;

        g2d.setColor(trackColor);
        g2d.fillRoundRect(x, trackRect.y, trackWidth, trackRect.height, 5, 5);

        g2d.dispose();
    }

    @Override
    protected Dimension getThumbSize() {
        // Ajustar el tamaño del área del thumb
        return new Dimension(thumbWidth, thumbHeight);
    }

    @Override
    public void calculateThumbLocation() {
        super.calculateThumbLocation();

        // Ajusta la posición del thumb para que esté centrado en la pista
        thumbRect.x = thumbRect.x - (thumbWidth - thumbRect.width) / 2;
        thumbRect.y = thumbRect.y - (thumbHeight - thumbRect.height) / 2;
    }

    @Override
    public void setThumbLocation(int x, int y) {
        super.setThumbLocation(x, y);
        slider.repaint();
    }
}
