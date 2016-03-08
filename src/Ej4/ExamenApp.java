package Ej4;

/**
 Escribir una aplicación, ExamenApp, que cree un objeto de tipo Examen, lo muestre por pantalla,
modifique su fecha y hora y lo vuelva a mostrar por pantalla.
Planteamiento: Para crear un objeto de tipo Examen hay que crear previamente los objetos de tipo Hora
y Fecha que se pasan como argumentos. Posteriormente se crea el objeto de tipo Examen.
Para mostrar la información del examen por pantalla se utiliza el método toString()que devuelve la
información, el resultado se pasa como argumento del método System.out.print1n() que muestra en la
pantalla lo que recibe.
Para modificar la fecha y la hora se utilizan los métodos setFecha ( ) y setHora ( ) respectivamente, que
reciben objetos de tipo Fecha y Hora. Se puede pasar la referencia que devuelve la creación del objeto
directamente.
 */
public class ExamenApp {

    public static void main(String[] args){
        Fecha laFecha = new Fecha();
        Hora laHora = new Hora();
        
        Examen elExamen = new Examen(laFecha, laHora);
        
        System.out.print(elExamen.toString());
        System.out.print(elExamen.fecha.toString());
        System.out.print(elExamen.horaObjeto.toString() + "\n");
        
        elExamen.fecha.setFecha(24, 5, 2016);
        elExamen.horaObjeto.setHora(13, 30);
        elExamen.setAsignatura("Matemáticas");
        elExamen.setAula("Aula-11");
        
        System.out.print(elExamen.toString());
        System.out.print(elExamen.fecha.toString());
        System.out.print(elExamen.horaObjeto.toString());
        
    }
}
