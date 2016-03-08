package Ej4;
/**
 * 4. Ejercicio de Composición
 * Realizar una clase, de nombre Examen, para guardar información sobre los exámenes de un centro
 * educativo.
 * La clase Examen realiza una composición de elementos de tipo String, Fecha y Hora. Recibe los valores
 * de los atributos por parámetro en el constructor y además tiene un método para cambiar cada uno de los
 * atributos y un método para devolver cada uno de los atributos. También tiene un método toString() que
 * devuelve el valor de todos los atributos en forma de String.
*/

/**
 * @author Raúl Jiménez Martín
 */
public class Examen {
  
    String asignatura, aula;
    Fecha fecha;
    Hora horaObjeto;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
    
    @Override
    public String toString(){
        return "El examen de " + asignatura + " es en " + aula;
    }
    public Examen(Fecha fecha, Hora hora){
        this.fecha = fecha;
        this.horaObjeto = hora;
    }
    
    public Examen(){
    }
    
    public Examen(String asignatura, String aula){
        this.asignatura = asignatura;
        this.aula = aula;
    }
    
}



