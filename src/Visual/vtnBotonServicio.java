package Visual;

import java.awt.Color;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.text.SimpleDateFormat;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;

public final class vtnBotonServicio extends javax.swing.JFrame {
    private final long idEdificio = 0;
    private final ControladoraV unaControladora = new ControladoraV();
    
    public vtnBotonServicio(long idEdificio) {
        initComponents();
        this.setLocationRelativeTo(null);   // Centra el JFrame
        cargarTablaServicio(idEdificio);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Cierra este JFrame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTituloServicio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableServicio = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanelButtonCerrar = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelMontoTotal = new javax.swing.JLabel();
        jTextFieldMontoTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 463));

        jLabelTituloServicio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelTituloServicio.setText("SERVICIOS");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jTableServicio.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
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
        jTableServicio.setGridColor(new java.awt.Color(255, 255, 255));
        jTableServicio.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableServicio);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanelButtonCerrar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelButtonCerrar.setPreferredSize(new java.awt.Dimension(100, 49));
        jPanelButtonCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelButtonCerrarMouseMoved(evt);
            }
        });
        jPanelButtonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonCerrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonCerrarMouseExited(evt);
            }
        });

        jLabelCerrar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCerrar.setText("Cerrar");

        javax.swing.GroupLayout jPanelButtonCerrarLayout = new javax.swing.GroupLayout(jPanelButtonCerrar);
        jPanelButtonCerrar.setLayout(jPanelButtonCerrarLayout);
        jPanelButtonCerrarLayout.setHorizontalGroup(
            jPanelButtonCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelButtonCerrarLayout.setVerticalGroup(
            jPanelButtonCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jPanelButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelMontoTotal.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelMontoTotal.setText("Monto total");

        jTextFieldMontoTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTextFieldMontoTotal.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelMontoTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMontoTotal)))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloServicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloServicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelButtonCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseMoved
        this.jPanelButtonCerrar.setBackground(new Color(255,255,255));
        this.jPanelButtonCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelCerrar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonCerrarMouseMoved

    private void jPanelButtonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseExited
        this.jPanelButtonCerrar.setBackground(new Color(51,51,51));
        this.jLabelCerrar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonCerrarMouseExited

    private void jPanelButtonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanelButtonCerrarMouseClicked

    public void cargarTablaServicio(long idEdificio){
        float montoTotal = 0;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        List<Logica.Servicio> servicios = ordenarServicios(unaControladora.obtenerEdificio(idEdificio).getServicios());
        String colTablaServicio[] = {"Id", "Nombre", "Mes", "Año", "Fecha Emisión.", "Fecha Vencimiento", "Monto", "Edificio"};
        String nombreEdi = unaControladora.obtenerEdificio(idEdificio).getNombre();
        int i = 0, tamanio = servicios.size();
        Object[][] filas = new Object[tamanio][8];

        for(Logica.Servicio unServicio : servicios){
            filas[i][0] = unServicio.getId();
            filas[i][1] = unServicio.getNombre();
            filas[i][2] = unServicio.getMes();
            filas[i][3] = unServicio.getAnio();
            if(unServicio.getFechaEmision() != null){
                filas[i][4] = formatoFecha.format(unServicio.getFechaEmision());
            }else{
                filas[i][4] = unServicio.getFechaEmision();
            }
            if(unServicio.getFechaVencimiento() != null){
                filas[i][5] = formatoFecha.format(unServicio.getFechaVencimiento());
            }else{
                filas[i][5] = unServicio.getFechaVencimiento();
            }
            filas[i][6] = unServicio.getMonto();
            filas[i][7] = nombreEdi;
            montoTotal += unServicio.getMonto();
            i++;
        }
        
        TableModel modelo = new DefaultTableModel(filas,colTablaServicio);
        
        this.jTextFieldMontoTotal.setText(String.valueOf(montoTotal));
        
        jTableServicio.setModel(modelo);
    }
    
    public List<Logica.Servicio> ordenarServicios(List<Logica.Servicio> servicios){
        List<Logica.Servicio> serviciosOrdenados = new LinkedList();
        
        for(Logica.Servicio unServicio : servicios){
            serviciosOrdenados.add(unServicio);
        }
        
        Collections.sort(serviciosOrdenados, (Logica.Servicio s1, Logica.Servicio s2) -> s1.getNombre().compareTo(s2.getNombre()));
        
        return serviciosOrdenados;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelMontoTotal;
    private javax.swing.JLabel jLabelTituloServicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelButtonCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableServicio;
    private javax.swing.JTextField jTextFieldMontoTotal;
    // End of variables declaration//GEN-END:variables
}
