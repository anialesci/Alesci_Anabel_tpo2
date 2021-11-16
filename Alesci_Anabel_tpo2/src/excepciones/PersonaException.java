 
package excepciones;


public class PersonaException extends Exception{
    private int codigoError;
     
    public PersonaException(){
        super();
        System.out.println("Hubo un error al agregar una persona");
}}
