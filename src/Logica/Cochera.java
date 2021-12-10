package Logica;

import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

@Entity
public class Cochera implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private String ubicacion;
    @Basic
    private String descripcion;
    @Basic
    private float precio;
    @OneToOne(cascade = CascadeType.ALL)
    private Inquilino unInquilino;

    public Cochera() {
    }

    public Cochera(String ubicacion, float precio, String descripcion, Inquilino unInquilino) {
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.descripcion = descripcion;
        this.unInquilino = unInquilino;
    }

    public long getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Inquilino getUnInquilino() {
        return unInquilino;
    }

    public void setUnInquilino(Inquilino unInquilino) {
        this.unInquilino = unInquilino;
    }    
    
    @Override
    public String toString(){
        return "Cochera N°: "+ubicacion;
    }
    
}
