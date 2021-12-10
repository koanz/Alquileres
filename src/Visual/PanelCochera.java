package Visual;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static java.awt.event.KeyEvent.VK_SPACE;
import static java.awt.event.KeyEvent.VK_PERIOD;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import java.util.Collections;

public class PanelCochera extends javax.swing.JPanel {
    private long idCochera;
    private final long idEdificio;
    private boolean modificar = false, eliminar = false;
    private final ControladoraV unaControladora = new ControladoraV();
    private final String colTablaCochera[] = {"Id", "Ubicación", "Precio", "Inquilino", "Descripción"};
    private final DefaultTableModel tablaCochera = new DefaultTableModel(null, colTablaCochera);
    
    public PanelCochera(long idEdificio) {
        initComponents();
        this.idEdificio = idEdificio;
        this.jTextFieldEdificio.setText(unaControladora.obtenerEdificio(idEdificio).getNombre());
        cargarTablaCochera("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelDatosCochera = new javax.swing.JPanel();
        jLabelUbicacion = new javax.swing.JLabel();
        jTextFieldUbicacion = new javax.swing.JTextField();
        jLabelPrecio = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabelEdificio = new javax.swing.JLabel();
        jSeparatorUbicacion = new javax.swing.JSeparator();
        jSeparatorPrecio = new javax.swing.JSeparator();
        jLabelTitutlo = new javax.swing.JLabel();
        jTextFieldEdificio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jPanelButtonRefresh = new javax.swing.JPanel();
        jLabelRefresh = new javax.swing.JLabel();
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
        jTableCochera = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelDatosCochera.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDatosCochera.setPreferredSize(new java.awt.Dimension(873, 315));

        jLabelUbicacion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelUbicacion.setText("Ubicación");

        jTextFieldUbicacion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldUbicacion.setBorder(null);
        jTextFieldUbicacion.setPreferredSize(new java.awt.Dimension(64, 22));
        jTextFieldUbicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUbicacionKeyTyped(evt);
            }
        });

        jLabelPrecio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelPrecio.setText("Precio");

        jTextFieldPrecio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldPrecio.setBorder(null);
        jTextFieldPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPrecioKeyTyped(evt);
            }
        });

        jLabelEdificio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelEdificio.setText("Edificio");

        jLabelTitutlo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabelTitutlo.setText("Cochera");

        jTextFieldEdificio.setEditable(false);
        jTextFieldEdificio.setBackground(new java.awt.Color(204, 204, 255));
        jTextFieldEdificio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldEdificio.setBorder(null);
        jTextFieldEdificio.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("Descripción");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextAreaDescripcion.setRows(2);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

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

        javax.swing.GroupLayout jPanelDatosCocheraLayout = new javax.swing.GroupLayout(jPanelDatosCochera);
        jPanelDatosCochera.setLayout(jPanelDatosCocheraLayout);
        jPanelDatosCocheraLayout.setHorizontalGroup(
            jPanelDatosCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosCocheraLayout.createSequentialGroup()
                .addGroup(jPanelDatosCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDatosCocheraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitutlo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosCocheraLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelDatosCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUbicacion)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDatosCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparatorUbicacion)
                            .addComponent(jTextFieldUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(50, 50, 50)
                        .addGroup(jPanelDatosCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosCocheraLayout.createSequentialGroup()
                                .addComponent(jLabelPrecio)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDatosCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparatorPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPrecio)))
                            .addGroup(jPanelDatosCocheraLayout.createSequentialGroup()
                                .addComponent(jLabelEdificio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelDatosCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1)
                                    .addComponent(jTextFieldEdificio))))))
                .addGap(22, 22, 22))
        );
        jPanelDatosCocheraLayout.setVerticalGroup(
            jPanelDatosCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosCocheraLayout.createSequentialGroup()
                .addGroup(jPanelDatosCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitutlo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanelDatosCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelUbicacion)
                    .addComponent(jTextFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecio)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelDatosCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparatorUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparatorPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanelDatosCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosCocheraLayout.createSequentialGroup()
                        .addGroup(jPanelDatosCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldEdificio)
                            .addComponent(jLabelEdificio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDatosCochera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatosCochera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(890, 315));

        jTextFieldBuscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextFieldBuscar.setText("Ingrese una ubicación para buscar");
        jTextFieldBuscar.setBorder(null);
        jTextFieldBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldBuscarMouseClicked(evt);
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
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            .addComponent(jLabelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
        jTableCochera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCocheraMouseClicked(evt);
            }
        });
        jTableCochera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableCocheraKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCochera);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparatorBuscar)
                                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparatorBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
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
            try {
                if(!modificar){
                    unaControladora.altaCochera(jTextFieldUbicacion.getText().toUpperCase(), Float.valueOf(jTextFieldPrecio.getText()), jTextAreaDescripcion.getText(), null, idEdificio);
                    cargarTablaCochera("");
                }else{
                    int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "Actualizar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(confirmacion == 0){
                        Logica.Inquilino unInquilino = unaControladora.obtenerCochera(idCochera).getUnInquilino();
                        unaControladora.modificarCochera(idCochera, jTextFieldUbicacion.getText().toUpperCase(), Float.valueOf(jTextFieldPrecio.getText()), jTextAreaDescripcion.getText(), unInquilino);
                        modificar = false;
                        cargarTablaCochera("");
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(Logica.Cochera.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se ha podido realizar la operación. Error: "+ex, "", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jPanelButtonAgregarMouseClicked

    private void jPanelButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonEliminarMouseClicked
        if(eliminar){
            try{
                int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirmacion == 0){
                    unaControladora.bajaCochera(idCochera, idEdificio);
                    cargarTablaCochera("");
                    eliminar = false;
                }
            }catch(Exception ex){
                Logger.getLogger(Logica.Cochera.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar.", "", JOptionPane.ERROR_MESSAGE);
            }
        }else{
             JOptionPane.showMessageDialog(null, "Debe seleccionar una Cochera de la tabla.", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jPanelButtonEliminarMouseClicked

    private void jTextFieldPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPrecioKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }else if(!Character.isDigit(evt.getKeyChar()) && (evt.getKeyChar() != VK_PERIOD) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPrecioKeyTyped

    private void jPanelButtonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseClicked
        if(jTextFieldBuscar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar una clave de busqueda.", "", JOptionPane.WARNING_MESSAGE);
            jTextFieldBuscar.requestFocus();
        }else{
            cargarTablaCochera(jTextFieldBuscar.getText().toUpperCase());
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
        cargarTablaCochera("");
    }//GEN-LAST:event_jPanelButtonRefreshMouseClicked

    private void jPanelButtonRefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseEntered
        icono("adentro");
    }//GEN-LAST:event_jPanelButtonRefreshMouseEntered

    private void jPanelButtonRefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefreshMouseExited
        icono("afuera");
    }//GEN-LAST:event_jPanelButtonRefreshMouseExited

    private void jTextFieldBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBuscarMouseClicked
        this.jTextFieldBuscar.setText(null);
    }//GEN-LAST:event_jTextFieldBuscarMouseClicked

    private void jTextFieldUbicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUbicacionKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jPanelButtonAgregarMouseClicked(null);
        }else if(!Character.isLetterOrDigit(evt.getKeyChar()) && (evt.getKeyChar() != VK_SPACE) && (evt.getKeyChar() != VK_BACK_SPACE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldUbicacionKeyTyped

    private void jTableCocheraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCocheraMouseClicked
        int fila = jTableCochera.getSelectedRow();
        
        if(fila >= 0){
            idCochera = Long.parseLong(tablaCochera.getValueAt(fila, 0).toString());
        
            if(evt.getClickCount() == 1){
                eliminar = true;
            }else if(evt.getClickCount() == 2){
                cargarPanelDatos(idCochera);
                eliminar = false;
            }
        }
    }//GEN-LAST:event_jTableCocheraMouseClicked

    private void jTableCocheraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableCocheraKeyTyped
        if (evt.getKeyChar() == evt.VK_DELETE) {
            jPanelButtonEliminarMouseClicked(null);
        }
    }//GEN-LAST:event_jTableCocheraKeyTyped

    private void cargarTablaCochera(String buscar){
        limpiarComponentes();
        List<Logica.Cochera> cocheras = new LinkedList();
        String datos[] = new String[5];
        
        if(!buscar.isEmpty()){
            for(Logica.Cochera unaCochera : unaControladora.obtenerEdificio(idEdificio).getCocheras()){
                if(unaCochera.getUbicacion().equals(buscar)){
                    cocheras.add(unaCochera);
                }
            }
            
            if(cocheras.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se ha encontrado la Cochera.", "", JOptionPane.ERROR_MESSAGE);
                cocheras = unaControladora.obtenerEdificio(idEdificio).getCocheras();
            }
        }else{
            cocheras = unaControladora.obtenerEdificio(idEdificio).getCocheras();
        }
        
        if(cocheras.size() > 0){
            List<Logica.Cochera> nuevaLista = ordenarCocheras(cocheras);
            
            for(Logica.Cochera unaCochera : nuevaLista){
                datos[0] = String.valueOf(unaCochera.getId());
                datos[1] = unaCochera.getUbicacion();
                datos[2] = String.valueOf(unaCochera.getPrecio());
                if(unaCochera.getUnInquilino() != null){
                    datos[3] = unaCochera.getUnInquilino().toString();
                }else{
                    datos[3] = "";
                }
                
                datos[4] = unaCochera.getDescripcion();

                tablaCochera.addRow(datos);
            }

            this.jTableCochera.setModel(tablaCochera);
        }
        
    }
    
    public List<Logica.Cochera> ordenarCocheras(List<Logica.Cochera> cocheras){
        List<Logica.Cochera> nuevaLista = new LinkedList();
        
        for(Logica.Cochera unaCochera : cocheras){
            nuevaLista.add(unaCochera);
        }
        
        Collections.sort(nuevaLista, (Logica.Cochera c1, Logica.Cochera c2) -> c1.getUbicacion().compareTo(c2.getUbicacion()));

        return nuevaLista;
    }
    
    private void cargarPanelDatos(long idCochera){
        modificar = true;
        Logica.Cochera unaCochera = unaControladora.obtenerCochera(idCochera);
        Logica.Edificio unEdificio = unaControladora.obtenerEdificio(idEdificio);
        
        jTextFieldPrecio.setText(String.valueOf(unaCochera.getPrecio()));
        jTextFieldUbicacion.setText(unaCochera.getUbicacion());
        jTextAreaDescripcion.setText(unaCochera.getDescripcion());
        jTextFieldEdificio.setText(unEdificio.getNombre());
        jLabelAceptar.setText("Actualizar");
        icono("afuera");
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
    
    private void limpiarComponentes(){
        jTextFieldUbicacion.setText(null);
        jTextFieldPrecio.setText(null);
        jTextAreaDescripcion.setText(null);
        jLabelAceptar.setText("Aceptar");
        jTextFieldBuscar.setText("Ingrese una ubicación para buscar");
        jTextFieldEdificio.setText(unaControladora.obtenerEdificio(idEdificio).getNombre());
        limpiarTabla();
        
        icono("afuera");
        jTextFieldUbicacion.requestFocus();
    }
    
    public void limpiarTabla(){
        int tamanio = tablaCochera.getRowCount();
        
        for(int i = 0; i < tamanio; i++){
            tablaCochera.removeRow(0);
        }
        
        this.jTableCochera.setModel(tablaCochera);
    }
    
    public boolean validar(){
        boolean validar = false;
        
        if((!jTextFieldUbicacion.getText().isEmpty()) && (!jTextFieldPrecio.getText().isEmpty())){
            if(!modificar){
                boolean existeCochera = unaControladora.existeCochera(jTextFieldUbicacion.getText().toUpperCase(), this.idEdificio);
                if(existeCochera){
                    JOptionPane.showMessageDialog(null, "La cochera: "+jTextFieldUbicacion.getText().toUpperCase()+" ya se encuentra registrada.", "", JOptionPane.WARNING_MESSAGE);
                }else{
                    validar = true;
                }
            }else{
                validar = true;
            }
        }else if(jTextFieldUbicacion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar el campo: Ubicación.", "", JOptionPane.WARNING_MESSAGE);
        }else if(jTextFieldPrecio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe completar el campo: Precio.", "", JOptionPane.WARNING_MESSAGE);
        }
        
        return validar;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelEdificio;
    private javax.swing.JLabel jLabelEliminar;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelRefresh;
    private javax.swing.JLabel jLabelTitutlo;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelButtonAgregar;
    private javax.swing.JPanel jPanelButtonBuscar;
    private javax.swing.JPanel jPanelButtonEliminar;
    private javax.swing.JPanel jPanelButtonRefresh;
    private javax.swing.JPanel jPanelDatosCochera;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparatorBuscar;
    private javax.swing.JSeparator jSeparatorPrecio;
    private javax.swing.JSeparator jSeparatorUbicacion;
    private javax.swing.JTable jTableCochera;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldEdificio;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldUbicacion;
    // End of variables declaration//GEN-END:variables
}
