package Visual;

import java.awt.Color;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.swing.RowSorter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author koshiro
 */
public final class vtnBotonDepartamento extends javax.swing.JFrame {
    private final long idEdificio;
    private final ControladoraV unaControladora = new ControladoraV();
    
    public vtnBotonDepartamento(long idEdificio) {
        initComponents();
        this.setLocationRelativeTo(null);   // Centra el JFrame
        this.idEdificio = idEdificio;
        cargarDepartamentos(idEdificio);
        info(idEdificio);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Cierra este JFrame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTituloEdificio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDepartamento = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanelButtonCerrar = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCantDeptos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDeptosOcupados = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDeptosDesocupados = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTituloEdificio.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabelTituloEdificio.setText("DEPARTAMENTOS");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        jTableDepartamento.setAutoCreateRowSorter(true);
        jTableDepartamento.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jTableDepartamento = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        jTableDepartamento.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableDepartamento.setGridColor(new java.awt.Color(255, 255, 255));
        jTableDepartamento.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableDepartamento);

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
            .addGroup(jPanelButtonCerrarLayout.createSequentialGroup()
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("Cantidad de departamentos");

        jTextFieldCantDeptos.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Departamentos ocupados");

        jTextFieldDeptosOcupados.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Departamentos desocupados");

        jTextFieldDeptosDesocupados.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDeptosOcupados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldCantDeptos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDeptosDesocupados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldCantDeptos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldDeptosDesocupados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldDeptosOcupados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloEdificio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloEdificio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelButtonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanelButtonCerrarMouseClicked

    private void jPanelButtonCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseMoved
        this.jPanelButtonCerrar.setBackground(new Color(255,255,255));
        this.jPanelButtonCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(51,51,51)));
        this.jLabelCerrar.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jPanelButtonCerrarMouseMoved

    private void jPanelButtonCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCerrarMouseExited
        this.jPanelButtonCerrar.setBackground(new Color(51,51,51));
        this.jLabelCerrar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jPanelButtonCerrarMouseExited

    public final void cargarDepartamentos(long idEdificio){
        List<Logica.Departamento> departamentos = unaControladora.obtenerEdificio(idEdificio).getDepartamentos();
        String nombreEdi = unaControladora.obtenerEdificio(idEdificio).getNombre();
        String colTablaDepartamento[] = {"Id", "Ubicación", "N° Dormitorios", "Inquilino", "Cant. Familiar", "Edificio"};
        int i = 0, tamanio = departamentos.size();
        Object[][] filas = new Object[tamanio][6];
        
        if(departamentos.size() > 0){
            List<Logica.Departamento> departamentosOrdenados = new LinkedList();
            for(Logica.Departamento unDepartamento : departamentos){
                departamentosOrdenados.add(unDepartamento);
            }
            
            Collections.sort(departamentosOrdenados, (Logica.Departamento d1, Logica.Departamento d2) -> d1.getUbicacion().compareTo(d2.getUbicacion()));
            
            for(Logica.Departamento unDepto : departamentos){
                filas[i][0] = unDepto.getId();
                filas[i][1] = unDepto.getUbicacion();
                filas[i][2] = unDepto.getCantDormitorios();
                if(unDepto.getUnInquilino() == null){
                    filas[i][3] = "--";
                    filas[i][4] = "--";
                }else{
                    filas[i][3] = unDepto.getUnInquilino().getApellido()+", "+unDepto.getUnInquilino().getNombre();
                    filas[i][4] = unDepto.getUnInquilino().getCantidadPersonas();
                } 
                filas[i][5] = nombreEdi;
                i++;
            }
            TableModel modelo = new DefaultTableModel(filas,colTablaDepartamento);
            
            RowSorter<TableModel> sorter = new TableRowSorter<>(modelo);
            jTableDepartamento.setRowSorter(sorter);
            jTableDepartamento.setModel(modelo);
        }
        
        // DEJAR ESTO COMO EJEMPLO, POR LAS MOSCAS
        /*TableModel modelo = new DefaultTableModel(filas,colTablaDepartamento){
            @Override 
            public Class getColumnClass(int column) {
                Class returnValue;
                if ((column >= 0) && (column < getColumnCount())) {
                    returnValue = getValueAt(0, column).getClass();
                } else {
                    returnValue = Object.class;
                }
                
                return returnValue;
            }
        };*/
        
        // DEJAR POR LAS MOSCAS
        /*for(Logica.Departamento unDepartamento : unEdificio.getDepartamentos()){
            datos[0] = String.valueOf(unDepartamento.getId());
            datos[1] = unDepartamento.getUbicacion();
            datos[2] = String.valueOf(unDepartamento.getCantDormitorios());
            if(unDepartamento.getUnInquilino() == null){
                datos[3] = "--";
            }else{
                datos[3] = unDepartamento.getUnInquilino().getApellido()+", "+unDepartamento.getUnInquilino().getNombre();
            }
            datos[4] = unEdificio.getNombre();
            
            tablaDepartamento.addRow(datos);
        }
        
        this.jTableDepartamento.setModel(tablaDepartamento);
        */
    }
    
    public void info(long idEdificio){
        Logica.Edificio unEdi = unaControladora.obtenerEdificio(idEdificio);
        int cantDeptos = unEdi.getDepartamentos().size(),
            cantDeptosOcupados = unaControladora.departamentosOcupados(idEdificio),
            cantDeptosDesocupados = cantDeptos - cantDeptosOcupados;
        
        if(cantDeptos == 0){
            this.jTextFieldCantDeptos.setText("0"); // No debería asignar nunca este valor..
        }else{
            this.jTextFieldCantDeptos.setText(String.valueOf(cantDeptos));
        }
        
        if(cantDeptosOcupados == 0){
            this.jTextFieldDeptosOcupados.setText("0");
        }else{
            this.jTextFieldDeptosOcupados.setText(String.valueOf(cantDeptosOcupados));
        }
        
        if(cantDeptosDesocupados == 0){
            this.jTextFieldDeptosDesocupados.setText("0");
        }else{
            this.jTextFieldDeptosDesocupados.setText(String.valueOf(cantDeptosDesocupados));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelTituloEdificio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelButtonCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDepartamento;
    private javax.swing.JTextField jTextFieldCantDeptos;
    private javax.swing.JTextField jTextFieldDeptosDesocupados;
    private javax.swing.JTextField jTextFieldDeptosOcupados;
    // End of variables declaration//GEN-END:variables
}
