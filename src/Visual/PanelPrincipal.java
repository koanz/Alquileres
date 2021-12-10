package Visual;

import java.awt.Color;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public final class PanelPrincipal extends javax.swing.JPanel {
    private final long idEdificio;
    private final String nombreEdificio;
    private final ControladoraV unaControladora = new ControladoraV();
    private final String colTablaExpensa[] = {"SERVICIOS", "MES","VENCIMIENTO", "TOTAL"};
    private final String colTablaAlquiler[] = {"DPTO", "INQUILINO", "FECHA", "ALQUILER", "OTRAS FACTURAS", "EXPENSA", "COCHERA", "SALDO MES ANT.", "INT. POR ATRASO", "TOTAL"};
    private final DefaultTableModel tablaExpensa = new DefaultTableModel(null, colTablaExpensa);
    private final DefaultTableModel tablaAlquiler = new DefaultTableModel(null, colTablaAlquiler); // No borrar esto, se rompe todo..
    
    public PanelPrincipal(long idEdificio, String nombreEdificio){
        initComponents();
        this.idEdificio = idEdificio;
        this.nombreEdificio = nombreEdificio;
        this.jLabelTituloEdificio.setText(nombreEdificio);
        cargarTablaAlquiler(idEdificio);
        cargarTablaExpensa(idEdificio);
        this.jTableAlquiler.setRowSelectionAllowed(true);
        this.jTableExpensa.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAlquileres = new javax.swing.JPanel();
        jPanelPrincipalTabla1 = new javax.swing.JPanel();
        jLabelTituloEdificio = new javax.swing.JLabel();
        jLabelAlquiler = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlquiler = new javax.swing.JTable();
        jPanelButtonRefrescar = new javax.swing.JPanel();
        jLabelRefrescar = new javax.swing.JLabel();
        jPanelExpensas = new javax.swing.JPanel();
        jLabelExpensa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableExpensa = new javax.swing.JTable();
        jPanelButtonReporte = new javax.swing.JPanel();
        jLabelReporte = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanelAlquileres.setBackground(new java.awt.Color(255, 255, 255));

        jPanelPrincipalTabla1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrincipalTabla1.setPreferredSize(new java.awt.Dimension(890, 315));

        jLabelTituloEdificio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabelTituloEdificio.setText("jLabel1");

        jLabelAlquiler.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelAlquiler.setText("Alquileres");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jTableAlquiler.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTableAlquiler = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        jTableAlquiler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAlquiler.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableAlquiler.setGridColor(new java.awt.Color(255, 255, 255));
        jTableAlquiler.setSelectionBackground(new java.awt.Color(102, 153, 255));
        jTableAlquiler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlquilerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlquiler);

        jPanelButtonRefrescar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonRefrescar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelButtonRefrescar.setPreferredSize(new java.awt.Dimension(100, 49));
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

        javax.swing.GroupLayout jPanelPrincipalTabla1Layout = new javax.swing.GroupLayout(jPanelPrincipalTabla1);
        jPanelPrincipalTabla1.setLayout(jPanelPrincipalTabla1Layout);
        jPanelPrincipalTabla1Layout.setHorizontalGroup(
            jPanelPrincipalTabla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalTabla1Layout.createSequentialGroup()
                .addGroup(jPanelPrincipalTabla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalTabla1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTituloEdificio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelButtonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalTabla1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelPrincipalTabla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAlquiler)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE))))
                .addGap(22, 22, 22))
        );
        jPanelPrincipalTabla1Layout.setVerticalGroup(
            jPanelPrincipalTabla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalTabla1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalTabla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloEdificio)
                    .addComponent(jPanelButtonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabelAlquiler)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelAlquileresLayout = new javax.swing.GroupLayout(jPanelAlquileres);
        jPanelAlquileres.setLayout(jPanelAlquileresLayout);
        jPanelAlquileresLayout.setHorizontalGroup(
            jPanelAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipalTabla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelAlquileresLayout.setVerticalGroup(
            jPanelAlquileresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlquileresLayout.createSequentialGroup()
                .addComponent(jPanelPrincipalTabla1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jPanelExpensas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelExpensas.setPreferredSize(new java.awt.Dimension(496, 315));

        jLabelExpensa.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelExpensa.setText("Expensas");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

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
        jTableExpensa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableExpensa.setGridColor(new java.awt.Color(255, 255, 255));
        jTableExpensa.setPreferredSize(new java.awt.Dimension(300, 312));
        jScrollPane2.setViewportView(jTableExpensa);

        jPanelButtonReporte.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonReporte.setPreferredSize(new java.awt.Dimension(100, 49));
        jPanelButtonReporte.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelButtonReporteMouseMoved(evt);
            }
        });
        jPanelButtonReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonReporteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonReporteMouseExited(evt);
            }
        });

        jLabelReporte.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabelReporte.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReporte.setText("Reporte");

        javax.swing.GroupLayout jPanelButtonReporteLayout = new javax.swing.GroupLayout(jPanelButtonReporte);
        jPanelButtonReporte.setLayout(jPanelButtonReporteLayout);
        jPanelButtonReporteLayout.setHorizontalGroup(
            jPanelButtonReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonReporteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelButtonReporteLayout.setVerticalGroup(
            jPanelButtonReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelExpensasLayout = new javax.swing.GroupLayout(jPanelExpensas);
        jPanelExpensas.setLayout(jPanelExpensasLayout);
        jPanelExpensasLayout.setHorizontalGroup(
            jPanelExpensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExpensasLayout.createSequentialGroup()
                .addGroup(jPanelExpensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelExpensasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelButtonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelExpensasLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelExpensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
                            .addGroup(jPanelExpensasLayout.createSequentialGroup()
                                .addComponent(jLabelExpensa)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(22, 22, 22))
        );
        jPanelExpensasLayout.setVerticalGroup(
            jPanelExpensasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExpensasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelExpensa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelButtonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAlquileres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelExpensas, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelAlquileres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelExpensas, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAlquilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlquilerMouseClicked
        if(evt.getClickCount() == 2){
            if(this.idEdificio != 0){
                try{
                    int fila = jTableAlquiler.getSelectedRow();
                    if(fila >= 0){
                        String ubicacionDepto = jTableAlquiler.getValueAt(fila, 0).toString();
                        String periodo = jTableAlquiler.getValueAt(fila, 2).toString(); // Periodo = "03/18"
                        cargarExpensaDepartamento(ubicacionDepto, periodo);
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe seleccionar una fila válida.");
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Seleccione un Alquiler");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado ningún registro. Intente seleccionar un Edificio nuevamente");
            }
        }
    }//GEN-LAST:event_jTableAlquilerMouseClicked

    private void jPanelButtonRefrescarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseClicked
        cargarTablaAlquiler(idEdificio);
        cargarTablaExpensa(idEdificio);
    }//GEN-LAST:event_jPanelButtonRefrescarMouseClicked

    private void jPanelButtonRefrescarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseExited
        ImageIcon refresh = new ImageIcon(getClass().getResource("/Visual/img/cargando_blanco.png"));
        this.jPanelButtonRefrescar.setBackground(new Color(51,51,51));
        this.jLabelRefrescar.setIcon(refresh);
    }//GEN-LAST:event_jPanelButtonRefrescarMouseExited

    private void jPanelButtonRefrescarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonRefrescarMouseMoved
        ImageIcon refresh = new ImageIcon(getClass().getResource("/Visual/img/cargando.png"));
        this.jPanelButtonRefrescar.setBackground(new Color(255,255,255));
        this.jPanelButtonRefrescar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelRefrescar.setIcon(refresh);
    }//GEN-LAST:event_jPanelButtonRefrescarMouseMoved

    private void jPanelButtonReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonReporteMouseClicked
        if(idEdificio != 0){
            PanelReporte vtnReporte = new PanelReporte(idEdificio);
            vtnReporte.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "No es posible generar el documento debido a que no se encuentra seleccionado un Edificio. Por favor Seleccione un Edificio");
        }        
    }//GEN-LAST:event_jPanelButtonReporteMouseClicked

    private void jPanelButtonReporteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonReporteMouseMoved
        this.jPanelButtonReporte.setBackground(new Color(255,255,255));
        this.jPanelButtonReporte.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelReporte.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonReporteMouseMoved

    private void jPanelButtonReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonReporteMouseExited
        this.jPanelButtonReporte.setBackground(new Color(51,51,51));
        this.jLabelReporte.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonReporteMouseExited

    public void limpiarVentana(){
        if(tablaAlquiler.getRowCount() > 0){
            while(tablaAlquiler.getRowCount() != 0){
                tablaAlquiler.removeRow(0);
            }
        }
        
        if(tablaExpensa.getRowCount() > 0){
            while(tablaExpensa.getRowCount() != 0){
                tablaExpensa.removeRow(0);
            }
        }
    }
    
    public void cargarTablaAlquiler(long idEdificio){
        limpiarVentana();
        Date fechaActual = new Date();
        String datos[] = new String[10];
        List<Logica.Inquilino> inquilinosEdificio = unaControladora.obtenerInquilinosEdificio(idEdificio);
        
        SimpleDateFormat formatoMes = new SimpleDateFormat("MM"),
                         formatoAnio = new SimpleDateFormat("yyyy"),
                         formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
       
        for(Logica.Inquilino unInquilino : inquilinosEdificio){
            List<Logica.Alquiler> alquileresInpagos = unaControladora.obtenerAlquileresInpagos(unInquilino.getId());
            float saldoMesAnterior = 0;
            /*List<Logica.Alquiler> alquileresInpagos = unaControladora.obtenerAlquileresInpagos(unInquilino.getId());
            Logica.Expensa unaExp = null;
            float saldoMesAnterior = 0, totales = 0, interesPorAtraso = 0;
            int i = 0;
            int compararFecha = 0;
            if(!alquileresInpagos.isEmpty()){
                Collections.sort(alquileresInpagos, (Logica.Alquiler a1, Logica.Alquiler a2) -> (a1.getFecha().compareTo(a2.getFecha())));
                int tam = alquileresInpagos.size()-1;
                Logica.Alquiler ultimoAlquilerInpago = alquileresInpagos.get(tam);
                String fechaV = "10-"+formatoMes.format(fechaActual)+"-"+formatoAnio.format(fechaActual);  // Dejo en 10 para que empiece a calcular el día 11
                Date fechaVencimiento;
                try{
                    fechaVencimiento = formatoFecha.parse(fechaV);
                    compararFecha = fechaActual.compareTo(fechaVencimiento);
                }catch(Exception e){
                    System.out.println(e);
                }
                if(compararFecha <= 0){ // Si compararFecha es TRUE. Entonces el Alquiler esta dentro de la Fecha de Vencimiento.
                    saldoMesAnterior = unaControladora.obtenerSaldoUltimoPago(unInquilino.getId());
                    Date fechaAlquilerAnterior = null;
                    float totalAnterior = 0;
                    fechaAlquilerAnterior = ultimoAlquilerInpago.getFecha();
                    for(Logica.Alquiler unAlq : alquileresInpagos){
                        float montoExpensa = 0;
                        String ubicacionDepto = "";
                        String ubicacionCochera = "";
                        if(unAlq.getCochera() > 0){
                            ubicacionCochera = unaControladora.obtenerCochera(unAlq.getCochera()).getUbicacion();
                        }

                        if(unAlq.getDepartamento() > 0){
                            ubicacionDepto = unaControladora.obtenerDepartamento(unAlq.getDepartamento()).getUbicacion();
                            unaExp = unaControladora.obtenerExpensa(unAlq.getDepartamento(), Integer.valueOf(formatoMes.format(unAlq.getFecha())), Integer.valueOf(formatoAnio.format(unAlq.getFecha())));
                            if(unaExp != null){
                                montoExpensa = unaExp.getMonto();
                                System.out.println("Período Alquiler: "+formatoMes.format(unAlq.getFecha())+"/"+formatoAnio.format(unAlq.getFecha())+" - Depto: "+ubicacionDepto+" - Período Expensa: "+unaExp.getMes()+"/"+unaExp.getAnio()+" - Monto: "+montoExpensa);
                                totales += unaExp.getMonto();
                            }
                        }
                        
                        totales += unAlq.getTotal();
                        
                        if(i == tam){
                            if(saldoMesAnterior > 0){
                                interesPorAtraso = unaControladora.interesesPorAtraso(fechaActual, fechaAlquilerAnterior, saldoMesAnterior);
                            }else{
                                totales += saldoMesAnterior;
                            }
                            totales += interesPorAtraso;
                        }else{
                            fechaAlquilerAnterior = unAlq.getFecha();
                            totales += saldoMesAnterior;
                            totalAnterior = totales;
                        }
                        
                        i++;
                        datos = cargarArrayTabla(ubicacionDepto, unInquilino.getApellido(), unInquilino.getNombre(), unAlq.getFecha(), unAlq.getTotal(), unAlq.getOtraFactura(), montoExpensa, ubicacionCochera, saldoMesAnterior, interesPorAtraso, totales);
                        saldoMesAnterior = totalAnterior;
                        
                        tablaAlquiler.addRow(datos);
                    }
                }else{                  // Si es FALSE. Entonces esta fuera de la fecha de Vencimiento.
                    saldoMesAnterior = unaControladora.obtenerSaldoUltimoPago(unInquilino.getId());
                    float totalAnterior = 0;
                    for(Logica.Alquiler unAlq : alquileresInpagos){
                        float montoExpensa = 0;
                        String ubicacionDepto = "";
                        String ubicacionCochera = "";
                        if(unAlq.getCochera() > 0){
                            ubicacionCochera = unaControladora.obtenerCochera(unAlq.getCochera()).getUbicacion();
                        }

                        if(unAlq.getDepartamento() > 0){
                            ubicacionDepto = unaControladora.obtenerDepartamento(unAlq.getDepartamento()).getUbicacion();
                            unaExp = unaControladora.obtenerExpensa(unAlq.getDepartamento(), Integer.valueOf(formatoMes.format(unAlq.getFecha())), Integer.valueOf(formatoAnio.format(unAlq.getFecha())));
                            if(unaExp != null){
                                montoExpensa = unaExp.getMonto();
                                totales += unaExp.getMonto();
                            }
                        }
                        
                        totales += unAlq.getTotal();
                        
                        if(i == tam){
                            interesPorAtraso = unaControladora.interesesPorAtraso(fechaActual, unAlq.getFecha(), totales);// Entra la 1ra vez.
                            totales += interesPorAtraso;
                        }else{
                            totales += saldoMesAnterior;
                            totalAnterior = totales;
                        }
                        
                        i++;
                        datos = cargarArrayTabla(ubicacionDepto, unInquilino.getApellido(), unInquilino.getNombre(), unAlq.getFecha(), unAlq.getTotal(), unAlq.getOtraFactura(), montoExpensa, ubicacionCochera, saldoMesAnterior, interesPorAtraso, totales);
                                                
                        saldoMesAnterior = totalAnterior;
                        
                        tablaAlquiler.addRow(datos);
                    }
                }
                
                
                /*
                if(tam == 1){
                    float saldoUltimoPago = 0;
                    Logica.Pago ultimoPago = unaControladora.buscarUltimoPago(unInquilino);
                    if(ultimoPago != null){
                        Logica.Alquiler ultimoAlquilerPagado = unaControladora.obtenerAlquiler(ultimoPago.getIdAlquiler());
                        if(ultimoAlquilerPagado != null){
                            saldoUltimoPago = unaControladora.obtenerSaldoUltimoPago(unInquilino.getId());
                            if(saldoUltimoPago > 0 &&){    // Si es mayor a 0 es una Deuda del Saldo Anterior.
                                 totalesPorIntereses += unaControladora.interesesPorAtraso(fechaActual, ultimoAlquilerPagado.getFecha(), saldoUltimoPago);
                                 totales += totalesPorIntereses;
                                 totales += saldoUltimoPago;
                            }else{
                                totales += saldoUltimoPago;
                            }
                        }
                    }
                }else if(tam > 1){
                    
                }
                */
                
                /*
                if(unInquilino.getApellido().equals("CINCO")){
                    System.out.println("CINCO");
                }
                saldoMesAnterior = unaControladora.obtenerSaldoUltimoPago(unInquilino.getId());
                float totalAnterior = 0;
                for(Logica.Alquiler unAlq : alquileresInpagos){
                    float montoExpensa = 0;
                    String ubicacionDepto = "";
                    String ubicacionCochera = "";
                    if(unAlq.getCochera() > 0){
                        ubicacionCochera = unaControladora.obtenerCochera(unAlq.getCochera()).getUbicacion();
                    }

                    if(unAlq.getDepartamento() > 0){
                        ubicacionDepto = unaControladora.obtenerDepartamento(unAlq.getDepartamento()).getUbicacion();
                        unaExp = unaControladora.obtenerExpensa(unAlq.getDepartamento(), Integer.valueOf(formatoMes.format(unAlq.getFecha())), Integer.valueOf(formatoAnio.format(unAlq.getFecha())));
                        if(unaExp != null){
                            montoExpensa = unaExp.getMonto();
                            totales += unaExp.getMonto();
                        }
                    }
                    totales += unAlq.getTotal();
                    totalAlquilerExpensa = montoExpensa + unAlq.getTotal();
                    interesPorAtraso = unaControladora.interesesPorAtraso(fechaActual, unAlq.getFecha(), totalAlquilerExpensa);
                    
                    totales += interesPorAtraso;
                    if(i == 0){                                                 // Entra la 1ra vez.
                        totalesPorIntereses += interesPorAtraso;
                        interesPorAtraso = totalesPorIntereses;
                        totalAnterior = totales;
                    }else if(i > 0){                                            // Entra a partir de la 2da vez.
                        saldoMesAnterior = totalAnterior;
                        totalAnterior += unAlq.getTotal();
                        totalAnterior += montoExpensa;
                        totalAnterior += interesPorAtraso;
                    }

                    i++;
                    totalAlquilerExpensa = 0;
                    datos[0] = ubicacionDepto;
                    datos[1] = unInquilino.getApellido()+", "+unInquilino.getNombre();
                    datos[2] = formatoFecha.format(unAlq.getFecha());
                    datos[3] = formatoDecimal.format(unAlq.getTotal());
                    if(unAlq.getOtraFactura() == 0){
                        datos[4] = "0";
                    }else{
                        datos[4] = formatoDecimal.format(unAlq.getOtraFactura());

                    }
                    if(montoExpensa == 0){
                        datos[5] = "0";
                    }else{
                        datos[5] = formatoDecimal.format(montoExpensa);
                    }
                    datos[6] = ubicacionCochera;
                    if(saldoMesAnterior == 0){
                        datos[7] = "0";
                    }else{
                        datos[7] = formatoDecimal.format(saldoMesAnterior);
                    }

                    if(interesPorAtraso == 0){
                        datos[8] = "0";
                    }else{
                        datos[8] = formatoDecimal.format(interesPorAtraso);
                    }
                    datos[9] = formatoDecimal.format(totales);
                    tablaAlquiler.addRow(datos);
                }
                
            }*/
            
            
            //
            DecimalFormat formatoDecimal = new DecimalFormat("#0.00");
            if(!alquileresInpagos.isEmpty()){
                Logica.Pago ultimoAlquilerPagado = unaControladora.buscarUltimoPago(unInquilino);
                if(ultimoAlquilerPagado != null){
                    saldoMesAnterior = unaControladora.obtenerSaldoUltimoPago(unInquilino.getId());
                    //bandera = true;
                }
                int i = 0, ultimoIndiceAlquiler = alquileresInpagos.size();
                for(Logica.Alquiler unAlquiler : alquileresInpagos){
                    Logica.Expensa unaExpensa = null;
                    float total = 0, interesPorAtraso = 0;
                    int mesExpensa = Integer.valueOf(formatoMes.format(unAlquiler.getFecha())),
                            anioExpensa = Integer.valueOf(formatoAnio.format(unAlquiler.getFecha()));
                    Logica.Departamento unDepartamento = unaControladora.obtenerDepartamento(unAlquiler.getDepartamento());
                    total += unAlquiler.getTotal();
                    if (unDepartamento != null) {
                        unaExpensa = unaControladora.obtenerExpensa(unDepartamento.getId(), mesExpensa, anioExpensa);
                        datos[0] = unDepartamento.getUbicacion();
                    } else {
                        datos[0] = "";
                    }
                    datos[1] = unInquilino.getApellido() + ", " + unInquilino.getNombre();
                    datos[2] = formatoFecha.format(unAlquiler.getFecha());
                    datos[3] = String.valueOf(unAlquiler.getTotal());
                    datos[4] = String.valueOf(unAlquiler.getOtraFactura());
                    if (unaExpensa != null) {   // En teoría debería tener siempre su expensa..
                        total += unaExpensa.getMonto();
                        datos[5] = formatoDecimal.format(unaExpensa.getMonto());
                    } else {
                        datos[5] = "Sin expensa.";  // Creo que no debería entrar, salvo que no se haya generado la Expensa para este MES/AÑO.
                    }
                    
                    if (unAlquiler.getCochera() != 0) {
                        datos[6] = unaControladora.obtenerCochera(unAlquiler.getCochera()).getUbicacion();
                    } else {
                        datos[6] = "";

                    }
                    //saldoMesAnterior += unaControladora.obtenerSaldoMesAnterior(idEdificio, unInquilino.getId(), Integer.valueOf(formatoMes.format(unAlquiler.getFecha())), Integer.valueOf(formatoAnio.format(unAlquiler.getFecha())));
                    
                    datos[7] = formatoDecimal.format(saldoMesAnterior);
                    
                    interesPorAtraso = unaControladora.interesesPorAtraso(fechaActual, unAlquiler.getFecha(), total);
                    total += saldoMesAnterior;
                    datos[8] = formatoDecimal.format(interesPorAtraso);
                    
                    total += interesPorAtraso;
                    saldoMesAnterior = total;
                    
                    datos[9] = formatoDecimal.format(total);
                    i++;
                    tablaAlquiler.addRow(datos);
                }
            }
            
        }
        
        if(tablaAlquiler.getRowCount() > 0){
            int tam = tablaAlquiler.getRowCount();
            String [][] tabla = new String[tam][10];

            for(int f = 0; f < tam; f++){
                for(int c = 0; c < 10; c++){
                    tabla[f][c] = (String) tablaAlquiler.getValueAt(f, c);
                }
            }
            
            Arrays.sort(tabla, (String[] t, String[] t1) -> t[0].compareTo(t1[0]));
            
            DefaultTableModel tab = new DefaultTableModel();
            tab.setDataVector(tabla,colTablaAlquiler);
            this.jTableAlquiler.setModel(tab);
        }
    }
    
    public String[] cargarArrayTabla(String ubicacionDepto, String inquilinoApellido, String inquilinoNombre, Date fechaAlquiler, float totalAlquiler, float otraFactura, float montoExpensa, String ubicacionCochera, float saldoAnterior, float interesPorAtraso, float totales){
        String[] datos = new String[10];
        DecimalFormat formatoDecimal = new DecimalFormat("#0.00");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        
        datos[0] = ubicacionDepto;
        datos[1] = inquilinoApellido+", "+inquilinoNombre;
        datos[2] = formatoFecha.format(fechaAlquiler);
        datos[3] = formatoDecimal.format(totalAlquiler);
        datos[4] = formatoDecimal.format(otraFactura);
        datos[5] = formatoDecimal.format(montoExpensa);
        datos[6] = ubicacionCochera;
        datos[7] = formatoDecimal.format(saldoAnterior);
        datos[8] = formatoDecimal.format(interesPorAtraso);
        datos[9] = formatoDecimal.format(totales);
        
        return datos;
    }
    
    public void cargarTablaExpensa(long idEdificio){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        this.jLabelExpensa.setText("Servicios");
        List<Logica.Servicio> servicios = unaControladora.obtenerEdificio(idEdificio).getServicios();
        Object datos[] = new Object[4];
        
        for(Logica.Servicio unServicio : servicios){
            datos[0] = unServicio.getNombre();
            datos[1] = unServicio.getMes();
            if(unServicio.getFechaEmision() != null && unServicio.getFechaVencimiento() != null){
                datos[2] = formatoFecha.format(unServicio.getFechaVencimiento());
            }else{
                datos[2] = "";
            }
            datos[3] = unServicio.getMonto();
            
            tablaExpensa.addRow(datos);
        }
        
        this.jTableExpensa.setModel(tablaExpensa);
    }
    
    public void cargarExpensaDepartamento(String ubicacionDepto, String periodoTabla){
        Object datos[] = new Object[3];
        String periodoString[] = periodoTabla.split("/");
        DecimalFormat formatoDecimal = new DecimalFormat("#0.00");
        String colTablaExpensaDep[] = {"ID", "SERVICIOS", "TOTAL"};
        DefaultTableModel tablaExpensaDep = new DefaultTableModel(null, colTablaExpensaDep);
        
        Logica.Edificio unEdificio = unaControladora.obtenerEdificio(idEdificio);
        Logica.Departamento unDepartamento = unaControladora.obtenerDepartamento(unEdificio.getId(), ubicacionDepto);
        List<Logica.ServicioExpensa> expensaDepartamento = unaControladora.obtenerServiciosExpensaDepartamento(unDepartamento, Integer.parseInt(periodoString[1]), Integer.parseInt(periodoString[2]));
        
        while(tablaExpensaDep.getRowCount() != 0){
            tablaExpensaDep.removeRow(0);
        }
        
        for(Logica.ServicioExpensa unServicioExpensa : expensaDepartamento){
                datos[0] = unServicioExpensa.getId();
                datos[1] = unServicioExpensa.getNombre();
                datos[2] = formatoDecimal.format(unServicioExpensa.getMonto());
                
                tablaExpensaDep.addRow(datos);
        }
        
        int mesExpensa = Integer.valueOf(periodoString[1]),
            anioExpensa = Integer.valueOf(periodoString[2]);
        
            if(mesExpensa == 1){
                mesExpensa = 12;
                anioExpensa -= 1;
            }else{
                mesExpensa -= 1;
            }
            
        this.jLabelExpensa.setText("Expensa "+mesExpensa+"/"+anioExpensa);
        this.jTableExpensa.setModel(tablaExpensaDep);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelAlquiler;
    private javax.swing.JLabel jLabelExpensa;
    private javax.swing.JLabel jLabelRefrescar;
    private javax.swing.JLabel jLabelReporte;
    private javax.swing.JLabel jLabelTituloEdificio;
    private javax.swing.JPanel jPanelAlquileres;
    private javax.swing.JPanel jPanelButtonRefrescar;
    private javax.swing.JPanel jPanelButtonReporte;
    private javax.swing.JPanel jPanelExpensas;
    private javax.swing.JPanel jPanelPrincipalTabla1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAlquiler;
    private javax.swing.JTable jTableExpensa;
    // End of variables declaration//GEN-END:variables
}
