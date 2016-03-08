/**
 * 3. Programación de Eventos
 * Escriba un programa de interfaz gráfica con una ventana que tenga 
 * una etiqueta y dos botones. El comportamiento de la aplicación 
 * debe reflejar en el texto de la etiqueta cuál es el último botón en el
 * que el usuario ha hecho clic. 
 */

package Ej3;

/**
 * @author Raúl Jiménez Martín
 */
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
 
public final class Ejercicio3 extends JFrame {
    String pulsado = "Yo soy el último pulsado";
    String noPulsado = ":(";
   
    public static void main( String []arg ){
        new Ejercicio3();
    }
 
    public Ejercicio3(){
       
        // Damos unos valores iniciales de tamaño de la ventana
        this.setSize(400,400);
        //Situamos inicialmente la ventana en el centro
        this.setLocationRelativeTo(null);

        // GridBagLayout conlleva la opción centrado por defecto
        this.setLayout(new GridBagLayout());
        // Con setVisible lo representamos por pantalla
        this.setVisible(true);
        
        // Creamos un objeto tipo JButton
        JButton Jboton1 = new JButton();
        Jboton1.setText("Púlsame a mí");
        JButton Jboton2 = new JButton();
        Jboton2.setText("no, a mí!");
        this.setVisible(true);
        add(Jboton1);
        add(Jboton2);
        
        Jboton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Jboton1.setText(pulsado);
                Jboton2.setText(noPulsado);
            }
        });
        Jboton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Jboton1.setText(noPulsado);
                Jboton2.setText(pulsado);
            }
        });
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
}

/*
 *  Programación de Eventos
 * Escriba un programa de interfaz gráfica con una ventana que tenga 
 * una etiqueta y dos botones. El comportamiento de la aplicación 
 * debe reflejar en el texto de la etiqueta el número de veces que ha sido
 * pulsado
 

package Ej3;

 
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
 
public final class Ejercicio3 extends JFrame {
    int boton1 = 0;
    int boton2 = 0;
   
    public static void main( String []arg ){
        new Ejercicio3();
    }
 
    public Ejercicio3(){
       
        // Damos unos valores iniciales de tamaño de la ventana
        this.setSize(400,400);
        //Situamos inicialmente la ventana en el centro
        this.setLocationRelativeTo(null);

        // GridBagLayout conlleva la opción centrado por defecto
        this.setLayout(new GridBagLayout());
        // Con setVisible lo representamos por pantalla
        this.setVisible(true);

        // Creamos un objeto tipo JButton
        JButton Jboton1 = new JButton();
        Jboton1.setText(String.valueOf(boton1));
        JButton Jboton2 = new JButton();
        Jboton2.setText(String.valueOf(boton2));
        this.setVisible(true);
        add(Jboton1);
        add(Jboton2);
        
        Jboton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                boton1++;
                Jboton1.setText("" +boton1);
            }
        });
        Jboton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                boton2++;
                Jboton2.setText("" +boton2);
            }
        });
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
}*/