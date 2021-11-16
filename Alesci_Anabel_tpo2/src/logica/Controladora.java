
package logica;

import excepciones.PerroException;
import excepciones.PersonaException;
import java.util.List;
import persistencia.ControladoraDePersistencia;


public class Controladora {

      ControladoraDePersistencia controlpersistencia = new ControladoraDePersistencia();
            
        public Persona crearPersona (String nombre_duenio, int celular_duenio, String observaciones)throws PersonaException{
            Persona pers = new Persona();
            pers.setNombre_duenio(nombre_duenio);
            pers.setCelular_duenio(celular_duenio);
            pers.setObservaciones(observaciones);
            controlpersistencia.crearPersona(pers);
            return pers;
           
        }

    public void crearPerro(Integer numero_cliente, String nombre_perro, String raza, String color, boolean alergico, boolean atencion_especial,Persona persona) throws PerroException,Exception {
        Perro perro = new Perro();
        perro.setNum_cliente(numero_cliente);
        perro.setNombre_perro(nombre_perro);
        perro.setRaza_perro(raza);
        perro.setColor_perro(nombre_perro);
        perro.setAlergico(alergico);
        perro.setAtencion_especial(atencion_especial);
        perro.setPersona(persona);
        controlpersistencia.crearPerro(perro);
    }
        
        
    }
    

