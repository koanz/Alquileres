package Logica;

import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class CoeficienteDorm implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private String nombre;
    @Basic
    private float valor;
    @Basic
    private int cantDorm;
    @Basic
    private String descripcion;

    public CoeficienteDorm() {
    }

    public CoeficienteDorm(String nombre, float valor, int cantDorm, String descripcion) {
        this.nombre = nombre;
        this.valor = valor;
        this.cantDorm = cantDorm;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCantDorm() {
        return cantDorm;
    }

    public void setCantDorm(int cantDorm) {
        this.cantDorm = cantDorm;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return nombre+" -- "+cantDorm+" -- $"+String.format("%.2f", valor);
    }
    
}
