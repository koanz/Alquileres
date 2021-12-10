package Logica;

import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Garante implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private String apellido;
    @Basic
    private String nombre;
    @Basic
    private String dni;
    @Basic
    private String direccion;
    @Basic
    private String telefono;
    @Basic
    private String cuit;
    @Basic
    private String email;
    @Basic
    private String descripcion;

    public Garante() {
    }

    public Garante(String apellido, String nombre, String dni, String direccion, String telefono, String cuit, String email, String descripcion) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuit = cuit;
        this.email = email;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString(){
        return apellido+", "+nombre;
    }
    
}
