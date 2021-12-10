package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notificaciones implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private String obsExpensa;
    @Basic
    private String obsAlquiler;

    public Notificaciones() {
    }

    public Notificaciones(String obsExpensa, String obsAlquiler) {
        this.obsExpensa = obsExpensa;
        this.obsAlquiler = obsAlquiler;
    }
    
    public long getId() {
        return id;
    }
    
    public String getObsExpensa() {
        return obsExpensa;
    }

    public void setObsExpensa(String obsExpensa) {
        this.obsExpensa = obsExpensa;
    }

    public String getObsAlquiler() {
        return obsAlquiler;
    }

    public void setObsAlquiler(String obsAlquiler) {
        this.obsAlquiler = obsAlquiler;
    }
}
