
package excepciones;


public class PerroException extends Exception{
    private int codigoError;
     
    public PerroException(){
        super();
        System.out.println("Hubo un error al agregar perro");
}
}
