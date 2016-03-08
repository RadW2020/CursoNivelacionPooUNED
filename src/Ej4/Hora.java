package Ej4;

/**
* La clase Hora guarda hora y minuto. También recibe los valores para los atributos por parámetro en el
* constructor, tiene métodos que devuelven cada uno de los atributos y un método toString().
* Planteamiento: La clase Fecha tiene tres atributos de tipo entero, cuyos valores se reciben en el^
* constructor por parámetro. El método toString() devuelve los valores de los tres atributos separados por
* una barra (“ / ”).
* La clase Hora tiene dos atributos de tipo entero, cuyos valores se reciben en el constructor por
* parámetro. El método toString() devuelve los dos atributos separados por dos puntos (“ : ”).
 */
public class Hora extends Examen{
    int hora, minuto;
    
    public void setHora(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    @Override
    public String toString(){
        return " " + hora + ":" + minuto + " ";
    }

}
