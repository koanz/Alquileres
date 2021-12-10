package Logica;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;
import java.util.Observable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Departamento extends Observable implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private String ubicacion;
    @Basic
    private int cantDormitorios;
    @Basic
    private String descripcion;
    @OneToMany(cascade=CascadeType.REMOVE)
    private List<Expensa> expensas;
    @OneToOne(cascade = CascadeType.ALL)
    private Inquilino unInquilino;

    public Departamento() {
    }

    public Departamento(String ubicacion, int cantDormitorios, String descripcion, List<Expensa> expensas, Inquilino unInquilino) {
        this.ubicacion = ubicacion;
        this.cantDormitorios = cantDormitorios;
        this.descripcion = descripcion;
        this.expensas = expensas;
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

    public int getCantDormitorios() {
        return cantDormitorios;
    }

    public void setCantDormitorios(int cantDormitorios) {
        this.cantDormitorios = cantDormitorios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Expensa> getExpensas() {
        return expensas;
    }

    public void setExpensas(List<Expensa> expensas) {
        this.expensas = expensas;
    }

    public Inquilino getUnInquilino() {
        return unInquilino;
    }

    public void setUnInquilino(Inquilino unInquilino) {
        this.unInquilino = unInquilino;
    }

    
    @Override
    public String toString(){
        return ubicacion+" - Cant. dormitorios: "+cantDormitorios;
    }
    
}
