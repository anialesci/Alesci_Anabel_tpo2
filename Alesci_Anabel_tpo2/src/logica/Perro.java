package logica;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Perro implements Serializable {
      @Id
      private Integer num_cliente;
      private String nombre_perro;
      private String raza_perro;
      private String color_perro;
      private boolean alergico;
      private boolean atencion_especial;
     @OneToOne
      private Persona persona;

    public Perro() {
    }

    public Perro(Integer num_cliente, String nombre_perro, String raza_perro, String color_perro, boolean alergico, boolean atencion_especial, Persona persona) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza_perro = raza_perro;
        this.color_perro = color_perro;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.persona = persona;
    }

    public Integer getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(Integer num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza_perro() {
        return raza_perro;
    }

    public void setRaza_perro(String raza_perro) {
        this.raza_perro = raza_perro;
    }

    public String getColor_perro() {
        return color_perro;
    }

    public void setColor_perro(String color_perro) {
        this.color_perro = color_perro;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(boolean atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Perro{" + "num_cliente=" + num_cliente + ", nombre_perro=" + nombre_perro + ", raza_perro=" + raza_perro + ", color_perro=" + color_perro + ", alergico=" + alergico + ", atencion_especial=" + atencion_especial + ", persona=" + persona + '}';
    }
      
}
   