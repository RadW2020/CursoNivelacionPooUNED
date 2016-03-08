package Ej1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 1. Estructuras de Control
 * Desarrollar un programa que permita la carga de 5 valores por teclado 
 * y nos muestre posteriormente la suma de los valores ingresados y su promedio,
 * lo resolveremos empleando la estructura for.
 *
 * @author Raúl Jiménez Martín
 */
public class Ejercicio1 {
    static InputStreamReader input = new InputStreamReader(System.in);
    static final BufferedReader entrada = new BufferedReader(input);
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double media;
        double suma;
        int count;
        suma = 0;
        count = 0;
        
        System.out.println("Entroduce 5 valores: ");
        for (int i=0; i < 5 ; i++){
            try {
                String lecturaDato = entrada.readLine(); // Leemos entrada y lo guardamos en lecturaDato
                suma += Integer.parseInt(lecturaDato); // Leemos una entrada de datos tipo string y la guardamos como int
                count ++;
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio1.class.getName()).log(Level.SEVERE, null, ex);
                
            } catch (NumberFormatException nex){
                System.err.println("Has introducido un caracter no válido.\n" + nex );
            }
        }
        //Mostramos por Pantalla
        System.out.println("La suma de valores es: " + suma);

        media = suma / count;
        System.out.println("La media de valores es: " + media);

    }

}
