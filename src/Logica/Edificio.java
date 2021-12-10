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
import javax.persistence.OneToOne;


@Entity
public class Edificio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private String nombre;
    @Basic
    private String direccion;
    @Basic
    private String descripcion;
    @OneToOne
    private Notificaciones Notificaciones;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Departamento> departamentos;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Cochera> cocheras;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Servicio> servicios;
    @OneToMany(cascade = CascadeType.ALL)
    private List<CoeficienteDorm> coeficientesDorm;

    public Edificio(String nombre, String direccion, String descripcion, List<Departamento> departamentos, List<Cochera> cocheras, List<Servicio> servicios, List<CoeficienteDorm> coeficientesDorm) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.descripcion = descripcion;
        this.departamentos = departamentos;
        this.cocheras = cocheras;
        this.servicios = servicios;
        this.coeficientesDorm = coeficientesDorm;
        this.Notificaciones = null;
    }

    public Edificio() {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Notificaciones getNotificaciones() {
        return Notificaciones;
    }

    public void setNotificaciones(Notificaciones Notificaciones) {
        this.Notificaciones = Notificaciones;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public List<Cochera> getCocheras() {
        return cocheras;
    }

    public void setCocheras(List<Cochera> cocheras) {
        this.cocheras = cocheras;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public List<CoeficienteDorm> getCoeficientesDorm() {
        return coeficientesDorm;
    }

    public void setCoeficientesDorm(List<CoeficienteDorm> coeficientesDorm) {
        this.coeficientesDorm = coeficientesDorm;
    }
    
    @Override
    public String toString(){
        return nombre+" - "+direccion;
    }
}
