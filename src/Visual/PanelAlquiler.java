package Visual;

import java.awt.Color;
import java.util.Date;
import java.util.List;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import static java.awt.event.KeyEvent.VK_SPACE;
import static java.awt.event.KeyEvent.VK_PERIOD;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import java.util.Collections;

public final class PanelAlquiler extends javax.swing.JPanel {
    private int fila;
    private final long idEdificio;
    private boolean eliminar = false, modificar = false, entro = false;
    private long idAlquiler, idDepartamento = 0, idCochera = 0;
    private float montoCochera = 0, montoAlquiler = 0, otrasFacturas = 0, total = 0, precioCochera = 0;
    private final ControladoraV unaControladora = new ControladoraV();
    private final DefaultComboBoxModel comboCochera = new DefaultComboBoxModel();
    private final DefaultComboBoxModel comboInquilino = new DefaultComboBoxModel();
    private final DefaultComboBoxModel comboAnio = new DefaultComboBoxModel();
    private final DefaultComboBoxModel comboDepartamento = new DefaultComboBoxModel();
    private final DefaultComboBoxModel comboMonto = new DefaultComboBoxModel();
    private final String colTablaAlquiler[] = {"Id", "Fecha", "Inquilino", "Departamento", "Cochera", "Total"};
    private final DefaultTableModel tablaAlquiler = new DefaultTableModel(null, colTablaAlquiler);
    
    public PanelAlquiler(long idEdificio){
        initComponents();
        this.idEdificio = idEdificio;
        cargarComboInquilino(idEdificio,0);
        cargarComboAnio();
        cargarTablaAlquiler(0,0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jLabelMonto = new javax.swing.JLabel();
        jLabelDepartamento = new javax.swing.JLabel();
        jComboBoxDepartamento = new javax.swing.JComboBox<>();
        jLabelInquilino = new javax.swing.JLabel();
        jLabelCochera = new javax.swing.JLabel();
        jComboBoxCochera = new javax.swing.JComboBox<>();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jComboBoxInquilino = new javax.swing.JComboBox<>();
        jLabelOtraFactura = new javax.swing.JLabel();
        jTextFieldOtraFactura = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelButtonRefresh = new javax.swing.JPanel();
        jLabelRefresh = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelNAlquiler = new javax.swing.JLabel();
        jSeparatorMonto1 = new javax.swing.JSeparator();
        jTextFieldNumAlquiler = new javax.swing.JTextField();
        jLabelSemestre = new javax.swing.JLabel();
        jTextFieldSemestre = new javax.swing.JTextField();
        jSeparatorMonto2 = new javax.swing.JSeparator();
        jComboBoxMonto = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlquiler = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanelButtonAgregar = new javax.swing.JPanel();
        jLabelAceptar = new javax.swing.JLabel();
        jPanelButtonEliminar = new javax.swing.JPanel();
        jLabelEliminar = new javax.swing.JLabel();
        jPanelButtonBuscar = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();
        jComboBoxAnio = new javax.swing.JComboBox<>();
        jComboBoxMesBusqueda = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(890, 315));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabelTitulo.setText("Alquiler");

        jLabelFecha.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelFecha.setText("Fecha");

        jDateChooserFecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserFecha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jDateChooserFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDateChooserFechaKeyTyped(evt);
            }
        });

        jLabelMonto.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelMonto.setText("Monto");

        jLabelDepartamento.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelDepartamento.setText("Departamento");

        jComboBoxDepartamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Sin departamento" }));
        jComboBoxDepartamento.setBorder(null);
        jComboBoxDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBoxDepartamentoKeyTyped(evt);
            }
        });

        jLabelInquilino.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelInquilino.setText("Inquilino");

        jLabelCochera.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelCochera.setText("Cochera");

        jComboBoxCochera.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxCochera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Sin cochera" }));
        jComboBoxCochera.setBorder(null);
        jComboBoxCochera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBoxCocheraKeyTyped(evt);
            }
        });

        jLabelDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelDescripcion.setText("Descripción");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextAreaDescripcion.setRows(2);
        jScrollPane2.setViewportView(jTextAreaDescripcion);

        jComboBoxInquilino.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxInquilino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jComboBoxInquilino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxInquilinoItemStateChanged(evt);
            }
        });
        jComboBoxInquilino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxInquilinoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxInquilinoFocusLost(evt);
            }
        });

        jLabelOtraFactura.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelOtraFactura.setText("Otras Facturas");

        jTextFieldOtraFactura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldOtraFactura.setText("0");
        jTextFieldOtraFactura.setBorder(null);
        jTextFieldOtraFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldOtraFacturaMouseClicked(evt);
            }
        });
        jTextFieldOtraFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldOtraFacturaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldOtraFacturaKeyTyped(evt);
            }
        });

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

        jLabelTotal.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelTotal.setText("Total");

        jTextFieldTotal.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldTotal.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jTextFieldTotal.setBorder(null);
        jTextFieldTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTotalKeyTyped(evt);
            }
        });

        jLabelNAlquiler.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelNAlquiler.setText("N° Alquiler");

        jTextFieldNumAlquiler.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldNumAlquiler.setText("1");
        jTextFieldNumAlquiler.setBorder(null);

        jLabelSemestre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelSemestre.setText("Semestre");

        jTextFieldSemestre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldSemestre.setText("1");
        jTextFieldSemestre.setBorder(null);

        jComboBoxMonto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxMonto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jComboBoxMonto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMontoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDepartamento)
                            .addComponent(jLabelMonto)
                            .addComponent(jLabelTotal)
                            .addComponent(jLabelFecha)
                            .addComponent(jLabelNAlquiler))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBoxMonto, javax.swing.GroupLayout.Alignment.LEADING, 0, 248, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDepartamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChooserFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(113, 113, 113))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldNumAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparatorMonto1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabelSemestre)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparatorMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelInquilino)
                                    .addComponent(jLabelCochera))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxInquilino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxCochera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelOtraFactura)
                                    .addComponent(jLabelDescripcion))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldOtraFactura))))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jPanelButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBoxInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInquilino)
                    .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBoxCochera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCochera)
                    .addComponent(jComboBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDepartamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldOtraFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMonto)
                    .addComponent(jLabelOtraFactura)
                    .addComponent(jComboBoxMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDescripcion)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTotal))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNAlquiler)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelSemestre))
                                    .addComponent(jSeparatorMonto2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jTextFieldNumAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jSeparatorMonto1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(837, 315));

        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jTableAlquiler.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTableAlquiler = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        jTableAlquiler.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableAlquiler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlquilerMouseClicked(evt);
            }
        });
        jTableAlquiler.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableAlquilerKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlquiler);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(355, 60));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanelButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
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

        jComboBoxAnio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione año" }));
        jComboBoxAnio.setBorder(null);
        jComboBoxAnio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jComboBoxMesBusqueda.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxMesBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBoxMesBusqueda.setBorder(null);
        jComboBoxMesBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBoxMesBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBoxMesBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
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

    private void jTableAlquilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlquilerMouseClicked
        fila = jTableAlquiler.getSelectedRow();
        
        if(fila >= 0){
            idAlquiler = Long.valueOf(jTableAlquiler.getValueAt(fila, 0).toString());
        
            if(evt.getClickCount() == 1){
                eliminar = true;
            }else if(evt.getClickCount() == 2){
                eliminar = false;
                cargarPanelDatos(idAlquiler);
           }
        }
    }//GEN-LAST:event_jTableAlquilerMouseClicked

    private void jPanelButtonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAgregarMouseClicked
        if(validar()){
            try {
                Date fecha = jDateChooserFecha.getDate();
                String descripcion = jTextAreaDescripcion.getText();
                float monto = Float.valueOf((String) jComboBoxMonto.getSelectedItem()), 
                      otraFactura = Float.valueOf(jTextFieldOtraFactura.getText());
                int[] generacionAuto = new int[2];
                generacionAuto[0] = Integer.valueOf(jTextFieldNumAlquiler.getText());
                generacionAuto[1] = Integer.valueOf(jTextFieldSemestre.getText());
                Logica.Inquilino unInquilino = (Logica.Inquilino) comboInquilino.getElementAt(jComboBoxInquilino.getSelectedIndex());
                
                float tot = Float.valueOf(jTextFieldTotal.getText());

                if(!modificar){
                    unaControladora.altaAlquiler(fecha, idCochera, idDepartamento, generacionAuto, monto, otraFactura, tot, descripcion, null, unInquilino.getId());
                    cargarTablaAlquiler(0,0);
                }else{
                    int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(confirmacion == 0){
                        Logica.Pago unPago = unaControladora.obtenerAlquiler(idAlquiler).getUnPago();
                        unaControladora.modificarAlquiler(idAlquiler, fecha, idCochera, idDepartamento, generacionAuto, monto, otraFactura, tot, descripcion, unPago);
                        modificar = false;
                        cargarTablaAlquiler(0,0);
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(Logica.Alquiler.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación. Error: "+ex, "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jPanelButtonAgregarMouseClicked

    private void jPanelButtonRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseClicked
        if(modificar){
            modificar = false;
        }
        cargarTablaAlquiler(0,0);
    }//GEN-LAST:event_jPanelButtonRefreshMouseClicked

    private void jPanelButtonRefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseEntered
        icono("adentro");
    }//GEN-LAST:event_jPanelButtonRefreshMouseEntered

    private void jPanelButtonRefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseExited
        icono("afuera");
    }//GEN-LAST:event_jPanelButtonRefreshMouseExited

    private void jPanelButtonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseClicked
        if(jComboBoxMesBusqueda.getSelectedIndex() == 0 || jComboBoxAnio.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Seleccione un mes y año para buscar.", "", JOptionPane.WARNING_MESSAGE);
        }else{
            int anio = Integer.parseInt(String.valueOf(jComboBoxAnio.getSelectedItem()));
            cargarTablaAlquiler(jComboBoxMesBusqueda.getSelectedIndex(), anio);
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

    private void jComboBoxInquilinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxInquilinoItemStateChanged
        if(jComboBoxInquilino.getSelectedIndex() > 0 && entro){
            Logica.Inquilino unInquilino = (Logica.Inquilino) comboInquilino.getElementAt(jComboBoxInquilino.getSelectedIndex());
            cargarCombos(unInquilino.getId(),1);
        }
    }//GEN-LAST:event_jComboBoxInquilinoItemStateChanged

    private void jPanelButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonEliminarMouseClicked
        if(eliminar){
            try{
                int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirmacion == 0){
                    Logica.Inquilino unInquilino = unaControladora.obtenerInquilinoPorAlquiler(idEdificio, idAlquiler);
                    unaControladora.bajaAlquiler(idAlquiler, unInquilino.getId());
                    cargarTablaAlquiler(0,0);
                    eliminar = false;
                }
            }catch(Exception e){
                Logger.getLogger(Logica.Departamento.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar.", "", JOptionPane.ERROR_MESSAGE);
            }
        }else{
             JOptionPane.showMessageDialog(null, "Debe seleccionar un Alquiler.", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jPanelButtonEliminarMouseClicked

    private void jTextFieldOtraFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldOtraFacturaKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }else if(!Character.isDigit(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_PERIOD) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldOtraFacturaKeyTyped

    private void jTextFieldOtraFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldOtraFacturaMouseClicked
        if(jTextFieldOtraFactura.getText().isEmpty() || jTextFieldOtraFactura.getText().equals("0")){
            jTextFieldOtraFactura.setText(null);
        }
        
        if(!modificar){
            if(jComboBoxMonto.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Debe Seleccionar una opcion en monto.");
                jComboBoxMonto.requestFocus();
            }
        }
    }//GEN-LAST:event_jTextFieldOtraFacturaMouseClicked

    private void jComboBoxInquilinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxInquilinoFocusGained
        entro = true;
    }//GEN-LAST:event_jComboBoxInquilinoFocusGained

    private void jComboBoxInquilinoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxInquilinoFocusLost
        entro = false;
    }//GEN-LAST:event_jComboBoxInquilinoFocusLost

    private void jComboBoxDepartamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentoKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jComboBoxDepartamentoKeyTyped

    private void jComboBoxCocheraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxCocheraKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jComboBoxCocheraKeyTyped

    private void jTextFieldTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTotalKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jTextFieldTotalKeyTyped

    private void jDateChooserFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserFechaKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jDateChooserFechaKeyTyped

    private void jTextFieldOtraFacturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldOtraFacturaKeyReleased
        
    }//GEN-LAST:event_jTextFieldOtraFacturaKeyReleased

    private void jComboBoxMontoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMontoItemStateChanged
        if(jComboBoxMonto.getSelectedIndex() > 0){
            jTextFieldSemestre.setText(String.valueOf(jComboBoxMonto.getSelectedIndex()));
            actualizarTotal();
        }
    }//GEN-LAST:event_jComboBoxMontoItemStateChanged

    private void jTableAlquilerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableAlquilerKeyTyped
        if (evt.getKeyChar() == evt.VK_DELETE) {
            jPanelButtonEliminarMouseClicked(null);
        }
    }//GEN-LAST:event_jTableAlquilerKeyTyped

    public boolean validar(){
        boolean validar = false;
        
        if(jDateChooserFecha.getDate() == null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Fecha.", "", JOptionPane.WARNING_MESSAGE);
            jDateChooserFecha.requestFocus();
        }else if(jComboBoxInquilino.getSelectedItem() == "Seleccione una opción"){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Inquilino.", "", JOptionPane.WARNING_MESSAGE);
            jComboBoxInquilino.requestFocus();
        }else if(jComboBoxDepartamento.getSelectedItem() == "Seleccione una opción"){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Departamento.", "", JOptionPane.WARNING_MESSAGE);
            jComboBoxDepartamento.requestFocus();
        }else if(jComboBoxCochera.getSelectedItem() == "Seleccione una opción"){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Cochera.", "", JOptionPane.WARNING_MESSAGE);
            jComboBoxCochera.requestFocus();
        }else if(jTextFieldOtraFactura.getText().isEmpty()){
            if(JOptionPane.showConfirmDialog(null, "Desea continuar con Otras Facturas en 0?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0){
                jTextFieldOtraFactura.requestFocus();
            }else{
                jTextFieldOtraFactura.setText("0");
            }
        }else{
            if(jComboBoxDepartamento.getSelectedItem() != "Sin Departamento."){
                Logica.Departamento unDepartamento = (Logica.Departamento)comboDepartamento.getSelectedItem();
                idDepartamento = unDepartamento.getId();
            }else{
                idDepartamento = 0;
            }
            
            if(jComboBoxCochera.getSelectedItem() != "Sin Cochera."){
                Logica.Cochera unaCochera = (Logica.Cochera)comboCochera.getSelectedItem();
                idCochera = unaCochera.getId();
            }else{
                idCochera = 0;
            }
            
            validar = true;
        }
        
        return validar;
    }
    
    private void cargarPanelDatos(long idAlquiler){
        this.jLabelAceptar.setText("Actualizar");
        modificar = true;
        Logica.Alquiler unAlquiler = unaControladora.obtenerAlquiler(idAlquiler);
        long idInquilino = unaControladora.obtenerInquilinoPorAlquiler(idEdificio, idAlquiler).getId();
        jTextFieldNumAlquiler.setText(String.valueOf(unAlquiler.getGeneracionAuto()[0]));
        jTextFieldSemestre.setText(String.valueOf(unAlquiler.getGeneracionAuto()[1]));
        jDateChooserFecha.setDate(unAlquiler.getFecha());
        jTextFieldOtraFactura.setText(String.valueOf(unAlquiler.getOtraFactura()));
        jComboBoxMonto.removeAllItems();
        jComboBoxMonto.addItem(String.valueOf(unAlquiler.getMonto()));
        
        cargarComboInquilino(idEdificio, idInquilino);
        jTextAreaDescripcion.setText(unAlquiler.getDescripcion());
        cargarCombos(idInquilino,0);
        jTextFieldTotal.setText(String.valueOf(unAlquiler.getTotal()));
        
        icono("afuera");
    }
    
    private void cargarTablaAlquiler(int mesBusqueda, int anioBusqueda){
        limpiarComponentes();
        int mesAlquiler, anioAlquiler;
        String datos[] = new String[7];
        List<Logica.Alquiler> alquileres = new LinkedList();
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM"),
                         yearFormat = new SimpleDateFormat("yyyy"),
                         dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        if(mesBusqueda != 0 && anioBusqueda != 0){
            for(Logica.Alquiler unAlquiler : unaControladora.obtenerAlquileresEdificio(idEdificio)){
                mesAlquiler = Integer.parseInt(monthFormat.format(unAlquiler.getFecha()));
                anioAlquiler = Integer.parseInt(yearFormat.format(unAlquiler.getFecha()));
                if(anioAlquiler == anioBusqueda && mesAlquiler == mesBusqueda){
                    alquileres.add(unAlquiler);
                }
            }
            
            if(alquileres.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ha encontrado el Alquiler.", "", JOptionPane.ERROR_MESSAGE);
                alquileres = unaControladora.obtenerAlquileresEdificio(idEdificio);
            }
        }else{
            alquileres = unaControladora.obtenerAlquileresEdificio(idEdificio);
        }
        
        for(Logica.Alquiler unAlquiler : alquileres){
            datos[0] = String.valueOf(unAlquiler.getId());
            datos[1] = String.valueOf(dateFormat.format(unAlquiler.getFecha()));
            datos[2] = unaControladora.obtenerInquilinoPorAlquiler(idEdificio, unAlquiler.getId()).toString();
            
            if(unAlquiler.getDepartamento() != 0){
                datos[3] = unaControladora.obtenerDepartamento(unAlquiler.getDepartamento()).getUbicacion();
            }else{
                datos[3] = "";
            }
            
            if(unAlquiler.getCochera() != 0){
                datos[4] = String.valueOf(unaControladora.obtenerCochera(unAlquiler.getCochera()).toString());
            }else{
                datos[4] = "";
            }
            
            datos[5] = String.valueOf(unAlquiler.getTotal());
            
            tablaAlquiler.addRow(datos);
        }
                
        this.jTableAlquiler.setModel(tablaAlquiler);
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
        jLabelAceptar.setText("Aceptar");
        jTextFieldNumAlquiler.setText("1");
        jTextFieldSemestre.setText("1");
        jComboBoxMonto.removeAllItems();
        comboMonto.addElement("Seleccione una opción");
        jComboBoxMonto.setModel(comboMonto);
        jDateChooserFecha.setDate(null);
        jTextFieldOtraFactura.setText("0");
        jTextFieldTotal.setText("0");
        jTextAreaDescripcion.setText(null);
        cargarComboInquilino(idEdificio, 0);
        cargarCombos(0,0);
        limpiarTabla();
        cargarComboAnio();
        
        jDateChooserFecha.requestFocus();
        icono("afuera");
    }
    
    public void limpiarTabla(){
        int tamanio = tablaAlquiler.getRowCount();
        
        for(int i = 0; i < tamanio; i++){
            tablaAlquiler.removeRow(0);
        }
        
        this.jTableAlquiler.setModel(tablaAlquiler);
    }
    
    public void cargarComboInquilino(long idEdificio, long idInquilino){
        List<Logica.Inquilino> inquilinos = new LinkedList();
        jComboBoxInquilino.removeAllItems();
        
        if(idInquilino != 0){
            inquilinos.add(unaControladora.obtenerInquilino(idInquilino));
            Collections.sort(inquilinos, (Logica.Inquilino i1, Logica.Inquilino a2) -> i1.getApellido().compareTo(a2.getApellido()));
        }else{
            //inquilinos = unaControladora.obtenerInquilinosSinAlquiler(idEdificio);
            inquilinos = unaControladora.obtenerInquilinosEdificio(idEdificio);
            comboInquilino.addElement("Seleccione una opción");
            Collections.sort(inquilinos, (Logica.Inquilino i1, Logica.Inquilino a2) -> i1.getApellido().compareTo(a2.getApellido()));
        }
        
        for(Logica.Inquilino unInquilino : inquilinos){
            comboInquilino.addElement(unInquilino);
        }
        
        this.jComboBoxInquilino.setModel(comboInquilino);
    }
    
    public void cargarCombos(long idInquilino, int nuevoAlqui){
        jComboBoxDepartamento.removeAllItems();
        jComboBoxCochera.removeAllItems();
        
        if(idInquilino != 0){
            Logica.Departamento unDepartamento = unaControladora.obtenerDepartamentoInquilino(idEdificio, idInquilino);
            if(unDepartamento != null){
                comboDepartamento.addElement(unDepartamento);
            }else{
                comboDepartamento.addElement("Sin Departamento.");
            }

            Logica.Cochera unaCochera = unaControladora.obtenerCocheraInquilino(idEdificio, idInquilino);
            if(unaCochera != null){
                comboCochera.addElement(unaCochera);
                precioCochera = unaCochera.getPrecio();
            }else{
                precioCochera = 0;
                comboCochera.addElement("Sin Cochera.");
            }
            
            if(nuevoAlqui == 1){
                jComboBoxMonto.removeAllItems();
                jComboBoxMonto.addItem("Seleccione una opción");
                for (int i = 0; i < 4; i++) {
                    jComboBoxMonto.addItem(String.valueOf(unaControladora.obtenerInquilino(idInquilino).getImpSemestres()[i]));
                }
            }
            
            actualizarTotal();
        }else{
            comboDepartamento.addElement("Seleccione una opción");
            comboCochera.addElement("Seleccione una opción");
        }
        
        this.jComboBoxDepartamento.setModel(comboDepartamento);
        this.jComboBoxCochera.setModel(comboCochera);
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
    
    public void actualizarTotal(){
        float monto;
        if(jComboBoxMonto.getSelectedIndex() == 0){
            monto = 0;
        }else{
            monto = Float.valueOf(String.valueOf(jComboBoxMonto.getSelectedItem()));
        }
        
        float tot = precioCochera + monto;
        jTextFieldTotal.setText(String.valueOf(tot));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxAnio;
    private javax.swing.JComboBox<String> jComboBoxCochera;
    private javax.swing.JComboBox<String> jComboBoxDepartamento;
    private javax.swing.JComboBox<String> jComboBoxInquilino;
    private javax.swing.JComboBox<String> jComboBoxMesBusqueda;
    private javax.swing.JComboBox<String> jComboBoxMonto;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelCochera;
    private javax.swing.JLabel jLabelDepartamento;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelInquilino;
    private javax.swing.JLabel jLabelMonto;
    private javax.swing.JLabel jLabelNAlquiler;
    private javax.swing.JLabel jLabelOtraFactura;
    private javax.swing.JLabel jLabelRefresh;
    private javax.swing.JLabel jLabelSemestre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelButtonAgregar;
    private javax.swing.JPanel jPanelButtonBuscar;
    private javax.swing.JPanel jPanelButtonEliminar;
    private javax.swing.JPanel jPanelButtonRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparatorMonto1;
    private javax.swing.JSeparator jSeparatorMonto2;
    private javax.swing.JTable jTableAlquiler;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldNumAlquiler;
    private javax.swing.JTextField jTextFieldOtraFactura;
    private javax.swing.JTextField jTextFieldSemestre;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
