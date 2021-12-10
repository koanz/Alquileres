package Visual;

import java.awt.Color;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JButton;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static java.awt.event.KeyEvent.VK_SPACE;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;

public final class PanelEdificio extends javax.swing.JPanel {
    private long id;
    private final long idEdificio;
    private boolean modificar = false;  
    private final ControladoraV unaControladora = new ControladoraV();
    
    public PanelEdificio(long idEdificio) {
        initComponents();
        this.idEdificio = idEdificio;
        cargarTablaEdificio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCargaDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanelButtonRefrescar = new javax.swing.JPanel();
        jLabelRefrescar = new javax.swing.JLabel();
        jLabelDescripción = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEdificio = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanelButtonAgregar = new javax.swing.JPanel();
        jLabelAceptar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelCargaDatos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTextFieldNombre.setBorder(null);
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Dirección");

        jTextFieldDireccion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTextFieldDireccion.setBorder(null);
        jTextFieldDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDireccionKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Edificio");

        jPanelButtonRefrescar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonRefrescar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelButtonRefrescar.setPreferredSize(new java.awt.Dimension(100, 49));
        jPanelButtonRefrescar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonRefrescarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelButtonRefrescarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonRefrescarMouseExited(evt);
            }
        });

        jLabelRefrescar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/img/cargando_blanco.png"))); // NOI18N

        javax.swing.GroupLayout jPanelButtonRefrescarLayout = new javax.swing.GroupLayout(jPanelButtonRefrescar);
        jPanelButtonRefrescar.setLayout(jPanelButtonRefrescarLayout);
        jPanelButtonRefrescarLayout.setHorizontalGroup(
            jPanelButtonRefrescarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonRefrescarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonRefrescarLayout.setVerticalGroup(
            jPanelButtonRefrescarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jLabelDescripción.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelDescripción.setText("Descripción");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextAreaDescripcion.setRows(2);
        jTextAreaDescripcion.setTabSize(4);
        jScrollPane2.setViewportView(jTextAreaDescripcion);

        javax.swing.GroupLayout jPanelCargaDatosLayout = new javax.swing.GroupLayout(jPanelCargaDatos);
        jPanelCargaDatos.setLayout(jPanelCargaDatosLayout);
        jPanelCargaDatosLayout.setHorizontalGroup(
            jPanelCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCargaDatosLayout.createSequentialGroup()
                .addGroup(jPanelCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCargaDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelButtonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCargaDatosLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabelDescripción))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jScrollPane2))
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(jTextFieldDireccion))))
                .addGap(22, 22, 22))
        );
        jPanelCargaDatosLayout.setVerticalGroup(
            jPanelCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCargaDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanelButtonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanelCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanelCargaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescripción)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jPanelTabla.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelTablaMouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jTableEdificio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableEdificio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTableEdificio = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        jTableEdificio.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableEdificio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableEdificio.setGridColor(new java.awt.Color(255, 255, 255));
        jTableEdificio.setPreferredSize(new java.awt.Dimension(212, 205));
        jTableEdificio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEdificioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEdificio);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(355, 60));

        jPanelButtonAgregar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelButtonAgregar.setPreferredSize(new java.awt.Dimension(100, 49));
        jPanelButtonAgregar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelButtonAgregarMouseMoved(evt);
            }
        });
        jPanelButtonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonAgregarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonAgregarMouseExited(evt);
            }
        });

        jLabelAceptar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAceptar.setText("Actualizar");

        javax.swing.GroupLayout jPanelButtonAgregarLayout = new javax.swing.GroupLayout(jPanelButtonAgregar);
        jPanelButtonAgregar.setLayout(jPanelButtonAgregarLayout);
        jPanelButtonAgregarLayout.setHorizontalGroup(
            jPanelButtonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonAgregarLayout.setVerticalGroup(
            jPanelButtonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanelButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanelButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanelTablaLayout = new javax.swing.GroupLayout(jPanelTabla);
        jPanelTabla.setLayout(jPanelTablaLayout);
        jPanelTablaLayout.setHorizontalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTablaLayout.createSequentialGroup()
                .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTablaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE))
                    .addGroup(jPanelTablaLayout.createSequentialGroup()
                        .addContainerGap(748, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanelTablaLayout.setVerticalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCargaDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCargaDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelButtonRefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseClicked
        limpiarComponentes();
    }//GEN-LAST:event_jPanelButtonRefrescarMouseClicked

    private void jPanelButtonAgregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAgregarMouseMoved
        this.jPanelButtonAgregar.setBackground(new Color(255,255,255));
        this.jPanelButtonAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelAceptar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonAgregarMouseMoved

    private void jPanelButtonAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAgregarMouseExited
        this.jPanelButtonAgregar.setBackground(new Color(51,51,51));
        this.jLabelAceptar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonAgregarMouseExited

    private void jPanelButtonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAgregarMouseClicked
        if(jTableEdificio.isRowSelected(jTableEdificio.getSelectedRow())){
            if(validar()){
                try {
                    int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(confirmacion == 0){
                        Logica.Edificio unEdificio = unaControladora.obtenerEdificio(id);
                        unaControladora.modificarEdificio(id, jTextFieldNombre.getText().toUpperCase(), jTextFieldDireccion.getText().toUpperCase(), jTextAreaDescripcion.getText(), unEdificio.getDepartamentos(), unEdificio.getCocheras(), unEdificio.getServicios(), unEdificio.getCoeficientesDorm());
                        modificar = false;
                        limpiarComponentes();
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Logica.Edificio.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación.", "", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Para realizar actualizaciones debe seleccionar un Edificio.");
        }
    }//GEN-LAST:event_jPanelButtonAgregarMouseClicked

    private void jTableEdificioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEdificioMouseClicked
        if(jTableEdificio.isRowSelected(jTableEdificio.getSelectedRow())){
            int fila = jTableEdificio.getSelectedRow(), columna = jTableEdificio.columnAtPoint(evt.getPoint());
            
            if(fila >= 0){
                id = Long.parseLong(jTableEdificio.getValueAt(fila, 0).toString());
        
                if(evt.getClickCount() == 2){
                    modificar = true;
                    cargarPanelDatos(id);
                }
                // Si clickea en alguna columna donde haya un botón.
                Object value = jTableEdificio.getValueAt(fila, columna);
                if(value instanceof JButton){
                    String textoBoton = ((JButton) value).getText();
                    switch(textoBoton){
                        case("Ver departamentos"):
                            new vtnBotonDepartamento(id).setVisible(true);
                            break;
                        case("Ver cocheras"):
                            new vtnBotonCochera(id).setVisible(true);
                            break;
                        case("Ver servicios"):
                            new vtnBotonServicio(id).setVisible(true);
                            break;
                        case("Ver coeficientes d."):
                            new vtnBotonCoeficienteDorm(id).setVisible(true);
                            break;

                        default:
                            JOptionPane.showMessageDialog(null, "No posee datos cargados.", "", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                    ((JButton) value).doClick();
                    JButton boton;
                    //JOptionPane.showMessageDialog(null, "Fila: "+fila+" Columna: "+columna+" Valor es igual a: "+textoBoton);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Debe cliquear una fila válida.", "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTableEdificioMouseClicked

    private void jPanelButtonRefrescarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseEntered
        if(modificar){
            ImageIcon cancelar = new ImageIcon(getClass().getResource("/Visual/img/cancelar.png"));
            this.jPanelButtonRefrescar.setBackground(new Color(255,255,255));
            this.jPanelButtonRefrescar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
            this.jLabelRefrescar.setIcon(cancelar);
        }else{
            ImageIcon refresh = new ImageIcon(getClass().getResource("/Visual/img/cargando.png"));
            this.jPanelButtonRefrescar.setBackground(new Color(255,255,255));
            this.jPanelButtonRefrescar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
            this.jLabelRefrescar.setIcon(refresh);
        }
    }//GEN-LAST:event_jPanelButtonRefrescarMouseEntered

    private void jPanelButtonRefrescarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseExited
        if(modificar){
            ImageIcon cancelar = new ImageIcon(getClass().getResource("/Visual/img/cancelar_blanco.png"));
            this.jPanelButtonRefrescar.setBackground(new Color(51,51,51));
            this.jLabelRefrescar.setIcon(cancelar);
        }else{
            ImageIcon refresh = new ImageIcon(getClass().getResource("/Visual/img/cargando_blanco.png"));
            this.jPanelButtonRefrescar.setBackground(new Color(51,51,51));
            this.jLabelRefrescar.setIcon(refresh);
        }
    }//GEN-LAST:event_jPanelButtonRefrescarMouseExited

    private void jPanelTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTablaMouseClicked
        this.jTableEdificio.clearSelection();
    }//GEN-LAST:event_jPanelTablaMouseClicked

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
        
        if(!Character.isLetterOrDigit(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDireccionKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jTextFieldDireccionKeyTyped
    
    public void cargarTablaEdificio(){
        List<Logica.Edificio> edificios = new LinkedList();
        
        if(unaControladora.obtenerEdificios().size() > 0){
            if(this.idEdificio != 0){
                Logica.Edificio unEd = unaControladora.obtenerEdificio(idEdificio);
                edificios.add(unEd);
            }
            
            if(!edificios.isEmpty()){
                armarTabla(jTableEdificio, edificios);
            }
        }else{
            armarTabla(jTableEdificio, null);
        }
        
    }
    
    public boolean validar(){
        boolean validar = false;
        
        if((!jTextFieldNombre.getText().isEmpty()) && (!jTextFieldDireccion.getText().isEmpty())){
           validar = true;
        }else if(jTextFieldNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar el campo: Nombre.", "", JOptionPane.WARNING_MESSAGE);
        }else if(jTextFieldDireccion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar el campo: Dirección.", "", JOptionPane.WARNING_MESSAGE);
        }
        
        return validar;
    }
    
    public void limpiarComponentes(){
        ImageIcon refrescar = new ImageIcon(getClass().getResource("/Visual/img/cargando_blanco.png"));
        this.jLabelRefrescar.setIcon(refrescar);
        this.jLabelAceptar.setText("Actualizar");
        this.jTextFieldNombre.setText(null);
        this.jTextFieldDireccion.setText(null);
        this.jTextAreaDescripcion.setText(null);        
        this.jTextFieldNombre.requestFocus();   // Una vez seteado los input se gana el Foco en InputNombre.
        this.jTableEdificio.clearSelection();
        modificar = false;
        cargarTablaEdificio();
    }
    
    public void cargarPanelDatos(long id){
        this.jLabelAceptar.setText("Actualizar");
        ImageIcon cancelar = new ImageIcon(getClass().getResource("/Visual/img/cancelar_blanco.png"));
        this.jLabelRefrescar.setIcon(cancelar);
        Logica.Edificio unEdificio = unaControladora.obtenerEdificio(id);
        
        this.jTextFieldNombre.setText(unEdificio.getNombre());
        this.jTextFieldDireccion.setText(unEdificio.getDireccion());
    }
    
    public JTable armarTabla(JTable jtb, List<Logica.Edificio> edificios){
        String colTablaEdificio[] = {"Id", "Nombre", "Dirección", "Departamentos", "Cocheras", "Servicios", "Coeficientes", "Descripción"};
        
        if(edificios != null){
            jtb.setDefaultRenderer(Object.class, new Render());
            DefaultTableModel tablaEdificio = new DefaultTableModel(null, colTablaEdificio);
            Object[] obj = new Object[8];
            
            for(Logica.Edificio unEdi : edificios){
                JButton btnDepartamento = new JButton();
                JButton btnCochera = new JButton();
                JButton btnServicio = new JButton();
                JButton btnCoeficienteDorm = new JButton();
                obj[0] = unEdi.getId();
                obj[1] = unEdi.getNombre();
                obj[2] = unEdi.getDireccion();
                if(!unEdi.getDepartamentos().isEmpty()){
                    btnDepartamento.setText("Ver departamentos");
                    obj[3] = btnDepartamento;
                }else{
                    btnDepartamento.setText("--");
                    obj[3] = btnDepartamento;
                }

                if(!unEdi.getCocheras().isEmpty()){
                    btnCochera.setText("Ver cocheras");
                    obj[4] = btnCochera;
                }else{
                    btnCochera.setText("--");
                    obj[4] = btnCochera;
                }

                if(!unEdi.getServicios().isEmpty()){
                    btnServicio.setText("Ver servicios");
                    obj[5] = btnServicio;
                }else{
                    btnServicio.setText("--");
                    obj[5] = btnServicio;
                }

                if(!unEdi.getCoeficientesDorm().isEmpty()){
                    btnCoeficienteDorm.setText("Ver coeficientes d.");
                    obj[6] = btnCoeficienteDorm;
                }else{
                    btnCoeficienteDorm.setText("--");
                    obj[6] = btnCoeficienteDorm;
                }
                obj[7] = unEdi.getDescripcion();
                
                tablaEdificio.addRow(obj);
            }
            
            jtb.setModel(tablaEdificio);
            jtb.setRowHeight(25);
        }else{
            DefaultTableModel tablaEdificio = new DefaultTableModel(null, colTablaEdificio);
            jtb.setModel(tablaEdificio);
            jtb.setRowHeight(25);
        }
           
        return jtb;
    }
    
    public boolean isCellEditable(int row, int column){
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelDescripción;
    private javax.swing.JLabel jLabelRefrescar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelButtonAgregar;
    private javax.swing.JPanel jPanelButtonRefrescar;
    private javax.swing.JPanel jPanelCargaDatos;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableEdificio;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

}
