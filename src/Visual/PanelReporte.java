package Visual;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author koshiro
 */
public final class PanelReporte extends javax.swing.JFrame {
    private final long idEdificio;
    private boolean banderaSelectAll = false;
    private final ControladoraV unaControladora = new ControladoraV();
    private DefaultTableModel tablaInquilino = new DefaultTableModel();
    
    public PanelReporte(long idEdificio) {
        initComponents();
        this.idEdificio = idEdificio;
        this.setLocationRelativeTo(null);
        cargarInquilinos();
        inicializar();
        cargarObservaciones();
        this.setSize(800, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxTipoReporte = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAnio = new javax.swing.JTextField();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInquilino = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanelButtonCerrar = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();
        jPanelButtonAceptar = new javax.swing.JPanel();
        jLabelAceptar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAlquiler = new javax.swing.JTextArea();
        jLabelContadorExpensa = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaExpensa = new javax.swing.JTextArea();
        jLabelContadorAlquiler = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Reporte");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Reporte de");

        jComboBoxTipoReporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Alquiler", "Expensa", "Alquiler y Expensa" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Mes");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Año");

        jTextFieldAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnioKeyTyped(evt);
            }
        });

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jTableInquilino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Opción", "Id", "Inquilino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableInquilino.getTableHeader().setReorderingAllowed(false);
        jTableInquilino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInquilinoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInquilino);
        if (jTableInquilino.getColumnModel().getColumnCount() > 0) {
            jTableInquilino.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableInquilino.getColumnModel().getColumn(1).setMinWidth(0);
            jTableInquilino.getColumnModel().getColumn(1).setPreferredWidth(0);
            jTableInquilino.getColumnModel().getColumn(1).setMaxWidth(0);
            jTableInquilino.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanelButtonCerrar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonCerrar.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabelCerrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabelCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCerrar.setText("Cerrar");

        javax.swing.GroupLayout jPanelButtonCerrarLayout = new javax.swing.GroupLayout(jPanelButtonCerrar);
        jPanelButtonCerrar.setLayout(jPanelButtonCerrarLayout);
        jPanelButtonCerrarLayout.setHorizontalGroup(
            jPanelButtonCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonCerrarLayout.setVerticalGroup(
            jPanelButtonCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanelButtonAceptar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonAceptar.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabelAceptar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabelAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAceptar.setText("Aceptar");

        javax.swing.GroupLayout jPanelButtonAceptarLayout = new javax.swing.GroupLayout(jPanelButtonAceptar);
        jPanelButtonAceptar.setLayout(jPanelButtonAceptarLayout);
        jPanelButtonAceptarLayout.setHorizontalGroup(
            jPanelButtonAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonAceptarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonAceptarLayout.setVerticalGroup(
            jPanelButtonAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanelButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Nota alquiler");

        jTextAreaAlquiler.setColumns(20);
        jTextAreaAlquiler.setRows(5);
        jTextAreaAlquiler.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaAlquilerKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTextAreaAlquiler);

        jLabelContadorExpensa.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelContadorExpensa.setText("255");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("máx. caracteres:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Nota expensa");

        jTextAreaExpensa.setColumns(20);
        jTextAreaExpensa.setRows(5);
        jTextAreaExpensa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaExpensaKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(jTextAreaExpensa);

        jLabelContadorAlquiler.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelContadorAlquiler.setText("255");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("máx. caracteres:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBoxMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jComboBoxTipoReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelContadorAlquiler))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelContadorExpensa))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBoxTipoReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelContadorAlquiler)
                            .addComponent(jLabel10))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContadorExpensa)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

    private void jTableInquilinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInquilinoMouseClicked
        if(jTableInquilino.isRowSelected(jTableInquilino.getSelectedRow())){
            int fila = jTableInquilino.getSelectedRow(), columna = jTableInquilino.columnAtPoint(evt.getPoint());
            if(fila == 0 && columna == 0){
                if((boolean)tablaInquilino.getValueAt(0, 0) == false){
                    int cant = tablaInquilino.getRowCount();
                    for(int i = 1; i < cant; i++){
                        tablaInquilino.setValueAt(false, i, 0);
                    }
                }else{  // Else = Check All en TRUE
                    int cant = tablaInquilino.getRowCount();
                    for(int i = 1; i < cant; i++){
                        tablaInquilino.setValueAt(true, i, 0);
                    }
                    banderaSelectAll = true;
                }
            }else{
                if(banderaSelectAll){
                    if((boolean)tablaInquilino.getValueAt(fila, columna) == false){
                        tablaInquilino.setValueAt(false, 0, 0);
                        banderaSelectAll = false;
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableInquilinoMouseClicked

    private void jPanelButtonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseExited
        this.jPanelButtonCerrar.setBackground(new Color(51,51,51));
        this.jLabelCerrar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonCerrarMouseExited

    private void jPanelButtonCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseMoved
        this.jPanelButtonCerrar.setBackground(new Color(255,255,255));
        this.jPanelButtonCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelCerrar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonCerrarMouseMoved

    private void jPanelButtonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanelButtonCerrarMouseClicked

    private void jTextFieldAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnioKeyTyped
        if(Character.isLetter(evt.getKeyChar())){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldAnioKeyTyped

    private void jPanelButtonAceptarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAceptarMouseMoved
        this.jPanelButtonAceptar.setBackground(new Color(255,255,255));
        this.jPanelButtonAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelAceptar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonAceptarMouseMoved

    private void jPanelButtonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAceptarMouseClicked
        if(!jTextFieldAnio.getText().isEmpty()){
            int indexTipoReporte = jComboBoxTipoReporte.getSelectedIndex();
            int mes = jComboBoxMes.getSelectedIndex(), anio = Integer.parseInt(jTextFieldAnio.getText());
            if(indexTipoReporte > 0){
                if(mes > 0){
                    List<Logica.Inquilino> inquilinosReporte = obtenerInquilinosSeleccionados(); // Puede ser 1 Inquilino como x cantidad..
                    if(inquilinosReporte.size() > 0){
                        switch(indexTipoReporte){
                            case 1:
                                // Generar solo Alquiler para el Inquilino seleccionado en el período dado.
                                if(unaControladora.generarRepo(idEdificio, mes, anio, inquilinosReporte, jTextAreaAlquiler.getText(), null,1)){
                                    JOptionPane.showMessageDialog(null, "Se ha generado el documento exitosamente.");
                                }
                                break;
                            case 2: 
                                // Generar solo expensa para el Inquilino seleccionado en el período dado.
                                if(unaControladora.generarRepo(idEdificio, mes, anio, inquilinosReporte, null, jTextAreaExpensa.getText(),2)){
                                    JOptionPane.showMessageDialog(null, "Se ha generado el documento exitosamente.");
                                }
                                break;
                            case 3:
                                // Generar Alquiler y Expensa para el Inquilino seleccionado en el período dado.
                                if(unaControladora.generarRepo(idEdificio, mes, anio, inquilinosReporte, jTextAreaAlquiler.getText(), jTextAreaExpensa.getText(),3)){
                                    JOptionPane.showMessageDialog(null, "Se ha generado el documento exitosamente.");
                                }
                                break;

                            default:
                                unaControladora.generarRepo(idEdificio, mes, anio, inquilinosReporte, jTextAreaAlquiler.getText(), jTextAreaExpensa.getText(),3);
                                JOptionPane.showMessageDialog(null, "Se ha generado el documento exitosamente.");
                                break;
                        }
                        limpiarComponentes();
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe marcar por lo menos una casilla válida.");
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Opción invalida para el Mes seleccionado. Intentelo nuevamente.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Compruebe que la opción del Reporte sea correcta e intentelo nuevamente.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El campo 'Año' no posee un valor. Ingrese un valor e intentelo nuevamente.");
        }
    }//GEN-LAST:event_jPanelButtonAceptarMouseClicked

    private void jPanelButtonAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAceptarMouseExited
        this.jPanelButtonAceptar.setBackground(new Color(51,51,51));
        this.jLabelAceptar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonAceptarMouseExited

    private void jTextAreaExpensaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaExpensaKeyTyped
        int cantNota = jTextAreaExpensa.getText().length();
        String c = jTextAreaExpensa.getText();
        int cant = 255 - cantNota;
        jLabelContadorExpensa.setText(String.valueOf(cant));
        if(cantNota > 254){
            String nuevo = c.substring(0, c.length()-1);
            jTextAreaExpensa.setText(nuevo);
        }
    }//GEN-LAST:event_jTextAreaExpensaKeyTyped

    private void jTextAreaAlquilerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaAlquilerKeyTyped
        int cantNota = jTextAreaAlquiler.getText().length();
        String c = jTextAreaAlquiler.getText();
        int cant = 255 - cantNota;
        jLabelContadorAlquiler.setText(String.valueOf(cant));
        if(cantNota > 254){
            String nuevo = c.substring(0, c.length()-1);
            jTextAreaAlquiler.setText(nuevo);
        }    
    }//GEN-LAST:event_jTextAreaAlquilerKeyTyped
    public void cargarInquilinos(){
        tablaInquilino = (DefaultTableModel) jTableInquilino.getModel();
        limpiarTabla();
        List<Logica.Inquilino> inquilinos = unaControladora.obtenerInquilinosEdificio(idEdificio);
        
        //Collections.sort(inquilinos, (Logica.Inquilino s1, Logica.Inquilino s2) -> s1.getApellido().compareTo(s2.getApellido()));
        tablaInquilino.addRow(new Object[]{false, null,"Seleccionar todos"});
        for(Logica.Inquilino unInqui : inquilinos){
            tablaInquilino.addRow(new Object[]{false,unInqui.getId(),unInqui.getApellido()+", "+unInqui.getNombre()});
        }
    }
    
    public void inicializar(){
        Date fechaActual = new Date();
        SimpleDateFormat formatoMes = new SimpleDateFormat("MM"), formatoAnio = new SimpleDateFormat("yyyy");
        this.jComboBoxMes.setSelectedIndex(Integer.valueOf(formatoMes.format(fechaActual)));
        this.jTextFieldAnio.setText(formatoAnio.format(fechaActual));
    }
    
    public List<Logica.Inquilino> obtenerInquilinosSeleccionados(){
        List<Logica.Inquilino> inquilinosSeleccionados = new LinkedList();
        String strId;
        
        for(int i = 1; i < tablaInquilino.getRowCount(); i++){
            if((boolean)tablaInquilino.getValueAt(i, 0) == true){
                strId = String.valueOf(tablaInquilino.getValueAt(i, 1));
                inquilinosSeleccionados.add(unaControladora.obtenerInquilino(Long.parseLong(strId)));
            }
        }
        return inquilinosSeleccionados;
    }
    
    public void cargarObservaciones(){
        if(unaControladora.obtenerEdificio(idEdificio).getNotificaciones() != null){
            if(unaControladora.obtenerEdificio(idEdificio).getNotificaciones().getObsAlquiler() != null){
                int cantAlquiler = unaControladora.obtenerEdificio(idEdificio).getNotificaciones().getObsAlquiler().length();
                jTextAreaAlquiler.setText(unaControladora.obtenerEdificio(idEdificio).getNotificaciones().getObsAlquiler());
                if(cantAlquiler != 0){
                    int contAlquiler = 255-cantAlquiler;
                    jLabelContadorAlquiler.setText(String.valueOf(contAlquiler));
                }
            }
            if(unaControladora.obtenerEdificio(idEdificio).getNotificaciones().getObsExpensa() != null){
                int cantExpensa = unaControladora.obtenerEdificio(idEdificio).getNotificaciones().getObsExpensa().length();
                    jTextAreaExpensa.setText(unaControladora.obtenerEdificio(idEdificio).getNotificaciones().getObsExpensa());  
                    if(cantExpensa != 0){
                        int contExpensa = 255-cantExpensa;
                        jLabelContadorExpensa.setText(String.valueOf(contExpensa));
                    }
            }
        }else{
            jTextAreaAlquiler.setText(null);
            jTextAreaExpensa.setText(null);
        }
    }
    
    public void limpiarComponentes(){
        this.jComboBoxTipoReporte.setSelectedIndex(0);
        limpiarTabla();
        cargarInquilinos();
        inicializar();
    }
    
    public void limpiarTabla(){
        DefaultTableModel tb = (DefaultTableModel)jTableInquilino.getModel();
        while(tb.getRowCount() > 0)
        {
            tb.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JComboBox<String> jComboBoxTipoReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelContadorAlquiler;
    private javax.swing.JLabel jLabelContadorExpensa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelButtonAceptar;
    private javax.swing.JPanel jPanelButtonCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableInquilino;
    private javax.swing.JTextArea jTextAreaAlquiler;
    private javax.swing.JTextArea jTextAreaExpensa;
    private javax.swing.JTextField jTextFieldAnio;
    // End of variables declaration//GEN-END:variables
}
