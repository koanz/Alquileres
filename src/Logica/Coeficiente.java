package Logica;

import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Coeficiente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private String nombre;
    @Basic
    private float valor;

    public Coeficiente() {
    }

    public Coeficiente(String nombre, float valor) {
        this.nombre = nombre;
        this.valor = valor;
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
    
    @Override
    public String toString(){
        return nombre+" -- $"+String.format("%.2f", valor);
    }
    
}
