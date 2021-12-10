package Logica;

import java.util.Date;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import java.text.SimpleDateFormat;
import javax.persistence.Temporal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Pago implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private long idAlquiler;
    @Basic
    private long idExpensa;
    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    @Basic
    private float efectivo;
    @Basic
    private float tarjeta;
    @Basic
    private float banco;
    @Basic
    private float saldo;
    @Basic
    private float interesPorAtraso;
    @Basic
    private float monto;
    @Basic
    private float otros;
    @Basic
    private String descripcion;

    public Pago() {
    }

    public Pago(Date fecha, float efectivo, float tarjeta, float banco, float saldo, float interesPorAtraso, float monto, float otros, String descripcion, long idAlquiler, long idExpensa) {
        this.fecha = fecha;
        this.efectivo = efectivo;
        this.tarjeta = tarjeta;
        this.banco = banco;
        this.saldo = saldo;
        this.interesPorAtraso = interesPorAtraso;
        this.monto = monto;
        this.otros = otros;
        this.descripcion = descripcion;
        this.idAlquiler = idAlquiler;
        this.idExpensa = idExpensa;
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

    public float getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(float efectivo) {
        this.efectivo = efectivo;
    }

    public float getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(float tarjeta) {
        this.tarjeta = tarjeta;
    }

    public float getBanco() {
        return banco;
    }

    public void setBanco(float banco) {
        this.banco = banco;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getInteresPorAtraso() {
        return interesPorAtraso;
    }

    public void setInteresPorAtraso(float interesPorAtraso) {
        this.interesPorAtraso = interesPorAtraso;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getOtros() {
        return otros;
    }

    public void setOtros(float otros) {
        this.otros = otros;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(long idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public long getIdExpensa() {
        return idExpensa;
    }

    public void setIdExpensa(long idExpensa) {
        this.idExpensa = idExpensa;
    }
    
    private String convertirFecha(Date fecha){
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
        String date = d.format(fecha);
                
        return date;
    }
    
    @Override
    public String toString(){
        return convertirFecha(fecha)+" - $"+String.format("%.2f", monto);
    }
    
}
