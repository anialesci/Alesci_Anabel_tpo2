
package persistencia;

import java.util.List;
import logica.Perro;
import logica.Persona;

public class ControladoraDePersistencia{
    PersonaJpaController personacontroller = new PersonaJpaController();
    PerroJpaController perrocontroller = new PerroJpaController();
    
    //Metodo para guardar datos de la persona//
    public void crearPersona(Persona pers) {
       personacontroller.create(pers);
    }
    //Metodo para guardar datos del perro//
    public void crearPerro(Perro perro) throws Exception{
        perrocontroller.create(perro);
       
   }
    
}
