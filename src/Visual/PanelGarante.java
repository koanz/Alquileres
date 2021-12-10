package Visual;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.ImageIcon;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import static java.awt.event.KeyEvent.VK_MINUS;
import static java.awt.event.KeyEvent.VK_SPACE;
import static java.awt.event.KeyEvent.VK_PERIOD;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import java.util.Collections;
import java.util.LinkedList;

public class PanelGarante extends javax.swing.JPanel {
    private final long idEdificio;
    private long idGarante, idInquilino;
    private boolean modificar = false, eliminar = false;
    private final ControladoraV unaControladora = new ControladoraV();
    private final DefaultComboBoxModel comboInquilino = new DefaultComboBoxModel();
    private final String colTablaGarante[] = {"Id", "Apellido", "Nombre", "DNI", "Dirección", "Teléfono", "E-mail", "Inquilino", "Descripción"};
    private final DefaultTableModel tablaGarante = new DefaultTableModel(null, colTablaGarante);
    
    public PanelGarante(long idEdificio) {
        initComponents();
        this.idEdificio = idEdificio;
        cargarComboInquilino(idEdificio);
        cargarTablaGarante("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jSeparatorBuscar = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanelButtonEliminar = new javax.swing.JPanel();
        jLabelEliminar = new javax.swing.JLabel();
        jPanelButtonAgregar = new javax.swing.JPanel();
        jLabelAceptar = new javax.swing.JLabel();
        jPanelButtonBuscar = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableGarante = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitutlo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelCuit = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldCuit = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jSeparatorCuit = new javax.swing.JSeparator();
        jSeparatorDni = new javax.swing.JSeparator();
        jSeparatorApellido = new javax.swing.JSeparator();
        jSeparatorNombre = new javax.swing.JSeparator();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelInquilino = new javax.swing.JLabel();
        jComboBoxInquilino = new javax.swing.JComboBox<>();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jPanelButtonRefrescar = new javax.swing.JPanel();
        jLabelRefrescar = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jSeparatorDireccion = new javax.swing.JSeparator();
        jSeparatorTelefono = new javax.swing.JSeparator();
        jSeparatorEmail = new javax.swing.JSeparator();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(890, 315));

        jTextFieldBuscar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jTextFieldBuscar.setText("Ingrese un apellido para buscar");
        jTextFieldBuscar.setBorder(null);
        jTextFieldBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldBuscarMouseClicked(evt);
            }
        });
        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyTyped(evt);
            }
        });

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
        jLabelBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        jTableGarante = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        jTableGarante.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableGarante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGaranteMouseClicked(evt);
            }
        });
        jTableGarante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableGaranteKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(jTableGarante);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(609, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparatorBuscar)
                                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane3)))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBuscar))
                .addGap(0, 0, 0)
                .addComponent(jSeparatorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(390, 315));

        jLabelTitutlo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabelTitutlo.setText("Garante");

        jLabelNombre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelNombre.setText("Nombre");

        jLabelApellido.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelApellido.setText("Apellido");

        jLabelCuit.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelCuit.setText("CUIT");

        jLabelDni.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelDni.setText("DNI");

        jLabelTelefono.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelTelefono.setText("Teléfono");

        jLabelDireccion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelDireccion.setText("Dirección");

        jLabelEmail.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelEmail.setText("E-mail");

        jTextFieldNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldNombre.setBorder(null);
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

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

        jTextFieldDni.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldDni.setBorder(null);
        jTextFieldDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDniKeyTyped(evt);
            }
        });

        jTextFieldDireccion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldDireccion.setBorder(null);

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldEmail.setBorder(null);

        jLabelInquilino.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelInquilino.setText("Inquilino");

        jComboBoxInquilino.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jComboBoxInquilino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        jComboBoxInquilino.setBorder(null);
        jComboBoxInquilino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxInquilino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBoxInquilinoKeyTyped(evt);
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
        jLabelRefrescar.setPreferredSize(new java.awt.Dimension(44, 37));

        javax.swing.GroupLayout jPanelButtonRefrescarLayout = new javax.swing.GroupLayout(jPanelButtonRefrescar);
        jPanelButtonRefrescar.setLayout(jPanelButtonRefrescarLayout);
        jPanelButtonRefrescarLayout.setHorizontalGroup(
            jPanelButtonRefrescarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonRefrescarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonRefrescarLayout.setVerticalGroup(
            jPanelButtonRefrescarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTextFieldTelefono.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldTelefono.setBorder(null);
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitutlo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelButtonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDireccion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jLabelDni)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelDescripcion))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparatorDireccion)
                                    .addComponent(jSeparatorNombre)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEmail)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldDireccion)
                                    .addComponent(jSeparatorDni)
                                    .addComponent(jSeparatorEmail))))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCuit)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelTelefono)
                            .addComponent(jLabelInquilino))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldApellido)
                            .addComponent(jTextFieldCuit)
                            .addComponent(jTextFieldTelefono)
                            .addComponent(jSeparatorApellido)
                            .addComponent(jSeparatorCuit)
                            .addComponent(jSeparatorTelefono)
                            .addComponent(jComboBoxInquilino, 0, 238, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitutlo)
                    .addComponent(jPanelButtonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparatorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDni)
                            .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCuit)
                            .addComponent(jTextFieldCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparatorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparatorDni, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDireccion)
                            .addComponent(jLabelTelefono)
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparatorCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparatorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelInquilino)
                    .addComponent(jComboBoxInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparatorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescripcion)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
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
                apellido = jTextFieldApellido.getText().toUpperCase(),
                dni = jTextFieldDni.getText(),
                cuit = jTextFieldCuit.getText(),
                direccion = jTextFieldDireccion.getText().toUpperCase(),
                telefono = jTextFieldTelefono.getText(),
                email = jTextFieldEmail.getText().toUpperCase();
                
                if(!modificar){
                    unaControladora.altaGarante(apellido, nombre, dni, direccion, telefono, cuit, email, jTextAreaDescripcion.getText(), idInquilino);
                    cargarTablaGarante("");
                }else{
                    int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(confirmacion == 0){  // confirmacion: SI = 0, NO = 1;
                        unaControladora.modificarGarante(idGarante, apellido, nombre, dni, direccion, telefono, cuit, email, jTextAreaDescripcion.getText(), idInquilino);
                        modificar = false;
                        cargarTablaGarante("");
                    }
                }
                ImageIcon refrescar = new ImageIcon(getClass().getResource("/Visual/img/cargando_blanco.png"));
                this.jLabelRefrescar.setIcon(refrescar);
                this.jLabelAceptar.setText("Aceptar");
                limpiarComponentes();
                cargarComboInquilino(idEdificio);
            }catch(Exception ex){
                Logger.getLogger(Logica.Garante.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación.", "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jPanelButtonAgregarMouseClicked

    private void jPanelButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonEliminarMouseClicked
        if(eliminar){
            try{
                int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirmacion == 0){
                    long idInqui = 0;

                    if(unaControladora.obtenerInquilinoGarante(idGarante, idEdificio) != null){
                        idInqui = unaControladora.obtenerInquilinoGarante(idGarante, idEdificio).getId();
                    }

                    unaControladora.bajaGarante(idGarante, idInqui);
                    cargarTablaGarante("");
                    cargarComboInquilino(idEdificio);
                    eliminar = false;
                }
            }catch(Exception e){
                Logger.getLogger(Logica.Garante.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar.", "", JOptionPane.ERROR_MESSAGE);
            }
        }else{
             JOptionPane.showMessageDialog(null, "Debe seleccionar una Garante.", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jPanelButtonEliminarMouseClicked

    private void jTextFieldDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDniKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_PERIOD) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldDniKeyTyped

    private void jPanelButtonRefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseClicked
        limpiarComponentes();
        cargarComboInquilino(idEdificio);
        cargarTablaGarante("");
    }//GEN-LAST:event_jPanelButtonRefrescarMouseClicked

    private void jPanelButtonRefrescarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseMoved
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
    }//GEN-LAST:event_jPanelButtonRefrescarMouseMoved

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

    private void jTextFieldCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCuitKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_PERIOD) && (evt.getKeyChar() != VK_MINUS) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCuitKeyTyped

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void jPanelButtonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseClicked
        if(!jTextFieldBuscar.getText().equals("Ingrese un apellido para buscar")){
            if(!jTextFieldBuscar.getText().isEmpty()){
                cargarTablaGarante(jTextFieldBuscar.getText().toUpperCase());
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un apellido para buscar", "", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un apellido para buscar", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jPanelButtonBuscarMouseClicked

    private void jTextFieldBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBuscarMouseClicked
        jTextFieldBuscar.setText(null);
    }//GEN-LAST:event_jTextFieldBuscarMouseClicked

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

    private void jTextFieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyTyped
        if(!Character.isDigit(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_MINUS) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldTelefonoKeyTyped

    private void jTextFieldBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyTyped
        if(!Character.isLetter(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldBuscarKeyTyped

    private void jTableGaranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGaranteMouseClicked
        int fila = jTableGarante.getSelectedRow();

        if(fila >= 0){
            try{
                idGarante = Long.parseLong(tablaGarante.getValueAt(fila, 0).toString());

                if(evt.getClickCount() == 1){
                    eliminar = true;
                }else if(evt.getClickCount() == 2){
                    cargarPanelDatos(idGarante);
                    eliminar = false;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error: "+e, "", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe cliquear una fila válida.", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTableGaranteMouseClicked

    private void jComboBoxInquilinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxInquilinoKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }
    }//GEN-LAST:event_jComboBoxInquilinoKeyTyped

    private void jTableGaranteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableGaranteKeyTyped
        if (evt.getKeyChar() == evt.VK_DELETE) {
            jPanelButtonEliminarMouseClicked(null);
        }
    }//GEN-LAST:event_jTableGaranteKeyTyped

    private void cargarTablaGarante(String buscar){
        if(tablaGarante.getRowCount() > 0){
            limpiarTabla(tablaGarante);
        }
        
        if(unaControladora.obtenerInquilinosEdificio(idEdificio).size() > 0){
            List<Logica.Inquilino> inquilinosEdificio = new LinkedList();
            
            if(!buscar.isEmpty()){
                for(Logica.Inquilino unInquilino : unaControladora.obtenerInquilinosEdificio(idEdificio)){
                    if(unInquilino.getUnGarante() != null){
                        if(unInquilino.getUnGarante().getApellido().equals(buscar)){
                            inquilinosEdificio.add(unInquilino);
                        }
                    }
                }
                
                if(inquilinosEdificio.size() < 1){
                    JOptionPane.showMessageDialog(null, "No se ha encontrado el Garante: "+buscar, "", JOptionPane.ERROR_MESSAGE);
                    inquilinosEdificio = unaControladora.obtenerInquilinosEdificio(idEdificio);
                }
            }else{
                inquilinosEdificio = unaControladora.obtenerInquilinosEdificio(idEdificio);
            }
            
            Object datos[] = new Object[9];
            for(Logica.Inquilino unInquilino : inquilinosEdificio){
                if(unInquilino.getUnGarante() != null){
                    datos[0] = unInquilino.getUnGarante().getId();
                    datos[1] = unInquilino.getUnGarante().getApellido();
                    datos[2] = unInquilino.getUnGarante().getNombre();
                    datos[3] = unInquilino.getUnGarante().getDni();
                    datos[4] = unInquilino.getUnGarante().getDireccion();
                    datos[5] = unInquilino.getUnGarante().getTelefono();
                    datos[6] = unInquilino.getUnGarante().getEmail();
                    datos[7] = unInquilino.getApellido()+", "+unInquilino.getNombre();
                    datos[8] = unInquilino.getUnGarante().getDescripcion();

                    tablaGarante.addRow(datos);
                }
            }
            
            this.jTableGarante.setModel(tablaGarante);
        }
    }
    
    private void limpiarTabla(DefaultTableModel tablaGarante){
        int cantFila = tablaGarante.getRowCount();
        
        for(int i = 0; i < cantFila; i++){
            tablaGarante.removeRow(0);
        }
    }
    
    public void cargarComboInquilino(long idEdificio){
        this.jComboBoxInquilino.removeAllItems();
        comboInquilino.addElement("Seleccione una opción");

        if(unaControladora.obtenerInquilinosEdificio(idEdificio).size() > 0){
            List<Logica.Inquilino> inquilinos = unaControladora.obtenerInquilinosEdificio(idEdificio);
            Collections.sort(inquilinos, (Logica.Inquilino i1, Logica.Inquilino i2) -> i1.getApellido().compareTo(i2.getApellido()));
            
            for(Logica.Inquilino unInquilino : inquilinos){
                if(unInquilino.getUnGarante() == null){
                    comboInquilino.addElement(unInquilino);
                }
            }
        }else{
            comboInquilino.addElement("Sin inquilino");
        }
        
        this.jComboBoxInquilino.setModel(comboInquilino);
    }
    
    private void cargarPanelDatos(long idGarante){
        ImageIcon cancelar = new ImageIcon(getClass().getResource("/Visual/img/cancelar_blanco.png"));
        this.jLabelRefrescar.setIcon(cancelar);
        this.jLabelAceptar.setText("Actualizar");
        modificar = true;
        Logica.Garante unGarante = unaControladora.obtenerGarante(idGarante);
        
        jTextFieldNombre.setText(unGarante.getNombre());
        jTextFieldApellido.setText(unGarante.getApellido());
        jTextFieldDni.setText(unGarante.getDni());
        jTextFieldCuit.setText(unGarante.getCuit());
        jTextFieldDireccion.setText(unGarante.getDireccion());
        jTextFieldTelefono.setText(unGarante.getTelefono());
        jTextFieldEmail.setText(unGarante.getEmail());
        jTextAreaDescripcion.setText(unGarante.getDescripcion());
        
        comboInquilino.removeAllElements();
        if(unaControladora.obtenerInquilinoGarante(idGarante, this.idEdificio) != null){
            comboInquilino.addElement(unaControladora.obtenerInquilinoGarante(idGarante, this.idEdificio));
        }else{  // En duda si dejar la opción "Sin inquilino"..
            comboInquilino.addElement("Sin inquilino");
        }
        
        this.jComboBoxInquilino.setModel(comboInquilino);
    }
    
    private boolean validar(){
        boolean validar = false, inquilino = false;
        
        // Si la selección es "Seleccione una opción" la función devuelve falso, y no realiza la Alta/Modificación
        if(comboInquilino.getSelectedItem() == "Seleccione una opción"){
            inquilino = false;
        }else if(comboInquilino.getSelectedItem() == "Sin inquilino"){  // Si es "Sin inquilino" realiza la Alta/Modificación del Garante sin Inquilino.. Opción a verificar, según la decisión de Oscar (Preguntar)
            idInquilino = 0;
            inquilino = false;
        }else{
            Logica.Inquilino unInqui = new Logica.Inquilino();
            unInqui = (Logica.Inquilino)comboInquilino.getSelectedItem();
            idInquilino = unInqui.getId();
            inquilino = true;
        }
        
        if(!jTextFieldNombre.getText().isEmpty() && !jTextFieldApellido.getText().isEmpty() && !jTextFieldDni.getText().isEmpty() && !jTextFieldTelefono.getText().isEmpty() && inquilino){
            if(!modificar){
                boolean existeGarante = unaControladora.existeGarante(jTextFieldDni.getText(), this.idEdificio);
                if(existeGarante){
                   JOptionPane.showMessageDialog(null, "El Garante con DNI: "+jTextFieldDni.getText()+" ya se encuentra registrado.", "", JOptionPane.WARNING_MESSAGE);
                }else{
                    validar = true;
                }
            }else{
                validar = true;
            }
        }else if(jTextFieldNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar el campo: NOMBRE.", "", JOptionPane.WARNING_MESSAGE);
        }else if(jTextFieldApellido.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar el campo: APELLIDO.", "", JOptionPane.WARNING_MESSAGE);
        }else if(jTextFieldDni.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar el campo: DNI.", "", JOptionPane.WARNING_MESSAGE);
        }else if(jTextFieldTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar el campo: TELEFONO.", "", JOptionPane.WARNING_MESSAGE);
        }else if(!inquilino){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Inquilino.", "", JOptionPane.WARNING_MESSAGE);
        }
        
        return validar;
    }
    
    private void limpiarComponentes(){
        modificar = false;
        eliminar = false;
        
        this.jLabelAceptar.setText("Aceptar");
        this.jTextFieldNombre.setText(null);
        this.jTextFieldApellido.setText(null);
        this.jTextFieldDni.setText(null);
        this.jTextFieldCuit.setText(null);
        this.jTextFieldDireccion.setText(null);
        this.jTextFieldTelefono.setText(null);
        this.jTextFieldEmail.setText(null);
        this.jTextAreaDescripcion.setText(null);
        this.jTextFieldBuscar.setText("Ingrese un apellido para buscar");
        this.jTextFieldNombre.requestFocus();
        comboInquilino.removeAllElements();
        this.jTableGarante.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxInquilino;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelCuit;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelInquilino;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRefrescar;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTitutlo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelButtonAgregar;
    private javax.swing.JPanel jPanelButtonBuscar;
    private javax.swing.JPanel jPanelButtonEliminar;
    private javax.swing.JPanel jPanelButtonRefrescar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparatorApellido;
    private javax.swing.JSeparator jSeparatorBuscar;
    private javax.swing.JSeparator jSeparatorCuit;
    private javax.swing.JSeparator jSeparatorDireccion;
    private javax.swing.JSeparator jSeparatorDni;
    private javax.swing.JSeparator jSeparatorEmail;
    private javax.swing.JSeparator jSeparatorNombre;
    private javax.swing.JSeparator jSeparatorTelefono;
    private javax.swing.JTable jTableGarante;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCuit;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
