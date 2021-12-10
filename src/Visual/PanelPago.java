package Visual;

import java.awt.Color;
import java.util.Date;
import java.util.List;
import java.awt.event.ItemEvent;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import static java.awt.event.KeyEvent.VK_PERIOD;
import static java.awt.event.KeyEvent.VK_SPACE;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import java.text.DecimalFormat;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public final class PanelPago extends javax.swing.JPanel {
    private final long idEdificio;
    private long idPago = 0, idInquilino = 0;
    private DecimalFormat formatoDecimal = new DecimalFormat("#0.00");
    private final ControladoraV unaControladora = new ControladoraV();
    private boolean modificar = false, eliminar = false, entro = false;
    private final DefaultComboBoxModel comboInquilino = new DefaultComboBoxModel();
    private final DefaultComboBoxModel comboBusquedaInquilino = new DefaultComboBoxModel();
    private final DefaultComboBoxModel comboAlquiler = new DefaultComboBoxModel();
    private final DefaultComboBoxModel comboAnio = new DefaultComboBoxModel();
    private final String colTablaPago[] = {"Id", "Fecha", "Inquilino", "Alquiler", "Departamento", "Cochera", "Efectivo", "Banco", "Tarjeta", "Total", "Descripción"};
    private final DefaultTableModel tablaPago = new DefaultTableModel(null, colTablaPago);
    
    public PanelPago(long idEdificio) {
        initComponents();
        this.idEdificio = idEdificio;
        cargarComboInquilino();
        cargarTablaPago(0,0);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTarjeta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEfectivo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldBanco = new javax.swing.JTextField();
        jComboBoxInquilino = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxAlquiler = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldTotalAlquiler = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldSaldoMesAnterior = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldMontoExpensa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldInteres = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePago = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanelButtonEliminar = new javax.swing.JPanel();
        jLabelEliminar = new javax.swing.JLabel();
        jPanelButtonAceptar = new javax.swing.JPanel();
        jLabelAceptar = new javax.swing.JLabel();
        jPanelButtonBuscar = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();
        jComboBoxBusquedaInquilino = new javax.swing.JComboBox<>();
        jComboBoxAnio = new javax.swing.JComboBox<>();
        jPanelButtonRefresh = new javax.swing.JPanel();
        jLabelRefresh = new javax.swing.JLabel();
        jTextFieldDepartamento = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jTextFieldCochera = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabelCochera = new javax.swing.JLabel();
        jLabelOtros = new javax.swing.JLabel();
        jTextFieldOtros = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Pago");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Fecha");

        jDateChooserFecha.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserFecha.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jDateChooserFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDateChooserFechaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Inquilino");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setText("Efectivo");

        jTextFieldTarjeta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldTarjeta.setText("0");
        jTextFieldTarjeta.setBorder(null);
        jTextFieldTarjeta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldTarjetaFocusLost(evt);
            }
        });
        jTextFieldTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldTarjetaMouseClicked(evt);
            }
        });
        jTextFieldTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTarjetaKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setText("Tarjeta");

        jTextFieldEfectivo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldEfectivo.setText("0");
        jTextFieldEfectivo.setBorder(null);
        jTextFieldEfectivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEfectivoFocusLost(evt);
            }
        });
        jTextFieldEfectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldEfectivoMouseClicked(evt);
            }
        });
        jTextFieldEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEfectivoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("Banco");

        jTextFieldBanco.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldBanco.setText("0");
        jTextFieldBanco.setBorder(null);
        jTextFieldBanco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldBancoFocusLost(evt);
            }
        });
        jTextFieldBanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldBancoMouseClicked(evt);
            }
        });
        jTextFieldBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBancoKeyTyped(evt);
            }
        });

        jComboBoxInquilino.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxInquilino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción." }));
        jComboBoxInquilino.setBorder(null);
        jComboBoxInquilino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxInquilinoItemStateChanged(evt);
            }
        });
        jComboBoxInquilino.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxInquilinoFocusGained(evt);
            }
        });
        jComboBoxInquilino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBoxInquilinoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setText("Departamento");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setText("Alquiler");

        jComboBoxAlquiler.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxAlquiler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción." }));
        jComboBoxAlquiler.setBorder(null);
        jComboBoxAlquiler.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAlquilerItemStateChanged(evt);
            }
        });
        jComboBoxAlquiler.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBoxAlquilerKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setText("Total Alquiler");

        jTextFieldTotalAlquiler.setEditable(false);
        jTextFieldTotalAlquiler.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldTotalAlquiler.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldTotalAlquiler.setBorder(null);
        jTextFieldTotalAlquiler.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldTotalAlquiler.setFocusable(false);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setText("Saldo mes ant.");

        jTextFieldSaldoMesAnterior.setEditable(false);
        jTextFieldSaldoMesAnterior.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldSaldoMesAnterior.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldSaldoMesAnterior.setBorder(null);
        jTextFieldSaldoMesAnterior.setFocusable(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel13.setText("Expensa");

        jTextFieldMontoExpensa.setEditable(false);
        jTextFieldMontoExpensa.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldMontoExpensa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldMontoExpensa.setBorder(null);
        jTextFieldMontoExpensa.setFocusable(false);

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel14.setText("Interés");

        jTextFieldInteres.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldInteres.setBorder(null);
        jTextFieldInteres.setPreferredSize(new java.awt.Dimension(2, 20));
        jTextFieldInteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldInteresKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldInteresKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel15.setText("Total");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldTotal.setBorder(null);
        jTextFieldTotal.setFocusable(false);
        jTextFieldTotal.setPreferredSize(new java.awt.Dimension(0, 20));

        jLabelDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelDescripcion.setText("Descripción");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextAreaDescripcion.setRows(1);
        jScrollPane2.setViewportView(jTextAreaDescripcion);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jTablePago.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTablePago = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        jTablePago.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePago.setGridColor(new java.awt.Color(255, 255, 255));
        jTablePago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePagoMouseClicked(evt);
            }
        });
        jTablePago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTablePagoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePago);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanelButtonEliminar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jPanelButtonAceptar.setBackground(new java.awt.Color(51, 51, 51));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jComboBoxBusquedaInquilino.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxBusquedaInquilino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción." }));
        jComboBoxBusquedaInquilino.setBorder(null);

        jComboBoxAnio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione año.", "2018" }));
        jComboBoxAnio.setBorder(null);
        jComboBoxAnio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jComboBoxBusquedaInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBoxBusquedaInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

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

        jTextFieldDepartamento.setEditable(false);
        jTextFieldDepartamento.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldDepartamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldDepartamento.setBorder(null);
        jTextFieldDepartamento.setFocusable(false);

        jTextFieldCochera.setEditable(false);
        jTextFieldCochera.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldCochera.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldCochera.setBorder(null);
        jTextFieldCochera.setFocusable(false);

        jLabelCochera.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelCochera.setText("Cochera");

        jLabelOtros.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabelOtros.setText("Otros");

        jTextFieldOtros.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldOtros.setBorder(null);
        jTextFieldOtros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldOtrosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldOtrosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabelDescripcion)
                                    .addComponent(jLabel10))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator11)
                                    .addComponent(jTextFieldEfectivo))
                                .addGap(72, 72, 72)
                                .addComponent(jLabel5)
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTarjeta)
                                    .addComponent(jSeparator10))
                                .addGap(62, 62, 62)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator9)
                                    .addComponent(jTextFieldBanco)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4)
                                    .addComponent(jTextFieldSaldoMesAnterior)
                                    .addComponent(jComboBoxAlquiler, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldDepartamento)
                                    .addComponent(jDateChooserFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldInteres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabelOtros)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator8)
                                            .addComponent(jTextFieldOtros))))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabelCochera)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel15))
                                        .addGap(13, 13, 13)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBoxInquilino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator6)
                                    .addComponent(jSeparator3)
                                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator7)
                                    .addComponent(jTextFieldMontoExpensa, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldTotalAlquiler, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldCochera, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jScrollPane2))))
                .addGap(22, 22, 22))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanelButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelCochera)
                    .addComponent(jTextFieldCochera, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldTotalAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldMontoExpensa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldSaldoMesAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jTextFieldInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelOtros)
                                    .addComponent(jTextFieldOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescripcion)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePagoMouseClicked
        int fila = jTablePago.getSelectedRow();
        
        if(fila >= 0){
            idPago = Long.parseLong(tablaPago.getValueAt(fila, 0).toString());
            idInquilino = unaControladora.obtenerInquilinoPago(idEdificio, idPago).getId();
            if(evt.getClickCount() == 1){
                eliminar = true;
            }else if(evt.getClickCount() == 2){
                eliminar = false;
                cargarPanelDatos(idPago);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila valida.", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTablePagoMouseClicked
    
    private void jPanelButtonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAceptarMouseClicked
        if(validar()){
            try {
                SimpleDateFormat formatoMes = new SimpleDateFormat("MM"), formatoAnio = new SimpleDateFormat("yyyy");
                Logica.Inquilino unInquilino = (Logica.Inquilino) comboInquilino.getElementAt(jComboBoxInquilino.getSelectedIndex());
                Logica.Alquiler unAlquiler = (Logica.Alquiler) comboAlquiler.getElementAt(jComboBoxAlquiler.getSelectedIndex());
                long idExp = 0;
                if(unAlquiler.getDepartamento() > 0){
                    Logica.Expensa unaExpensa = unaControladora.obtenerExpensa(unAlquiler.getDepartamento(), Integer.valueOf(formatoMes.format(unAlquiler.getFecha())), Integer.valueOf(formatoAnio.format(unAlquiler.getFecha())));
                    if(unaExpensa != null){
                        idExp = unaExpensa.getId();
                    }
                }
                        
                long idAlquiler = unAlquiler.getId();
                Date fechaPago = jDateChooserFecha.getDate();
                float interesPorAtraso = 0;
                if(!jTextFieldInteres.getText().isEmpty()){
                    interesPorAtraso = Float.valueOf(unaControladora.reemplazarString(jTextFieldInteres.getText()));
                }
                float total = Float.valueOf(unaControladora.reemplazarString(jTextFieldTotal.getText()));
                float otros = Float.valueOf(unaControladora.reemplazarString(jTextFieldOtros.getText()));
                float efectivo = Float.valueOf(jTextFieldEfectivo.getText());
                float tarjeta = Float.valueOf(jTextFieldTarjeta.getText());
                float banco = Float.valueOf(jTextFieldBanco.getText());
                float saldoMesAnt = Float.valueOf(unaControladora.reemplazarString(jTextFieldSaldoMesAnterior.getText()));
                
                if(!modificar){
                    unaControladora.altaPago(fechaPago, efectivo, tarjeta, banco, saldoMesAnt, interesPorAtraso, total, otros, jTextAreaDescripcion.getText(), idAlquiler, idExp, unInquilino.getId());
                }else{
                    int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(confirmacion == 0){
                        unaControladora.modificarPago(idPago, fechaPago, efectivo, tarjeta, banco, saldoMesAnt, interesPorAtraso, total, otros, jTextAreaDescripcion.getText(), idAlquiler, idExp, unInquilino.getId());
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(Logica.Pago.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación.", "", JOptionPane.ERROR_MESSAGE);
            }
            limpiarComponentes();
        }
        
        cargarTablaPago(0, 0);
    }//GEN-LAST:event_jPanelButtonAceptarMouseClicked

    private void jPanelButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonEliminarMouseClicked
        if(eliminar){
            try{
                if(unaControladora.obtenerPagosInquilino(idInquilino).get(unaControladora.obtenerPagosInquilino(idInquilino).size()-1).getId() == idPago){
                    int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(confirmacion == 0){
                        unaControladora.bajaPago(idPago, idEdificio);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No es posible eliminar el Pago.");
                }
            }catch(Exception ex){
                Logger.getLogger(Logica.Pago.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar. Ha ocurrido un error: "+ex, "", JOptionPane.ERROR_MESSAGE);
            }
            
            cargarTablaPago(0, 0);
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Pago de la tabla.", "", JOptionPane.WARNING_MESSAGE);
        }
        eliminar = false;
    }//GEN-LAST:event_jPanelButtonEliminarMouseClicked

    private void jPanelButtonAceptarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAceptarMouseMoved
        this.jPanelButtonAceptar.setBackground(new Color(255,255,255));
        this.jPanelButtonAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelAceptar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonAceptarMouseMoved

    private void jPanelButtonEliminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonEliminarMouseMoved
        this.jPanelButtonEliminar.setBackground(new Color(255,255,255));
        this.jPanelButtonEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelEliminar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonEliminarMouseMoved

    private void jPanelButtonAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAceptarMouseExited
        this.jPanelButtonAceptar.setBackground(new Color(51,51,51));
        this.jLabelAceptar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonAceptarMouseExited

    private void jPanelButtonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonEliminarMouseExited
        this.jPanelButtonEliminar.setBackground(new Color(51,51,51));
        this.jLabelEliminar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonEliminarMouseExited

    private void jTextFieldInteresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldInteresKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAceptarMouseClicked(null);
        }else if(Character.isLetter(evt.getKeyChar())){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldInteresKeyTyped

    private void jTextFieldEfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEfectivoKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAceptarMouseClicked(null);
        }else if(Character.isLetter(evt.getKeyChar())){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldEfectivoKeyTyped

    private void jTextFieldTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTarjetaKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAceptarMouseClicked(null);
        }else if(Character.isLetter(evt.getKeyChar())){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldTarjetaKeyTyped

    private void jTextFieldBancoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBancoKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAceptarMouseClicked(null);
        }else if(Character.isLetter(evt.getKeyChar())){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldBancoKeyTyped

    private void jComboBoxInquilinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxInquilinoItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(jComboBoxInquilino.getSelectedIndex() > 0){
                Logica.Inquilino unInquilino = (Logica.Inquilino)jComboBoxInquilino.getSelectedItem();
                jTextFieldDepartamento.setText(null);
                jTextFieldCochera.setText(null);
                Logica.Departamento unDeptoInquilino = unaControladora.obtenerDepartamentoInquilino(idEdificio, unInquilino.getId());
                if(unDeptoInquilino != null){
                    jTextFieldDepartamento.setText(unDeptoInquilino.getUbicacion());
                    }else{
                    jTextFieldDepartamento.setText("Sin Departamento.");
                }

                if(unaControladora.obtenerCocheraInquilino(idEdificio, unInquilino.getId()) != null){
                    jTextFieldCochera.setText(unaControladora.obtenerCocheraInquilino(idEdificio,unInquilino.getId()).getUbicacion());
                }else{
                    jTextFieldCochera.setText("Sin Cochera.");
                }

                comboAlquiler.removeAllElements();
                comboAlquiler.addElement("Seleccione una opción.");
                List<Logica.Alquiler> alquileresInpagos = unaControladora.obtenerAlquileresInpagos(unInquilino.getId());
                if(alquileresInpagos.size() > 0){
                    Collections.sort(alquileresInpagos, (Logica.Alquiler a1, Logica.Alquiler a2) -> a1.getFecha().compareTo(a2.getFecha()));
                    for(Logica.Alquiler unAlquiler : alquileresInpagos){
                        comboAlquiler.addElement(unAlquiler);
                    }

                    jComboBoxAlquiler.setModel(comboAlquiler);
                }
            }
        }
        
        entro = false;
    }//GEN-LAST:event_jComboBoxInquilinoItemStateChanged

    private void jComboBoxAlquilerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAlquilerItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(jComboBoxAlquiler.getSelectedIndex() > 0){
                Date fechaActual = jDateChooserFecha.getDate();
                float montoExpensa = 0, saldoMesAnt = 0, interes = 0, otros = 0;
                boolean bandera = false;
                SimpleDateFormat formatoAnio = new SimpleDateFormat("yyyy"), 
                                 formatoMes = new SimpleDateFormat("MM");
                float totalPago = 0;
                int mes, anio;

                Logica.Alquiler unAlquiler = (Logica.Alquiler)jComboBoxAlquiler.getSelectedItem();

                mes = Integer.parseInt(formatoMes.format(unAlquiler.getFecha()));
                anio = Integer.valueOf(formatoAnio.format(unAlquiler.getFecha()));

                Logica.Inquilino unInquilino = (Logica.Inquilino)jComboBoxInquilino.getSelectedItem();
                Logica.Departamento unDepartamento = unaControladora.obtenerDepartamento(idEdificio, jTextFieldDepartamento.getText());

                if(unAlquiler.getCochera() != 0){
                    jTextFieldCochera.setText(unaControladora.obtenerCochera(unAlquiler.getCochera()).getUbicacion());
                }else{
                    jTextFieldCochera.setText("Sin Cochera.");
                }

                if(unDepartamento != null){
                    Logica.Expensa unaExpensa = unaControladora.obtenerExpensa(unDepartamento.getId(), mes, anio);
                    if(unaExpensa != null){
                        montoExpensa = unaExpensa.getMonto();
                    }else{
                        if(mes == 1){
                            mes = 12;
                        }else{
                            mes-=1;
                        }
                        JOptionPane.showMessageDialog(null, "No es posible generar el Pago. Debido a que no existe una Expensa del mes: "+mes+", para el Departamento: "+unDepartamento.getUbicacion(),"",JOptionPane.WARNING_MESSAGE);
                    }
                }
                
                jTextFieldMontoExpensa.setText(formatoDecimal.format(montoExpensa));

                jTextFieldTotalAlquiler.setText(formatoDecimal.format(unAlquiler.getTotal()));
                saldoMesAnt = unaControladora.obtenerSaldoMesAnterior(idEdificio, unInquilino.getId(), Integer.valueOf(formatoMes.format(unAlquiler.getFecha())), Integer.valueOf(formatoAnio.format(unAlquiler.getFecha())));
                
                jTextFieldSaldoMesAnterior.setText(formatoDecimal.format(saldoMesAnt));
                totalPago = unAlquiler.getTotal()+montoExpensa; 
                interes = unaControladora.interesesPorAtraso(fechaActual, unAlquiler.getFecha(), totalPago);
                jTextFieldInteres.setText(formatoDecimal.format(interes));
                jTextFieldOtros.setText(formatoDecimal.format(otros));
                totalPago += interes;
                totalPago += saldoMesAnt;
                jTextFieldTotal.setText(formatoDecimal.format(totalPago));
            }
        }
        entro = false;
    }//GEN-LAST:event_jComboBoxAlquilerItemStateChanged

    private void jPanelButtonRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseClicked
        if(modificar){
            modificar = false;
        }
        limpiarComponentes();
        cargarTablaPago(0,0);
    }//GEN-LAST:event_jPanelButtonRefreshMouseClicked

    private void jPanelButtonRefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseEntered
        icono("adentro");
    }//GEN-LAST:event_jPanelButtonRefreshMouseEntered

    private void jPanelButtonRefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseExited
        icono("afuera");
    }//GEN-LAST:event_jPanelButtonRefreshMouseExited

    private void jPanelButtonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseClicked
        if(jComboBoxAnio.getSelectedIndex() == 0 && jComboBoxBusquedaInquilino.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Seleccione datos a buscar.", "", JOptionPane.WARNING_MESSAGE);
        }else{
            Logica.Inquilino unInquilino = (Logica.Inquilino)jComboBoxBusquedaInquilino.getSelectedItem();
            int anio = Integer.valueOf(String.valueOf(jComboBoxAnio.getSelectedItem()));
            cargarTablaPago(unInquilino.getId(), anio);
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

    private void jTextFieldEfectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldEfectivoMouseClicked
        jTextFieldEfectivo.setText(null);
    }//GEN-LAST:event_jTextFieldEfectivoMouseClicked

    private void jTextFieldTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldTarjetaMouseClicked
        jTextFieldTarjeta.setText(null);
    }//GEN-LAST:event_jTextFieldTarjetaMouseClicked

    private void jTextFieldBancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBancoMouseClicked
        jTextFieldBanco.setText(null);
    }//GEN-LAST:event_jTextFieldBancoMouseClicked

    private void jTextFieldEfectivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEfectivoFocusLost
        if(jTextFieldEfectivo.getText().isEmpty()){
            jTextFieldEfectivo.setText("0");
        }
    }//GEN-LAST:event_jTextFieldEfectivoFocusLost

    private void jTextFieldTarjetaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTarjetaFocusLost
        if(jTextFieldTarjeta.getText().isEmpty()){
            jTextFieldTarjeta.setText("0");
        }
    }//GEN-LAST:event_jTextFieldTarjetaFocusLost

    private void jTextFieldBancoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBancoFocusLost
        if(jTextFieldBanco.getText().isEmpty()){
            jTextFieldBanco.setText("0");
        }
    }//GEN-LAST:event_jTextFieldBancoFocusLost

    private void jDateChooserFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserFechaKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAceptarMouseClicked(null);
        }else if(!Character.isDigit(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_PERIOD) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jDateChooserFechaKeyTyped

    private void jComboBoxInquilinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxInquilinoKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAceptarMouseClicked(null);
        }
    }//GEN-LAST:event_jComboBoxInquilinoKeyTyped

    private void jComboBoxAlquilerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxAlquilerKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAceptarMouseClicked(null);
        }
    }//GEN-LAST:event_jComboBoxAlquilerKeyTyped

    private void jComboBoxInquilinoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxInquilinoFocusGained
        if(jDateChooserFecha == null){
            jDateChooserFecha.requestFocus();
            JOptionPane.showMessageDialog(null, "Debe ingresar una Fecha para continuar.", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jComboBoxInquilinoFocusGained

    private void jTablePagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTablePagoKeyTyped
        if (evt.getKeyChar() == evt.VK_DELETE) {
            jPanelButtonEliminarMouseClicked(null);
        }
    }//GEN-LAST:event_jTablePagoKeyTyped

    private void jTextFieldInteresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldInteresKeyReleased
        actualizarTotal();
    }//GEN-LAST:event_jTextFieldInteresKeyReleased

    private void jTextFieldOtrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldOtrosKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAceptarMouseClicked(null);
        }else if(Character.isLetter(evt.getKeyChar())){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldOtrosKeyTyped

    private void jTextFieldOtrosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldOtrosKeyReleased
        actualizarTotal();
    }//GEN-LAST:event_jTextFieldOtrosKeyReleased

    public void cargarComboInquilino(){
        List<Logica.Inquilino> inquilinosSinPago = unaControladora.obtenerInquilinosSinPago(idEdificio);
        jComboBoxInquilino.removeAllItems();
        jComboBoxBusquedaInquilino.removeAllItems();
        comboInquilino.addElement("Seleccione una opción.");
        for(Logica.Inquilino unInquilino : inquilinosSinPago){
            comboInquilino.addElement(unInquilino);
        }
        
        for(Logica.Inquilino unInquilino : unaControladora.obtenerInquilinosEdificio(idEdificio)){
            comboBusquedaInquilino.addElement(unInquilino);
        }
        
        jComboBoxInquilino.setModel(comboInquilino);
        jComboBoxBusquedaInquilino.setModel(comboBusquedaInquilino);
    }
    
    public void cargarTablaPago(long idInquilino, int anio){
        limpiarTabla();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy"),
                         monthFormat = new SimpleDateFormat("MM"),
                         yearFormat = new SimpleDateFormat("yyyy");
        Date fechaActual = new Date();
        int anioPago, mesPago,
            mesActual = Integer.valueOf(monthFormat.format(fechaActual)),
            anioActual = Integer.valueOf(yearFormat.format(fechaActual));
        List<Logica.Pago> pagos = new LinkedList();
        Object datos[] = new Object[11];
        
        if(idInquilino > 0 && anio > 0){ 
            List<Logica.Pago> pagosInquilino = unaControladora.obtenerPagosInquilino(idInquilino);
            for(Logica.Pago unPago : pagosInquilino){
                anioPago = Integer.valueOf(yearFormat.format(unPago.getFecha()));
                if(anioPago == anio){
                    pagos.add(unPago);
                }
            }
            
            if(pagos.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ha encontrado Pagos.", "", JOptionPane.ERROR_MESSAGE);
                for(Logica.Pago unPago : unaControladora.obtenerPagosEdificio(idEdificio)){
                    anioPago = Integer.valueOf(yearFormat.format(unPago.getFecha()));
                    mesPago = Integer.valueOf(monthFormat.format(unPago.getFecha()));
                    if(anioPago == anioActual && mesPago == mesActual){
                        pagos.add(unPago);
                    }
                }
            }
            
        }else{
            for(Logica.Pago unPago : unaControladora.obtenerPagosEdificio(idEdificio)){
                pagos.add(unPago);
            }
        }
        
        for(Logica.Pago unPago : pagos){
            datos[0] = unPago.getId();
            datos[1] = formatoFecha.format(unPago.getFecha());
            
            Logica.Inquilino unInquilino = unaControladora.obtenerInquilinoPago(idEdificio, unPago.getId());
            datos[2] = unInquilino.getApellido()+", "+unInquilino.getNombre();
            
            datos[3] = unaControladora.obtenerAlquiler(unPago.getIdAlquiler());
            
            if(unaControladora.obtenerDepartamentoInquilino(idEdificio, unInquilino.getId()) != null){
                datos[4] = unaControladora.obtenerDepartamentoInquilino(idEdificio, unInquilino.getId());
            }else{
                datos[4] = "";
            }
            
            if(unaControladora.obtenerCocheraInquilino(idEdificio, unInquilino.getId()) != null){
                datos[5] = unaControladora.obtenerCocheraInquilino(idEdificio, unInquilino.getId());
            }else{
                datos[5] = ""; 
            }
            datos[6] = unPago.getEfectivo();
            datos[7] = unPago.getBanco();
            datos[8] = unPago.getTarjeta();
            datos[9] = unPago.getMonto();
            datos[10] = unPago.getDescripcion();
            
            tablaPago.addRow(datos);
        }
        
        this.jTablePago.setModel(tablaPago);
    }
    
    public boolean validar(){
        boolean validar = false;
        Date fecha = jDateChooserFecha.getDate();
        
        if(fecha == null){
            JOptionPane.showMessageDialog(null, "Debe ingresar una Fecha.", "", JOptionPane.WARNING_MESSAGE);
            jDateChooserFecha.requestFocus();
        }else if(jComboBoxInquilino.getSelectedItem().equals("Seleccione una opción.")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Inquilino.", "", JOptionPane.WARNING_MESSAGE);
            jComboBoxInquilino.requestFocus();
        }else if(jComboBoxAlquiler.getSelectedItem().equals("Seleccione una opción.")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Alquiler.", "", JOptionPane.WARNING_MESSAGE);
            jComboBoxAlquiler.requestFocus();
        }else if(Float.valueOf(jTextFieldEfectivo.getText()) == 0 && Float.valueOf(jTextFieldTarjeta.getText()) == 0 && Float.valueOf(jTextFieldBanco.getText()) == 0){
            JOptionPane.showMessageDialog(null, "El pago no puede ser efectuado sin un monto mayor a 0.", "", JOptionPane.WARNING_MESSAGE);
        }else{
            validar = true;
        }
        
        return validar;
    }
    
    private void cargarPanelDatos(long idPago){
        jTextFieldMontoExpensa.setText(null);
        modificar = true;
        Logica.Pago unPago = unaControladora.obtenerPago(idPago);
        Logica.Inquilino unInquilino = unaControladora.obtenerInquilinoPago(idEdificio, idPago);
        Logica.Alquiler unAlquiler = unaControladora.obtenerAlquilerPago(idPago);
        jDateChooserFecha.setDate(unPago.getFecha());
        
        comboInquilino.removeAllElements();
        comboInquilino.addElement(unInquilino);
        jComboBoxInquilino.setModel(comboInquilino);
        
        if(unaControladora.obtenerDepartamento(unAlquiler.getDepartamento()) != null){
            jTextFieldDepartamento.setText(unaControladora.obtenerDepartamento(unAlquiler.getDepartamento()).getUbicacion());
        }else{
            jTextFieldDepartamento.setText("Sin Departamento.");
        }
        if(unaControladora.obtenerCochera(unAlquiler.getCochera()) != null){
            jTextFieldCochera.setText(unaControladora.obtenerCochera(unAlquiler.getCochera()).getUbicacion());
        }else{
            jTextFieldCochera.setText("Sin Cochera.");
        }
        
        comboAlquiler.removeAllElements();
        comboAlquiler.addElement(unAlquiler);
        jComboBoxAlquiler.setModel(comboAlquiler);
        
        jTextFieldTotalAlquiler.setText(String.valueOf(unAlquiler.getTotal()));
        jTextFieldSaldoMesAnterior.setText(formatoDecimal.format(unPago.getSaldo()));
        if(unPago.getIdExpensa() != 0){
            Logica.Expensa unaExpensaPaga = unaControladora.obtenerExpensa(unPago.getIdExpensa());
            if(unaExpensaPaga != null){
                jTextFieldMontoExpensa.setText(formatoDecimal.format(unaExpensaPaga.getMonto()));
            }else{
                jTextFieldMontoExpensa.setText("0.00");
            }
        }
        jTextFieldInteres.setText(formatoDecimal.format(unPago.getInteresPorAtraso()));
        
        jTextFieldTotal.setText(formatoDecimal.format(unPago.getMonto()));
        jTextFieldOtros.setText(String.valueOf(unPago.getOtros()));
        jTextAreaDescripcion.setText(unPago.getDescripcion());
        jTextFieldBanco.setText(String.valueOf(unPago.getBanco()));
        jTextFieldEfectivo.setText(String.valueOf(unPago.getEfectivo()));
        jTextFieldTarjeta.setText(String.valueOf(unPago.getTarjeta()));
        
        icono("afuera");
        jLabelAceptar.setText("Actualizar");
    }
    
    private void limpiarComponentes(){
        jDateChooserFecha.setDate(null);
        jLabelAceptar.setText("Aceptar");
        jTextFieldBanco.setText("0");
        jTextFieldEfectivo.setText("0");
        jTextFieldCochera.setText(null);
        jTextFieldInteres.setText(null);
        jTextFieldTotalAlquiler.setText(null);
        jTextFieldMontoExpensa.setText(null);
        jTextFieldSaldoMesAnterior.setText(null);
        jTextFieldTarjeta.setText("0");
        jTextFieldOtros.setText(null);
        jTextFieldTotal.setText(null);
        jTextFieldDepartamento.setText(null);
        
        cargarComboInquilino();
        jComboBoxAlquiler.removeAllItems();
        comboAlquiler.addElement("Seleccione una opción.");
        
        limpiarTabla();
        
        jDateChooserFecha.requestFocus();
    }
    
    public void limpiarTabla(){
        int tamanio = tablaPago.getRowCount();
        
        for(int i = 0; i < tamanio; i++){
            tablaPago.removeRow(0);
        }
        
        this.jTablePago.setModel(tablaPago);
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
    
    public void cargarComboAnio(){
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        Date fechaActual = new Date();
        int anioActual = Integer.valueOf(yearFormat.format(fechaActual));
        
        if(anioActual > 2018){
            for(int i = 2018; i < anioActual;i++){
                comboAnio.addElement(i);
            }
        }
    }
    
    public void actualizarTotal(){
        float total = Float.valueOf(unaControladora.reemplazarString(jTextFieldTotalAlquiler.getText()))+Float.valueOf(unaControladora.reemplazarString(jTextFieldSaldoMesAnterior.getText()))+Float.valueOf(unaControladora.reemplazarString(jTextFieldMontoExpensa.getText()));
        
        if(!jTextFieldInteres.getText().isEmpty()){
            total += Float.valueOf(unaControladora.reemplazarString(jTextFieldInteres.getText()));
        }
        
        if(!jTextFieldOtros.getText().isEmpty()){
            total += Float.valueOf(unaControladora.reemplazarString(jTextFieldOtros.getText()));
        }
        
        jTextFieldTotal.setText(formatoDecimal.format(total));
    }
    
    public Logica.Expensa obtenerUltimoPagoExpensa(Logica.Pago ultimoPago, Logica.Departamento deptoInquilino){
        Logica.Expensa expensaBuscada = null;
        Logica.Alquiler ultimoAlquilerPagado = unaControladora.obtenerAlquiler(ultimoPago.getIdAlquiler());
        int[] periodos = new int[2];
        periodos = ultimoAlquilerPagado.getGeneracionAuto();
        if(periodos[0] == 6 && periodos[1] == 4){
            Logica.Expensa ultimaExpensa = unaControladora.obtenerUltimaExpensa(deptoInquilino.getId());
            if(ultimoPago.getIdExpensa() != ultimaExpensa.getId()){
                Logica.Expensa ultimaExpensaPaga = unaControladora.obtenerExpensa(ultimoPago.getIdExpensa());
                if(ultimaExpensa.getMes() > ultimaExpensaPaga.getMes() && ultimaExpensa.getAnio() >= ultimaExpensaPaga.getAnio()){
                    expensaBuscada = ultimaExpensa;
                }
            }
        }
        
        return expensaBuscada;
    }
    
    public long calcularTiempo(Date fechaAlquiler, Date fechaActual){        
        long difDias = ((fechaActual.getTime()-fechaAlquiler.getTime())/86400000);
        
        return difDias;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxAlquiler;
    private javax.swing.JComboBox<String> jComboBoxAnio;
    private javax.swing.JComboBox<String> jComboBoxBusquedaInquilino;
    private javax.swing.JComboBox<String> jComboBoxInquilino;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelCochera;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelOtros;
    private javax.swing.JLabel jLabelRefresh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelButtonAceptar;
    private javax.swing.JPanel jPanelButtonBuscar;
    private javax.swing.JPanel jPanelButtonEliminar;
    private javax.swing.JPanel jPanelButtonRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTablePago;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldBanco;
    private javax.swing.JTextField jTextFieldCochera;
    private javax.swing.JTextField jTextFieldDepartamento;
    private javax.swing.JTextField jTextFieldEfectivo;
    private javax.swing.JTextField jTextFieldInteres;
    private javax.swing.JTextField jTextFieldMontoExpensa;
    private javax.swing.JTextField jTextFieldOtros;
    private javax.swing.JTextField jTextFieldSaldoMesAnterior;
    private javax.swing.JTextField jTextFieldTarjeta;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldTotalAlquiler;
    // End of variables declaration//GEN-END:variables
}
