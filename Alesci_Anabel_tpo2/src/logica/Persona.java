
package logica;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Persona implements Serializable {
   @Id 
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int documento;
   private String nombre_duenio;
   private int celular_duenio;
   private String observaciones;


    public Persona() {
    }

    public Persona(int documento, String nombre_duenio, int celular_duenio, String observaciones) {
        this.documento = documento;
        this.nombre_duenio = nombre_duenio;
        this.celular_duenio = celular_duenio;
        this.observaciones = observaciones;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public int getCelular_duenio() {
        return celular_duenio;
    }

    public void setCelular_duenio(int celular_duenio) {
        this.celular_duenio = celular_duenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Persona{" + "documento=" + documento + ", nombre_duenio=" + nombre_duenio + ", celular_duenio=" + celular_duenio + ", observaciones=" + observaciones + '}';
    }

    
}
