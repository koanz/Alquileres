package Persistencia;

import Logica.Notificaciones;
import Persistencia.exceptions.NonexistentEntityException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ControladoraP {
    
    AlquilerJpaController AlquilerJpa = new AlquilerJpaController();
    CocheraJpaController CocheraJpa = new CocheraJpaController();
    CoeficienteDormJpaController CoeficienteDormJpa = new CoeficienteDormJpaController();
    CoeficienteJpaController CoeficienteJpa = new CoeficienteJpaController();
    DepartamentoJpaController DepartamentoJpa = new DepartamentoJpaController();
    EdificioJpaController EdificioJpa = new EdificioJpaController();
    ExpensaJpaController ExpensaJpa = new ExpensaJpaController();
    GaranteJpaController GaranteJpa = new GaranteJpaController();
    InquilinoJpaController InquilinoJpa = new InquilinoJpaController();
    NotificacionesJpaController NotificacionesJpa = new NotificacionesJpaController();
    PagoJpaController PagoJpa = new PagoJpaController();
    ServicioJpaController ServicioJpa = new ServicioJpaController();
    ServicioExpensaJpaController ServicioExpensaJpa = new ServicioExpensaJpaController();
    
    
/*------------------------------------------------------------------------------
                                TEST CONEXION
------------------------------------------------------------------------------*/
    public boolean comprobarConexion() throws SQLException{
        boolean conexion = false;
        String puerto = "35.198.7.134:3306";
        String db = "Alquileres";
        String pass = "admin";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://" + puerto + "/" + db, "root", pass);
            Statement st = (Statement) conn.createStatement();
            String sql = "SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = '" + db + "'";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                //JOptionPane.showMessageDialog(main, "La base de datos existe.");
                conexion = true;
            }
        } catch (ClassNotFoundException ex) {
            //JOptionPane.showMessageDialog(main, "La base de datos no existe. Error: "+ex);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(main, "La base de datos no existe. Error: "+ex);
            conexion = false;
        }
        
        return conexion;
    }
    
/*------------------------------------------------------------------------------
                                NOTIFICACIONES
------------------------------------------------------------------------------*/
    public void altaNotificaciones(Notificaciones Notificaciones) {
        NotificacionesJpa.create(Notificaciones);
    }

    public void modificarNotificaciones(Notificaciones unaNotificacion) throws Exception {
        NotificacionesJpa.edit(unaNotificacion);
    }
    
/*------------------------------------------------------------------------------
                                ALQUILER
------------------------------------------------------------------------------*/
    public void altaAlquiler(Logica.Alquiler unAlquiler) throws Exception{
        AlquilerJpa.create(unAlquiler);
    }
    
    public void modificarAlquiler(Logica.Alquiler unAlquiler) throws Exception{
        AlquilerJpa.edit(unAlquiler);
    }
    
    public void bajaAlquiler(long id) throws NonexistentEntityException{
        AlquilerJpa.destroy(id);
    }
    
    public Logica.Alquiler obtenerAlquiler(long id){
        return AlquilerJpa.findAlquiler(id);
    }
    
    public List<Logica.Alquiler> obtenerAlquileres(){
        return AlquilerJpa.findAlquilerEntities();
    }
    
/*------------------------------------------------------------------------------
                                COCHERA
------------------------------------------------------------------------------*/
    public void altaCochera(Logica.Cochera unaCochera) throws Exception{
        CocheraJpa.create(unaCochera);
    }
    
    public void modificarCochera(Logica.Cochera unaCochera) throws Exception{
        CocheraJpa.edit(unaCochera);
    }
    
    public void bajaCochera(long id) throws NonexistentEntityException{
        CocheraJpa.destroy(id);
    }
    
    public Logica.Cochera obtenerCochera(long id){
        return CocheraJpa.findCochera(id);
    }
    
    public List<Logica.Cochera> obtenerCocheras(){
        return CocheraJpa.findCocheraEntities();
    }
    
/*------------------------------------------------------------------------------
                                COEFICIENTE
------------------------------------------------------------------------------*/
    public void altaCoeficiente(Logica.Coeficiente unCoeficiente) throws Exception{
        CoeficienteJpa.create(unCoeficiente);
    }
    
    public void modificarCoeficiente(Logica.Coeficiente unCoeficiente) throws Exception{
        CoeficienteJpa.edit(unCoeficiente);
    }
    
    public void bajaCoeficiente(long id) throws NonexistentEntityException{
        CoeficienteJpa.destroy(id);
    }
    
    public Logica.Coeficiente obtenerCoeficiente(long id){
        return CoeficienteJpa.findCoeficiente(id);
    }
    
    public List<Logica.Coeficiente> obtenerCoeficientes(){
         return CoeficienteJpa.findCoeficienteEntities();
    }
    
/*------------------------------------------------------------------------------
                            COEFICIENTE DORMITORIO
------------------------------------------------------------------------------*/
    public void altaCoeficienteDorm(Logica.CoeficienteDorm unCoeficiente) throws Exception{
        CoeficienteDormJpa.create(unCoeficiente);
    }
    
    public void modificarCoeficienteDorm(Logica.CoeficienteDorm unCoeficiente) throws Exception{
        CoeficienteDormJpa.edit(unCoeficiente);
    }
    
    public void bajaCoeficienteDorm(long id) throws NonexistentEntityException{
        CoeficienteDormJpa.destroy(id);
    }
    
    public Logica.CoeficienteDorm obtenerCoeficienteDorm(long id){
        return CoeficienteDormJpa.findCoeficienteDorm(id);
    }
    
    public List<Logica.CoeficienteDorm> obtenerCoeficientesDorm(){
        return CoeficienteDormJpa.findCoeficienteDormEntities();
    }
    
/*------------------------------------------------------------------------------
                                DEPARTAMENTO
------------------------------------------------------------------------------*/
    public void altaDepartamento(Logica.Departamento unDepartamento) throws Exception{
        DepartamentoJpa.create(unDepartamento);
    }
    
    public void modificarDepartamento(Logica.Departamento unDepartamento) throws Exception{
        DepartamentoJpa.edit(unDepartamento);
    }
    
    public void bajaDepartamento(long id) throws NonexistentEntityException{
        DepartamentoJpa.destroy(id);
    }
    
    public Logica.Departamento obtenerDepartamento(long id){
        return DepartamentoJpa.findDepartamento(id);
    }
    
    public List<Logica.Departamento> obtenerDepartamentos(){
        return DepartamentoJpa.findDepartamentoEntities();
    }
    
/*------------------------------------------------------------------------------
                                EDIFICIO
------------------------------------------------------------------------------*/
    public void altaEdificio(Logica.Edificio unEdificio) throws Exception{
        EdificioJpa.create(unEdificio);
    }
    
    public void modificarEdificio(Logica.Edificio unEdificio) throws Exception{
        EdificioJpa.edit(unEdificio);
    }
    
    public void bajaEdificio(long id) throws NonexistentEntityException{
        EdificioJpa.destroy(id);
    }
    
    public Logica.Edificio obtenerEdificio(long id){
        return EdificioJpa.findEdificio(id);
    }
    
    public List<Logica.Edificio> obtenerEdificios(){
        return EdificioJpa.findEdificioEntities();
    }
    
/*------------------------------------------------------------------------------
                                EXPENSA
------------------------------------------------------------------------------*/
    public void altaExpensa(Logica.Expensa unaExpensa) throws Exception{
        ExpensaJpa.create(unaExpensa);
    }
    
    public void modificarExpensa(Logica.Expensa unaExpensa) throws Exception{
        ExpensaJpa.edit(unaExpensa);
    }
    
    public void bajaExpensa(long id) throws NonexistentEntityException{
        ExpensaJpa.destroy(id);
    }
    
    public Logica.Expensa obtenerExpensa(long id){
        return ExpensaJpa.findExpensa(id);
    }
    
    public List<Logica.Expensa> obtenerExpensas(){
        return ExpensaJpa.findExpensaEntities();
    }
    
/*------------------------------------------------------------------------------
                                GARANTE
------------------------------------------------------------------------------*/
    public void altaGarante(Logica.Garante unGarante) throws Exception{
        GaranteJpa.create(unGarante);
    }
    
    public void modificarGarante(Logica.Garante unGarante) throws Exception{
        GaranteJpa.edit(unGarante);
    }
    
    public void bajaGarante(long id) throws NonexistentEntityException{
        GaranteJpa.destroy(id);
    }
    
    public Logica.Garante obtenerGarante(long id){
        return GaranteJpa.findGarante(id);
    }
    
    public List<Logica.Garante> obtenerGarantes(){
        return GaranteJpa.findGaranteEntities();
    }
    
/*------------------------------------------------------------------------------
                                INQUILINO
------------------------------------------------------------------------------*/
    public void altaInquilino(Logica.Inquilino unInquilino) throws Exception{
        InquilinoJpa.create(unInquilino);
    }
    
    public void modificarInquilino(Logica.Inquilino unInquilino) throws Exception{
        InquilinoJpa.edit(unInquilino);
    }
    
    public void bajaInquilino(long id) throws NonexistentEntityException{
        InquilinoJpa.destroy(id);
    }
    
    public Logica.Inquilino obtenerInquilino(long id){
        return InquilinoJpa.findInquilino(id);
    }
    
    public List<Logica.Inquilino> obtenerInquilinos(){
        return InquilinoJpa.findInquilinoEntities();
    }
    
/*------------------------------------------------------------------------------
                                PAGO
------------------------------------------------------------------------------*/
    public void altaPago(Logica.Pago unPago) throws Exception{
        PagoJpa.create(unPago);
    }
    
    public void modificarPago(Logica.Pago unPago) throws Exception{
        PagoJpa.edit(unPago);
    }
    
    public void bajaPago(long id) throws NonexistentEntityException{
        PagoJpa.destroy(id);
    }
    
    public Logica.Pago obtenerPago(long id){
        return PagoJpa.findPago(id);
    }
    
    public List<Logica.Pago> obtenerPagos(){
        return PagoJpa.findPagoEntities();
    }
    
/*------------------------------------------------------------------------------
                                SERVICIO
------------------------------------------------------------------------------*/
    public void altaServicio(Logica.Servicio unServicio) throws Exception{
        ServicioJpa.create(unServicio);
    }
    
    public void modificarServicio(Logica.Servicio unServicio) throws Exception{
        ServicioJpa.edit(unServicio);
    }
    
    public void bajaServicio(long id) throws NonexistentEntityException{
        ServicioJpa.destroy(id);
    }
    
    public Logica.Servicio obtenerServicio(long id){
        return ServicioJpa.findServicio(id);
    }
    
    public List<Logica.Servicio> obtenerServicios(){
        return ServicioJpa.findServicioEntities();
    }

/*------------------------------------------------------------------------------
                                SERVICIOEXPENSA
------------------------------------------------------------------------------*/
    public void altaServicioExpensa(Logica.ServicioExpensa unServicio) throws Exception{
        ServicioExpensaJpa.create(unServicio);
    }
    
    public void modificarServicioExpensa(Logica.ServicioExpensa unServicio) throws Exception{
        ServicioExpensaJpa.edit(unServicio);
    }
    
    public void bajaServicioExpensa(long id) throws NonexistentEntityException{
        ServicioExpensaJpa.destroy(id);
    }
    
    public Logica.ServicioExpensa obtenerServicioExpensa(long id){
        return ServicioExpensaJpa.findServicioExpensa(id);
    }
    
    public List<Logica.ServicioExpensa> obtenerServiciosExpensa(){
        return ServicioExpensaJpa.findServicioExpensaEntities();
    }

}
