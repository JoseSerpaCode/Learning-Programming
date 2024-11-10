package interfaceSampler;

import java.io.File;
import javax.swing.ImageIcon;

/**
 * @author José_Serpa
 */
public class AjustesPadsSampler extends javax.swing.JFrame {

    
    public AjustesPadsSampler() {
        initComponents();

        ImageIcon icon = new ImageIcon(getClass().getResource("/img/beatLogoRedimensionado.png"));
        setIconImage(icon.getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelHeaderPads = new interfaceSampler.PanelRound();
        labelTitulo_PADS = new javax.swing.JLabel();
        label_NumeroDelPAD_1 = new javax.swing.JLabel();
        label_NumeroDelPAD_2 = new javax.swing.JLabel();
        label_NumeroDelPAD_3 = new javax.swing.JLabel();
        botonSelecccionarSonido_Pad1 = new interfaceSampler.PanelRound();
        label_SeleccionarSonido1 = new javax.swing.JLabel();
        botonSelecccionarSonido_Pad2 = new interfaceSampler.PanelRound();
        label_SeleccionarSonido2 = new javax.swing.JLabel();
        botonSelecccionarSonido_Pad3 = new interfaceSampler.PanelRound();
        label_SeleccionarSonido3 = new javax.swing.JLabel();
        label_NumeroDelPAD_4 = new javax.swing.JLabel();
        label_NumeroDelPAD_5 = new javax.swing.JLabel();
        label_NumeroDelPAD_6 = new javax.swing.JLabel();
        botonSelecccionarSonido_Pad4 = new interfaceSampler.PanelRound();
        label_SeleccionarSonido4 = new javax.swing.JLabel();
        botonSelecccionarSonido_Pad5 = new interfaceSampler.PanelRound();
        label_SeleccionarSonido5 = new javax.swing.JLabel();
        botonSelecccionarSonido_Pad6 = new interfaceSampler.PanelRound();
        label_SeleccionarSonido6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PadLAND");
        setBackground(new java.awt.Color(0, 0, 0));
        setName("bg"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 18, 18));

        panelHeaderPads.setBackground(new java.awt.Color(20, 20, 20));
        panelHeaderPads.setRoundBottomLeft(10);
        panelHeaderPads.setRoundBottomRight(10);
        panelHeaderPads.setRoundTopLeft(10);
        panelHeaderPads.setRoundTopRight(10);

        labelTitulo_PADS.setBackground(new java.awt.Color(210, 210, 210));
        labelTitulo_PADS.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        labelTitulo_PADS.setForeground(new java.awt.Color(230, 230, 230));
        labelTitulo_PADS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTitulo_PADS.setText("Configuración de Pads");

        javax.swing.GroupLayout panelHeaderPadsLayout = new javax.swing.GroupLayout(panelHeaderPads);
        panelHeaderPads.setLayout(panelHeaderPadsLayout);
        panelHeaderPadsLayout.setHorizontalGroup(
            panelHeaderPadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderPadsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelTitulo_PADS, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHeaderPadsLayout.setVerticalGroup(
            panelHeaderPadsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderPadsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo_PADS, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label_NumeroDelPAD_1.setBackground(new java.awt.Color(210, 210, 210));
        label_NumeroDelPAD_1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        label_NumeroDelPAD_1.setForeground(new java.awt.Color(230, 230, 230));
        label_NumeroDelPAD_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NumeroDelPAD_1.setText("PAD 1");

        label_NumeroDelPAD_2.setBackground(new java.awt.Color(210, 210, 210));
        label_NumeroDelPAD_2.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        label_NumeroDelPAD_2.setForeground(new java.awt.Color(230, 230, 230));
        label_NumeroDelPAD_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NumeroDelPAD_2.setText("PAD 2");

        label_NumeroDelPAD_3.setBackground(new java.awt.Color(210, 210, 210));
        label_NumeroDelPAD_3.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        label_NumeroDelPAD_3.setForeground(new java.awt.Color(230, 230, 230));
        label_NumeroDelPAD_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NumeroDelPAD_3.setText("PAD 3");

        botonSelecccionarSonido_Pad1.setBackground(new java.awt.Color(119, 55, 149));
        botonSelecccionarSonido_Pad1.setRoundBottomLeft(25);
        botonSelecccionarSonido_Pad1.setRoundBottomRight(25);
        botonSelecccionarSonido_Pad1.setRoundTopLeft(25);
        botonSelecccionarSonido_Pad1.setRoundTopRight(25);

        label_SeleccionarSonido1.setBackground(new java.awt.Color(210, 210, 210));
        label_SeleccionarSonido1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        label_SeleccionarSonido1.setForeground(new java.awt.Color(255, 255, 255));
        label_SeleccionarSonido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_SeleccionarSonido1.setText("Seleccionar Sonido");
        label_SeleccionarSonido1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_SeleccionarSonido1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_SeleccionarSonido1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout botonSelecccionarSonido_Pad1Layout = new javax.swing.GroupLayout(botonSelecccionarSonido_Pad1);
        botonSelecccionarSonido_Pad1.setLayout(botonSelecccionarSonido_Pad1Layout);
        botonSelecccionarSonido_Pad1Layout.setHorizontalGroup(
            botonSelecccionarSonido_Pad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_SeleccionarSonido1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        botonSelecccionarSonido_Pad1Layout.setVerticalGroup(
            botonSelecccionarSonido_Pad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_SeleccionarSonido1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        botonSelecccionarSonido_Pad2.setBackground(new java.awt.Color(235, 30, 50));
        botonSelecccionarSonido_Pad2.setRoundBottomLeft(25);
        botonSelecccionarSonido_Pad2.setRoundBottomRight(25);
        botonSelecccionarSonido_Pad2.setRoundTopLeft(25);
        botonSelecccionarSonido_Pad2.setRoundTopRight(25);

        label_SeleccionarSonido2.setBackground(new java.awt.Color(210, 210, 210));
        label_SeleccionarSonido2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        label_SeleccionarSonido2.setForeground(new java.awt.Color(255, 255, 255));
        label_SeleccionarSonido2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_SeleccionarSonido2.setText("Seleccionar Sonido");
        label_SeleccionarSonido2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout botonSelecccionarSonido_Pad2Layout = new javax.swing.GroupLayout(botonSelecccionarSonido_Pad2);
        botonSelecccionarSonido_Pad2.setLayout(botonSelecccionarSonido_Pad2Layout);
        botonSelecccionarSonido_Pad2Layout.setHorizontalGroup(
            botonSelecccionarSonido_Pad2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_SeleccionarSonido2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        botonSelecccionarSonido_Pad2Layout.setVerticalGroup(
            botonSelecccionarSonido_Pad2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_SeleccionarSonido2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        botonSelecccionarSonido_Pad3.setBackground(new java.awt.Color(30, 215, 96));
        botonSelecccionarSonido_Pad3.setRoundBottomLeft(25);
        botonSelecccionarSonido_Pad3.setRoundBottomRight(25);
        botonSelecccionarSonido_Pad3.setRoundTopLeft(25);
        botonSelecccionarSonido_Pad3.setRoundTopRight(25);

        label_SeleccionarSonido3.setBackground(new java.awt.Color(210, 210, 210));
        label_SeleccionarSonido3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        label_SeleccionarSonido3.setForeground(new java.awt.Color(255, 255, 255));
        label_SeleccionarSonido3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_SeleccionarSonido3.setText("Seleccionar Sonido");
        label_SeleccionarSonido3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout botonSelecccionarSonido_Pad3Layout = new javax.swing.GroupLayout(botonSelecccionarSonido_Pad3);
        botonSelecccionarSonido_Pad3.setLayout(botonSelecccionarSonido_Pad3Layout);
        botonSelecccionarSonido_Pad3Layout.setHorizontalGroup(
            botonSelecccionarSonido_Pad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_SeleccionarSonido3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        botonSelecccionarSonido_Pad3Layout.setVerticalGroup(
            botonSelecccionarSonido_Pad3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_SeleccionarSonido3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        label_NumeroDelPAD_4.setBackground(new java.awt.Color(210, 210, 210));
        label_NumeroDelPAD_4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        label_NumeroDelPAD_4.setForeground(new java.awt.Color(230, 230, 230));
        label_NumeroDelPAD_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NumeroDelPAD_4.setText("PAD 4");

        label_NumeroDelPAD_5.setBackground(new java.awt.Color(210, 210, 210));
        label_NumeroDelPAD_5.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        label_NumeroDelPAD_5.setForeground(new java.awt.Color(230, 230, 230));
        label_NumeroDelPAD_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NumeroDelPAD_5.setText("PAD 5");

        label_NumeroDelPAD_6.setBackground(new java.awt.Color(210, 210, 210));
        label_NumeroDelPAD_6.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        label_NumeroDelPAD_6.setForeground(new java.awt.Color(230, 230, 230));
        label_NumeroDelPAD_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_NumeroDelPAD_6.setText("PAD 6");

        botonSelecccionarSonido_Pad4.setBackground(new java.awt.Color(119, 55, 149));
        botonSelecccionarSonido_Pad4.setRoundBottomLeft(25);
        botonSelecccionarSonido_Pad4.setRoundBottomRight(25);
        botonSelecccionarSonido_Pad4.setRoundTopLeft(25);
        botonSelecccionarSonido_Pad4.setRoundTopRight(25);

        label_SeleccionarSonido4.setBackground(new java.awt.Color(210, 210, 210));
        label_SeleccionarSonido4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        label_SeleccionarSonido4.setForeground(new java.awt.Color(255, 255, 255));
        label_SeleccionarSonido4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_SeleccionarSonido4.setText("Seleccionar Sonido");
        label_SeleccionarSonido4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout botonSelecccionarSonido_Pad4Layout = new javax.swing.GroupLayout(botonSelecccionarSonido_Pad4);
        botonSelecccionarSonido_Pad4.setLayout(botonSelecccionarSonido_Pad4Layout);
        botonSelecccionarSonido_Pad4Layout.setHorizontalGroup(
            botonSelecccionarSonido_Pad4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_SeleccionarSonido4, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        botonSelecccionarSonido_Pad4Layout.setVerticalGroup(
            botonSelecccionarSonido_Pad4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_SeleccionarSonido4, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        botonSelecccionarSonido_Pad5.setBackground(new java.awt.Color(235, 30, 50));
        botonSelecccionarSonido_Pad5.setRoundBottomLeft(25);
        botonSelecccionarSonido_Pad5.setRoundBottomRight(25);
        botonSelecccionarSonido_Pad5.setRoundTopLeft(25);
        botonSelecccionarSonido_Pad5.setRoundTopRight(25);

        label_SeleccionarSonido5.setBackground(new java.awt.Color(210, 210, 210));
        label_SeleccionarSonido5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        label_SeleccionarSonido5.setForeground(new java.awt.Color(255, 255, 255));
        label_SeleccionarSonido5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_SeleccionarSonido5.setText("Seleccionar Sonido");
        label_SeleccionarSonido5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout botonSelecccionarSonido_Pad5Layout = new javax.swing.GroupLayout(botonSelecccionarSonido_Pad5);
        botonSelecccionarSonido_Pad5.setLayout(botonSelecccionarSonido_Pad5Layout);
        botonSelecccionarSonido_Pad5Layout.setHorizontalGroup(
            botonSelecccionarSonido_Pad5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_SeleccionarSonido5, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        botonSelecccionarSonido_Pad5Layout.setVerticalGroup(
            botonSelecccionarSonido_Pad5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_SeleccionarSonido5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        botonSelecccionarSonido_Pad6.setBackground(new java.awt.Color(30, 215, 96));
        botonSelecccionarSonido_Pad6.setRoundBottomLeft(25);
        botonSelecccionarSonido_Pad6.setRoundBottomRight(25);
        botonSelecccionarSonido_Pad6.setRoundTopLeft(25);
        botonSelecccionarSonido_Pad6.setRoundTopRight(25);

        label_SeleccionarSonido6.setBackground(new java.awt.Color(210, 210, 210));
        label_SeleccionarSonido6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        label_SeleccionarSonido6.setForeground(new java.awt.Color(255, 255, 255));
        label_SeleccionarSonido6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_SeleccionarSonido6.setText("Seleccionar Sonido");
        label_SeleccionarSonido6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout botonSelecccionarSonido_Pad6Layout = new javax.swing.GroupLayout(botonSelecccionarSonido_Pad6);
        botonSelecccionarSonido_Pad6.setLayout(botonSelecccionarSonido_Pad6Layout);
        botonSelecccionarSonido_Pad6Layout.setHorizontalGroup(
            botonSelecccionarSonido_Pad6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_SeleccionarSonido6, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        botonSelecccionarSonido_Pad6Layout.setVerticalGroup(
            botonSelecccionarSonido_Pad6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_SeleccionarSonido6, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeaderPads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_NumeroDelPAD_1)
                    .addComponent(label_NumeroDelPAD_4)
                    .addComponent(botonSelecccionarSonido_Pad4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_NumeroDelPAD_5)
                    .addComponent(label_NumeroDelPAD_2)
                    .addComponent(botonSelecccionarSonido_Pad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSelecccionarSonido_Pad5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonSelecccionarSonido_Pad6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSelecccionarSonido_Pad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_NumeroDelPAD_3)
                    .addComponent(label_NumeroDelPAD_6))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(botonSelecccionarSonido_Pad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(369, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelHeaderPads, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_NumeroDelPAD_2)
                    .addComponent(label_NumeroDelPAD_3)
                    .addComponent(label_NumeroDelPAD_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonSelecccionarSonido_Pad3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonSelecccionarSonido_Pad2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_NumeroDelPAD_4)
                    .addComponent(label_NumeroDelPAD_5)
                    .addComponent(label_NumeroDelPAD_6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonSelecccionarSonido_Pad4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSelecccionarSonido_Pad5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botonSelecccionarSonido_Pad6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 127, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(botonSelecccionarSonido_Pad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(272, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_SeleccionarSonido1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_SeleccionarSonido1MouseClicked
        
    }//GEN-LAST:event_label_SeleccionarSonido1MouseClicked

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
            java.util.logging.Logger.getLogger(AjustesPadsSampler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjustesPadsSampler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjustesPadsSampler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjustesPadsSampler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjustesPadsSampler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private interfaceSampler.PanelRound botonSelecccionarSonido_Pad1;
    private interfaceSampler.PanelRound botonSelecccionarSonido_Pad2;
    private interfaceSampler.PanelRound botonSelecccionarSonido_Pad3;
    private interfaceSampler.PanelRound botonSelecccionarSonido_Pad4;
    private interfaceSampler.PanelRound botonSelecccionarSonido_Pad5;
    private interfaceSampler.PanelRound botonSelecccionarSonido_Pad6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo_PADS;
    private javax.swing.JLabel label_NumeroDelPAD_1;
    private javax.swing.JLabel label_NumeroDelPAD_2;
    private javax.swing.JLabel label_NumeroDelPAD_3;
    private javax.swing.JLabel label_NumeroDelPAD_4;
    private javax.swing.JLabel label_NumeroDelPAD_5;
    private javax.swing.JLabel label_NumeroDelPAD_6;
    private javax.swing.JLabel label_SeleccionarSonido1;
    private javax.swing.JLabel label_SeleccionarSonido2;
    private javax.swing.JLabel label_SeleccionarSonido3;
    private javax.swing.JLabel label_SeleccionarSonido4;
    private javax.swing.JLabel label_SeleccionarSonido5;
    private javax.swing.JLabel label_SeleccionarSonido6;
    private interfaceSampler.PanelRound panelHeaderPads;
    // End of variables declaration//GEN-END:variables
}
