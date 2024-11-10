package interfaceSampler;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * @author José_Serpa
 */
public class PrincipalSampler extends javax.swing.JFrame {
    
    public PrincipalSampler() {
        initComponents();

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/beatLogoRedimensionado.png"));
        setIconImage(icon.getImage());   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelPrincipal_Uno = new interfaceSampler.PanelRound();
        panelPerfil = new interfaceSampler.PanelRound();
        label_PerfilSeleccionado = new javax.swing.JLabel();
        label_ImageLibrary = new javax.swing.JLabel();
        panelGuardar = new interfaceSampler.PanelRound();
        botonGuardar = new interfaceSampler.PanelRound();
        label_Guardar = new javax.swing.JLabel();
        label_TituloGuardar = new javax.swing.JLabel();
        panelTextoGuardar = new interfaceSampler.PanelRound();
        label_TextoGuardar = new javax.swing.JLabel();
        panelReestablecer = new interfaceSampler.PanelRound();
        botonReestablecer = new interfaceSampler.PanelRound();
        label_Reestablecer = new javax.swing.JLabel();
        label_TituloReestablecer = new javax.swing.JLabel();
        panelTextoReestablecer = new interfaceSampler.PanelRound();
        label_TextoReestablecer = new javax.swing.JLabel();
        panelPrincipal_Dos = new interfaceSampler.PanelRound();
        panelHeaderPads = new interfaceSampler.PanelRound();
        labelAjustesIcon = new javax.swing.JLabel();
        labelTitulo_PADS = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelPerfil_Seleccionado = new javax.swing.JLabel();
        padSound1 = new interfaceSampler.PanelRound();
        labelPadSound1 = new javax.swing.JLabel();
        padSound2 = new interfaceSampler.PanelRound();
        labelPadSound2 = new javax.swing.JLabel();
        padSound3 = new interfaceSampler.PanelRound();
        labelPadSound3 = new javax.swing.JLabel();
        padSound4 = new interfaceSampler.PanelRound();
        labelPadSound4 = new javax.swing.JLabel();
        padSound11 = new interfaceSampler.PanelRound();
        labelPadSound5 = new javax.swing.JLabel();
        padSound14 = new interfaceSampler.PanelRound();
        labelPadSound6 = new javax.swing.JLabel();
        label_NumeroDelPAD_1 = new javax.swing.JLabel();
        label_NumeroDelPAD_2 = new javax.swing.JLabel();
        label_NumeroDelPAD_3 = new javax.swing.JLabel();
        label_NumeroDelPAD_4 = new javax.swing.JLabel();
        label_NumeroDelPAD_5 = new javax.swing.JLabel();
        label_NumeroDelPAD_6 = new javax.swing.JLabel();
        panelRelleno = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PadLand");
        setResizable(false);

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal_Uno.setBackground(new java.awt.Color(18, 18, 18));
        panelPrincipal_Uno.setRoundBottomLeft(20);
        panelPrincipal_Uno.setRoundBottomRight(20);
        panelPrincipal_Uno.setRoundTopLeft(20);
        panelPrincipal_Uno.setRoundTopRight(20);

        panelPerfil.setBackground(new java.awt.Color(18, 18, 18));

        label_PerfilSeleccionado.setBackground(new java.awt.Color(210, 210, 210));
        label_PerfilSeleccionado.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        label_PerfilSeleccionado.setForeground(new java.awt.Color(168, 168, 168));
        label_PerfilSeleccionado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_PerfilSeleccionado.setText("<html>Perfil Predeterminado<html>");

        label_ImageLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libraryIcon.png"))); // NOI18N

        javax.swing.GroupLayout panelPerfilLayout = new javax.swing.GroupLayout(panelPerfil);
        panelPerfil.setLayout(panelPerfilLayout);
        panelPerfilLayout.setHorizontalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPerfilLayout.createSequentialGroup()
                .addComponent(label_ImageLibrary, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_PerfilSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelPerfilLayout.setVerticalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfilLayout.createSequentialGroup()
                .addGroup(panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label_PerfilSeleccionado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_ImageLibrary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelGuardar.setBackground(new java.awt.Color(31, 31, 31));
        panelGuardar.setRoundBottomLeft(30);
        panelGuardar.setRoundBottomRight(30);
        panelGuardar.setRoundTopLeft(30);
        panelGuardar.setRoundTopRight(30);

        botonGuardar.setBackground(new java.awt.Color(255, 255, 255));
        botonGuardar.setRoundBottomLeft(25);
        botonGuardar.setRoundBottomRight(25);
        botonGuardar.setRoundTopLeft(25);
        botonGuardar.setRoundTopRight(25);

        label_Guardar.setBackground(new java.awt.Color(210, 210, 210));
        label_Guardar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        label_Guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Guardar.setText("Guardar");
        label_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout botonGuardarLayout = new javax.swing.GroupLayout(botonGuardar);
        botonGuardar.setLayout(botonGuardarLayout);
        botonGuardarLayout.setHorizontalGroup(
            botonGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );
        botonGuardarLayout.setVerticalGroup(
            botonGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        label_TituloGuardar.setBackground(new java.awt.Color(210, 210, 210));
        label_TituloGuardar.setFont(new java.awt.Font("Roboto Black", 0, 15)); // NOI18N
        label_TituloGuardar.setForeground(new java.awt.Color(230, 230, 230));
        label_TituloGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_TituloGuardar.setText("Guardar Cambios");

        panelTextoGuardar.setBackground(new java.awt.Color(31, 31, 31));
        panelTextoGuardar.setRoundBottomLeft(30);
        panelTextoGuardar.setRoundBottomRight(30);
        panelTextoGuardar.setRoundTopLeft(30);
        panelTextoGuardar.setRoundTopRight(30);

        label_TextoGuardar.setBackground(new java.awt.Color(210, 210, 210));
        label_TextoGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        label_TextoGuardar.setForeground(new java.awt.Color(230, 230, 230));
        label_TextoGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_TextoGuardar.setText("<html>Guardar los sonidos de los pads en el perfil seleccionado.<html>");

        javax.swing.GroupLayout panelTextoGuardarLayout = new javax.swing.GroupLayout(panelTextoGuardar);
        panelTextoGuardar.setLayout(panelTextoGuardarLayout);
        panelTextoGuardarLayout.setHorizontalGroup(
            panelTextoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTextoGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_TextoGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
        );
        panelTextoGuardarLayout.setVerticalGroup(
            panelTextoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextoGuardarLayout.createSequentialGroup()
                .addComponent(label_TextoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelGuardarLayout = new javax.swing.GroupLayout(panelGuardar);
        panelGuardar.setLayout(panelGuardarLayout);
        panelGuardarLayout.setHorizontalGroup(
            panelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuardarLayout.createSequentialGroup()
                .addGroup(panelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTextoGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelGuardarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_TituloGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelGuardarLayout.setVerticalGroup(
            panelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuardarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label_TituloGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTextoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelReestablecer.setBackground(new java.awt.Color(31, 31, 31));
        panelReestablecer.setRoundBottomLeft(30);
        panelReestablecer.setRoundBottomRight(30);
        panelReestablecer.setRoundTopLeft(30);
        panelReestablecer.setRoundTopRight(30);

        botonReestablecer.setBackground(new java.awt.Color(255, 255, 255));
        botonReestablecer.setRoundBottomLeft(25);
        botonReestablecer.setRoundBottomRight(25);
        botonReestablecer.setRoundTopLeft(25);
        botonReestablecer.setRoundTopRight(25);

        label_Reestablecer.setBackground(new java.awt.Color(210, 210, 210));
        label_Reestablecer.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        label_Reestablecer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_Reestablecer.setText("Reestablecer");
        label_Reestablecer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout botonReestablecerLayout = new javax.swing.GroupLayout(botonReestablecer);
        botonReestablecer.setLayout(botonReestablecerLayout);
        botonReestablecerLayout.setHorizontalGroup(
            botonReestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Reestablecer, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );
        botonReestablecerLayout.setVerticalGroup(
            botonReestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_Reestablecer, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        label_TituloReestablecer.setBackground(new java.awt.Color(210, 210, 210));
        label_TituloReestablecer.setFont(new java.awt.Font("Roboto Black", 0, 15)); // NOI18N
        label_TituloReestablecer.setForeground(new java.awt.Color(230, 230, 230));
        label_TituloReestablecer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_TituloReestablecer.setText("Reestablecer");

        panelTextoReestablecer.setBackground(new java.awt.Color(31, 31, 31));
        panelTextoReestablecer.setRoundBottomLeft(30);
        panelTextoReestablecer.setRoundBottomRight(30);
        panelTextoReestablecer.setRoundTopLeft(30);
        panelTextoReestablecer.setRoundTopRight(30);

        label_TextoReestablecer.setBackground(new java.awt.Color(210, 210, 210));
        label_TextoReestablecer.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        label_TextoReestablecer.setForeground(new java.awt.Color(230, 230, 230));
        label_TextoReestablecer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_TextoReestablecer.setText("<html>Se reestablecen todos los pads.<html>");

        javax.swing.GroupLayout panelTextoReestablecerLayout = new javax.swing.GroupLayout(panelTextoReestablecer);
        panelTextoReestablecer.setLayout(panelTextoReestablecerLayout);
        panelTextoReestablecerLayout.setHorizontalGroup(
            panelTextoReestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextoReestablecerLayout.createSequentialGroup()
                .addComponent(label_TextoReestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        panelTextoReestablecerLayout.setVerticalGroup(
            panelTextoReestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_TextoReestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout panelReestablecerLayout = new javax.swing.GroupLayout(panelReestablecer);
        panelReestablecer.setLayout(panelReestablecerLayout);
        panelReestablecerLayout.setHorizontalGroup(
            panelReestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReestablecerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelReestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonReestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_TituloReestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTextoReestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelReestablecerLayout.setVerticalGroup(
            panelReestablecerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReestablecerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label_TituloReestablecer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTextoReestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonReestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout panelPrincipal_UnoLayout = new javax.swing.GroupLayout(panelPrincipal_Uno);
        panelPrincipal_Uno.setLayout(panelPrincipal_UnoLayout);
        panelPrincipal_UnoLayout.setHorizontalGroup(
            panelPrincipal_UnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipal_UnoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelPrincipal_UnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipal_UnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelReestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 163, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipal_UnoLayout.setVerticalGroup(
            panelPrincipal_UnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipal_UnoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelReestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        bg.add(panelPrincipal_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 412));

        panelPrincipal_Dos.setBackground(new java.awt.Color(18, 18, 18));
        panelPrincipal_Dos.setRoundBottomLeft(10);
        panelPrincipal_Dos.setRoundBottomRight(10);
        panelPrincipal_Dos.setRoundTopLeft(10);
        panelPrincipal_Dos.setRoundTopRight(10);

        panelHeaderPads.setBackground(new java.awt.Color(20, 20, 20));
        panelHeaderPads.setRoundBottomLeft(10);
        panelHeaderPads.setRoundBottomRight(10);
        panelHeaderPads.setRoundTopLeft(10);
        panelHeaderPads.setRoundTopRight(10);

        labelAjustesIcon.setBackground(new java.awt.Color(210, 210, 210));
        labelAjustesIcon.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelAjustesIcon.setForeground(new java.awt.Color(210, 210, 210));
        labelAjustesIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAjustesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ajustesIcon.png"))); // NOI18N
        labelAjustesIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAjustesIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAjustesIconMouseClicked(evt);
            }
        });

        labelTitulo_PADS.setBackground(new java.awt.Color(210, 210, 210));
        labelTitulo_PADS.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelTitulo_PADS.setForeground(new java.awt.Color(210, 210, 210));
        labelTitulo_PADS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTitulo_PADS.setText("PADS");

        javax.swing.GroupLayout panelHeaderPadsLayout = new javax.swing.GroupLayout(panelHeaderPads);
        panelHeaderPads.setLayout(panelHeaderPadsLayout);
        panelHeaderPadsLayout.setHorizontalGroup(
            panelHeaderPadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderPadsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAjustesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelHeaderPadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelHeaderPadsLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(labelTitulo_PADS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(323, Short.MAX_VALUE)))
        );
        panelHeaderPadsLayout.setVerticalGroup(
            panelHeaderPadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAjustesIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
            .addGroup(panelHeaderPadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelHeaderPadsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelTitulo_PADS, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        labelPerfil_Seleccionado.setBackground(new java.awt.Color(107, 107, 107));
        labelPerfil_Seleccionado.setFont(new java.awt.Font("Roboto Medium", 0, 10)); // NOI18N
        labelPerfil_Seleccionado.setForeground(new java.awt.Color(107, 107, 107));
        labelPerfil_Seleccionado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelPerfil_Seleccionado.setText("© 2024 José Serpa - Jairo Gamarra");

        padSound1.setBackground(new java.awt.Color(119, 55, 149));
        padSound1.setRoundBottomLeft(30);
        padSound1.setRoundBottomRight(30);
        padSound1.setRoundTopLeft(30);
        padSound1.setRoundTopRight(30);

        labelPadSound1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelPadSound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPadSound1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout padSound1Layout = new javax.swing.GroupLayout(padSound1);
        padSound1.setLayout(padSound1Layout);
        padSound1Layout.setHorizontalGroup(
            padSound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPadSound1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        padSound1Layout.setVerticalGroup(
            padSound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPadSound1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        padSound2.setBackground(new java.awt.Color(235, 30, 50));
        padSound2.setRoundBottomLeft(30);
        padSound2.setRoundBottomRight(30);
        padSound2.setRoundTopLeft(30);
        padSound2.setRoundTopRight(30);

        labelPadSound2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout padSound2Layout = new javax.swing.GroupLayout(padSound2);
        padSound2.setLayout(padSound2Layout);
        padSound2Layout.setHorizontalGroup(
            padSound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPadSound2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        padSound2Layout.setVerticalGroup(
            padSound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPadSound2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        padSound3.setBackground(new java.awt.Color(30, 215, 96));
        padSound3.setRoundBottomLeft(30);
        padSound3.setRoundBottomRight(30);
        padSound3.setRoundTopLeft(30);
        padSound3.setRoundTopRight(30);

        labelPadSound3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout padSound3Layout = new javax.swing.GroupLayout(padSound3);
        padSound3.setLayout(padSound3Layout);
        padSound3Layout.setHorizontalGroup(
            padSound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPadSound3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        padSound3Layout.setVerticalGroup(
            padSound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPadSound3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        padSound4.setBackground(new java.awt.Color(119, 55, 149));
        padSound4.setRoundBottomLeft(30);
        padSound4.setRoundBottomRight(30);
        padSound4.setRoundTopLeft(30);
        padSound4.setRoundTopRight(30);

        labelPadSound4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout padSound4Layout = new javax.swing.GroupLayout(padSound4);
        padSound4.setLayout(padSound4Layout);
        padSound4Layout.setHorizontalGroup(
            padSound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPadSound4, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        padSound4Layout.setVerticalGroup(
            padSound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPadSound4, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        padSound11.setBackground(new java.awt.Color(235, 30, 50));
        padSound11.setRoundBottomLeft(30);
        padSound11.setRoundBottomRight(30);
        padSound11.setRoundTopLeft(30);
        padSound11.setRoundTopRight(30);

        labelPadSound5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout padSound11Layout = new javax.swing.GroupLayout(padSound11);
        padSound11.setLayout(padSound11Layout);
        padSound11Layout.setHorizontalGroup(
            padSound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPadSound5, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        padSound11Layout.setVerticalGroup(
            padSound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPadSound5, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        padSound14.setBackground(new java.awt.Color(30, 215, 96));
        padSound14.setRoundBottomLeft(30);
        padSound14.setRoundBottomRight(30);
        padSound14.setRoundTopLeft(30);
        padSound14.setRoundTopRight(30);

        labelPadSound6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout padSound14Layout = new javax.swing.GroupLayout(padSound14);
        padSound14.setLayout(padSound14Layout);
        padSound14Layout.setHorizontalGroup(
            padSound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPadSound6, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        padSound14Layout.setVerticalGroup(
            padSound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPadSound6, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        label_NumeroDelPAD_1.setBackground(new java.awt.Color(210, 210, 210));
        label_NumeroDelPAD_1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        label_NumeroDelPAD_1.setForeground(new java.awt.Color(66, 66, 66));
        label_NumeroDelPAD_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NumeroDelPAD_1.setText("PAD 1");

        label_NumeroDelPAD_2.setBackground(new java.awt.Color(210, 210, 210));
        label_NumeroDelPAD_2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        label_NumeroDelPAD_2.setForeground(new java.awt.Color(66, 66, 66));
        label_NumeroDelPAD_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NumeroDelPAD_2.setText("PAD 2");

        label_NumeroDelPAD_3.setBackground(new java.awt.Color(210, 210, 210));
        label_NumeroDelPAD_3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        label_NumeroDelPAD_3.setForeground(new java.awt.Color(66, 66, 66));
        label_NumeroDelPAD_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NumeroDelPAD_3.setText("PAD 3");

        label_NumeroDelPAD_4.setBackground(new java.awt.Color(210, 210, 210));
        label_NumeroDelPAD_4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        label_NumeroDelPAD_4.setForeground(new java.awt.Color(66, 66, 66));
        label_NumeroDelPAD_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NumeroDelPAD_4.setText("PAD 4");

        label_NumeroDelPAD_5.setBackground(new java.awt.Color(210, 210, 210));
        label_NumeroDelPAD_5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        label_NumeroDelPAD_5.setForeground(new java.awt.Color(66, 66, 66));
        label_NumeroDelPAD_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NumeroDelPAD_5.setText("PAD 5");

        label_NumeroDelPAD_6.setBackground(new java.awt.Color(210, 210, 210));
        label_NumeroDelPAD_6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        label_NumeroDelPAD_6.setForeground(new java.awt.Color(66, 66, 66));
        label_NumeroDelPAD_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NumeroDelPAD_6.setText("PAD 6");

        javax.swing.GroupLayout panelPrincipal_DosLayout = new javax.swing.GroupLayout(panelPrincipal_Dos);
        panelPrincipal_Dos.setLayout(panelPrincipal_DosLayout);
        panelPrincipal_DosLayout.setHorizontalGroup(
            panelPrincipal_DosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeaderPads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipal_DosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipal_DosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(panelPrincipal_DosLayout.createSequentialGroup()
                        .addComponent(labelPerfil_Seleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipal_DosLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelPrincipal_DosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipal_DosLayout.createSequentialGroup()
                        .addComponent(padSound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(padSound11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(padSound14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipal_DosLayout.createSequentialGroup()
                        .addComponent(padSound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(padSound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(padSound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(panelPrincipal_DosLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(label_NumeroDelPAD_1)
                .addGap(88, 88, 88)
                .addComponent(label_NumeroDelPAD_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_NumeroDelPAD_3)
                .addGap(63, 63, 63))
            .addGroup(panelPrincipal_DosLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(label_NumeroDelPAD_4)
                .addGap(87, 87, 87)
                .addComponent(label_NumeroDelPAD_5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_NumeroDelPAD_6)
                .addGap(66, 66, 66))
        );
        panelPrincipal_DosLayout.setVerticalGroup(
            panelPrincipal_DosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipal_DosLayout.createSequentialGroup()
                .addComponent(panelHeaderPads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelPrincipal_DosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(padSound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(padSound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(padSound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipal_DosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_NumeroDelPAD_1)
                    .addComponent(label_NumeroDelPAD_2)
                    .addComponent(label_NumeroDelPAD_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(panelPrincipal_DosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(padSound4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(padSound11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(padSound14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipal_DosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_NumeroDelPAD_5)
                    .addComponent(label_NumeroDelPAD_6)
                    .addComponent(label_NumeroDelPAD_4))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPerfil_Seleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bg.add(panelPrincipal_Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 417, 412));

        panelRelleno.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelRellenoLayout = new javax.swing.GroupLayout(panelRelleno);
        panelRelleno.setLayout(panelRellenoLayout);
        panelRellenoLayout.setHorizontalGroup(
            panelRellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        panelRellenoLayout.setVerticalGroup(
            panelRellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(panelRelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 660, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*
    
    Cambiar de ventana: Ajustar Pads
    
    */
    private void labelAjustesIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAjustesIconMouseClicked
       cambiarVentana(new AjustesPadsSampler());
    }//GEN-LAST:event_labelAjustesIconMouseClicked

    
    /*
    
    Evento Reproducir Sonido Asignado
    
    */
    private void labelPadSound1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPadSound1MouseClicked
        
    }//GEN-LAST:event_labelPadSound1MouseClicked

    public void cambiarVentana(JFrame nuevaVentana) {
        nuevaVentana.setVisible(true);
        nuevaVentana.setLocationRelativeTo(null);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalSampler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalSampler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalSampler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalSampler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalSampler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private interfaceSampler.PanelRound botonGuardar;
    private interfaceSampler.PanelRound botonReestablecer;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelAjustesIcon;
    private javax.swing.JLabel labelPadSound1;
    private javax.swing.JLabel labelPadSound2;
    private javax.swing.JLabel labelPadSound3;
    private javax.swing.JLabel labelPadSound4;
    private javax.swing.JLabel labelPadSound5;
    private javax.swing.JLabel labelPadSound6;
    private javax.swing.JLabel labelPerfil_Seleccionado;
    private javax.swing.JLabel labelTitulo_PADS;
    private javax.swing.JLabel label_Guardar;
    private javax.swing.JLabel label_ImageLibrary;
    private javax.swing.JLabel label_NumeroDelPAD_1;
    private javax.swing.JLabel label_NumeroDelPAD_2;
    private javax.swing.JLabel label_NumeroDelPAD_3;
    private javax.swing.JLabel label_NumeroDelPAD_4;
    private javax.swing.JLabel label_NumeroDelPAD_5;
    private javax.swing.JLabel label_NumeroDelPAD_6;
    private javax.swing.JLabel label_PerfilSeleccionado;
    private javax.swing.JLabel label_Reestablecer;
    private javax.swing.JLabel label_TextoGuardar;
    private javax.swing.JLabel label_TextoReestablecer;
    private javax.swing.JLabel label_TituloGuardar;
    private javax.swing.JLabel label_TituloReestablecer;
    private interfaceSampler.PanelRound padSound1;
    private interfaceSampler.PanelRound padSound11;
    private interfaceSampler.PanelRound padSound14;
    private interfaceSampler.PanelRound padSound2;
    private interfaceSampler.PanelRound padSound3;
    private interfaceSampler.PanelRound padSound4;
    private interfaceSampler.PanelRound panelGuardar;
    private interfaceSampler.PanelRound panelHeaderPads;
    private interfaceSampler.PanelRound panelPerfil;
    private interfaceSampler.PanelRound panelPrincipal_Dos;
    private interfaceSampler.PanelRound panelPrincipal_Uno;
    private interfaceSampler.PanelRound panelReestablecer;
    private javax.swing.JPanel panelRelleno;
    private interfaceSampler.PanelRound panelTextoGuardar;
    private interfaceSampler.PanelRound panelTextoReestablecer;
    // End of variables declaration//GEN-END:variables
}
