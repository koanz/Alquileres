package Visual;

import java.awt.Color;

public class VentanaMensaje extends javax.swing.JFrame {
    private final String mensaje;
    
    public VentanaMensaje(String mensaje) {
        initComponents();
        this.mensaje = mensaje;
        this.jTextArea1.setText(mensaje);
        this.setSize(400, 200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMensaje = new javax.swing.JPanel();
        jPanelButtonAceptar = new javax.swing.JPanel();
        jLabelAceptar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMensaje.setBackground(new java.awt.Color(255, 255, 255));

        jPanelButtonAceptar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelButtonAceptar.setPreferredSize(new java.awt.Dimension(100, 49));
        jPanelButtonAceptar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelButtonAceptarMouseMoved(evt);
            }
        });
        jPanelButtonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonAceptarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonAceptarMouseExited(evt);
            }
        });

        jLabelAceptar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAceptar.setText("Aceptar");

        javax.swing.GroupLayout jPanelButtonAceptarLayout = new javax.swing.GroupLayout(jPanelButtonAceptar);
        jPanelButtonAceptar.setLayout(jPanelButtonAceptarLayout);
        jPanelButtonAceptarLayout.setHorizontalGroup(
            jPanelButtonAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonAceptarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonAceptarLayout.setVerticalGroup(
            jPanelButtonAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jTextArea1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextArea1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanelMensajeLayout = new javax.swing.GroupLayout(jPanelMensaje);
        jPanelMensaje.setLayout(jPanelMensajeLayout);
        jPanelMensajeLayout.setHorizontalGroup(
            jPanelMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMensajeLayout.createSequentialGroup()
                .addGroup(jPanelMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMensajeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMensajeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMensajeLayout.setVerticalGroup(
            jPanelMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMensajeLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelButtonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAceptarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanelButtonAceptarMouseClicked

    private void jPanelButtonAceptarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAceptarMouseMoved
        this.jPanelButtonAceptar.setBackground(new Color(255,255,255));
        this.jPanelButtonAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelAceptar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonAceptarMouseMoved

    private void jPanelButtonAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAceptarMouseExited
        this.jPanelButtonAceptar.setBackground(new Color(51,51,51));
        this.jLabelAceptar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonAceptarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JPanel jPanelButtonAceptar;
    private javax.swing.JPanel jPanelMensaje;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
