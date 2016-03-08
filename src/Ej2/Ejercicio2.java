/**
 * RAUL JIMENEZ MARTIN 2/3/2016
 * 
 * 2 . Interfaz Gráfica de Usuario:
 * Crear una interfaz gráfica de usuario,
 * con un botón de nombre "UNED CURSO JAVA",
 * y que además esté siempre centrado en la ventana, 
 * tenga el tamaño que tenga la ventana, recordar que se puede hacer
 * con uno de los Layouts Managers.
 */

package Ej2;

import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
 
public class Ejercicio2 extends JFrame {
  
    public static void main( String []arg ){
        new Ejercicio2();
    }
 
    public Ejercicio2(){

        // Damos unos valores iniciales de tamaño de la ventana
        this.setSize(400,400);
        //Situamos inicialmente la ventana en el centro
        this.setLocationRelativeTo(null);

        // GridBagLayout conlleva la opción centrado por defecto
        this.setLayout(new GridBagLayout());
        // Con setVisible lo representamos por pantalla
        this.setVisible(true);

        // Creamos un objeto tipo JButton
        JButton boton = new JButton();
        boton.setText("UNED CURSO JAVA");

        add(boton);
    }
}