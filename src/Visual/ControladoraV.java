package Visual;

import java.util.Date;
import java.util.List;
import Logica.ControladoraL;
import java.sql.SQLException;

public class ControladoraV {
    private final ControladoraL unaControladora = new ControladoraL();
    
    public int getCantAlquileresGenerados(){
        return unaControladora.getCantAlquileresGenerados();
    }
    
    public boolean comprobarConexion() throws SQLException{
        return unaControladora.comprobarConexion();
    }
    
    public List<Integer> obtenerAniosServicios(){
        return unaControladora.obtenerAniosServicios();
    }
/*------------------------------------------------------------------------------
                           REPORTE
------------------------------------------------------------------------------*/    
    public boolean generarRepo(long idEdificio, int mesAbuscar, int anioAbuscar, List<Logica.Inquilino> inquilinosReporte, String obsAlquiler, String obsExpensa, int opcion){
        return unaControladora.generarRepo(idEdificio, mesAbuscar, anioAbuscar, inquilinosReporte, obsAlquiler, obsExpensa, opcion);
    }
    
    public void altaNotificaciones(long idEdificio, String obsAlquiler, String obsExpensa) throws Exception{
        unaControladora.altaNotificaciones(idEdificio, obsAlquiler, obsExpensa);
    }
    
    public void modificarNotificaciones(long idEdificio, String obsAlquiler, String obsExpensa) throws Exception{
        unaControladora.modificarNotificaciones(idEdificio, obsAlquiler, obsExpensa);
    }   
/*------------------------------------------------------------------------------
                           NOTIFICACIONES
------------------------------------------------------------------------------*/
    public List<String> notificaciones(int idEdificio){
        return unaControladora.notificaciones(idEdificio);
    }
    
/*------------------------------------------------------------------------------
                           INTERES POR ATRASO
------------------------------------------------------------------------------*/
    public float interesesPorAtraso(Date fechaActual, Date fechaAlquiler, float total){
        return unaControladora.interesesPorAtraso(fechaActual, fechaAlquiler, total);
    }

/*------------------------------------------------------------------------------
                           CONVERSOR STRING A FLOAT
------------------------------------------------------------------------------*/
    public String reemplazarString(String valor){
        return unaControladora.reemplazarString(valor);
    }
    
/*------------------------------------------------------------------------------
                           SALDO MES ANTERIOR
------------------------------------------------------------------------------*/
    public float obtenerSaldoMesAnterior(long idEdificio, long idInquilino, int mesAlquiler, int anioAlquiler){
        return unaControladora.obtenerSaldoMesAnterior(idEdificio, idInquilino, mesAlquiler, anioAlquiler);
    }
    
    public float calcularSaldo(long idEdificio, long idInquilino, int mes, int anio){
        return unaControladora.calcularSaldo(idEdificio, idInquilino, mes, anio);
    }
    
/*------------------------------------------------------------------------------
                                ALQUILER
------------------------------------------------------------------------------*/
    public void altaAlquiler(Date fecha, long cochera, long departamento, int[] GeneracionAuto, float monto, float otraFactura, float total, String descripcion, Logica.Pago unPago, long idInquilino) throws Exception{
        unaControladora.altaAlquiler(fecha, cochera, departamento, GeneracionAuto, monto, otraFactura, total, descripcion, unPago, idInquilino);
    }
    
    public void modificarAlquiler(long id, Date fecha, long cochera, long departamento, int[] GeneracionAuto, float monto, float otraFactura, float total, String descripcion, Logica.Pago unPago) throws Exception{
        unaControladora.modificarAlquiler(id, fecha, cochera, departamento, GeneracionAuto, monto, otraFactura, total, descripcion, unPago);
    }
    
    public void bajaAlquiler(long idAlquiler, long idInquilino) throws Exception{
        unaControladora.bajaAlquiler(idAlquiler, idInquilino);
    }
    
    public Logica.Alquiler obtenerAlquiler(long id){
        return unaControladora.obtenerAlquiler(id);
    }
    
    public Logica.Alquiler obtenerAlquilerPago(long idPago){
        return unaControladora.obtenerAlquilerPago(idPago);
    }
    
    public List <Logica.Alquiler> obtenerAlquileres(){
        return unaControladora.obtenerAlquileres();
    }
    
    public List<Logica.Alquiler> obtenerAlquileresInpagos(long idInquilino){
        return unaControladora.obtenerAlquileresInpagos(idInquilino);
    }
    
    public List<Logica.Alquiler> obtenerAlquileresEdificio(long idEdificio){
        return unaControladora.obtenerAlquileresEdificio(idEdificio);
    }
    
    public void generarAlquiler() throws Exception{
        unaControladora.generarAlquiler();
    }
    
    public Logica.Alquiler obtenerUltiAlquilerInquilino(Logica.Inquilino unInquilino){
        return unaControladora.obtenerUltiAlquilerInquilino(unInquilino);
    }
    
/*------------------------------------------------------------------------------
                                COCHERA
------------------------------------------------------------------------------*/
    public void altaCochera(String ubicacion, float precio, String descripcion, Logica.Inquilino unInquilino, long idEdificio) throws Exception{
        unaControladora.altaCochera(ubicacion, precio, descripcion, unInquilino, idEdificio);
    }
    
    public void modificarCochera(long id, String ubicacion, float precio, String descripcion, Logica.Inquilino unInquilino) throws Exception{
        unaControladora.modificarCochera(id, ubicacion, precio, descripcion, unInquilino);
    }
    
    public void bajaCochera(long id, long idEdificio) throws Exception{
        unaControladora.bajaCochera(id, idEdificio);
    }
    
    public Logica.Cochera obtenerCochera(long id){
        return unaControladora.obtenerCochera(id);
    }
    
    public List<Logica.Cochera> obtenerCocheras(){
        return unaControladora.obtenerCocheras();
    }
    
    public Logica.Cochera obtenerCocheraInquilino(long idEdificio, long idInquilino){
        return unaControladora.obtenerCocheraInquilino(idEdificio, idInquilino);
    }
    
    public List<Logica.Cochera> obtenerCocherasDisponibles(long idEdificio){
        return unaControladora.obtenerCocherasDisponibles(idEdificio);
    }
    
    public int obtenerCocherasOcupadas(long idEdificio){
        return unaControladora.obtenerCocherasOcupadas(idEdificio);
    }
    
    public boolean existeCochera(String ubicacionCochera, long idEdificio){
        return unaControladora.existeCochera(ubicacionCochera, idEdificio);
    }
    
/*------------------------------------------------------------------------------
                                COEFICIENTE
------------------------------------------------------------------------------*/
    public void altaCoeficiente(String nombre, float valor) throws Exception{
        unaControladora.altaCoeficiente(nombre, valor);
    }
    
    public void modificarCoeficiente(long id, String nombre, float valor) throws Exception{
        unaControladora.modificarCoeficiente(id, nombre, valor);
    }
    
    public void bajaCoeficiente(long id) throws Exception{
        unaControladora.bajaCoeficiente(id);
    }
    
    public Logica.Coeficiente obtenerCoeficiente(long id){
        return unaControladora.obtenerCoeficiente(id);
    }
    
    public List<Logica.Coeficiente> obtenerCoeficientes(){
        return unaControladora.obtenerCoeficientes();
    }
    
    public Logica.Coeficiente obtenerCoeficiente(){
        return unaControladora.obtenerCoeficiente();
    }
    
/*------------------------------------------------------------------------------
                            COEFICIENTE DORMITORIO
------------------------------------------------------------------------------*/
    public void altaCoeficienteDorm(String nombre, float valor, int cantDorm, String descripcion, long idEdificio) throws Exception{
        unaControladora.altaCoeficienteDorm(nombre, valor, cantDorm, descripcion, idEdificio);
    }
    
    public void modificarCoeficienteDorm(long idCoeficienteDorm, int cantDorm, String nombre, float valor, String descripcion) throws Exception{
        unaControladora.modificarCoeficienteDorm(idCoeficienteDorm, cantDorm, nombre, valor, descripcion);
    }
    
    public void bajaCoeficienteDorm(long idCoeficienteDorm, long idEdificio) throws Exception{
        unaControladora.bajaCoeficienteDorm(idCoeficienteDorm, idEdificio);
    }
    
    public Logica.CoeficienteDorm obtenerCoeficienteDorm(long idCoeficienteDorm){
        return unaControladora.obtenerCoeficienteDorm(idCoeficienteDorm);
    }
    
    public List<Logica.CoeficienteDorm> obtenerCoeficientesDorm(){
        return unaControladora.obtenerCoeficientesDorm();
    }
    
    public Logica.CoeficienteDorm obtenerCoeficienteDorm(long idEdificio, Logica.Departamento unDepartamento){
        return unaControladora.obtenerCoeficienteDorm(idEdificio, unDepartamento);
    }
    
    public boolean existeCoeficienteDorm(String nombreCoeficienteDorm, long idEdificio){
        return unaControladora.existeCoeficienteDorm(nombreCoeficienteDorm, idEdificio);
    }
    
/*------------------------------------------------------------------------------
                                DEPARTAMENTO
------------------------------------------------------------------------------*/
    public void altaDepartamento(String ubicacion, int cantDormitorios, String descripcion, List<Logica.Expensa> expensas, Logica.Inquilino unInquilino, long idEdificio) throws Exception{
        unaControladora.altaDepartamento(ubicacion, cantDormitorios, descripcion, expensas, unInquilino, idEdificio);
    }
    
    public void modificarDepartamento(long idDepartamento, String ubicacion, int cantDormitorios, String descripcion, List<Logica.Expensa> expensas, Logica.Inquilino unInquilino) throws Exception{
        unaControladora.modificarDepartamento(idDepartamento, ubicacion, cantDormitorios, descripcion, expensas, unInquilino);
    }
    
    public void bajaDepartamento(long idDepartamento, long idEdificio) throws Exception{
        unaControladora.bajaDepartamento(idDepartamento, idEdificio);
    }
    
    public Logica.Departamento obtenerDepartamento(long idDepartamento){
        return unaControladora.obtenerDepartamento(idDepartamento);
    }
    
    public List<Logica.Departamento> obtenerDepartamentos(){
        return unaControladora.obtenerDepartamentos();
    }
    
    public Logica.Departamento obtenerDepartamento(long idDepartamento, String ubicacion){
        return unaControladora.obtenerDepartamento(idDepartamento, ubicacion);
    }
    
    public Logica.Departamento obtenerDepartamentoInquilino(long idEdificio, long idInquilino){
        return unaControladora.obtenerDepartamentoInquilino(idEdificio, idInquilino);
    }
    
    public int departamentosOcupados(long idEdificio){
        return unaControladora.departamentosOcupados(idEdificio);
    }
    
    public List <Logica.Departamento> departamentosDisponibles(long idEdificio){
        return unaControladora.departamentosDisponibles(idEdificio);
    }
    
    public List <Logica.Departamento> departamentosSinExpensas(int mes, long idEdificio){
        return unaControladora.departamentosSinExpensas(mes, idEdificio);
    }
    
    public Logica.Departamento obtenerDepartamentoPorExpensa(long idEdificio, long idExpensa){
        return unaControladora.obtenerDepartamentoPorExpensa(idEdificio, idExpensa);
    }
    
    public Logica.Departamento obtenerDepartamentoPorAlquiler(long idAlquiler, long idEdificio, long idInquilino){
        return unaControladora.obtenerDepartamentoPorAlquiler(idAlquiler, idEdificio, idInquilino);
    }
    
    public boolean existeDepartamento(String ubicacionDepto, long idEdificio){
        return unaControladora.existeDepartamento(ubicacionDepto, idEdificio);
    }
/*------------------------------------------------------------------------------
                                EDIFICIO
------------------------------------------------------------------------------*/
    public void altaEdificio(String nombre, String direccion, String descripcion, List<Logica.Departamento> departamentos, List<Logica.Cochera> cocheras, List<Logica.Servicio> servicios, List<Logica.CoeficienteDorm> coeficientesDorm) throws Exception{
        unaControladora.altaEdificio(nombre, direccion, descripcion, departamentos, cocheras, servicios, coeficientesDorm);
    }
    
    public void modificarEdificio(long idEdificio, String nombre, String direccion, String descripcion, List<Logica.Departamento> departamentos, List<Logica.Cochera> cocheras, List<Logica.Servicio> servicios, List<Logica.CoeficienteDorm> coeficientesDorm) throws Exception{
        unaControladora.modificarEdificio(idEdificio, nombre, direccion, descripcion, departamentos, cocheras, servicios, coeficientesDorm);
    }
    
    public void bajaEdificio(long idEdificio) throws Exception{
        unaControladora.bajaEdificio(idEdificio);
    }
    
    public Logica.Edificio obtenerEdificio(long idEdificio){
        return unaControladora.obtenerEdificio(idEdificio);
    }
    
    public List<Logica.Edificio> obtenerEdificios(){
        return unaControladora.obtenerEdificios();
    }
    
    public Logica.Edificio buscarEdificioPorNombre(String nombreEdificio){
        return unaControladora.buscarEdificioPorNombre(nombreEdificio);
    }
    
    public Logica.Edificio obtenerEdificioSegunDepartamento(long idDepartamento){
        return unaControladora.obtenerEdificioSegunDepartamento(idDepartamento);
    }
    
    public boolean existeEdificio(String nombreEdificio){
        return unaControladora.existeEdificio(nombreEdificio);
    }
    
/*------------------------------------------------------------------------------
                                EXPENSA
------------------------------------------------------------------------------*/
    public void altaExpensa(float monto, int periodo, int anio, String descripcion, List<Logica.ServicioExpensa> serviciosExpensa, long idInquilino) throws Exception{
        unaControladora.altaExpensa(monto, periodo, anio, descripcion, serviciosExpensa, idInquilino);
    }
    
    public void modificarExpensa(long idExpensa, float monto, int periodo, int anio, String descripcion, List<Logica.ServicioExpensa> serviciosExpensa) throws Exception{
        unaControladora.modificarExpensa(idExpensa, monto, periodo, anio, descripcion, serviciosExpensa);
    }
    
    public void bajaExpensa(long idExpensa, long idDepartamento) throws Exception{
        unaControladora.bajaExpensa(idExpensa, idDepartamento);
    }
    
    public Logica.Expensa obtenerExpensa(long idExpensa){
        return unaControladora.obtenerExpensa(idExpensa);
    }
    
    public List<Logica.Expensa> obtenerExpensas(){
        return unaControladora.obtenerExpensas();
    }
    
    public float calcularMonto(List<Logica.ServicioExpensa> serviciosExpensa){
        return unaControladora.calcularMonto(serviciosExpensa);
    }
    
    public List<Logica.ServicioExpensa> calcularExpensa(long idEdificio, Logica.Departamento unDepartamento, int periodo, int anio, boolean alta) throws Exception{
        return unaControladora.calcularExpensa(idEdificio, unDepartamento, periodo, anio, alta);
    }
    
    public List<Logica.Expensa> obtenerExpensasEdificio(long idEdificio){
        return unaControladora.obtenerExpensasEdificio(idEdificio);
    }
    
    public List<Logica.Expensa> obtenerExpensasFechaActual(long idEdificio){
        return unaControladora.obtenerExpensasFechaActual(idEdificio);
    }
    
    public Logica.Expensa obtenerExpensa(long idDepartamento, int mesAlquiler, int anioAlquiler){
         return unaControladora.obtenerExpensa(idDepartamento, mesAlquiler, anioAlquiler);
    }
    
    public Logica.Expensa obtenerUltimaExpensa(long idDepartamento){
        return unaControladora.obtenerUltimaExpensa(idDepartamento);
    }
    
    public boolean existeExpensa(long idDepto, int mesExpensa, int anioExpensa){
        return unaControladora.existeExpensa(idDepto, mesExpensa, anioExpensa);
    }
    
    public boolean existenExpensas(long idEdificio){
        return unaControladora.existenExpensas(idEdificio);
    }
    
/*------------------------------------------------------------------------------
                                GARANTE
------------------------------------------------------------------------------*/
    public void altaGarante(String apellido, String nombre, String dni, String direccion, String telefono, String cuit, String email, String descripcion, long idInquilino) throws Exception{
        unaControladora.altaGarante(apellido, nombre, dni, direccion, telefono, cuit, email, descripcion, idInquilino);
    }
    
    public void modificarGarante(long idGarante, String apellido, String nombre, String dni, String direccion, String telefono, String cuit, String email, String descripcion, long idInquilino) throws Exception{
        unaControladora.modificarGarante(idGarante, apellido, nombre, dni, direccion, telefono, cuit, email, descripcion, idInquilino);
    }
    
    public void bajaGarante(long idGarante, long idInquilino) throws Exception{
        unaControladora.bajaGarante(idGarante, idInquilino);
    }
    
    public Logica.Garante obtenerGarante(long idGarante){
        return unaControladora.obtenerGarante(idGarante);
    }
    
    public List<Logica.Garante> obtenerGarantes(){
        return unaControladora.obtenerGarantes();
    }
    
    public List<Logica.Garante> obtenerGarantesInquilinos(List<Logica.Inquilino> inquilinos){
        return unaControladora.obtenerGarantesInquilinos(inquilinos);
    }
    
    public List<Logica.Garante> obtenerGarantesEdificio(long idEdificio){
        return unaControladora.obtenerGarantesEdificio(idEdificio);
    }
    
    public boolean existeGarante(String dniGarante, long idEdificio){
        return unaControladora.existeGarante(dniGarante, idEdificio);
    }
    
/*------------------------------------------------------------------------------
                                INQUILINO
------------------------------------------------------------------------------*/
    public void altaInquilino(int cantidadPersonas, String apellido, String nombre, String dni, String email, String telefono, String cuit, float saldoMesAnt, float[] impSemestres, String descripcion, Logica.Garante unGarante, List<Logica.Alquiler> alquileres, long idDepartamento, long idCochera) throws Exception{
        unaControladora.altaInquilino(cantidadPersonas, apellido, nombre, dni, email, telefono, cuit, saldoMesAnt, impSemestres, descripcion, unGarante, alquileres, idDepartamento, idCochera);
    }
    
    public void modificarInquilino(long idInquilino, int cantidadPersonas, String apellido, String nombre, String dni, String email, String telefono, String cuit, float saldoMesAnt, float[] impSemestres, String descripcion, Logica.Garante unGarante, List<Logica.Alquiler> alquileres, long idDepartamento, long idCochera, long idEdificio) throws Exception{
        unaControladora.modificarInquilino(idInquilino, cantidadPersonas, apellido, nombre, dni, email, telefono, cuit, saldoMesAnt, impSemestres, descripcion, unGarante, alquileres, idDepartamento, idCochera, idEdificio);
    }
    
    public void modificarSaldo(long idInquilino, float saldoMesAnt) throws Exception{
        unaControladora.modificarSaldo(idInquilino, saldoMesAnt);
    }
    
    public void bajaInquilino(long idInquilino, long idDepartamento, long idCochera) throws Exception{
        unaControladora.bajaInquilino(idInquilino, idDepartamento, idCochera);
    }
    
    public Logica.Inquilino obtenerInquilino(long idInquilino){        
        return unaControladora.obtenerInquilino(idInquilino);
    }
    
    public List<Logica.Inquilino> obtenerInquilinos(){
        return unaControladora.obtenerInquilinos();
    }
    
    // Obtiene todos los inquilinos de un Edificio dado.
    public List<Logica.Inquilino> obtenerInquilinosEdificio(long idEdificio){
        return unaControladora.obtenerInquilinosEdificio(idEdificio);
    }
    
    public boolean obtenerInquilinoPorDni(String dni, long idEdificio){
        return unaControladora.obtenerInquilinoPorDni(dni, idEdificio);
    }
    
    public List<Logica.Inquilino> obtenerInquilinosSinPago(long idEdificio){
        return unaControladora.obtenerInquilinosSinPago(idEdificio);
    }
    
    public Logica.Inquilino obtenerInquilinoPorAlquiler(long idEdificio, long idAlquiler){
        return unaControladora.obtenerInquilinoPorAlquiler(idEdificio, idAlquiler);
    }
    
    public Logica.Inquilino obtenerInquilinoGarante(long idGarante, long idEdificio){
        return unaControladora.obtenerInquilinoGarante(idGarante, idEdificio);
    }
    
    public List<Logica.Inquilino> obtenerInquilinosSinAlquiler(long idEdificio){
        return unaControladora.obtenerInquilinosSinAlquiler(idEdificio);
    }
    
    public Logica.Inquilino obtenerInquilinoPago(long idEdificio, long idPago){
        return unaControladora.obtenerInquilinoPago(idEdificio, idPago);
    }
/*------------------------------------------------------------------------------
                                PAGO
------------------------------------------------------------------------------*/
    public void altaPago(Date fecha, float efectivo, float tarjeta, float banco, float saldoMesAnt, float interesPorAtraso, float monto, float otros, String descripcion, long idAlquiler, long idExpensa, long idInquilino) throws Exception{
        unaControladora.altaPago(fecha, efectivo, tarjeta, banco, saldoMesAnt, interesPorAtraso, monto, otros, descripcion, idAlquiler, idExpensa, idInquilino);
    }
    
    public void modificarPago(long idPago, Date fecha, float efectivo, float tarjeta, float banco, float saldoMesAnt, float interesPorAtraso, float monto, float otros, String descripcion, long idAlquiler, long idExpensa, long idInquilino) throws Exception{
        unaControladora.modificarPago(idPago, fecha, efectivo, tarjeta, banco, saldoMesAnt, interesPorAtraso, monto, otros, descripcion, idAlquiler, idExpensa, idInquilino);
    }
    
    public void bajaPago(long idPago, long idEdificio) throws Exception{
        unaControladora.bajaPago(idPago, idEdificio);
    }
    
    public Logica.Pago obtenerPago(long idPago){        
        return unaControladora.obtenerPago(idPago);
    }
    
    public List<Logica.Pago> obtenerPagos(){
        return unaControladora.obtenerPagos();
    }
    
    public List<Logica.Pago> obtenerPagosInquilino(long idInquilino){
        return unaControladora.obtenerPagosInquilino(idInquilino);
    }
    
    public List<Logica.Pago> obtenerPagosEdificio(long idEdificio){
        return unaControladora.obtenerPagosEdificio(idEdificio);
    }
    
    public float obtenerSaldoUltimoPago(long idInquilino){
        return unaControladora.obtenerSaldoUltimoPago(idInquilino);
    }
    
    public Logica.Pago buscarUltimoPago(Logica.Inquilino unInqui){
        return unaControladora.buscarUltimoPago(unInqui);
    }
    
/*------------------------------------------------------------------------------
                                SERVICIO
------------------------------------------------------------------------------*/
    public void altaServicio(String nombre, int mes, int anio, boolean calculoxPersona, Date fechaEmision, Date fechaVencimiento, float monto, String descripcion, long idEdificio) throws Exception{
        unaControladora.altaServicio(nombre, mes, anio, calculoxPersona, fechaEmision, fechaVencimiento, monto, descripcion, idEdificio);
    }
    
    public void modificarServicio(long idServicio, String nombre, int mes, int anio, boolean calculoxPersona, Date fechaEmision, Date fechaVencimiento, float monto, String descripcion) throws Exception{
        unaControladora.modificarServicio(idServicio, nombre, mes, anio, calculoxPersona, fechaEmision, fechaVencimiento, monto, descripcion);
    }
    
    public void bajaServicio(long idServicio, long idEdificio) throws Exception{
        unaControladora.bajaServicio(idServicio, idEdificio);
    }
    
    public Logica.Servicio obtenerServicio(long idServicio){        
        return unaControladora.obtenerServicio(idServicio);
    }
    
    public Logica.Servicio obtenerServicio(long idServicio, String nombreServicio){        
        return unaControladora.obtenerServicio(idServicio, nombreServicio);
    }
    
    public List<Logica.Servicio> obtenerServicios(){
        return unaControladora.obtenerServicios();
    }
    
    public List<Logica.Servicio> obtenerServEdifMes(int mes, long idEdificio){
        return unaControladora.obtenerServEdifMes(mes, idEdificio);
    }
    
    /*public boolean existeServicio(String nombreServicio, long idEdificio){
        return unaControladora.existeServicio(nombreServicio, idEdificio);
    }*/
    
/*------------------------------------------------------------------------------
                             SERVICIO EXPENSA
------------------------------------------------------------------------------*/

    Logica.ServicioExpensa cargarListaServicioExpensa(String nombre, int mes, int anio, float monto, String descripcion) throws Exception{
        return unaControladora.cargarListaServicioExpensa(nombre, mes, anio, monto, descripcion);
    }
    
    List<Logica.ServicioExpensa> obtenerServiciosExpensaDepartamento(Logica.Departamento unDepartamento, int mes, int anio){
        return unaControladora.obtenerServiciosExpensaDepartamento(unDepartamento, mes, anio);
    }

}
