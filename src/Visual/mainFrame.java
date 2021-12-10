package Visual;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mainFrame extends javax.swing.JFrame {
    private long idEdificio = 0;
    private final String nombreEdificio;
    private boolean bloquearMenu = false;
    private final ControladoraV unaControladora = new ControladoraV();
    
    public mainFrame(long idEdificio, String nombreEdificio) {
        initComponents();
        this.setTitle("Sistema de Gestión de Alquileres");
        this.idEdificio = idEdificio;
        this.nombreEdificio = nombreEdificio;
        if(idEdificio == 0){
            bloquearMenu = true;
        }
        this.setExtendedState(MAXIMIZED_BOTH);
        agregarPanelPrincipal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jPanelMenuInicio = new javax.swing.JPanel();
        jLabelInicio = new javax.swing.JLabel();
        jPanelMenuEdificio = new javax.swing.JPanel();
        jLabelEdificio = new javax.swing.JLabel();
        jPanelMenuDepartamento = new javax.swing.JPanel();
        jLabelDepartamento = new javax.swing.JLabel();
        jPanelMenuCochera = new javax.swing.JPanel();
        jLabelCochera = new javax.swing.JLabel();
        jPanelMenuServicio = new javax.swing.JPanel();
        jLabelServicio = new javax.swing.JLabel();
        jPanelMenuInquilino = new javax.swing.JPanel();
        jLabelInquilino = new javax.swing.JLabel();
        jPanelMenuGarante = new javax.swing.JPanel();
        jLabelGarante = new javax.swing.JLabel();
        jPanelMenuExpensa = new javax.swing.JPanel();
        jLabelExpensa = new javax.swing.JLabel();
        jPanelMenuCoeficiente = new javax.swing.JPanel();
        jLabelCoeficiente = new javax.swing.JLabel();
        jPanelMenuPago = new javax.swing.JPanel();
        jLabelPago = new javax.swing.JLabel();
        jPanelMenuAlquiler = new javax.swing.JPanel();
        jLabelAlquiler = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelPie = new javax.swing.JPanel();
        jPanelButtonSeleccionarEdificio = new javax.swing.JPanel();
        jLabelSeleccionarEdificio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));

        jPanelMenuInicio.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenuInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenuInicio.setPreferredSize(new java.awt.Dimension(103, 52));
        jPanelMenuInicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelMenuInicioMouseMoved(evt);
            }
        });
        jPanelMenuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenuInicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMenuInicioMouseExited(evt);
            }
        });

        jLabelInicio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInicio.setText("Inicio");

        javax.swing.GroupLayout jPanelMenuInicioLayout = new javax.swing.GroupLayout(jPanelMenuInicio);
        jPanelMenuInicio.setLayout(jPanelMenuInicioLayout);
        jPanelMenuInicioLayout.setHorizontalGroup(
            jPanelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuInicioLayout.setVerticalGroup(
            jPanelMenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelMenuEdificio.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenuEdificio.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMenuEdificio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenuEdificio.setPreferredSize(new java.awt.Dimension(103, 52));
        jPanelMenuEdificio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelMenuEdificioMouseMoved(evt);
            }
        });
        jPanelMenuEdificio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenuEdificioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMenuEdificioMouseExited(evt);
            }
        });

        jLabelEdificio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabelEdificio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEdificio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEdificio.setText("Edificio");

        javax.swing.GroupLayout jPanelMenuEdificioLayout = new javax.swing.GroupLayout(jPanelMenuEdificio);
        jPanelMenuEdificio.setLayout(jPanelMenuEdificioLayout);
        jPanelMenuEdificioLayout.setHorizontalGroup(
            jPanelMenuEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuEdificioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEdificio, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuEdificioLayout.setVerticalGroup(
            jPanelMenuEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEdificio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jPanelMenuDepartamento.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenuDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMenuDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenuDepartamento.setPreferredSize(new java.awt.Dimension(103, 52));
        jPanelMenuDepartamento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelMenuDepartamentoMouseMoved(evt);
            }
        });
        jPanelMenuDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenuDepartamentoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMenuDepartamentoMouseExited(evt);
            }
        });

        jLabelDepartamento.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabelDepartamento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDepartamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDepartamento.setText("Departamento");

        javax.swing.GroupLayout jPanelMenuDepartamentoLayout = new javax.swing.GroupLayout(jPanelMenuDepartamento);
        jPanelMenuDepartamento.setLayout(jPanelMenuDepartamentoLayout);
        jPanelMenuDepartamentoLayout.setHorizontalGroup(
            jPanelMenuDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuDepartamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuDepartamentoLayout.setVerticalGroup(
            jPanelMenuDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelDepartamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelMenuCochera.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenuCochera.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMenuCochera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenuCochera.setPreferredSize(new java.awt.Dimension(103, 52));
        jPanelMenuCochera.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelMenuCocheraMouseMoved(evt);
            }
        });
        jPanelMenuCochera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenuCocheraMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMenuCocheraMouseExited(evt);
            }
        });

        jLabelCochera.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabelCochera.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCochera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCochera.setText("Cochera");

        javax.swing.GroupLayout jPanelMenuCocheraLayout = new javax.swing.GroupLayout(jPanelMenuCochera);
        jPanelMenuCochera.setLayout(jPanelMenuCocheraLayout);
        jPanelMenuCocheraLayout.setHorizontalGroup(
            jPanelMenuCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuCocheraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCochera, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuCocheraLayout.setVerticalGroup(
            jPanelMenuCocheraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCochera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelMenuServicio.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenuServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenuServicio.setPreferredSize(new java.awt.Dimension(103, 52));
        jPanelMenuServicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelMenuServicioMouseMoved(evt);
            }
        });
        jPanelMenuServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenuServicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMenuServicioMouseExited(evt);
            }
        });

        jLabelServicio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabelServicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelServicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelServicio.setText("Servicio");

        javax.swing.GroupLayout jPanelMenuServicioLayout = new javax.swing.GroupLayout(jPanelMenuServicio);
        jPanelMenuServicio.setLayout(jPanelMenuServicioLayout);
        jPanelMenuServicioLayout.setHorizontalGroup(
            jPanelMenuServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuServicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelServicio, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuServicioLayout.setVerticalGroup(
            jPanelMenuServicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelServicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelMenuInquilino.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenuInquilino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenuInquilino.setPreferredSize(new java.awt.Dimension(103, 52));
        jPanelMenuInquilino.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelMenuInquilinoMouseMoved(evt);
            }
        });
        jPanelMenuInquilino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenuInquilinoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMenuInquilinoMouseExited(evt);
            }
        });

        jLabelInquilino.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabelInquilino.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInquilino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInquilino.setText("Inquilino");

        javax.swing.GroupLayout jPanelMenuInquilinoLayout = new javax.swing.GroupLayout(jPanelMenuInquilino);
        jPanelMenuInquilino.setLayout(jPanelMenuInquilinoLayout);
        jPanelMenuInquilinoLayout.setHorizontalGroup(
            jPanelMenuInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuInquilinoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInquilino, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuInquilinoLayout.setVerticalGroup(
            jPanelMenuInquilinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelInquilino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelMenuGarante.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenuGarante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenuGarante.setPreferredSize(new java.awt.Dimension(103, 52));
        jPanelMenuGarante.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelMenuGaranteMouseMoved(evt);
            }
        });
        jPanelMenuGarante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenuGaranteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMenuGaranteMouseExited(evt);
            }
        });

        jLabelGarante.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabelGarante.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGarante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGarante.setText("Garante");

        javax.swing.GroupLayout jPanelMenuGaranteLayout = new javax.swing.GroupLayout(jPanelMenuGarante);
        jPanelMenuGarante.setLayout(jPanelMenuGaranteLayout);
        jPanelMenuGaranteLayout.setHorizontalGroup(
            jPanelMenuGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuGaranteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGarante, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuGaranteLayout.setVerticalGroup(
            jPanelMenuGaranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelGarante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelMenuExpensa.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenuExpensa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenuExpensa.setPreferredSize(new java.awt.Dimension(103, 52));
        jPanelMenuExpensa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelMenuExpensaMouseMoved(evt);
            }
        });
        jPanelMenuExpensa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenuExpensaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMenuExpensaMouseExited(evt);
            }
        });

        jLabelExpensa.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabelExpensa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExpensa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExpensa.setText("Expensa");

        javax.swing.GroupLayout jPanelMenuExpensaLayout = new javax.swing.GroupLayout(jPanelMenuExpensa);
        jPanelMenuExpensa.setLayout(jPanelMenuExpensaLayout);
        jPanelMenuExpensaLayout.setHorizontalGroup(
            jPanelMenuExpensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuExpensaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelExpensa, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuExpensaLayout.setVerticalGroup(
            jPanelMenuExpensaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelExpensa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelMenuCoeficiente.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenuCoeficiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenuCoeficiente.setPreferredSize(new java.awt.Dimension(103, 52));
        jPanelMenuCoeficiente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelMenuCoeficienteMouseMoved(evt);
            }
        });
        jPanelMenuCoeficiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenuCoeficienteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMenuCoeficienteMouseExited(evt);
            }
        });

        jLabelCoeficiente.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelCoeficiente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCoeficiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCoeficiente.setText("Coeficiente");

        javax.swing.GroupLayout jPanelMenuCoeficienteLayout = new javax.swing.GroupLayout(jPanelMenuCoeficiente);
        jPanelMenuCoeficiente.setLayout(jPanelMenuCoeficienteLayout);
        jPanelMenuCoeficienteLayout.setHorizontalGroup(
            jPanelMenuCoeficienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuCoeficienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCoeficiente, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
        jPanelMenuCoeficienteLayout.setVerticalGroup(
            jPanelMenuCoeficienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCoeficiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelMenuPago.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenuPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenuPago.setPreferredSize(new java.awt.Dimension(103, 52));
        jPanelMenuPago.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelMenuPagoMouseMoved(evt);
            }
        });
        jPanelMenuPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenuPagoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMenuPagoMouseExited(evt);
            }
        });

        jLabelPago.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelPago.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPago.setText("Pago");

        javax.swing.GroupLayout jPanelMenuPagoLayout = new javax.swing.GroupLayout(jPanelMenuPago);
        jPanelMenuPago.setLayout(jPanelMenuPagoLayout);
        jPanelMenuPagoLayout.setHorizontalGroup(
            jPanelMenuPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPago, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuPagoLayout.setVerticalGroup(
            jPanelMenuPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelMenuAlquiler.setBackground(new java.awt.Color(51, 51, 51));
        jPanelMenuAlquiler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenuAlquiler.setPreferredSize(new java.awt.Dimension(103, 52));
        jPanelMenuAlquiler.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelMenuAlquilerMouseMoved(evt);
            }
        });
        jPanelMenuAlquiler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMenuAlquilerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelMenuAlquilerMouseExited(evt);
            }
        });

        jLabelAlquiler.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        jLabelAlquiler.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAlquiler.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAlquiler.setText("Alquiler");

        javax.swing.GroupLayout jPanelMenuAlquilerLayout = new javax.swing.GroupLayout(jPanelMenuAlquiler);
        jPanelMenuAlquiler.setLayout(jPanelMenuAlquilerLayout);
        jPanelMenuAlquilerLayout.setHorizontalGroup(
            jPanelMenuAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuAlquilerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuAlquilerLayout.setVerticalGroup(
            jPanelMenuAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAlquiler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addComponent(jPanelMenuInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenuEdificio, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenuDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenuCochera, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenuServicio, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenuInquilino, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenuGarante, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenuCoeficiente, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenuAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenuExpensa, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenuPago, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMenuAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelMenuEdificio, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(jPanelMenuDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(jPanelMenuInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(jPanelMenuCochera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(jPanelMenuServicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(jPanelMenuInquilino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(jPanelMenuGarante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(jPanelMenuExpensa, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(jPanelMenuCoeficiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(jPanelMenuPago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))))
        );

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        jPanelPie.setBackground(new java.awt.Color(255, 255, 255));

        jPanelButtonSeleccionarEdificio.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonSeleccionarEdificio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelButtonSeleccionarEdificio.setPreferredSize(new java.awt.Dimension(100, 49));
        jPanelButtonSeleccionarEdificio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelButtonSeleccionarEdificioMouseMoved(evt);
            }
        });
        jPanelButtonSeleccionarEdificio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonSeleccionarEdificioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonSeleccionarEdificioMouseExited(evt);
            }
        });

        jLabelSeleccionarEdificio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelSeleccionarEdificio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeleccionarEdificio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSeleccionarEdificio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visual/img/volver_blanco.png"))); // NOI18N
        jLabelSeleccionarEdificio.setText("Seleccionar Edificio");

        javax.swing.GroupLayout jPanelButtonSeleccionarEdificioLayout = new javax.swing.GroupLayout(jPanelButtonSeleccionarEdificio);
        jPanelButtonSeleccionarEdificio.setLayout(jPanelButtonSeleccionarEdificioLayout);
        jPanelButtonSeleccionarEdificioLayout.setHorizontalGroup(
            jPanelButtonSeleccionarEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonSeleccionarEdificioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSeleccionarEdificio, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonSeleccionarEdificioLayout.setVerticalGroup(
            jPanelButtonSeleccionarEdificioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSeleccionarEdificio, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelPieLayout = new javax.swing.GroupLayout(jPanelPie);
        jPanelPie.setLayout(jPanelPieLayout);
        jPanelPieLayout.setHorizontalGroup(
            jPanelPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPieLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelButtonSeleccionarEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1028, Short.MAX_VALUE))
        );
        jPanelPieLayout.setVerticalGroup(
            jPanelPieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPieLayout.createSequentialGroup()
                .addComponent(jPanelButtonSeleccionarEdificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelPie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelMenuEdificioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuEdificioMouseClicked
        if(!bloquearMenu || this.idEdificio != 0){
            PanelEdificio vtnEdificio;
            vtnEdificio = new PanelEdificio(idEdificio);
            agregarPanel(vtnEdificio);
        }else{
            JOptionPane.showMessageDialog(null, "Ya se encuentra ubicado en Edificio.");
        }
    }//GEN-LAST:event_jPanelMenuEdificioMouseClicked

    private void jPanelMenuEdificioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuEdificioMouseMoved
        this.jPanelMenuEdificio.setBackground(new Color(255,255,255));
        this.jPanelMenuEdificio.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelEdificio.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelMenuEdificioMouseMoved

    private void jPanelMenuInicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuInicioMouseMoved
        this.jPanelMenuInicio.setBackground(new Color(255,255,255));
        this.jPanelMenuInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelInicio.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelMenuInicioMouseMoved

    private void jPanelMenuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuInicioMouseClicked
        if(!bloquearMenu || this.idEdificio != 0){
            Logica.Edificio unEdi = unaControladora.obtenerEdificio(idEdificio);
            if(unEdi != null){
                PanelPrincipal vtnPrincipal = new PanelPrincipal(idEdificio, nombreEdificio);
                agregarPanel(vtnPrincipal);
            }else{
                JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Debe crear o seleccionar un edificio.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Para desbloquear previamente debe Seleccionar un Edificio.");
        }
    }//GEN-LAST:event_jPanelMenuInicioMouseClicked

    private void jPanelMenuDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuDepartamentoMouseClicked
        if(!bloquearMenu || this.idEdificio != 0){
            Logica.Edificio unEdi = unaControladora.obtenerEdificio(idEdificio);
            if(unEdi != null){
                PanelDepartamento vtnDepartamento = new PanelDepartamento(idEdificio);
                agregarPanel(vtnDepartamento);
            }else{
                JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Debe crear o seleccionar un edificio.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Para desbloquear previamente debe Seleccionar un Edificio.");
        }
    }//GEN-LAST:event_jPanelMenuDepartamentoMouseClicked

    private void jPanelMenuDepartamentoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuDepartamentoMouseMoved
        this.jPanelMenuDepartamento.setBackground(new Color(255,255,255));
        this.jPanelMenuDepartamento.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelDepartamento.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelMenuDepartamentoMouseMoved

    private void jPanelMenuCocheraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuCocheraMouseMoved
        this.jPanelMenuCochera.setBackground(new Color(255,255,255));
        this.jPanelMenuCochera.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelCochera.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelMenuCocheraMouseMoved

    private void jPanelMenuServicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuServicioMouseMoved
        this.jPanelMenuServicio.setBackground(new Color(255,255,255));
        this.jPanelMenuServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelServicio.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelMenuServicioMouseMoved

    private void jPanelMenuInquilinoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuInquilinoMouseMoved
        this.jPanelMenuInquilino.setBackground(new Color(255,255,255));
        this.jPanelMenuInquilino.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelInquilino.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelMenuInquilinoMouseMoved

    private void jPanelMenuCocheraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuCocheraMouseClicked
        if(!bloquearMenu){
            Logica.Edificio unEdi = unaControladora.obtenerEdificio(idEdificio);
            if(unEdi != null){
                PanelCochera vtnCochera = new PanelCochera(idEdificio);
                agregarPanel(vtnCochera);
            }else{
                JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Debe crear o seleccionar un edificio.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Para desbloquear previamente debe Seleccionar un Edificio.");
        }
    }//GEN-LAST:event_jPanelMenuCocheraMouseClicked

    private void jPanelMenuServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuServicioMouseClicked
        if(!bloquearMenu){
            Logica.Edificio unEdi = unaControladora.obtenerEdificio(idEdificio);
            if(unEdi != null){
                PanelServicio vtnServicio = new PanelServicio(idEdificio);
                agregarPanel(vtnServicio);
            }else{
                JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Debe crear o seleccionar un edificio.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Para desbloquear previamente debe Seleccionar un Edificio.");
        }
    }//GEN-LAST:event_jPanelMenuServicioMouseClicked

    private void jPanelMenuInquilinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuInquilinoMouseClicked
        if(!bloquearMenu){
            Logica.Edificio unEdi = unaControladora.obtenerEdificio(idEdificio);
            if(unEdi != null){
                PanelInquilino vtnInquilino = new PanelInquilino(idEdificio);
                agregarPanel(vtnInquilino);
            }else{
                JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Debe crear o seleccionar un edificio.");
            }            
        }else{
            JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Para desbloquear previamente debe Seleccionar un Edificio.");
        }
    }//GEN-LAST:event_jPanelMenuInquilinoMouseClicked

    private void jPanelMenuGaranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuGaranteMouseClicked
        if(!bloquearMenu){
            Logica.Edificio unEdi = unaControladora.obtenerEdificio(idEdificio);
            if(unEdi != null){
                PanelGarante vtnGarante = new PanelGarante(idEdificio);
                agregarPanel(vtnGarante);
            }else{
                JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Debe crear o seleccionar un edificio.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Para desbloquear previamente debe Seleccionar un Edificio.");
        }
    }//GEN-LAST:event_jPanelMenuGaranteMouseClicked

    private void jPanelMenuAlquilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuAlquilerMouseClicked
        if(!bloquearMenu){
            Logica.Edificio unEdi = unaControladora.obtenerEdificio(idEdificio);
            if(unEdi != null){
                PanelAlquiler vtnAlquiler = new PanelAlquiler(idEdificio);
                agregarPanel(vtnAlquiler);
            }else{
                JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Debe crear o seleccionar un edificio.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Para desbloquear previamente debe Seleccionar un Edificio.");
        }
    }//GEN-LAST:event_jPanelMenuAlquilerMouseClicked

    private void jPanelMenuExpensaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuExpensaMouseClicked
        if(!bloquearMenu){
            Logica.Edificio unEdi = unaControladora.obtenerEdificio(idEdificio);
            if(unEdi != null){
                try {
                    PanelExpensa vtnExpensa;
                    vtnExpensa = new PanelExpensa(idEdificio);
                    agregarPanel(vtnExpensa);
                } catch (Exception ex) {
                    Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Debe crear o seleccionar un edificio.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Para desbloquear previamente debe Seleccionar un Edificio.");
        }
    }//GEN-LAST:event_jPanelMenuExpensaMouseClicked

    private void jPanelMenuCoeficienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuCoeficienteMouseClicked
        if(!bloquearMenu){
            Logica.Edificio unEdi = unaControladora.obtenerEdificio(idEdificio);
            if(unEdi != null){
                PanelCoeficienteDorm vtnCoeficiente = new PanelCoeficienteDorm(idEdificio);
                agregarPanel(vtnCoeficiente);
            }else{
                JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Debe crear o seleccionar un edificio.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Para desbloquear previamente debe Seleccionar un Edificio.");
        }
    }//GEN-LAST:event_jPanelMenuCoeficienteMouseClicked

    private void jPanelMenuInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuInicioMouseExited
        this.jPanelMenuInicio.setBackground(new Color(51,51,51));
        this.jLabelInicio.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelMenuInicioMouseExited

    private void jPanelMenuExpensaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuExpensaMouseMoved
        this.jPanelMenuExpensa.setBackground(new Color(255,255,255));
        this.jPanelMenuExpensa.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelExpensa.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelMenuExpensaMouseMoved

    private void jPanelMenuAlquilerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuAlquilerMouseMoved
        this.jPanelMenuAlquiler.setBackground(new Color(255,255,255));
        this.jPanelMenuAlquiler.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelAlquiler.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelMenuAlquilerMouseMoved

    private void jPanelMenuCoeficienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuCoeficienteMouseMoved
        this.jPanelMenuCoeficiente.setBackground(new Color(255,255,255));
        this.jPanelMenuCoeficiente.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelCoeficiente.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelMenuCoeficienteMouseMoved

    private void jPanelMenuGaranteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuGaranteMouseMoved
        this.jPanelMenuGarante.setBackground(new Color(255,255,255));
        this.jPanelMenuGarante.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelGarante.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelMenuGaranteMouseMoved

    private void jPanelMenuPagoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuPagoMouseMoved
        this.jPanelMenuPago.setBackground(new Color(255,255,255));
        this.jPanelMenuPago.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelPago.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelMenuPagoMouseMoved

    private void jPanelMenuPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuPagoMouseExited
        this.jPanelMenuPago.setBackground(new Color(51,51,51));
        this.jLabelPago.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelMenuPagoMouseExited

    private void jPanelMenuExpensaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuExpensaMouseExited
        this.jPanelMenuExpensa.setBackground(new Color(51,51,51));
        this.jLabelExpensa.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelMenuExpensaMouseExited

    private void jPanelMenuAlquilerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuAlquilerMouseExited
        this.jPanelMenuAlquiler.setBackground(new Color(51,51,51));
        this.jLabelAlquiler.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelMenuAlquilerMouseExited

    private void jPanelMenuCoeficienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuCoeficienteMouseExited
        this.jPanelMenuCoeficiente.setBackground(new Color(51,51,51));
        this.jLabelCoeficiente.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelMenuCoeficienteMouseExited

    private void jPanelMenuGaranteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuGaranteMouseExited
        this.jPanelMenuGarante.setBackground(new Color(51,51,51));
        this.jLabelGarante.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelMenuGaranteMouseExited

    private void jPanelMenuInquilinoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuInquilinoMouseExited
        this.jPanelMenuInquilino.setBackground(new Color(51,51,51));
        this.jLabelInquilino.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelMenuInquilinoMouseExited

    private void jPanelMenuServicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuServicioMouseExited
        this.jPanelMenuServicio.setBackground(new Color(51,51,51));
        this.jLabelServicio.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelMenuServicioMouseExited

    private void jPanelMenuCocheraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuCocheraMouseExited
        this.jPanelMenuCochera.setBackground(new Color(51,51,51));
        this.jLabelCochera.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelMenuCocheraMouseExited

    private void jPanelMenuDepartamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuDepartamentoMouseExited
        this.jPanelMenuDepartamento.setBackground(new Color(51,51,51));
        this.jLabelDepartamento.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelMenuDepartamentoMouseExited

    private void jPanelMenuEdificioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuEdificioMouseExited
        this.jPanelMenuEdificio.setBackground(new Color(51,51,51));
        this.jLabelEdificio.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelMenuEdificioMouseExited

    private void jPanelButtonSeleccionarEdificioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonSeleccionarEdificioMouseMoved
        ImageIcon volver = new ImageIcon(getClass().getResource("/Visual/img/volver_negro.png"));
        
        this.jPanelButtonSeleccionarEdificio.setBackground(new Color(255,255,255));
        this.jPanelButtonSeleccionarEdificio.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelSeleccionarEdificio.setForeground(new Color(51,51,51));
        this.jLabelSeleccionarEdificio.setIcon(volver);
    }//GEN-LAST:event_jPanelButtonSeleccionarEdificioMouseMoved

    private void jPanelButtonSeleccionarEdificioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonSeleccionarEdificioMouseExited
        ImageIcon volver = new ImageIcon(getClass().getResource("/Visual/img/volver_blanco.png"));
        
        this.jPanelButtonSeleccionarEdificio.setBackground(new Color(51,51,51));
        this.jLabelSeleccionarEdificio.setForeground(new Color(255,255,255));
        this.jLabelSeleccionarEdificio.setIcon(volver);
    }//GEN-LAST:event_jPanelButtonSeleccionarEdificioMouseExited

    private void jPanelButtonSeleccionarEdificioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonSeleccionarEdificioMouseClicked
        try {
            new Inicio(null).setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanelButtonSeleccionarEdificioMouseClicked

    private void jPanelMenuPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuPagoMouseClicked
        if(!bloquearMenu){
            Logica.Edificio unEdi = unaControladora.obtenerEdificio(idEdificio);
            if(unEdi != null){
                PanelPago vtnPago = new PanelPago(idEdificio);
                agregarPanel(vtnPago);
            }else{
                JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Debe crear o seleccionar un edificio.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El menú se encuentra bloqueado. Para desbloquear previamente debe Seleccionar un Edificio.");
        }
    }//GEN-LAST:event_jPanelMenuPagoMouseClicked
   
    private void agregarPanelPrincipal(){        
        if(idEdificio != 0){
            PanelPrincipal vtnPrincipal = new PanelPrincipal(idEdificio, nombreEdificio);
            agregarPanel(vtnPrincipal);  // 2do parametro en 1 para la ventana inicio.
        }else{
            PanelEdificio vtnEdificio = new PanelEdificio(idEdificio);
            agregarPanel(vtnEdificio);   // Crear Edificio = 2do parametro en 1 para ir a la ventana Edificio.
        }
    }
    
    private void agregarPanel(JComponent panel){ // Recibe el panel de tipo JComponent (Jerarquía de paneles)
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        panel.setSize(screenSize.width, (screenSize.height)-180);
        this.jPanelPrincipal.removeAll();
        this.jPanelPrincipal.add(panel,BorderLayout.CENTER);
        this.jPanelPrincipal.revalidate();
        this.jPanelPrincipal.repaint();
        
        // Alto del menú (53) y menuInicio windows (48) = 101
        //JOptionPane.showMessageDialog(null, "Ancho: "+screenSize.width+" Alto: "+screenSize.height);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAlquiler;
    private javax.swing.JLabel jLabelCochera;
    private javax.swing.JLabel jLabelCoeficiente;
    private javax.swing.JLabel jLabelDepartamento;
    private javax.swing.JLabel jLabelEdificio;
    private javax.swing.JLabel jLabelExpensa;
    private javax.swing.JLabel jLabelGarante;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelInquilino;
    private javax.swing.JLabel jLabelPago;
    private javax.swing.JLabel jLabelSeleccionarEdificio;
    private javax.swing.JLabel jLabelServicio;
    private javax.swing.JPanel jPanelButtonSeleccionarEdificio;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelMenuAlquiler;
    private javax.swing.JPanel jPanelMenuCochera;
    private javax.swing.JPanel jPanelMenuCoeficiente;
    private javax.swing.JPanel jPanelMenuDepartamento;
    private javax.swing.JPanel jPanelMenuEdificio;
    private javax.swing.JPanel jPanelMenuExpensa;
    private javax.swing.JPanel jPanelMenuGarante;
    private javax.swing.JPanel jPanelMenuInicio;
    private javax.swing.JPanel jPanelMenuInquilino;
    private javax.swing.JPanel jPanelMenuPago;
    private javax.swing.JPanel jPanelMenuServicio;
    private javax.swing.JPanel jPanelPie;
    private javax.swing.JPanel jPanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
