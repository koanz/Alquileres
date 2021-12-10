package Visual;

import java.awt.Color;
import java.util.List;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public final class vtnBotonCochera extends javax.swing.JFrame {
    private final long idEdificio;
    private final ControladoraV unaControladora = new ControladoraV();
    
    public vtnBotonCochera(long idEdificio) {
        initComponents();
        this.setLocationRelativeTo(null);   // Centra el JFrame
        this.idEdificio = idEdificio;
        cargarTablaCochera(idEdificio);
        info();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Cierra este JFrame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTituloCochera = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCochera = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanelButtonCerrar = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCantCocheras = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCocherasOcupadas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCocherasDesocupadas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTituloCochera.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelTituloCochera.setText("COCHERAS");
        jLabelTituloCochera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jTableCochera.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTableCochera = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        jTableCochera.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCochera.setGridColor(new java.awt.Color(255, 255, 255));
        jTableCochera.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableCochera);

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
            .addGroup(jPanelButtonCerrarLayout.createSequentialGroup()
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
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jPanelButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("Cantidad de cocheras");

        jTextFieldCantCocheras.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Cocheras ocupadas");

        jTextFieldCocherasOcupadas.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Cocheras desocupadas");

        jTextFieldCocherasDesocupadas.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(jTextFieldCocherasOcupadas))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCantCocheras, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCocherasDesocupadas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldCantCocheras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldCocherasDesocupadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCocherasOcupadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloCochera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloCochera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelButtonCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseMoved
        this.jPanelButtonCerrar.setBackground(new Color(255,255,255));
        this.jPanelButtonCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelCerrar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonCerrarMouseMoved

    private void jPanelButtonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseExited
        this.jPanelButtonCerrar.setBackground(new Color(51,51,51));
        this.jLabelCerrar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonCerrarMouseExited

    private void jPanelButtonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanelButtonCerrarMouseClicked

    public void cargarTablaCochera(long idEdificio){
        List<Logica.Cochera> cocheras = unaControladora.obtenerEdificio(idEdificio).getCocheras();
        String[] datos = new String[5];
        String colTablaCochera[] = {"Id", "Ubicación", "Precio", "Inquilino", "Edificio"};
        String nombreEdi = unaControladora.obtenerEdificio(idEdificio).getNombre();
        int i = 0, tamanio = cocheras.size();
        Object[][] filas = new Object[tamanio][5];
        
        for(Logica.Cochera unaCochera : cocheras){
            filas[i][0] = unaCochera.getId();
            filas[i][1] = unaCochera.getUbicacion();
            filas[i][2] = unaCochera.getPrecio();
            if(unaCochera.getUnInquilino() == null){
                filas[i][3] = "--";
            }else{
                filas[i][3] = unaCochera.getUnInquilino().getApellido()+", "+unaCochera.getUnInquilino().getNombre();
            } 
            filas[i][4] = nombreEdi;
            i++;
        }
        
        TableModel modelo = new DefaultTableModel(filas,colTablaCochera);
        
        RowSorter<TableModel> sorter = new TableRowSorter<>(modelo);
        jTableCochera.setRowSorter(sorter);
        jTableCochera.setModel(modelo);
    }
    
    public void info(){
        Logica.Edificio unEdi = unaControladora.obtenerEdificio(idEdificio);
        int cantCocheras = unEdi.getCocheras().size(),
            cocherasOcupadas = unaControladora.obtenerCocherasOcupadas(idEdificio),
            cocherasDesocupadas = cantCocheras - cocherasOcupadas;
        
        if(cantCocheras == 0){
            this.jTextFieldCantCocheras.setText("0");
        }else{
            this.jTextFieldCantCocheras.setText(String.valueOf(cantCocheras));
        }
        
        if(cocherasOcupadas == 0){
            this.jTextFieldCocherasOcupadas.setText("0");
        }else{
            this.jTextFieldCocherasOcupadas.setText(String.valueOf(cocherasOcupadas));
        }
        
        if(cocherasDesocupadas == 0){
            this.jTextFieldCocherasDesocupadas.setText("0");
        }else{
            this.jTextFieldCocherasDesocupadas.setText(String.valueOf(cocherasDesocupadas));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelTituloCochera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelButtonCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCochera;
    private javax.swing.JTextField jTextFieldCantCocheras;
    private javax.swing.JTextField jTextFieldCocherasDesocupadas;
    private javax.swing.JTextField jTextFieldCocherasOcupadas;
    // End of variables declaration//GEN-END:variables
}
