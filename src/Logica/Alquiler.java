package Logica;

import java.util.Date;
import javax.persistence.Id;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Alquiler implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fecha;
    @Basic
    private long idCochera;
    @Basic
    private long idDepartamento;
    @Basic
    private int[] GeneracionAuto = new int[2];
    @Basic
    private float monto;
    @Basic
    private float otraFactura;
    @Basic
    private float total;
    @Basic
    private String descripcion;
    @OneToOne(cascade=CascadeType.REMOVE)
    private Pago unPago;
    

    public Alquiler() {
    }

    public Alquiler(Date fecha, long idCochera, long idDepartamento, int[] GeneracionAuto, float monto, float otraFactura, float total, String descripcion,  Pago unPago) {
        this.fecha = fecha;
        this.idCochera = idCochera;
        this.idDepartamento = idDepartamento;
        this.GeneracionAuto = GeneracionAuto;
        this.monto = monto;
        this.otraFactura = otraFactura;
        this.total = total;
        this.descripcion = descripcion;
        this.unPago = unPago;
    }

    public long getId() {
        return id;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public long getCochera() {
        return idCochera;
    }

    public void setIdCochera(long idCochera) {
        this.idCochera = idCochera;
    }

    public long getDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int[] getGeneracionAuto() {
        return GeneracionAuto;
    }

    public void setGeneracionAuto(int[] GeneracionAuto) {
        this.GeneracionAuto = GeneracionAuto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto){
        this.monto = monto;
    }

    public float getOtraFactura() {
        return otraFactura;
    }

    public void setOtraFactura(float otraFactura) {
        this.otraFactura = otraFactura;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Pago getUnPago() {
        return unPago;
    }

    public void setUnPago(Pago unPago) {
        this.unPago = unPago;
    }
    
    private String obtenerMes(int periodo){
        String mes = "";
        
        switch(periodo){
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
        }
        
        return mes;
    }
    
    @Override
    public String toString(){
        SimpleDateFormat mes = new SimpleDateFormat("MM");
        return mes.format(fecha)+" - $"+total;
    }
    
}
