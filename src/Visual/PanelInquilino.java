package Visual;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.util.List;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import static java.awt.event.KeyEvent.VK_MINUS;
import static java.awt.event.KeyEvent.VK_SPACE;
import static java.awt.event.KeyEvent.VK_PERIOD;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import java.util.Collections;

public final class PanelInquilino extends javax.swing.JPanel {
    private TableModel modelo;
    private final long idEdificio;
    private boolean modificar = false, eliminar = false;
    private long idInquilino, idDepartamento = 0, idCochera = 0;
    private final ControladoraV unaControladora = new ControladoraV();
    private final DefaultComboBoxModel comboDepartamento = new DefaultComboBoxModel();
    private final DefaultComboBoxModel comboCochera = new DefaultComboBoxModel();
    private final DefaultComboBoxModel comboSemestre = new DefaultComboBoxModel();
    
    public PanelInquilino(long idEdificio) {
        initComponents();
        this.idEdificio = idEdificio;
        cargarComboDepartamento(idEdificio);
        cargarComboCochera(idEdificio);
        cargarTablaInquilino("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelDni = new javax.swing.JLabel();
        jTextFieldDni = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldCuit = new javax.swing.JTextField();
        jLabelCuit = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelCantFamiliares = new javax.swing.JLabel();
        jTextFieldCantFamiliares = new javax.swing.JTextField();
        jLabelDepartamento = new javax.swing.JLabel();
        jComboBoxDepartamento = new javax.swing.JComboBox<>();
        jSeparatorNombre = new javax.swing.JSeparator();
        jSeparatorApellido = new javax.swing.JSeparator();
        jSeparatorDni = new javax.swing.JSeparator();
        jSeparatorCuit = new javax.swing.JSeparator();
        jSeparatorEmail = new javax.swing.JSeparator();
        jSeparatorTelefono = new javax.swing.JSeparator();
        jSeparatorCantFamiliares = new javax.swing.JSeparator();
        jLabelSemestres = new javax.swing.JLabel();
        jComboBoxSemestres = new javax.swing.JComboBox<>();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jPanelButtonRefrescar = new javax.swing.JPanel();
        jLabelRefrescar = new javax.swing.JLabel();
        jLabelCochera = new javax.swing.JLabel();
        jComboBoxCochera = new javax.swing.JComboBox<>();
        jButtonSemestre = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jSeparatorBuscar = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInquilino = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanelButtonEliminar = new javax.swing.JPanel();
        jLabelEliminar = new javax.swing.JLabel();
        jPanelButtonAgregar = new javax.swing.JPanel();
        jLabelAceptar = new javax.swing.JLabel();
        jPanelButtonBuscar = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabelTitulo.setText("Inquilino");

        jLabelNombre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelNombre.setText("Nombre");

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldNombre.setBorder(null);
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jLabelDni.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelDni.setText("DNI");

        jTextFieldDni.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldDni.setBorder(null);
        jTextFieldDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDniKeyTyped(evt);
            }
        });

        jLabelApellido.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelApellido.setText("Apellido");

        jTextFieldApellido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldApellido.setBorder(null);
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });

        jTextFieldCuit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldCuit.setBorder(null);
        jTextFieldCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCuitKeyTyped(evt);
            }
        });

        jLabelCuit.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelCuit.setText("CUIT");

        jLabelTelefono.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelTelefono.setText("Teléfono");

        jTextFieldTelefono.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldTelefono.setBorder(null);
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyTyped(evt);
            }
        });

        jLabelEmail.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelEmail.setText("E-mail");

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldEmail.setBorder(null);
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyTyped(evt);
            }
        });

        jLabelCantFamiliares.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelCantFamiliares.setText("Cant. Personas");

        jTextFieldCantFamiliares.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldCantFamiliares.setBorder(null);
        jTextFieldCantFamiliares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCantFamiliaresKeyTyped(evt);
            }
        });

        jLabelDepartamento.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelDepartamento.setText("Departamento");

        jComboBoxDepartamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Sin departamento" }));
        jComboBoxDepartamento.setBorder(null);
        jComboBoxDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxDepartamentoMouseClicked(evt);
            }
        });

        jLabelSemestres.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelSemestres.setText("Imp. Semestres");

        jComboBoxSemestres.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxSemestres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jComboBoxSemestres.setBorder(null);
        jComboBoxSemestres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxSemestres.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxSemestresItemStateChanged(evt);
            }
        });
        jComboBoxSemestres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxSemestresMouseClicked(evt);
            }
        });
        jComboBoxSemestres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBoxSemestresKeyTyped(evt);
            }
        });

        jLabelDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelDescripcion.setText("Descripción");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextAreaDescripcion.setRows(2);
        jScrollPane2.setViewportView(jTextAreaDescripcion);

        jPanelButtonRefrescar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonRefrescar.setPreferredSize(new java.awt.Dimension(44, 37));
        jPanelButtonRefrescar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelButtonRefrescarMouseMoved(evt);
            }
        });
        jPanelButtonRefrescar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonRefrescarMouseClicked(evt);
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
            .addGroup(jPanelButtonRefrescarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonRefrescarLayout.setVerticalGroup(
            jPanelButtonRefrescarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        jLabelCochera.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelCochera.setText("Cochera");

        jComboBoxCochera.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxCochera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Sin cochera" }));
        jComboBoxCochera.setBorder(null);
        jComboBoxCochera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxCochera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBoxCocheraKeyTyped(evt);
            }
        });

        jButtonSemestre.setText("+");
        jButtonSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSemestreActionPerformed(evt);
            }
        });
        jButtonSemestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButtonSemestreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelButtonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelDni)
                            .addComponent(jLabelTelefono)
                            .addComponent(jLabelCantFamiliares)
                            .addComponent(jLabelSemestres)
                            .addComponent(jLabelDescripcion))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jSeparatorCantFamiliares)
                            .addComponent(jTextFieldCantFamiliares)
                            .addComponent(jSeparatorTelefono)
                            .addComponent(jTextFieldTelefono)
                            .addComponent(jSeparatorDni)
                            .addComponent(jTextFieldDni)
                            .addComponent(jSeparatorNombre)
                            .addComponent(jTextFieldNombre)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxSemestres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(jButtonSemestre)))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCuit)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelDepartamento)
                            .addComponent(jLabelCochera))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxCochera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldCuit)
                            .addComponent(jTextFieldApellido)
                            .addComponent(jTextFieldEmail)
                            .addComponent(jComboBoxDepartamento, 0, 345, Short.MAX_VALUE)
                            .addComponent(jSeparatorApellido)
                            .addComponent(jSeparatorCuit)
                            .addComponent(jSeparatorEmail))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jPanelButtonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparatorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDni))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jTextFieldCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCuit)))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorDni, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparatorCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmail))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparatorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabelCantFamiliares)
                            .addComponent(jTextFieldCantFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDepartamento)
                            .addComponent(jComboBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefono))
                        .addGap(0, 0, 0)
                        .addComponent(jSeparatorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jSeparatorCantFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBoxCochera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCochera)
                    .addComponent(jComboBoxSemestres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSemestres)
                    .addComponent(jButtonSemestre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescripcion)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(582, 315));

        jTextFieldBuscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextFieldBuscar.setText("Ingrese un apellido para buscar");
        jTextFieldBuscar.setBorder(null);
        jTextFieldBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldBuscarMouseClicked(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jTableInquilino.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTableInquilino = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        jTableInquilino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableInquilino.setFillsViewportHeight(true);
        jTableInquilino.getTableHeader().setReorderingAllowed(false);
        jTableInquilino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInquilinoMouseClicked(evt);
            }
        });
        jTableInquilino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableInquilinoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInquilino);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonAgregarLayout.setVerticalGroup(
            jPanelButtonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanelButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanelButtonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonBuscar.setPreferredSize(new java.awt.Dimension(44, 37));
        jPanelButtonBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelButtonBuscarMouseMoved(evt);
            }
        });
        jPanelButtonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonBuscarMouseClicked(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonBuscarLayout.setVerticalGroup(
            jPanelButtonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 659, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparatorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparatorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
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
            try{
                String nombre = jTextFieldNombre.getText().toUpperCase(), 
                dni = jTextFieldDni.getText(),
                telefono = jTextFieldTelefono.getText(),
                cantFamilia = jTextFieldCantFamiliares.getText(), 
                apellido = jTextFieldApellido.getText().toUpperCase(),
                cuit = jTextFieldCuit.getText(),
                email = jTextFieldEmail.getText().toUpperCase();
                float[] impSemestres = new float[4];
                
                for(int i = 1; i < comboSemestre.getSize(); i++){
                    impSemestres[i-1] = (float)comboSemestre.getElementAt(i);
                }
                
                if(!modificar){
                    unaControladora.altaInquilino(Integer.valueOf(cantFamilia), apellido, nombre, dni, email, telefono, cuit, 0/* saldoMesAnt*/, impSemestres, jTextAreaDescripcion.getText(), null/*unGarante*/, null/*alquileres*/, idDepartamento, idCochera);
                    limpiarComponentes();
                }else{
                    int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(confirmacion == 0){
                        Logica.Garante unGarante = unaControladora.obtenerInquilino(idInquilino).getUnGarante();
                        List<Logica.Alquiler> alquileres = unaControladora.obtenerInquilino(idInquilino).getAlquileres();
                        float saldoMesAnt = unaControladora.obtenerInquilino(idInquilino).getSaldoMesAnt();
                        unaControladora.modificarInquilino(idInquilino, Integer.valueOf(cantFamilia), apellido, nombre, dni, email, telefono, cuit, saldoMesAnt, impSemestres, jTextAreaDescripcion.getText(), unGarante, alquileres, idDepartamento, idCochera, idEdificio);
                        limpiarComponentes();
                    }
                }
            }catch(Exception ex){
                Logger.getLogger(Logica.Inquilino.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación. Error: "+ex, "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jPanelButtonAgregarMouseClicked

    private void jTableInquilinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInquilinoMouseClicked
        int fila = jTableInquilino.getSelectedRow();
        
        if(fila >= 0){
            idInquilino = Long.parseLong(modelo.getValueAt(fila, 0).toString());
            if(evt.getClickCount() == 1){
                eliminar = true;
            }else if(evt.getClickCount() == 2){
                cargarPanelDatos(idInquilino);
                eliminar = false;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe cliquear una fila válida.", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTableInquilinoMouseClicked

    private void jPanelButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonEliminarMouseClicked
        if(eliminar){
            try{
                int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirmacion == 0){
                    long idDepto = 0;
                    long idCoche = 0;

                    if(unaControladora.obtenerDepartamentoInquilino(idEdificio, idInquilino) != null){
                        Logica.Departamento unDepartamento = unaControladora.obtenerDepartamentoInquilino(idEdificio, idInquilino);
                            idDepto = unDepartamento.getId();
                    }

                    if(unaControladora.obtenerCocheraInquilino(idEdificio, idInquilino) != null){
                        Logica.Cochera unaCochera = unaControladora.obtenerCocheraInquilino(idEdificio, idInquilino);
                            idCoche = unaCochera.getId();
                    }
                    
                    unaControladora.bajaInquilino(idInquilino, idDepto, idCoche);
                    limpiarComponentes();
                }
            }catch(Exception e){
                Logger.getLogger(Logica.Inquilino.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar.", "", JOptionPane.ERROR_MESSAGE);
            }
        }else{
             JOptionPane.showMessageDialog(null, "Debe seleccionar un Inquilino.", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jPanelButtonEliminarMouseClicked

    private void jTextFieldDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDniKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }else if(!Character.isDigit(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_PERIOD) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDniKeyTyped

    private void jTextFieldCantFamiliaresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantFamiliaresKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }else if(!Character.isDigit(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCantFamiliaresKeyTyped

    private void jComboBoxDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentoMouseClicked
        
    }//GEN-LAST:event_jComboBoxDepartamentoMouseClicked

    private void jPanelButtonRefrescarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseMoved
        if(modificar){
            ImageIcon cancelar = new ImageIcon(getClass().getResource("/Visual/img/cancelar.png"));
            this.jPanelButtonRefrescar.setBackground(new Color(255,255,255));
            this.jPanelButtonRefrescar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
            this.jLabelRefrescar.setForeground(new Color(51,51,51));
            this.jLabelRefrescar.setIcon(cancelar);
        }else{
            ImageIcon refrescar = new ImageIcon(getClass().getResource("/Visual/img/cargando.png"));
            this.jPanelButtonRefrescar.setBackground(new Color(255,255,255));
            this.jPanelButtonRefrescar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
            this.jLabelRefrescar.setForeground(new Color(51,51,51));
            this.jLabelRefrescar.setIcon(refrescar);
        }
    }//GEN-LAST:event_jPanelButtonRefrescarMouseMoved

    private void jPanelButtonRefrescarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseExited
        if(modificar){
            ImageIcon cancelar = new ImageIcon(getClass().getResource("/Visual/img/cancelar_blanco.png"));
            this.jPanelButtonRefrescar.setBackground(new Color(51,51,51));
            this.jLabelRefrescar.setIcon(cancelar);
        }else{
            ImageIcon refrescar = new ImageIcon(getClass().getResource("/Visual/img/cargando_blanco.png"));
            this.jPanelButtonRefrescar.setBackground(new Color(51,51,51));
            this.jLabelRefrescar.setIcon(refrescar);
        }
    }//GEN-LAST:event_jPanelButtonRefrescarMouseExited

    private void jPanelButtonRefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseClicked
        limpiarComponentes();        
    }//GEN-LAST:event_jPanelButtonRefrescarMouseClicked

    private void jTextFieldBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBuscarMouseClicked
        jTextFieldBuscar.setText(null);
        jTextFieldBuscar.requestFocus();
    }//GEN-LAST:event_jTextFieldBuscarMouseClicked

    private void jPanelButtonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseClicked
        if(!jTextFieldBuscar.getText().equals("Ingrese un apellido para buscar")){
            if(!jTextFieldBuscar.getText().isEmpty()){
                cargarTablaInquilino(jTextFieldBuscar.getText().toUpperCase());
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un apellido para buscar", "", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un apellido para buscar", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jPanelButtonBuscarMouseClicked

    private void jPanelButtonBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseMoved
        ImageIcon buscar = new ImageIcon(getClass().getResource("/Visual/img/lupa_negra.png"));
        this.jPanelButtonBuscar.setBackground(new Color(255,255,255));
        this.jPanelButtonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelBuscar.setIcon(buscar);
    }//GEN-LAST:event_jPanelButtonBuscarMouseMoved

    private void jPanelButtonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseExited
        ImageIcon buscar = new ImageIcon(getClass().getResource("/Visual/img/lupa_blanca.png"));
        this.jPanelButtonBuscar.setBackground(new Color(51,51,51));
        this.jLabelBuscar.setIcon(buscar);
    }//GEN-LAST:event_jPanelButtonBuscarMouseExited

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }else if(!Character.isLetter(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }else if(!Character.isLetter(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void jTextFieldCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCuitKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }else if(!Character.isDigit(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_PERIOD) && (evt.getKeyChar() != VK_BACK_SPACE) && (evt.getKeyChar() != VK_MINUS)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCuitKeyTyped

    private void jComboBoxSemestresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxSemestresKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jComboBoxSemestresKeyTyped

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }else if(!Character.isDigit(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_PERIOD) && (evt.getKeyChar() != VK_BACK_SPACE) && (evt.getKeyChar() != VK_MINUS)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jTextFieldEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jTextFieldEmailKeyTyped

    private void jComboBoxCocheraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxCocheraKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jComboBoxCocheraKeyTyped

    private void jButtonSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSemestreActionPerformed
        if(jButtonSemestre.getText().equals("-")){
            if(jComboBoxSemestres.getSelectedIndex() > 0){
                int indice = jComboBoxSemestres.getSelectedIndex();
                String importe = JOptionPane.showInputDialog(null, "Importe");
                comboSemestre.removeElementAt(indice);
                comboSemestre.insertElementAt(Float.valueOf(importe), indice);
                jComboBoxSemestres.setModel(comboSemestre);
                jComboBoxSemestres.setSelectedIndex(indice);
            }
        }else{
            try{
                jComboBoxSemestres.removeAllItems();
                comboSemestre.addElement("Seleccione una opción");
                int i = 0;
                while(i < 4){
                    String importe = JOptionPane.showInputDialog(null, "Importe");
                    comboSemestre.addElement(Float.valueOf(importe));
                    i++;
                }
                
                jComboBoxSemestres.setModel(comboSemestre);
                jComboBoxSemestres.requestFocus();
            }catch(HeadlessException | NumberFormatException e){
                System.out.print("Aprieta para agregar servicio, le da ok y no escribio nada. No ocurre ningun problema ;)"+e);
                jButtonSemestreActionPerformed(null);
            }
        }
    }//GEN-LAST:event_jButtonSemestreActionPerformed

    private void jButtonSemestreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonSemestreKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jButtonSemestreActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonSemestreKeyTyped

    private void jComboBoxSemestresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSemestresItemStateChanged
        if(jComboBoxSemestres.getSelectedIndex() > 0){
            jButtonSemestre.setText("-");
        }else{
            jButtonSemestre.setText("+");
        }
    }//GEN-LAST:event_jComboBoxSemestresItemStateChanged

    private void jTableInquilinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableInquilinoKeyTyped
        if (evt.getKeyChar() == evt.VK_DELETE) {
            jPanelButtonEliminarMouseClicked(null);
        }
    }//GEN-LAST:event_jTableInquilinoKeyTyped

    private void jComboBoxSemestresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxSemestresMouseClicked
        
    }//GEN-LAST:event_jComboBoxSemestresMouseClicked

    public void cargarTablaInquilino(String buscar){
        String colTablaInquilino[] = {"Id", "Apellido", "Nombre", "DNI", "Tel.", "E-mail", "Departamento", "Cochera", "Descripción"};
        
        if(unaControladora.obtenerInquilinosEdificio(idEdificio).size() > 0){
            List<Logica.Inquilino> inquilinos = new LinkedList();

            if(!buscar.isEmpty()){
                for(Logica.Inquilino unInquilino : unaControladora.obtenerInquilinosEdificio(idEdificio)){
                    if(unInquilino.getApellido().equals(buscar)){
                        inquilinos.add(unInquilino);
                    }
                }

                if(inquilinos.size() < 1){
                    JOptionPane.showMessageDialog(null, "No se ha encontrado el Inquilino: "+buscar, "", JOptionPane.ERROR_MESSAGE);
                    inquilinos = unaControladora.obtenerInquilinosEdificio(idEdificio);
                }
            }else{
                inquilinos = unaControladora.obtenerInquilinosEdificio(idEdificio);
            }

            int i = 0, tamanio = inquilinos.size();
            Object[][] filas = new Object[tamanio][9];
            Logica.Departamento unDepto;
            Logica.Cochera unaCochera;
            Collections.sort(inquilinos, (Logica.Inquilino i1, Logica.Inquilino i2) -> i1.getApellido().compareTo(i2.getApellido()));
            
            for(Logica.Inquilino unInquilino : inquilinos){
                unDepto = unaControladora.obtenerDepartamentoInquilino(idEdificio, unInquilino.getId());
                unaCochera = unaControladora.obtenerCocheraInquilino(idEdificio, unInquilino.getId());
                
                filas[i][0] = unInquilino.getId();
                filas[i][1] = unInquilino.getApellido();
                filas[i][2] = unInquilino.getNombre();
                filas[i][3] = unInquilino.getDni();
                filas[i][4] = unInquilino.getTelefono();
                filas[i][5] = unInquilino.getEmail();
                
                if(unDepto != null){
                    filas[i][6] = unDepto.getUbicacion();
                }else{
                    filas[i][6] = "";
                }
                
                if(unaCochera != null){
                    filas[i][7] = unaCochera.getUbicacion();
                }else{
                    filas[i][7] = "";
                }
                
                filas[i][8] = unInquilino.getDescripcion();
                i++;
            }

            modelo = new DefaultTableModel(filas,colTablaInquilino);
            
            jTableInquilino.setModel(modelo);
        }
        
    }
    
    public void cargarComboDepartamento(long idEdificio){
        List<Logica.Departamento> departamentosDisponibles = unaControladora.departamentosDisponibles(idEdificio);
        
        comboDepartamento.removeAllElements();
        comboDepartamento.addElement("Seleccione una opción");
        for(Logica.Departamento unDepartamento : departamentosDisponibles){
            comboDepartamento.addElement(unDepartamento);
        }
        comboDepartamento.addElement("Sin departamento");
        
        this.jComboBoxDepartamento.setModel(comboDepartamento);
    }
    
    public void cargarComboCochera(long idEdificio){
        List<Logica.Cochera> cocherasDisponibles = unaControladora.obtenerCocherasDisponibles(idEdificio);
        
        comboCochera.removeAllElements();
        comboCochera.addElement("Seleccione una opción");
        for(Logica.Cochera unaCochera : cocherasDisponibles){
            comboCochera.addElement(unaCochera);
        }
        comboCochera.addElement("Sin cochera");
        
        this.jComboBoxCochera.setModel(comboCochera);
    }
    
    private void cargarPanelDatos(long idInquilino){
        ImageIcon cancelar = new ImageIcon(getClass().getResource("/Visual/img/cancelar_blanco.png"));
        this.jLabelRefrescar.setIcon(cancelar);
        this.jLabelAceptar.setText("Actualizar");
        modificar = true;
        Logica.Inquilino unInquilino = unaControladora.obtenerInquilino(idInquilino);
        
        jTextAreaDescripcion.setText(unInquilino.getDescripcion());
        jTextFieldNombre.setText(unInquilino.getNombre());
        jTextFieldApellido.setText(unInquilino.getApellido());
        jTextFieldDni.setText(unInquilino.getDni());
        jTextFieldCuit.setText(unInquilino.getCuit());
        jTextFieldTelefono.setText(unInquilino.getTelefono());
        jTextFieldEmail.setText(unInquilino.getEmail());
        jTextFieldCantFamiliares.setText(String.valueOf(unInquilino.getCantidadPersonas()));
        
        comboDepartamento.removeAllElements();
        if(unaControladora.obtenerDepartamentoInquilino(idEdificio, idInquilino) != null){
            // El Inquilino posee Departamento/s
            Logica.Departamento unDepto = unaControladora.obtenerDepartamentoInquilino(idEdificio, idInquilino);
            comboDepartamento.addElement(unDepto);
        }else{  // El Inquilino no posee DEPARTAMENTO/s
               // Este Inquilino no tiene depto.
                comboDepartamento.addElement("Sin departamento");
        }
        
        // Si hay Departamento/s disponible/s
        if(unaControladora.departamentosDisponibles(idEdificio).size() > 0){
            for(Logica.Departamento unDepto : unaControladora.departamentosDisponibles(idEdificio)){
                comboDepartamento.addElement(unDepto);
            }
        }
        comboDepartamento.addElement("Sin departamento");
        
        comboCochera.removeAllElements();
        if(unaControladora.obtenerCocheraInquilino(idEdificio, idInquilino) != null){
            // El Inquilino posee COCHERA/S
            Logica.Cochera unaCochera = unaControladora.obtenerCocheraInquilino(idEdificio, idInquilino);
                comboCochera.addElement(unaCochera);
            
        }else{  // El Inquilino no posee Cochera
            comboCochera.addElement("Sin cochera");
        }
        // Si hay Cochera/s disponibles size > 0 
        if(unaControladora.obtenerCocherasDisponibles(idEdificio).size() > 0){
            for(Logica.Cochera unaCochera : unaControladora.obtenerCocherasDisponibles(idEdificio)){
                comboCochera.addElement(unaCochera);
            }
        }
        comboCochera.addElement("Sin cochera");
        
        comboSemestre.removeAllElements();
        comboSemestre.addElement("Seleccione una opción");
        for (int i = 0; i < 4; i++) {
            comboSemestre.addElement(unInquilino.getImpSemestres()[i]);
        }
        jComboBoxSemestres.setModel(comboSemestre);
        /*for (int i = 0; i < 4; i++) {
            jComboBoxSemestres.addItem(String.valueOf(unInquilino.getImpSemestres()[i]));
        }*/
    }
    
    private boolean validar(){
        boolean validar = false, departamento = false, cochera = false;
        
        if(comboDepartamento.getSelectedItem() == "Seleccione una opción"){
            departamento = false;
        }else if(comboDepartamento.getSelectedItem() == "Sin departamento"){
            idDepartamento = 0;
            departamento = true;
        }else{
            Logica.Departamento unDepto;
            unDepto = (Logica.Departamento)comboDepartamento.getSelectedItem();
            idDepartamento = unDepto.getId();
            departamento = true;
        }
        
        if(comboCochera.getSelectedItem() == "Seleccione una opción"){
            cochera = false;
        }else if(comboCochera.getSelectedItem() == "Sin cochera"){
            idCochera = 0;
            cochera = true;
        }else{
            Logica.Cochera unaCocher;
            unaCocher = (Logica.Cochera)comboCochera.getSelectedItem();
            idCochera = unaCocher.getId();
            cochera = true;
        }
        
        if(!jTextFieldNombre.getText().isEmpty() && !jTextFieldApellido.getText().isEmpty() && !jTextFieldCantFamiliares.getText().isEmpty() && departamento && cochera){
            if(idDepartamento == 0 && idCochera == 0){
                validar = false;    // Imposible dejar a un Inquilino sin Departamento y sin Cochera al mismo tiempo.
                JOptionPane.showMessageDialog(null, "No es posible guardar un Inquilino sin departamento ni cochera. Intentelo nuevamente", "", JOptionPane.ERROR_MESSAGE);
            }else{
                if(!modificar){
                    boolean existeInquilino = unaControladora.obtenerInquilinoPorDni(jTextFieldDni.getText(), this.idEdificio);
                    if(existeInquilino){
                        JOptionPane.showMessageDialog(null, "El Inquilino con DNI: "+jTextFieldDni.getText()+" ya se encuentra registrado.", "", JOptionPane.WARNING_MESSAGE);
                    }else{
                        validar = true;
                    }
                }else{
                    validar = true;
                }
            }
        }else if(jTextFieldNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar el campo: Nombre.", "", JOptionPane.WARNING_MESSAGE);
        }else if(jTextFieldApellido.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar el campo: Apellido.", "", JOptionPane.WARNING_MESSAGE);
        }else if(jTextFieldCantFamiliares.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar el campo: Cantidad Familiares.", "", JOptionPane.WARNING_MESSAGE);
        }else if(!departamento){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Departamento.", "", JOptionPane.WARNING_MESSAGE);
        }else if(!cochera){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Cochera.", "", JOptionPane.WARNING_MESSAGE);
        }
            
        return validar;
    }
    
    private void limpiarComponentes(){
        ImageIcon refrescar = new ImageIcon(getClass().getResource("/Visual/img/cargando_blanco.png"));
        this.jLabelRefrescar.setIcon(refrescar);
        this.jLabelAceptar.setText("Aceptar");
        jTextFieldNombre.setText(null);
        jTextFieldApellido.setText(null);
        jTextFieldDni.setText(null);
        jTextFieldCuit.setText(null);
        jTextFieldTelefono.setText(null);
        jTextFieldEmail.setText(null);
        jTextFieldCantFamiliares.setText(null);
        jTextAreaDescripcion.setText(null);
        jTextFieldBuscar.setText("Ingrese un apellido para buscar");
        this.jTextFieldNombre.requestFocus();
        eliminar = false;
        modificar = false;
        
        jComboBoxSemestres.removeAllItems();
        comboSemestre.addElement("Seleccione una opción");
        jComboBoxSemestres.setModel(comboSemestre);
        /*jComboBoxSemestres.removeAllItems();
        jComboBoxSemestres.addItem("Seleccione una opción");*/
        
        cargarComboDepartamento(idEdificio);
        cargarComboCochera(idEdificio);
        cargarTablaInquilino("");
        this.jTableInquilino.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSemestre;
    private javax.swing.JComboBox<String> jComboBoxCochera;
    private javax.swing.JComboBox<String> jComboBoxDepartamento;
    private javax.swing.JComboBox<String> jComboBoxSemestres;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelCantFamiliares;
    private javax.swing.JLabel jLabelCochera;
    private javax.swing.JLabel jLabelCuit;
    private javax.swing.JLabel jLabelDepartamento;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRefrescar;
    private javax.swing.JLabel jLabelSemestres;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelButtonAgregar;
    private javax.swing.JPanel jPanelButtonBuscar;
    private javax.swing.JPanel jPanelButtonEliminar;
    private javax.swing.JPanel jPanelButtonRefrescar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparatorApellido;
    private javax.swing.JSeparator jSeparatorBuscar;
    private javax.swing.JSeparator jSeparatorCantFamiliares;
    private javax.swing.JSeparator jSeparatorCuit;
    private javax.swing.JSeparator jSeparatorDni;
    private javax.swing.JSeparator jSeparatorEmail;
    private javax.swing.JSeparator jSeparatorNombre;
    private javax.swing.JSeparator jSeparatorTelefono;
    private javax.swing.JTable jTableInquilino;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCantFamiliares;
    private javax.swing.JTextField jTextFieldCuit;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
