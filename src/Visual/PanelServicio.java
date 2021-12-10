package Visual;

import java.awt.Color;
import java.awt.event.ItemEvent;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import static java.awt.event.KeyEvent.VK_MINUS;
import static java.awt.event.KeyEvent.VK_PERIOD;
import static java.awt.event.KeyEvent.VK_SPACE;
import java.util.Date;
import java.util.List;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public final class PanelServicio extends javax.swing.JPanel {
    private int fila;
    private final long idEdificio;
    private long idServicio;
    private final Date anio = new Date();
    private final SimpleDateFormat formatoAnio = new SimpleDateFormat("yyyy");
    private boolean modificar = false, eliminar = false, entro = false;
    private final ControladoraV unaControladora = new ControladoraV();
    String colTablaServicio[] = {"Id", "Nombre", "Período", "Año", "F. Emisión", "F. Vencimiento", "Monto"};
    DefaultTableModel tablaServicio = new DefaultTableModel(null, colTablaServicio);
    DefaultComboBoxModel comboBoxNombre = new DefaultComboBoxModel();
    
    
    public PanelServicio(long idEdificio) {
        initComponents();
        this.idEdificio = idEdificio;
        jTextFieldAnio.setText(String.valueOf(formatoAnio.format(anio)));
        this.jTextFieldEdificio.setText(unaControladora.obtenerEdificio(idEdificio).getNombre());
        cargarTablaServicio("");
        cargarComboNombre(idEdificio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelMes = new javax.swing.JLabel();
        jLabelFechaEmision = new javax.swing.JLabel();
        jDateChooserFechaEmision = new com.toedter.calendar.JDateChooser();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jLabelFechaVencimiento = new javax.swing.JLabel();
        jDateChooserFechaVencimiento = new com.toedter.calendar.JDateChooser();
        jLabelMonto = new javax.swing.JLabel();
        jTextFieldMonto = new javax.swing.JTextField();
        jLabelEdificio = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldEdificio = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAnio = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jPanelButtonRefresh = new javax.swing.JPanel();
        jLabelRefresh = new javax.swing.JLabel();
        jButtonNombre = new javax.swing.JButton();
        jComboBoxNombre = new javax.swing.JComboBox<>();
        jCheckBoxCalculoXpersona = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanelButtonAgregar = new javax.swing.JPanel();
        jLabelAceptar = new javax.swing.JLabel();
        jPanelButtonEliminar = new javax.swing.JPanel();
        jLabelEliminar = new javax.swing.JLabel();
        jPanelButtonBuscar = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableServicio = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(574, 315));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Servicio");

        jLabelNombre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelNombre.setText("Nombre");

        jLabelMes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelMes.setText("Mes");

        jLabelFechaEmision.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelFechaEmision.setText("F. Emisión");

        jDateChooserFechaEmision.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserFechaEmision.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jDateChooserFechaEmision.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDateChooserFechaEmisionKeyTyped(evt);
            }
        });

        jComboBoxMes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBoxMes.setBorder(null);
        jComboBoxMes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBoxMesKeyTyped(evt);
            }
        });

        jLabelFechaVencimiento.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelFechaVencimiento.setText("F. Vencimiento");

        jDateChooserFechaVencimiento.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserFechaVencimiento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jDateChooserFechaVencimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDateChooserFechaVencimientoKeyTyped(evt);
            }
        });

        jLabelMonto.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelMonto.setText("Monto");

        jTextFieldMonto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldMonto.setBorder(null);
        jTextFieldMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMontoKeyTyped(evt);
            }
        });

        jLabelEdificio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelEdificio.setText("Edificio");

        jTextFieldEdificio.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldEdificio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jTextFieldEdificio.setBorder(null);
        jTextFieldEdificio.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Año");

        jTextFieldAnio.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldAnio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldAnio.setBorder(null);

        jLabelDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelDescripcion.setText("Descripción");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextAreaDescripcion.setRows(2);
        jScrollPane2.setViewportView(jTextAreaDescripcion);

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

        jButtonNombre.setText("+");
        jButtonNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNombreActionPerformed(evt);
            }
        });
        jButtonNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButtonNombreKeyTyped(evt);
            }
        });

        jComboBoxNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "AGUA Y CLOACA" }));
        jComboBoxNombre.setBorder(null);
        jComboBoxNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxNombre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxNombreItemStateChanged(evt);
            }
        });
        jComboBoxNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxNombreFocusGained(evt);
            }
        });

        jCheckBoxCalculoXpersona.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Calcular por persona");

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
                            .addComponent(jLabelFechaEmision)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelMonto)
                            .addComponent(jLabelDescripcion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jTextFieldMonto)
                            .addComponent(jDateChooserFechaEmision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxNombre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonNombre)))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabelEdificio)
                            .addComponent(jLabelFechaVencimiento)
                            .addComponent(jLabelMes))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxMes, 0, 173, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldAnio, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(jSeparator5)))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldEdificio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooserFechaVencimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBoxCalculoXpersona)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jPanelButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMes)
                    .addComponent(jComboBoxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNombre)
                    .addComponent(jLabelNombre))
                .addGap(1, 1, 1)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jDateChooserFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaVencimiento)
                    .addComponent(jDateChooserFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaEmision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEdificio)
                    .addComponent(jTextFieldMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMonto))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabelDescripcion)
                    .addComponent(jCheckBoxCalculoXpersona)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(496, 315));

        jTextFieldBuscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextFieldBuscar.setText("Ingrese un nombre para buscar");
        jTextFieldBuscar.setBorder(null);
        jTextFieldBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldBuscarMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(355, 60));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonAgregarLayout.setVerticalGroup(
            jPanelButtonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
                .addContainerGap()
                .addComponent(jLabelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonBuscarLayout.setVerticalGroup(
            jPanelButtonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jTableServicio = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        jTableServicio.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableServicioMouseClicked(evt);
            }
        });
        jTableServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableServicioKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(jTableServicio);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(jTextFieldBuscar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3))))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
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

    private void jPanelButtonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAgregarMouseClicked
        if(validar()){
            String nombre = String.valueOf(jComboBoxNombre.getSelectedItem()).toUpperCase(), 
                   monto = jTextFieldMonto.getText();
            Date fechaE = jDateChooserFechaEmision.getDate(),
                 fechaV = jDateChooserFechaVencimiento.getDate();
            int mes = jComboBoxMes.getSelectedIndex();
            boolean calculoxPersona = false;
            if(jCheckBoxCalculoXpersona.isSelected()){
                calculoxPersona = true;
            }
            
            try{
                if(!modificar){
                    unaControladora.altaServicio(nombre, mes, Integer.parseInt(jTextFieldAnio.getText()), calculoxPersona, fechaE, fechaV, Float.valueOf(monto), jTextAreaDescripcion.getText(), this.idEdificio);
                    cargarTablaServicio("");
                }else{
                    int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(confirmacion == 0){
                        idServicio = unaControladora.obtenerServicio(idEdificio, String.valueOf(jComboBoxNombre.getSelectedItem())).getId();
                        unaControladora.modificarServicio(idServicio, nombre, mes, Integer.parseInt(jTextFieldAnio.getText()), calculoxPersona, fechaE, fechaV, Float.valueOf(monto), jTextAreaDescripcion.getText());
                        modificar = false;
                        cargarTablaServicio("");
                    }
                }
            }catch(Exception ex){
                Logger.getLogger(Logica.Servicio.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación.", "", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Verifique que los campos NOMBRE, MES y MONTO hayan sido seleccionados o cargados.", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jPanelButtonAgregarMouseClicked

    private void jPanelButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonEliminarMouseClicked
        if(eliminar){
            try{
                int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirmacion == 0){
                    unaControladora.bajaServicio(idServicio, idEdificio);
                    cargarTablaServicio("");
                    eliminar = false;
                }
            }catch(Exception e){
                Logger.getLogger(Logica.Servicio.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar.", "", JOptionPane.ERROR_MESSAGE);
            }
        }else{
             JOptionPane.showMessageDialog(null, "Debe seleccionar un Servicio.", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jPanelButtonEliminarMouseClicked

    private void jTextFieldMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMontoKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }else if(!Character.isDigit(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_PERIOD) && (evt.getKeyChar() != VK_BACK_SPACE) && (evt.getKeyChar() != VK_MINUS)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMontoKeyTyped

    private void jPanelButtonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseClicked
        if(jTextFieldBuscar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar una clave de busqueda.", "", JOptionPane.WARNING_MESSAGE);
            jTextFieldBuscar.requestFocus();
        }else{
            cargarTablaServicio(jTextFieldBuscar.getText().toUpperCase());
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

    private void jPanelButtonRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseClicked
        if(modificar){
            modificar = false;
        }
        cargarTablaServicio("");
    }//GEN-LAST:event_jPanelButtonRefreshMouseClicked

    private void jPanelButtonRefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseEntered
        icono("adentro");
    }//GEN-LAST:event_jPanelButtonRefreshMouseEntered

    private void jPanelButtonRefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseExited
        icono("afuera");
    }//GEN-LAST:event_jPanelButtonRefreshMouseExited

    private void jComboBoxNombreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxNombreItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if(jComboBoxNombre.getSelectedIndex() > 0){
                Logica.Servicio unServicio = unaControladora.obtenerServicio(idEdificio, String.valueOf(jComboBoxNombre.getSelectedItem()));
                if(unServicio != null){
                    cargarPanelDatos(unServicio.getId());
                }else{
                    modificar = false;
                    if(jComboBoxNombre.getComponentCount() > 2){
                        jButtonNombre.setText("-");
                    }else{
                        jButtonNombre.setText("+");
                    }
                    
                    jComboBoxMes.setSelectedIndex(0);
                    jDateChooserFechaEmision.setDate(null);
                    jDateChooserFechaVencimiento.setDate(null);
                    jTextFieldMonto.setText(null);
                    jTextFieldEdificio.setText(unaControladora.obtenerEdificio(idEdificio).getNombre());
                    jTextFieldAnio.setText(String.valueOf(formatoAnio.format(anio)));
                }
            }
        }
        //entro = false;
    }//GEN-LAST:event_jComboBoxNombreItemStateChanged

    private void jButtonNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNombreActionPerformed
        if(jComboBoxNombre.getSelectedIndex() > 0){
            if(jButtonNombre.getText().equals("-")){
                if(jComboBoxNombre.getSelectedIndex() > 1){
                    Logica.Servicio unServicio = unaControladora.obtenerServicio(idEdificio, String.valueOf(jComboBoxNombre.getSelectedItem()));
                    if(unServicio == null){
                        jComboBoxNombre.remove(jComboBoxNombre.getSelectedIndex());
                    }else{
                        JOptionPane.showMessageDialog(null, "El nombre esta siendo ocupado por algun Servicio.", "", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }else{
                try{
                    String nombre = JOptionPane.showInputDialog(null, "Nombre").toUpperCase();
                    jComboBoxNombre.addItem(nombre.toUpperCase());
                    jComboBoxNombre.setSelectedIndex(jComboBoxNombre.getItemCount()-1);
                    jComboBoxNombre.requestFocus();
                }catch(Exception e){
                    System.out.print("Aprieta para agregar servicio, le da ok y no escribio nada. No ocurre ningun problema ;)"+e);
                }
            }
        }else{
            try{
                String nombre = JOptionPane.showInputDialog(null, "Nombre").toUpperCase();
                jComboBoxNombre.addItem(nombre.toUpperCase());
                jComboBoxNombre.setSelectedIndex(jComboBoxNombre.getItemCount()-1);
                jComboBoxNombre.requestFocus();
            }catch(Exception e){
                System.out.print("Aprieta para agregar servicio, le da ok y no escribio nada. No ocurre ningun problema ;)"+e);
            }
        }
    }//GEN-LAST:event_jButtonNombreActionPerformed

    private void jTextFieldBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBuscarMouseClicked
        jTextFieldBuscar.setText(null);
    }//GEN-LAST:event_jTextFieldBuscarMouseClicked

    private void jTableServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableServicioMouseClicked
        fila = jTableServicio.getSelectedRow();
        
        if(fila >= 0){
            idServicio = Long.valueOf(jTableServicio.getValueAt(fila, 0).toString());
        
            if(evt.getClickCount() == 1){
                eliminar = true;
            }else if(evt.getClickCount() == 2){
                cargarPanelDatos(idServicio);
                eliminar = false;
           }
        }
    }//GEN-LAST:event_jTableServicioMouseClicked

    private void jComboBoxNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxNombreFocusGained
        entro = true;
    }//GEN-LAST:event_jComboBoxNombreFocusGained

    private void jComboBoxMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxMesKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jComboBoxMesKeyTyped

    private void jButtonNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonNombreKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jButtonNombreActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonNombreKeyTyped

    private void jDateChooserFechaEmisionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserFechaEmisionKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jDateChooserFechaEmisionKeyTyped

    private void jDateChooserFechaVencimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserFechaVencimientoKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jDateChooserFechaVencimientoKeyTyped

    private void jTableServicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableServicioKeyTyped
        if (evt.getKeyChar() == evt.VK_DELETE) {
            jPanelButtonEliminarMouseClicked(null);
        }
    }//GEN-LAST:event_jTableServicioKeyTyped

    private void cargarPanelDatos(long idServicio){
        int i = 0;
        jLabelAceptar.setText("Actualizar");
        boolean salir = false;
        modificar = true;
        Logica.Servicio unServicio = unaControladora.obtenerServicio(idServicio);
        
        while(!salir){
            if(jComboBoxNombre.getItemAt(i).equals(unServicio.getNombre())){
                jComboBoxNombre.setSelectedIndex(i);
                salir = true;
            }
            i++;
        }
        
        jTextFieldAnio.setText(String.valueOf(unServicio.getAnio()));
        jComboBoxMes.setSelectedIndex(unServicio.getMes());
        jDateChooserFechaEmision.setDate(unServicio.getFechaEmision());
        jDateChooserFechaVencimiento.setDate(unServicio.getFechaVencimiento());
        jTextFieldMonto.setText(String.valueOf(unServicio.getMonto()));
        jTextFieldEdificio.setText(unaControladora.obtenerEdificio(idEdificio).getNombre());
        //jTextFieldAnio.setText(String.valueOf(formatoAnio.format(anio)));
        jCheckBoxCalculoXpersona.setSelected(unServicio.isCalculoxPersona());
        
        icono("afuera");
    }
    
    private void cargarTablaServicio(String buscar){
        limpiarComponentes();
        String datos[] = new String[8];
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        List<Logica.Servicio> servicios = new LinkedList();
        
        if(!buscar.isEmpty()){
            for(Logica.Servicio unServicio : unaControladora.obtenerEdificio(idEdificio).getServicios()){
                if(unServicio.getNombre().equals(buscar)){
                    servicios.add(unServicio);
                }
            }
            
            if(servicios.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ha encontrado el Servicio.", "", JOptionPane.ERROR_MESSAGE);
                servicios = unaControladora.obtenerEdificio(idEdificio).getServicios();
            }
        }else{
            servicios = unaControladora.obtenerEdificio(idEdificio).getServicios();
        }
        
        for(Logica.Servicio unServicio : servicios){
            datos[0] = String.valueOf(unServicio.getId());
            datos[1] = unServicio.getNombre();  
            datos[2] = unServicio.obtenerMes(unServicio.getMes());
            datos[3] = String.valueOf(unServicio.getAnio());
            if(unServicio.getFechaEmision() != null){
                datos[4] = String.valueOf(dateFormat.format(unServicio.getFechaEmision()));
            }else{
                datos[4] = "";
            }
            
            if(unServicio.getFechaVencimiento() != null){
                datos[5] = String.valueOf(dateFormat.format(unServicio.getFechaVencimiento()));
            }else{
                datos[5] = "";
            }
            datos[6] = String.valueOf(unServicio.getMonto());

            tablaServicio.addRow(datos);
        }

        this.jTableServicio.setModel(tablaServicio);
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
    
    public void limpiarComponentes(){
        jComboBoxMes.setSelectedIndex(0);
        jComboBoxNombre.setSelectedIndex(0);
        jButtonNombre.setText("+");
        jDateChooserFechaEmision.setDate(null);
        jDateChooserFechaVencimiento.setDate(null);
        jTextFieldMonto.setText(null);
        jTextFieldBuscar.setText("Ingrese un nombre para buscar");
        jLabelAceptar.setText("Aceptar");
        jTextFieldEdificio.setText(unaControladora.obtenerEdificio(idEdificio).getNombre());
        jTextFieldAnio.setText(String.valueOf(formatoAnio.format(anio)));
        jCheckBoxCalculoXpersona.setSelected(false);
        limpiarTabla();
        
        icono("afuera");
        jComboBoxNombre.requestFocus();
    }
    
    public void limpiarTabla(){
        int tamanio = tablaServicio.getRowCount();
        
        for(int i = 0; i < tamanio; i++){
            tablaServicio.removeRow(0);
        }
        
        this.jTableServicio.setModel(tablaServicio);
        
    }
    
    public void cargarComboNombre(long idEdificio){
        jComboBoxNombre.removeAllItems();
        List<Logica.Servicio> servicios = unaControladora.obtenerEdificio(idEdificio).getServicios();
        
        jComboBoxNombre.addItem("Seleccione una opción");
        
        if(servicios.isEmpty()){
            jComboBoxNombre.addItem("AGUA Y CLOACA");
        }else{
            for(Logica.Servicio unServicio : servicios){
                jComboBoxNombre.addItem(unServicio.getNombre());
            }
        }
    }
    
    private boolean validar(){
        boolean validar = false, comboNombre = false, comboMes = false;
        
        if(jComboBoxNombre.getSelectedIndex() > 0){
            String nombre = String.valueOf(jComboBoxNombre.getSelectedItem()).toUpperCase();
            if(nombre.isEmpty()){
               JOptionPane.showMessageDialog(null, "Error: No se ha podido cargar el Nombre.", "", JOptionPane.ERROR_MESSAGE);
            }else{
                comboNombre = true;
            }
        }
        
        if(jComboBoxMes.getSelectedIndex() > 0){
            int mes = jComboBoxMes.getSelectedIndex();
            if(mes != 0){
                comboMes = true;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Mes válido.", "", JOptionPane.WARNING_MESSAGE);
        }
        
        if(comboNombre && comboMes && !jTextFieldMonto.getText().isEmpty()){
            validar = true;
        }
        
        return validar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonNombre;
    private javax.swing.JCheckBox jCheckBoxCalculoXpersona;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JComboBox<String> jComboBoxNombre;
    private com.toedter.calendar.JDateChooser jDateChooserFechaEmision;
    private com.toedter.calendar.JDateChooser jDateChooserFechaVencimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEdificio;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelFechaEmision;
    private javax.swing.JLabel jLabelFechaVencimiento;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JLabel jLabelMonto;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRefresh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelButtonAgregar;
    private javax.swing.JPanel jPanelButtonBuscar;
    private javax.swing.JPanel jPanelButtonEliminar;
    private javax.swing.JPanel jPanelButtonRefresh;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTableServicio;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldAnio;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldEdificio;
    private javax.swing.JTextField jTextFieldMonto;
    // End of variables declaration//GEN-END:variables
}
