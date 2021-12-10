package Visual;

import java.awt.Color;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class vtnEdificio extends javax.swing.JFrame {
    private final ControladoraV unaControladora = new ControladoraV();
    private final JFrame inicio;
    
    public vtnEdificio(JFrame inicio) {
        initComponents();
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.inicio = inicio;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Cierra este JFrame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelAgregar = new javax.swing.JPanel();
        jLabelAgregar = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanelButtonCancelar = new javax.swing.JPanel();
        jLabelCancelar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel1.setText("Edificio");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Dirección");

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldNombre.setBorder(null);
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jTextFieldDireccion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldDireccion.setBorder(null);
        jTextFieldDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDireccionKeyTyped(evt);
            }
        });

        jPanelAgregar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelAgregar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelAgregarMouseMoved(evt);
            }
        });
        jPanelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAgregarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelAgregarMouseExited(evt);
            }
        });

        jLabelAgregar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabelAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAgregar.setText("Agregar");

        javax.swing.GroupLayout jPanelAgregarLayout = new javax.swing.GroupLayout(jPanelAgregar);
        jPanelAgregar.setLayout(jPanelAgregarLayout);
        jPanelAgregarLayout.setHorizontalGroup(
            jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAgregarLayout.setVerticalGroup(
            jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jPanelButtonCancelar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonCancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelButtonCancelarMouseMoved(evt);
            }
        });
        jPanelButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonCancelarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonCancelarMouseExited(evt);
            }
        });

        jLabelCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabelCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanelButtonCancelarLayout = new javax.swing.GroupLayout(jPanelButtonCancelar);
        jPanelButtonCancelar.setLayout(jPanelButtonCancelarLayout);
        jPanelButtonCancelarLayout.setHorizontalGroup(
            jPanelButtonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonCancelarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonCancelarLayout.setVerticalGroup(
            jPanelButtonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Descripción");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextAreaDescripcion.setRows(3);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3)
                                    .addComponent(jTextFieldDireccion)
                                    .addComponent(jTextFieldNombre)
                                    .addComponent(jSeparator2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))))))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanelButtonCancelarMouseClicked

    private void jPanelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAgregarMouseClicked
        if(validar()){
            long idEdificio = 0;
            String nombreEdificio = "";
            String nombre = jTextFieldNombre.getText().toUpperCase(), direccion = jTextFieldDireccion.getText().toUpperCase(), descripcion = jTextAreaDescripcion.getText().toUpperCase();
            try {
                unaControladora.altaEdificio(nombre, direccion, descripcion, null, null, null, null);
                List<Logica.Edificio> edificios = unaControladora.obtenerEdificios();
                int i = 0;
                if(edificios.size() > 0){
                    int tam = edificios.size();
                    while(i < tam){
                        if(edificios.get(i).getNombre().equals(nombre) && edificios.get(i).getDireccion().equals(direccion)){
                            idEdificio = edificios.get(i).getId();
                            nombreEdificio = edificios.get(i).getNombre();
                            i = tam;
                        }else{
                            i++;
                        }
                    }
                    mainFrame vtnPrincipal = new mainFrame(idEdificio, nombreEdificio);
                    vtnPrincipal.setVisible(true);
                    this.dispose();
                    this.inicio.dispose();
                }
            } catch (Exception ex) {
                Logger.getLogger(vtnEdificio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jPanelAgregarMouseClicked

    private void jPanelButtonCancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCancelarMouseMoved
        this.jPanelButtonCancelar.setBackground(new Color(255,255,255));
        this.jPanelButtonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelCancelar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonCancelarMouseMoved

    private void jPanelAgregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAgregarMouseMoved
        this.jPanelAgregar.setBackground(new Color(255,255,255));
        this.jPanelAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelAgregar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelAgregarMouseMoved

    private void jPanelButtonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCancelarMouseExited
        this.jPanelButtonCancelar.setBackground(new Color(51,51,51));
        this.jLabelCancelar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonCancelarMouseExited

    private void jPanelAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAgregarMouseExited
        this.jPanelAgregar.setBackground(new Color(51,51,51));
        this.jLabelAgregar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelAgregarMouseExited

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDireccionKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jTextFieldDireccionKeyTyped

    public boolean validar(){
        boolean respuesta = false;
        String nombre = jTextFieldNombre.getText().toUpperCase(), direccion = jTextFieldDireccion.getText().toUpperCase();
        
        if(!nombre.isEmpty() && !direccion.isEmpty()){
            if(!unaControladora.existeEdificio(nombre)){
                respuesta = true;
            }else{
                JOptionPane.showMessageDialog(null, "El edificio: "+nombre+" ya se encuentra registrado.");
            }
        }else if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar el campo Nombre.");
        }else if(direccion.isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar el campo Dirección.");
        }
        
        return respuesta;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAgregar;
    private javax.swing.JLabel jLabelCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAgregar;
    private javax.swing.JPanel jPanelButtonCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
