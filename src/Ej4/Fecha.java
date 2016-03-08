package Ej4;

/**
 * La información que se guarda de un examen es: el nombre de la asignatura, el aula, la fecha y la hora.
 * Para guardar la fecha y la hora hay que realizar dos clases, Fecha y Hora.
 * La clase Fecha guarda día, mes y año. Todos los valores se reciben en el constructor por parámetro.
 * Además, esta clase debe tener un método que devuelva cada uno de los atributos y un método toString()
 * que devuelva la información de la fecha en forma de String.
 */
public class Fecha extends Examen{
    
    int dia, mes, año;
        
    public void setFecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    @Override
    public String toString() {
        return " " + dia + "/" + mes + "/" + año;
    }
}
