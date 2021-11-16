


import igu.Pantalla;
import javax.swing.JFrame;
import logica.Controladora;


public class main {

    
    public static void main(String[] args) {
        Controladora control = new Controladora();
        Pantalla pantallaigu = new Pantalla(control);
        pantallaigu.pack();
        pantallaigu.setVisible(true);
        pantallaigu.setLocationRelativeTo(null);
        pantallaigu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }        
        
}
