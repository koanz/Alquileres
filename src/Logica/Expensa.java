package Logica;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

@Entity
public class Expensa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private float monto;
    @Basic
    private int mes;
    @Basic
    private int anio;
    @Basic
    private String descripcion;
    @OneToMany(cascade=CascadeType.REMOVE)
    private List<ServicioExpensa> serviciosExpensa;

    public Expensa() {
    }

    public Expensa(float monto, int mes, int anio, String descripcion, List<ServicioExpensa> serviciosExpensa) {
        this.monto = monto;
        this.anio = anio;
        this.mes = mes;
        this.descripcion = descripcion;
        this.serviciosExpensa = serviciosExpensa;
    }

    public long getId() {
        return id;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<ServicioExpensa> getServiciosExpensa() {
        return serviciosExpensa;
    }

    public void setServiciosExpensa(List<ServicioExpensa> serviciosExpensa) {
        this.serviciosExpensa = serviciosExpensa;
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
        return obtenerMes(mes)+": $"+String.format("%.2f", monto);
    }
}
