package Visual;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

public final class PanelExpensa extends javax.swing.JPanel {
    private long idExpensa;
    private final long idEdificio;
    private final Calendar calendario = Calendar.getInstance();
    private final ControladoraV unaControladora = new ControladoraV();
    private final DefaultComboBoxModel comboAnio = new DefaultComboBoxModel();
    private final DefaultComboBoxModel comboDepartamento = new DefaultComboBoxModel();
    private final String colTablaExpensa[] = {"Id", "Nombre", "Mes", "Año", "Monto", "Descripción"};
    private final DefaultTableModel tablaExpensa = new DefaultTableModel(null, colTablaExpensa);
    private final String colTablaBuscarExpensa[] = {"Id", "Departamento", "Mes", "Año","Monto", "Descripción"};
    private final DefaultTableModel tablaBuscarExpensa = new DefaultTableModel(null, colTablaBuscarExpensa);
    private boolean modificar = false, eliminar = false, entro = false, alta = false, eliminarSeleccion = false;
    
    public PanelExpensa(long idEdificio) throws Exception {
        initComponents();
        this.idEdificio = idEdificio;
        cargarTablaExpensa(idEdificio,0);
        cargarTablaBuscarExpensa(0,0);
        cargarComboAnio();
        eliminarServicioSeleccionado();
        jTextFieldAnio.setText(String.valueOf(calendario.get(Calendar.YEAR)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelMes = new javax.swing.JLabel();
        jLabelDepartamento = new javax.swing.JLabel();
        jLabelServicio = new javax.swing.JLabel();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jComboBoxDepartamento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableExpensa = new javax.swing.JTable();
        jLabelAnio = new javax.swing.JLabel();
        jTextFieldAnio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jPanelButtonRefresh = new javax.swing.JPanel();
        jLabelRefresh = new javax.swing.JLabel();
        jTextFieldMonto = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanelButtonEliminar = new javax.swing.JPanel();
        jLabelEliminar = new javax.swing.JLabel();
        jPanelButtonAgregar = new javax.swing.JPanel();
        jLabelAceptar = new javax.swing.JLabel();
        jComboBoxAnio = new javax.swing.JComboBox<>();
        jComboBoxMesBusqueda = new javax.swing.JComboBox<>();
        jPanelButtonBuscar = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableBuscarExpensa = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(896, 315));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Expensa");

        jLabelMes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelMes.setText("Mes");

        jLabelDepartamento.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelDepartamento.setText("Departamento");

        jLabelServicio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelServicio.setText("Servicios");

        jComboBoxMes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBoxMes.setBorder(null);
        jComboBoxMes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMesItemStateChanged(evt);
            }
        });
        jComboBoxMes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxMesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxMesFocusLost(evt);
            }
        });

        jComboBoxDepartamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jComboBoxDepartamento.setBorder(null);
        jComboBoxDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDepartamentoItemStateChanged(evt);
            }
        });
        jComboBoxDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBoxDepartamentoKeyTyped(evt);
            }
        });

        jTableExpensa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTableExpensa = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        jTableExpensa.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableExpensa.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableExpensa);

        jLabelAnio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelAnio.setText("Año");

        jTextFieldAnio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldAnio.setBorder(null);
        jTextFieldAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAnioKeyTyped(evt);
            }
        });

        jLabelDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelDescripcion.setText("Descripción");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextAreaDescripcion.setRows(2);
        jTextAreaDescripcion.setTabSize(4);
        jScrollPane3.setViewportView(jTextAreaDescripcion);

        jPanelButtonRefresh.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonRefresh.setPreferredSize(new java.awt.Dimension(100, 49));
        jPanelButtonRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonRefreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelButtonRefreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonRefreshMouseExited(evt);
            }
        });

        jLabelRefresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/img/cargando_blanco.png"))); // NOI18N

        javax.swing.GroupLayout jPanelButtonRefreshLayout = new javax.swing.GroupLayout(jPanelButtonRefresh);
        jPanelButtonRefresh.setLayout(jPanelButtonRefreshLayout);
        jPanelButtonRefreshLayout.setHorizontalGroup(
            jPanelButtonRefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonRefreshLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonRefreshLayout.setVerticalGroup(
            jPanelButtonRefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jTextFieldMonto.setEditable(false);
        jTextFieldMonto.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldMonto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldMonto.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Monto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelMes)
                                    .addComponent(jLabelServicio)
                                    .addComponent(jLabelDepartamento))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxMes, 0, 368, Short.MAX_VALUE)
                                            .addComponent(jComboBoxDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabelDescripcion)
                                                        .addGap(15, 15, 15)
                                                        .addComponent(jScrollPane3))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabelAnio)
                                                                .addGap(129, 129, 129)))
                                                        .addGap(51, 51, 51))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addComponent(jTextFieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(171, 171, 171))))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelAnio)
                    .addComponent(jTextFieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMes))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelDepartamento)
                        .addComponent(jComboBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDescripcion))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelServicio)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(896, 315));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanelButtonEliminar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelButtonEliminar.setPreferredSize(new java.awt.Dimension(100, 49));
        jPanelButtonEliminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelButtonEliminarMouseMoved(evt);
            }
        });
        jPanelButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonEliminarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonEliminarMouseExited(evt);
            }
        });

        jLabelEliminar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEliminar.setText("Eliminar");

        javax.swing.GroupLayout jPanelButtonEliminarLayout = new javax.swing.GroupLayout(jPanelButtonEliminar);
        jPanelButtonEliminar.setLayout(jPanelButtonEliminarLayout);
        jPanelButtonEliminarLayout.setHorizontalGroup(
            jPanelButtonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonEliminarLayout.setVerticalGroup(
            jPanelButtonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jPanelButtonAgregar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jLabelAceptar.setText("Aceptar");

        javax.swing.GroupLayout jPanelButtonAgregarLayout = new javax.swing.GroupLayout(jPanelButtonAgregar);
        jPanelButtonAgregar.setLayout(jPanelButtonAgregarLayout);
        jPanelButtonAgregarLayout.setHorizontalGroup(
            jPanelButtonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonAgregarLayout.createSequentialGroup()
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
                .addGap(11, 11, 11)
                .addComponent(jPanelButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jComboBoxAnio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione año" }));
        jComboBoxAnio.setBorder(null);
        jComboBoxAnio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBoxMesBusqueda.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxMesBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBoxMesBusqueda.setBorder(null);
        jComboBoxMesBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanelButtonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonBuscar.setPreferredSize(new java.awt.Dimension(100, 49));
        jPanelButtonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelButtonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonBuscarMouseExited(evt);
            }
        });

        jLabelBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/img/lupa_blanca.png"))); // NOI18N

        javax.swing.GroupLayout jPanelButtonBuscarLayout = new javax.swing.GroupLayout(jPanelButtonBuscar);
        jPanelButtonBuscar.setLayout(jPanelButtonBuscarLayout);
        jPanelButtonBuscarLayout.setHorizontalGroup(
            jPanelButtonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonBuscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelButtonBuscarLayout.setVerticalGroup(
            jPanelButtonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jTableBuscarExpensa = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        jTableBuscarExpensa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBuscarExpensa.getTableHeader().setReorderingAllowed(false);
        jTableBuscarExpensa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBuscarExpensaMouseClicked(evt);
            }
        });
        jTableBuscarExpensa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableBuscarExpensaKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(jTableBuscarExpensa);
        jTableBuscarExpensa.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableBuscarExpensa.getColumnModel().getColumnCount() > 0) {
            jTableBuscarExpensa.getColumnModel().getColumn(0).setMinWidth(70);
            jTableBuscarExpensa.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTableBuscarExpensa.getColumnModel().getColumn(0).setMaxWidth(90);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxMesBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4))))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBoxMesBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelButtonAgregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAgregarMouseMoved
        this.jPanelButtonAgregar.setBackground(new Color(255,255,255));
        this.jPanelButtonAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelAceptar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonAgregarMouseMoved

    private void jPanelButtonAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAgregarMouseExited
        this.jPanelButtonAgregar.setBackground(new Color(51,51,51));
        this.jLabelAceptar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonAgregarMouseExited

    private void jPanelButtonEliminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonEliminarMouseMoved
        this.jPanelButtonEliminar.setBackground(new Color(255,255,255));
        this.jPanelButtonEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelEliminar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonEliminarMouseMoved

    private void jPanelButtonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonEliminarMouseExited
        this.jPanelButtonEliminar.setBackground(new Color(51,51,51));
        this.jLabelEliminar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonEliminarMouseExited

    private void jPanelButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonEliminarMouseClicked
        if(eliminar){
            try{
                int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirmacion == 0){
                    Logica.Departamento unDepartamento = unaControladora.obtenerDepartamentoPorExpensa(idEdificio, idExpensa);
                    unaControladora.bajaExpensa(idExpensa, unDepartamento.getId());
                    cargarTablaExpensa(idEdificio,0);
                    cargarTablaBuscarExpensa(0,0);
                    eliminar = false;
                }
            }catch(Exception e){
                Logger.getLogger(Logica.Expensa.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar.", "", JOptionPane.ERROR_MESSAGE);
                //VentanaMensaje vtnMensaje = new VentanaMensaje("No se ha podido eliminar el Edificio.");
            }
        }else{
             JOptionPane.showMessageDialog(null, "Debe seleccionar una Expensa.", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jPanelButtonEliminarMouseClicked

    private void jPanelButtonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAgregarMouseClicked
        if(validar()){
            int mes = jComboBoxMes.getSelectedIndex(), 
            anio = Integer.valueOf(jTextFieldAnio.getText());
            Logica.Departamento unDepartamento = (Logica.Departamento) comboDepartamento.getSelectedItem();
            List<Logica.ServicioExpensa> serviciosExpensa = new LinkedList();
            float montoExpensa;
            
            if(eliminarSeleccion){
                if(tablaExpensa.getRowCount() > 0){
                    float monto;
                    String nombre, descripcion;
                    int mesServicio, anioServicio;
                    
                    for(int i = 0; i < tablaExpensa.getRowCount(); i++){
                        nombre = String.valueOf(tablaExpensa.getValueAt(i, 1));
                        mesServicio = Integer.parseInt((String) tablaExpensa.getValueAt(i, 2));
                        anioServicio = Integer.parseInt((String) tablaExpensa.getValueAt(i, 3));
                        monto = Float.valueOf(unaControladora.reemplazarString(((String) tablaExpensa.getValueAt(i, 4))));
                        descripcion = String.valueOf(tablaExpensa.getValueAt(i, 5));
                        //System.out.println(i+": "+nombre+" - "+mesServicio+"/"+anioServicio+" - $"+monto);
                        try{
                            serviciosExpensa.add(unaControladora.cargarListaServicioExpensa(nombre, mesServicio, anioServicio, monto, descripcion));
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar un servicio expensa: "+e, "", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    try{
                        montoExpensa = Float.valueOf(unaControladora.reemplazarString(jTextFieldMonto.getText()));
                        unaControladora.altaExpensa(montoExpensa, mes, anio, jTextAreaDescripcion.getText(), serviciosExpensa, unDepartamento.getId());
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar Expensa: "+e, "", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }else{
                try {
                    alta = true;
                    serviciosExpensa = unaControladora.calcularExpensa(idEdificio, unDepartamento, mes, anio, alta);
                    montoExpensa = unaControladora.calcularMonto(serviciosExpensa);
                    try {
                        if (!modificar) {
                            unaControladora.altaExpensa(montoExpensa, mes, anio, jTextAreaDescripcion.getText(), serviciosExpensa, unDepartamento.getId());
                        } else {
                            int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            if (confirmacion == 0) {
                                unaControladora.modificarExpensa(idExpensa, montoExpensa, mes, anio, jTextAreaDescripcion.getText(), serviciosExpensa);
                            }
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(Logica.Expensa.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación. "+ex, "", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al calcular la expensa. " + ex, "", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            try {
                limpiarComponentes();
            } catch (Exception ex) {
                Logger.getLogger(PanelExpensa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Para guardar se debe tener todos los datos.", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jPanelButtonAgregarMouseClicked

    private void jPanelButtonRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseClicked
        if(modificar){
            modificar = false;
        }
        try {
            cargarTablaExpensa(idEdificio, 0);
            cargarTablaBuscarExpensa(0,0);
            this.jTextFieldMonto.setText(null);
            limpiarComponentes();
        } catch (Exception ex) {
            Logger.getLogger(PanelExpensa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanelButtonRefreshMouseClicked

    private void jPanelButtonRefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseEntered
        icono("adentro");
    }//GEN-LAST:event_jPanelButtonRefreshMouseEntered

    private void jPanelButtonRefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseExited
        icono("afuera");
    }//GEN-LAST:event_jPanelButtonRefreshMouseExited

    private void jPanelButtonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseClicked
        if(jComboBoxMesBusqueda.getSelectedIndex() == 0 || jComboBoxAnio.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Debe ingresar una clave de busqueda.", "", JOptionPane.WARNING_MESSAGE);
        }else{
            int anio = Integer.valueOf(String.valueOf(jComboBoxAnio.getSelectedItem()));
            try {
                cargarTablaBuscarExpensa(jComboBoxMesBusqueda.getSelectedIndex(), anio);
            } catch (Exception ex) {
                Logger.getLogger(PanelExpensa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jPanelButtonBuscarMouseClicked

    private void jPanelButtonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseEntered
        ImageIcon buscar = new ImageIcon(getClass().getResource("/Visual/img/lupa_negra.png"));
        this.jPanelButtonBuscar.setBackground(new Color(255,255,255));
        this.jPanelButtonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelBuscar.setIcon(buscar);
    }//GEN-LAST:event_jPanelButtonBuscarMouseEntered

    private void jPanelButtonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseExited
        ImageIcon buscar = new ImageIcon(getClass().getResource("/Visual/img/lupa_blanca.png"));
        this.jPanelButtonBuscar.setBackground(new Color(51,51,51));
        this.jLabelBuscar.setIcon(buscar);
    }//GEN-LAST:event_jPanelButtonBuscarMouseExited

    private void jComboBoxMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMesItemStateChanged
        if(jComboBoxMes.getSelectedIndex() > 0 && entro){
            int mes = jComboBoxMes.getSelectedIndex();
            List<Logica.Departamento> departamentosSinExpensas = unaControladora.departamentosSinExpensas(mes, idEdificio);
            
            Collections.sort(departamentosSinExpensas, (Logica.Departamento d1, Logica.Departamento d2) -> d1.getUbicacion().compareTo(d2.getUbicacion()));
            
            comboDepartamento.removeAllElements();
            comboDepartamento.addElement("Seleccione una opción");
            for(Logica.Departamento unDepartamento : departamentosSinExpensas){
                if(unDepartamento.getUnInquilino() != null){
                    comboDepartamento.addElement(unDepartamento);
                }
            }
            
            if(!departamentosSinExpensas.isEmpty()){
                if(departamentosSinExpensas.size() != comboDepartamento.getSize()-1){
                    JOptionPane.showMessageDialog(null, "Existen Departamentos sin Inquilino", "", JOptionPane.WARNING_MESSAGE);
                }
            }
            
            jComboBoxDepartamento.setModel(comboDepartamento);
        }
    }//GEN-LAST:event_jComboBoxMesItemStateChanged

    private void jComboBoxDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentoItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED && jComboBoxDepartamento.getSelectedIndex() > 0){
            Logica.Departamento unDepartamento = (Logica.Departamento) comboDepartamento.getElementAt(jComboBoxDepartamento.getSelectedIndex());
            
            if(unaControladora.obtenerCoeficienteDorm(idEdificio, unDepartamento) == null){
                JOptionPane.showMessageDialog(null, "No existen un Coeficiente adecuado  para el Departamento", "", JOptionPane.WARNING_MESSAGE);
                try {
                    limpiarComponentes();
                } catch (Exception ex) {
                    Logger.getLogger(PanelExpensa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {
                    cargarTablaExpensa(idEdificio, unDepartamento.getId());
                } catch (Exception ex) {
                    Logger.getLogger(PanelExpensa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jComboBoxDepartamentoItemStateChanged

    private void jTableBuscarExpensaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBuscarExpensaMouseClicked
        int fila = jTableBuscarExpensa.getSelectedRow();
        
        if(fila >= 0){
            idExpensa = Long.parseLong(jTableBuscarExpensa.getValueAt(fila, 0).toString());
        
            if(evt.getClickCount() == 1){
                eliminar = true;
            }else if(evt.getClickCount() == 2){
                try {
                    cargarPanelDatos(idExpensa);
                } catch (Exception ex) {
                    Logger.getLogger(PanelExpensa.class.getName()).log(Level.SEVERE, null, ex);
                }
                eliminar = false;
            }
        }
    }//GEN-LAST:event_jTableBuscarExpensaMouseClicked

    private void jComboBoxDepartamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentoKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jComboBoxDepartamentoKeyTyped

    private void jComboBoxMesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxMesFocusGained
        entro = true;
    }//GEN-LAST:event_jComboBoxMesFocusGained

    private void jComboBoxMesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxMesFocusLost
        entro = false;
    }//GEN-LAST:event_jComboBoxMesFocusLost

    private void jTableBuscarExpensaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableBuscarExpensaKeyTyped
        if (evt.getKeyChar() == evt.VK_DELETE) {
            jPanelButtonEliminarMouseClicked(null);
        }
    }//GEN-LAST:event_jTableBuscarExpensaKeyTyped

    private void jTextFieldAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnioKeyTyped
        if(Character.isLetter(evt.getKeyChar())){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldAnioKeyTyped
    
    public void cargarTablaExpensa(long idEdificio, long idDepartamento) throws Exception{
        limpiarTablaExpensa();
        String datos[] = new String[5];
        DecimalFormat formatoDecimal = new DecimalFormat("#0.00");
        formatoDecimal.setMinimumFractionDigits(2);
        
        if(idDepartamento != 0){
            int anio = Integer.valueOf(jTextFieldAnio.getText()),
                mes = jComboBoxMes.getSelectedIndex();
            
            List<Logica.ServicioExpensa> serviciosExpensa = unaControladora.calcularExpensa(idEdificio, unaControladora.obtenerDepartamento(idDepartamento), mes, anio, alta);
            
            if(serviciosExpensa.size() > 0){
                Collections.sort(serviciosExpensa, (Logica.ServicioExpensa sE1, Logica.ServicioExpensa sE2) -> sE1.getNombre().compareTo(sE2.getNombre()));
                
                for (Logica.ServicioExpensa unServicioExpensa : serviciosExpensa) {
                    datos[0] = String.valueOf(unServicioExpensa.getId());
                    datos[1] = unServicioExpensa.getNombre();
                    datos[2] = String.valueOf(unServicioExpensa.getMes());
                    datos[3] = String.valueOf(unServicioExpensa.getAnio());
                    datos[4] = formatoDecimal.format(unServicioExpensa.getMonto());

                    this.tablaExpensa.addRow(datos);
                }
                
                jTextFieldMonto.setText(formatoDecimal.format(unaControladora.calcularMonto(serviciosExpensa)));

            }else{
                JOptionPane.showMessageDialog(null, "No existen servicios para la Expensa", "", JOptionPane.WARNING_MESSAGE);
            }
        }else{                  
            List<Logica.Servicio> servicios = unaControladora.obtenerEdificio(idEdificio).getServicios();
            Collections.sort(servicios, (Logica.Servicio s1, Logica.Servicio s2) -> s1.getNombre().compareTo(s2.getNombre()));
            for (Logica.Servicio unServicio : servicios) {
                datos[0] = String.valueOf(unServicio.getId());
                datos[1] = String.valueOf(unServicio.getNombre());
                datos[2] = String.valueOf(unServicio.getMes());
                datos[3] = String.valueOf(unServicio.getAnio());
                datos[4] = formatoDecimal.format(unServicio.getMonto());
                
                this.tablaExpensa.addRow(datos);
            }
            
        }
        
        this.jTableExpensa.setModel(tablaExpensa);
    }
    
    public void cargarTablaBuscarExpensa(int mes, int anio) throws Exception{
        limpiarTablaBusqueda();
        List<Logica.Expensa> expensas = new LinkedList();
        String datos[] = new String[6];
        DecimalFormat formatoDecimal = new DecimalFormat("#0.00");
        formatoDecimal.setMinimumFractionDigits(2);
        
        if(mes != 0 && anio != 0){
            for(Logica.Expensa unaExpensa : unaControladora.obtenerExpensasEdificio(idEdificio)){
                if(unaExpensa.getMes() == mes && unaExpensa.getAnio() == anio){
                    expensas.add(unaExpensa);
                }
            }
            
            if(expensas.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ha encontrado la Expensa.", "", JOptionPane.ERROR_MESSAGE);
                expensas = unaControladora.obtenerExpensasFechaActual(idEdificio);
            }
        }else{
            expensas = unaControladora.obtenerExpensasFechaActual(idEdificio);
        }
        
        List<Logica.Expensa> expensasFinal = new LinkedList();
                
        //Collections.sort(expensas, (Logica.Expensa e1, Logica.Expensa e2) -> e1.getId().compareTo(e2.getId()));

        for (Logica.Expensa unaExpensa : expensas) {
                datos[0] = String.valueOf(unaExpensa.getId());
                datos[1] = unaControladora.obtenerDepartamentoPorExpensa(idEdificio, unaExpensa.getId()).getUbicacion();
                datos[2] = String.valueOf(unaExpensa.getMes());
                datos[3] = String.valueOf(unaExpensa.getAnio());
                datos[4] = formatoDecimal.format(unaExpensa.getMonto());
                datos[5] = String.valueOf(unaExpensa.getDescripcion());

                this.tablaBuscarExpensa.addRow(datos);
        }
        this.jTableBuscarExpensa.setModel(tablaBuscarExpensa);
    }
    
    private void eliminarServicioSeleccionado(){
        JPopupMenu popupMenu = new JPopupMenu();
        
        JMenuItem menuItem = new JMenuItem("Eliminar");
        menuItem.addActionListener((ActionEvent e) -> {
            int fila = jTableExpensa.getSelectedRow();
            
            if(fila >= 0){
                DecimalFormat formatoDecimal = new DecimalFormat("#0.00");
                String precioString = unaControladora.reemplazarString(jTableExpensa.getValueAt(fila, 4).toString());
                float precioFloat = Float.parseFloat(precioString), total;
                tablaExpensa.removeRow(fila);
                total = Float.parseFloat(unaControladora.reemplazarString(jTextFieldMonto.getText()));
                total -= precioFloat;
                jTextFieldMonto.setText(formatoDecimal.format(total));
                eliminarSeleccion = true;
            }
        });
        
        popupMenu.add(menuItem);
        jTableExpensa.setComponentPopupMenu(popupMenu);
    }
    
    private void cargarPanelDatos(long idExpensa) throws Exception{
        modificar = true;
        String datos[] = new String[5];
        jLabelAceptar.setText("Actualizar");
        DecimalFormat formatoDecimal = new DecimalFormat("#0.00");
        Logica.Expensa unaExpensa = unaControladora.obtenerExpensa(idExpensa);
        Logica.Departamento unDepartamento = unaControladora.obtenerDepartamentoPorExpensa(idEdificio, idExpensa);
        
        jComboBoxMes.setSelectedIndex(unaExpensa.getMes());
        jTextFieldAnio.setText(String.valueOf(unaExpensa.getAnio()));
        
        /*------------------------------------------------*/
        jComboBoxDepartamento.removeAllItems();
        comboDepartamento.addElement(unDepartamento);
        jComboBoxDepartamento.setModel(comboDepartamento);
        /*------------------------------------------------*/
        limpiarTablaExpensa();
        for (Logica.ServicioExpensa unServicioExpensa : unaExpensa.getServiciosExpensa()) {
            datos[0] = String.valueOf(unServicioExpensa.getId());
            datos[1] = unServicioExpensa.getNombre();
            datos[2] = String.valueOf(unServicioExpensa.getMes());
            datos[3] = String.valueOf(unServicioExpensa.getAnio());
            datos[4] = formatoDecimal.format(unServicioExpensa.getMonto());

            this.tablaExpensa.addRow(datos);
        }

        jTableExpensa.setModel(tablaExpensa);
        jTextAreaDescripcion.setText(unaExpensa.getDescripcion());
        jTextFieldMonto.setText(formatoDecimal.format(unaExpensa.getMonto()));
        
        icono("afuera");
    }
    
    private void limpiarComponentes() throws Exception{
        eliminarSeleccion = false;
        modificar = false;
        alta = false;
        jComboBoxMes.setSelectedIndex(0);
        jComboBoxMesBusqueda.setSelectedIndex(0);
        comboDepartamento.removeAllElements();
        comboDepartamento.addElement("Seleccione una opción");
        jTableExpensa.removeAll();
        jLabelAceptar.setText("Aceptar");
        jTextAreaDescripcion.setText(null);
        cargarTablaBuscarExpensa(0, 0);
        cargarTablaExpensa(idEdificio, 0);
        jTextFieldMonto.setText(null);
        icono("afuera");
        
        jComboBoxMes.requestFocus();
    }
    
    public void icono(String lugar){
        ImageIcon refresh = null;
        
        switch(lugar){
            case "adentro":
                refresh = new ImageIcon(getClass().getResource("/Visual/img/cargando.png"));
                if(modificar){
                    refresh = new ImageIcon(getClass().getResource("/Visual/img/cancelar.png"));
                }
                this.jPanelButtonRefresh.setBackground(new Color(255,255,255));
                this.jPanelButtonRefresh.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
                break;
            case  "afuera":
                refresh = new ImageIcon(getClass().getResource("/Visual/img/cargando_blanco.png"));
                if(modificar){
                    refresh = new ImageIcon(getClass().getResource("/Visual/img/cancelar_blanco.png"));
                }
                this.jPanelButtonRefresh.setBackground(new Color(51,51,51));
                break;
        }
        
        this.jLabelRefresh.setIcon(refresh);
    }
    
    public void limpiarTablaBusqueda(){
        int tamanio = tablaBuscarExpensa.getRowCount();
        
        for(int i = 0; i < tamanio; i++){
            tablaBuscarExpensa.removeRow(0);
        }
        
        this.jTableBuscarExpensa.setModel(tablaBuscarExpensa);
        
    }
    
    public void limpiarTablaExpensa(){
        int tamanio = tablaExpensa.getRowCount();
        
        for(int i = 0; i < tamanio; i++){
            tablaExpensa.removeRow(0);
        }
        
        this.jTableExpensa.setModel(tablaExpensa);
        
    }
    
    private boolean validar(){
        boolean validar = false, mes = false, departamento = false, expensa = false;
        
        if(jComboBoxMes.getSelectedItem() != "Seleccione una opción"){
            mes = true;
        }
        
        if(comboDepartamento.getSelectedItem() != "Seleccione una opción"){
            departamento = true;
        }
        
        if(tablaExpensa.getRowCount() > 0){
            expensa = true;
        }
        
        if(mes && departamento && expensa && !jTextFieldAnio.getText().isEmpty()){
            if(!modificar){
                Logica.Departamento unDepto = (Logica.Departamento)comboDepartamento.getSelectedItem();
                boolean existeExpensa = unaControladora.existeExpensa(unDepto.getId(), jComboBoxMes.getSelectedIndex(), Integer.valueOf(jTextFieldAnio.getText()));
                if(existeExpensa){
                    // En teoría esto nunca debería pasar..
                    JOptionPane.showMessageDialog(null, "La Expensa "+jComboBoxMes.getSelectedIndex()+"/"+Integer.valueOf(jTextFieldAnio.getText())+" del Departamento: "+unDepto.getUbicacion()+" ya se encuentra registrado.", "", JOptionPane.WARNING_MESSAGE);
                }else{
                    validar = true;
                }
            }else{
                validar = true;
            }
            
        }
        
        return validar;
    }
    
    public void cargarComboAnio(){
        comboAnio.removeAllElements();
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        Date fechaActual = new Date();
        int anioActual = Integer.valueOf(yearFormat.format(fechaActual));
        
        if(anioActual >= 2018){
            comboAnio.addElement("Seleccione año");
            for(int i = 2018; i <= anioActual;i++){
                comboAnio.addElement(i);
            }
            jComboBoxAnio.setModel(comboAnio);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxAnio;
    private javax.swing.JComboBox<String> jComboBoxDepartamento;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JComboBox<String> jComboBoxMesBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelAnio;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelDepartamento;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JLabel jLabelRefresh;
    private javax.swing.JLabel jLabelServicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelButtonAgregar;
    private javax.swing.JPanel jPanelButtonBuscar;
    private javax.swing.JPanel jPanelButtonEliminar;
    private javax.swing.JPanel jPanelButtonRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableBuscarExpensa;
    private javax.swing.JTable jTableExpensa;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldAnio;
    private javax.swing.JTextField jTextFieldMonto;
    // End of variables declaration//GEN-END:variables
}
