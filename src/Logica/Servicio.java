package Logica;

import java.util.Date;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Servicio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private String nombre;
    @Basic
    private int mes;
    @Basic
    private int anio;
    @Basic
    private boolean calculoxPersona;
    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaEmision;
    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaVencimiento;
    @Basic
    private float monto;
    @Basic
    private String descripcion;

    public Servicio() {
    }

    public Servicio(String nombre, int mes, int anio, boolean calculoxPersona, Date fechaEmision, Date fechaVencimiento, float monto, String descripcion) {
        this.nombre = nombre;
        this.mes = mes;
        this.anio = anio;
        this.calculoxPersona = calculoxPersona;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isCalculoxPersona() {
        return calculoxPersona;
    }

    public void setCalculoxPersona(boolean calculoxPersona) {
        this.calculoxPersona = calculoxPersona;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String obtenerMes(int periodo){
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
        return obtenerMes(mes)+"/"+anio+" - "+nombre+": $"+String.format("%.2f", monto);
    }
}
