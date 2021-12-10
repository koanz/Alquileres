package Logica;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

@Entity
public class Inquilino implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private int cantidadPersonas;
    @Basic
    private String apellido;
    @Basic
    private String nombre;
    @Basic
    private String dni;
    @Basic
    private String email;
    @Basic
    private String telefono;
    @Basic
    private String cuit;
    @Basic
    private float saldoMesAnt;
    @Basic
    private float[] impSemestres = new float[4];
    @Basic
    private String descripcion;
    @OneToOne(cascade=CascadeType.REMOVE)
    private Garante unGarante;
    @OneToMany(cascade=CascadeType.REMOVE)
    private List<Alquiler> alquileres;

    public Inquilino() {
    }

    public Inquilino(int cantidadPersonas, String apellido, String nombre, String dni, String email, String telefono, String cuit, float saldoMesAnt, float[] impSemestres, String descripcion, Garante unGarante, List<Alquiler> alquileres) {
        this.cantidadPersonas = cantidadPersonas;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.cuit = cuit;
        this.saldoMesAnt = saldoMesAnt;
        this.descripcion = descripcion;
        this.unGarante = unGarante;
        this.alquileres = alquileres;
        this.impSemestres = impSemestres;
    }

    public long getId() {
        return id;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    
    public Garante getUnGarante() {
        return unGarante;
    }
    

    public void setUnGarante(Garante unGarante) {
        this.unGarante = unGarante;
    }

    public float getSaldoMesAnt() {
        return saldoMesAnt;
    }

    public void setSaldoMesAnt(float saldoMesAnt) {
        this.saldoMesAnt = saldoMesAnt;
    }

    public float[] getImpSemestres() {
        return impSemestres;
    }

    public void setImpSemestres(float[] impSemestres) {
        this.impSemestres = impSemestres;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }
    
    @Override
    public String toString(){
        return apellido+", "+nombre;
    }
    
}
