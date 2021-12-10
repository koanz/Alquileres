package Visual;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author koshiro
 */
public class vtnBotonCoeficienteDorm extends javax.swing.JFrame {
    private final long idEdificio;
    private final ControladoraV unaControladora = new ControladoraV();
    
    public vtnBotonCoeficienteDorm(long idEdificio) {
        initComponents();
        this.setLocationRelativeTo(null);   // Centra el JFrame
        this.idEdificio = idEdificio;
        cargarTablaCoeficienteDorm(idEdificio);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Cierra este JFrame
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTituloCoeficienteDorm = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCoeficienteDorm = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanelButtonCerrar = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTituloCoeficienteDorm.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelTituloCoeficienteDorm.setText("COEFICIENTES DORMITORIO");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jTableCoeficienteDorm.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTableCoeficienteDorm = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        jTableCoeficienteDorm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCoeficienteDorm.setGridColor(new java.awt.Color(255, 255, 255));
        jTableCoeficienteDorm.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableCoeficienteDorm);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanelButtonCerrar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonCerrar.setPreferredSize(new java.awt.Dimension(100, 49));
        jPanelButtonCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelButtonCerrarMouseMoved(evt);
            }
        });
        jPanelButtonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonCerrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonCerrarMouseExited(evt);
            }
        });

        jLabelCerrar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCerrar.setText("Cerrar");

        javax.swing.GroupLayout jPanelButtonCerrarLayout = new javax.swing.GroupLayout(jPanelButtonCerrar);
        jPanelButtonCerrar.setLayout(jPanelButtonCerrarLayout);
        jPanelButtonCerrarLayout.setHorizontalGroup(
            jPanelButtonCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonCerrarLayout.setVerticalGroup(
            jPanelButtonCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanelButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloCoeficienteDorm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloCoeficienteDorm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelButtonCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseMoved
        this.jPanelButtonCerrar.setBackground(new Color(255,255,255));
        this.jPanelButtonCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelCerrar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonCerrarMouseMoved

    private void jPanelButtonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanelButtonCerrarMouseClicked

    private void jPanelButtonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseExited
        this.jPanelButtonCerrar.setBackground(new Color(51,51,51));
        this.jLabelCerrar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonCerrarMouseExited

    public void cargarTablaCoeficienteDorm(long idEdificio){
        Logica.Edificio unEdificio = unaControladora.obtenerEdificio(idEdificio);
        String[] datos = new String[4];
        String colTablaCoeficienteDorm[] = {"Id", "Nombre", "Valor", "Edificio"};
        DefaultTableModel tablaCoeficienteDorm = new DefaultTableModel(null, colTablaCoeficienteDorm);
        
        for(Logica.CoeficienteDorm unCoeficienteDorm : unEdificio.getCoeficientesDorm()){
            datos[0] = String.valueOf(unCoeficienteDorm.getId());
            datos[1] = unCoeficienteDorm.getNombre();
            datos[2] = String.valueOf(unCoeficienteDorm.getValor());
            datos[3] = unEdificio.getNombre();
            
            tablaCoeficienteDorm.addRow(datos);
        }
        
        this.jTableCoeficienteDorm.setModel(tablaCoeficienteDorm);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelTituloCoeficienteDorm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelButtonCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCoeficienteDorm;
    // End of variables declaration//GEN-END:variables
}
