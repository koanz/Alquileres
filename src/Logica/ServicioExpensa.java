package Logica;

import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class ServicioExpensa implements Serializable {
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
    private float monto;
    @Basic
    private String descripcion;

    public ServicioExpensa() {
    }

    public ServicioExpensa(String nombre, int mes, int anio, float monto, String descripcion) {
        this.nombre = nombre;
        this.mes = mes;
        this.anio = anio;
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
    
    @Override
    public String toString(){
        return nombre+" - "+String.format("%.2f", monto);
    }
    
}
