package Visual;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

public final class Inicio extends javax.swing.JFrame {
    private boolean busqueda = false;
    private final ControladoraV unaControladora = new ControladoraV();
    private final String colTablaEdificio[] = {"Id", "Nombre", "Dirección"};
    private final DefaultTableModel tablaEdificio = new DefaultTableModel(null, colTablaEdificio);
    
    public Inicio(JFrame inicio) throws Exception {
        initComponents();
        this.setTitle("Sistema de Gestión de Alquileres");
        this.setLocationRelativeTo(null);
        cargarCoeficiente();
        cargarEdificios("");
        generarAlquileres();
        eliminarEdificioSeleccionado();
        this.setResizable(false);
        if(inicio != null){
            inicio.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInicio = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEdificio = new javax.swing.JTable();
        jPanelButtonCrearEdificio = new javax.swing.JPanel();
        jLabelCrearEdificio = new javax.swing.JLabel();
        jPanelButtonAceptar = new javax.swing.JPanel();
        jLabelAceptar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelBusqueda = new javax.swing.JPanel();
        jButtonCoefiente = new javax.swing.JButton();
        jTextFieldCoeficiente = new javax.swing.JTextField();
        jLabelCoeficiente = new javax.swing.JLabel();
        jTextFieldBuscarInicio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelButtonBuscar = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();
        jPanelButtonRefrescar = new javax.swing.JPanel();
        jLabelRefrescar = new javax.swing.JLabel();
        jPanelNotificacion = new javax.swing.JPanel();
        jLabelNotificaciones = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListNotificaciones = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelInicio.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

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
        jTableEdificio.getTableHeader().setReorderingAllowed(false);
        jTableEdificio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEdificioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableEdificio);

        jPanelButtonCrearEdificio.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonCrearEdificio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelButtonCrearEdificio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelButtonCrearEdificioMouseMoved(evt);
            }
        });
        jPanelButtonCrearEdificio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonCrearEdificioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonCrearEdificioMouseExited(evt);
            }
        });

        jLabelCrearEdificio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabelCrearEdificio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCrearEdificio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCrearEdificio.setText("Crear edificio");

        javax.swing.GroupLayout jPanelButtonCrearEdificioLayout = new javax.swing.GroupLayout(jPanelButtonCrearEdificio);
        jPanelButtonCrearEdificio.setLayout(jPanelButtonCrearEdificioLayout);
        jPanelButtonCrearEdificioLayout.setHorizontalGroup(
            jPanelButtonCrearEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonCrearEdificioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCrearEdificio, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonCrearEdificioLayout.setVerticalGroup(
            jPanelButtonCrearEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCrearEdificio, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jPanelButtonAceptar.setBackground(new java.awt.Color(65, 65, 65));
        jPanelButtonAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelButtonAceptar.setPreferredSize(new java.awt.Dimension(163, 58));
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

        jLabelAceptar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabelAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAceptar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAceptar.setText("Aceptar");

        javax.swing.GroupLayout jPanelButtonAceptarLayout = new javax.swing.GroupLayout(jPanelButtonAceptar);
        jPanelButtonAceptar.setLayout(jPanelButtonAceptarLayout);
        jPanelButtonAceptarLayout.setHorizontalGroup(
            jPanelButtonAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonAceptarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonAceptarLayout.setVerticalGroup(
            jPanelButtonAceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelBusqueda.setBackground(new java.awt.Color(51, 51, 51));

        jButtonCoefiente.setText("M");
        jButtonCoefiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCoefienteActionPerformed(evt);
            }
        });

        jTextFieldCoeficiente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCoeficienteFocusLost(evt);
            }
        });
        jTextFieldCoeficiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCoeficienteKeyTyped(evt);
            }
        });

        jLabelCoeficiente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelCoeficiente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCoeficiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCoeficiente.setText("Coeficiente");

        jTextFieldBuscarInicio.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldBuscarInicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextFieldBuscarInicio.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBuscarInicio.setBorder(null);
        jTextFieldBuscarInicio.setCaretColor(new java.awt.Color(255, 255, 255));

        jPanelButtonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelButtonBuscarLayout.setVerticalGroup(
            jPanelButtonBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelButtonRefrescar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonRefrescar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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

        jLabelRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/img/cargando_blanco.png"))); // NOI18N

        javax.swing.GroupLayout jPanelButtonRefrescarLayout = new javax.swing.GroupLayout(jPanelButtonRefrescar);
        jPanelButtonRefrescar.setLayout(jPanelButtonRefrescarLayout);
        jPanelButtonRefrescarLayout.setHorizontalGroup(
            jPanelButtonRefrescarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonRefrescarLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabelRefrescar)
                .addGap(10, 10, 10))
        );
        jPanelButtonRefrescarLayout.setVerticalGroup(
            jPanelButtonRefrescarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanelBusquedaLayout = new javax.swing.GroupLayout(jPanelBusqueda);
        jPanelBusqueda.setLayout(jPanelBusquedaLayout);
        jPanelBusquedaLayout.setHorizontalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jTextFieldBuscarInicio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelCoeficiente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                        .addComponent(jTextFieldCoeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCoefiente))
                    .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                        .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelButtonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanelBusquedaLayout.setVerticalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelCoeficiente)
                    .addComponent(jTextFieldCoeficiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCoefiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldBuscarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelButtonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanelNotificacion.setBackground(new java.awt.Color(51, 51, 51));

        jLabelNotificaciones.setBackground(new java.awt.Color(51, 51, 51));
        jLabelNotificaciones.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabelNotificaciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNotificaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNotificaciones.setText("Notificaciones");
        jLabelNotificaciones.setOpaque(true);

        javax.swing.GroupLayout jPanelNotificacionLayout = new javax.swing.GroupLayout(jPanelNotificacion);
        jPanelNotificacion.setLayout(jPanelNotificacionLayout);
        jPanelNotificacionLayout.setHorizontalGroup(
            jPanelNotificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNotificacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNotificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelNotificacionLayout.setVerticalGroup(
            jPanelNotificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelNotificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNotificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNotificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBusqueda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jListNotificaciones.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jListNotificaciones.setForeground(new java.awt.Color(51, 51, 51));
        jListNotificaciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "- Bienvenido a Kunz Alquileres!!" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListNotificaciones.setToolTipText("");
        jListNotificaciones.setEnabled(false);
        jListNotificaciones.setFocusable(false);
        jListNotificaciones.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jListNotificaciones);

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addComponent(jPanelButtonCrearEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelButtonCrearEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableEdificioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEdificioMouseClicked
        if(evt.getClickCount() == 1){
            DefaultListModel listaNotificaciones = new DefaultListModel();
            String nomEdif = String.valueOf(jTableEdificio.getValueAt(jTableEdificio.getSelectedRow(),1));
            int idEdificio = Integer.valueOf(String.valueOf(jTableEdificio.getValueAt(jTableEdificio.getSelectedRow(),0)));
            
            if(unaControladora.getCantAlquileresGenerados()  > 0){
                listaNotificaciones.addElement("Se han generado "+unaControladora.getCantAlquileresGenerados()+" Alquileres.");
            }else{
                listaNotificaciones.addElement("No se han generado nuevos alquileres.");
            }
            listaNotificaciones.addElement(" ");
            
            listaNotificaciones.addElement("Bienvenido a "+nomEdif+"!!");
            listaNotificaciones.addElement(" ");

            if(unaControladora.obtenerEdificios().isEmpty()){
                listaNotificaciones.addElement("Todo listo para empezar su utilizacion.");
            }
        
            for(String msj : unaControladora.notificaciones(idEdificio)){
                listaNotificaciones.addElement("- "+msj+".");
            }
            
            jListNotificaciones.setModel(listaNotificaciones);
        }else if(evt.getClickCount() == 2){
            if(this.jTableEdificio.isRowSelected(jTableEdificio.getSelectedRow())){
                int fila = jTableEdificio.getSelectedRow();
                String id = jTableEdificio.getValueAt(fila, 0).toString();
                long idEdificio = Long.parseLong(id);

                String nombreEdificio = unaControladora.obtenerEdificio(idEdificio).getNombre();

                new mainFrame(idEdificio, nombreEdificio).setVisible(true);
                this.dispose();
            }
       }
    }//GEN-LAST:event_jTableEdificioMouseClicked

    private void jPanelButtonCrearEdificioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCrearEdificioMouseMoved
        this.jPanelButtonCrearEdificio.setBackground(new Color(255,255,255));
        this.jPanelButtonCrearEdificio.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelCrearEdificio.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonCrearEdificioMouseMoved

    private void jPanelButtonCrearEdificioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCrearEdificioMouseClicked
        vtnEdificio ventanaEdificio = new vtnEdificio(this);
        ventanaEdificio.setVisible(true);
    }//GEN-LAST:event_jPanelButtonCrearEdificioMouseClicked

    private void jPanelButtonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAceptarMouseClicked
        try{
            if(jTableEdificio.isRowSelected(jTableEdificio.getSelectedRow())){
                int fila = jTableEdificio.getSelectedRow()/*, dia, mes, anio*/;
                String id = jTableEdificio.getValueAt(fila, 0).toString();
                long idEdificio = Long.parseLong(id);
                String nombreEdificio = unaControladora.obtenerEdificio(idEdificio).getNombre();
                new mainFrame(idEdificio, nombreEdificio).setVisible(true);            
                this.dispose();
            }else{
                if(jTextFieldCoeficiente.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un Edificio y cargar el Coeficiente.", "", JOptionPane.WARNING_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un Edificio.", "", JOptionPane.WARNING_MESSAGE);
                }
            }
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Seleccione un Edificio.", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jPanelButtonAceptarMouseClicked

    private void jPanelButtonAceptarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAceptarMouseMoved
        this.jPanelButtonAceptar.setBackground(new Color(255,255,255));
        this.jPanelButtonAceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelAceptar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonAceptarMouseMoved

    private void jPanelButtonCrearEdificioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCrearEdificioMouseExited
        this.jPanelButtonCrearEdificio.setBackground(new Color(51,51,51));
        this.jLabelCrearEdificio.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonCrearEdificioMouseExited

    private void jPanelButtonAceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonAceptarMouseExited
        this.jPanelButtonAceptar.setBackground(new Color(51,51,51));
        this.jLabelAceptar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonAceptarMouseExited

    private void jPanelButtonRefrescarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseMoved
        ImageIcon refresh = new ImageIcon(getClass().getResource("/Visual/img/cargando.png"));
        
        this.jPanelButtonRefrescar.setBackground(new Color(255,255,255));
        this.jPanelButtonRefrescar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelRefrescar.setIcon(refresh);
    }//GEN-LAST:event_jPanelButtonRefrescarMouseMoved

    private void jPanelButtonRefrescarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseExited
        ImageIcon refresh = new ImageIcon(getClass().getResource("/Visual/img/cargando_blanco.png"));
        
        this.jPanelButtonRefrescar.setBackground(new Color(51,51,51));
        this.jPanelButtonRefrescar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,255,255)));
        this.jLabelRefrescar.setIcon(refresh);
    }//GEN-LAST:event_jPanelButtonRefrescarMouseExited

    private void jPanelButtonRefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseClicked
        this.jTextFieldBuscarInicio.setText(null);
        busqueda = false;
        cargarEdificios("");
    }//GEN-LAST:event_jPanelButtonRefrescarMouseClicked

    private void jPanelButtonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseClicked
        if(!"".equals(jTextFieldBuscarInicio.getText())){
            busqueda = true;
            cargarEdificios(jTextFieldBuscarInicio.getText().toUpperCase());
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un nombre a buscar.", "", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jPanelButtonBuscarMouseClicked

    private void jPanelButtonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseExited
        ImageIcon buscar = new ImageIcon(getClass().getResource("/Visual/img/lupa_blanca.png"));
        
        this.jPanelButtonBuscar.setBackground(new Color(51,51,51));
        this.jPanelButtonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,255,255)));
        this.jLabelBuscar.setIcon(buscar);
    }//GEN-LAST:event_jPanelButtonBuscarMouseExited

    private void jPanelButtonBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonBuscarMouseMoved
        ImageIcon buscar = new ImageIcon(getClass().getResource("/Visual/img/lupa_negra.png"));
        
        this.jPanelButtonBuscar.setBackground(new Color(255,255,255));
        this.jLabelBuscar.setIcon(buscar);
    }//GEN-LAST:event_jPanelButtonBuscarMouseMoved

    private void jTextFieldCoeficienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCoeficienteKeyTyped
        if (evt.getKeyChar() == evt.VK_ENTER) {
            jButtonCoefienteActionPerformed(null);
        }
        char ingreso = evt.getKeyChar();
        if(Character.isLetter(ingreso)){
            evt.consume();
        }else{
            if(jLabelCoeficiente.getForeground() == Color.red){
                jLabelCoeficiente.setForeground(Color.white);
            }
        }
    }//GEN-LAST:event_jTextFieldCoeficienteKeyTyped

    private void jTextFieldCoeficienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCoeficienteFocusLost
        jButtonCoefienteActionPerformed(null);
    }//GEN-LAST:event_jTextFieldCoeficienteFocusLost

    private void jButtonCoefienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCoefienteActionPerformed
        if(!jTextFieldCoeficiente.getText().isEmpty()){
            try {
                float valor = Float.valueOf(jTextFieldCoeficiente.getText());
                if(unaControladora.obtenerCoeficiente() != null){
                    if(unaControladora.obtenerCoeficiente().getValor() != valor){
                        unaControladora.modificarCoeficiente(unaControladora.obtenerCoeficiente().getId(), unaControladora.obtenerCoeficiente().getNombre(), valor);
                        JOptionPane.showMessageDialog(null, "El Coeficiente se ha modificado con éxito.", "", JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    unaControladora.altaCoeficiente("Coeficiente", valor);
                    JOptionPane.showMessageDialog(null, "El Coeficiente se ha guardado con éxito.", "", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonCoefienteActionPerformed
    
    public void cargarEdificios(String buscar){
        limpiarTabla();
        String datos[] = new String[3];
        List<Logica.Edificio> edificios = unaControladora.obtenerEdificios();
        
        if(busqueda){
            Logica.Edificio unEdi = unaControladora.buscarEdificioPorNombre(buscar);
            
            if(unEdi != null){
                limpiarTabla();
                edificios.clear();
                edificios.add(unEdi);
            }else{
                JOptionPane.showMessageDialog(null, "No existe el Edificio: "+buscar+".");
            }
        }
        
        for(Logica.Edificio unEdificio : edificios){
            datos[0] = String.valueOf(unEdificio.getId());
            datos[1] = unEdificio.getNombre();
            datos[2] = unEdificio.getDireccion();

            tablaEdificio.addRow(datos);
        }
        
        this.jTableEdificio.setModel(tablaEdificio);
    }
    
    public void limpiarTabla(){
        int tam = tablaEdificio.getRowCount();
        for(int i = 0; i < tam; i++){
            tablaEdificio.removeRow(0);
        }
    }
    
    public void generarAlquileres() throws Exception{
        unaControladora.generarAlquiler();
    }
    
    private void eliminarEdificioSeleccionado(){
        JPopupMenu popupMenu = new JPopupMenu();
        
        JMenuItem menuItem = new JMenuItem("Eliminar");
        menuItem.addActionListener((ActionEvent e) -> {
            int fila = jTableEdificio.getSelectedRow();
            
            if(fila >= 0){
                int confirmacion = JOptionPane.showConfirmDialog(null, "Desea realizar esta operación?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(confirmacion == 0){
                    try{
                        long idEdificio = Long.parseLong(jTableEdificio.getValueAt(fila, 0).toString());
                        unaControladora.bajaEdificio(idEdificio);
                        tablaEdificio.removeRow(fila);
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "No se ha podido eliminar el Edificio. "+ex);
                    }
                }
            }
        });
        
        popupMenu.add(menuItem);
        jTableEdificio.setComponentPopupMenu(popupMenu);
    }
    
    private void cargarCoeficiente() {
        if(unaControladora.obtenerCoeficiente() != null){
            jTextFieldCoeficiente.setText(String.valueOf(unaControladora.obtenerCoeficiente().getValor()));
        }else{
            jLabelCoeficiente.setForeground(Color.red);
            jTextFieldCoeficiente.requestFocus();
        }
    }
    /*
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        //Create and display the form 
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Inicio().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error: "+ex);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCoefiente;
    private javax.swing.JLabel jLabelAceptar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelCoeficiente;
    private javax.swing.JLabel jLabelCrearEdificio;
    private javax.swing.JLabel jLabelNotificaciones;
    private javax.swing.JLabel jLabelRefrescar;
    private javax.swing.JList<String> jListNotificaciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JPanel jPanelButtonAceptar;
    private javax.swing.JPanel jPanelButtonBuscar;
    private javax.swing.JPanel jPanelButtonCrearEdificio;
    private javax.swing.JPanel jPanelButtonRefrescar;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelNotificacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableEdificio;
    private javax.swing.JTextField jTextFieldBuscarInicio;
    private javax.swing.JTextField jTextFieldCoeficiente;
    // End of variables declaration//GEN-END:variables
}
