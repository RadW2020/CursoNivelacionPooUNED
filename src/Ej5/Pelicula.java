package Ej5;
/**
 * Necesitaremos definir una clase denominada película que nos permita crear distintas instancias.
 * En el sistema que queremos implementar cada película se caracteriza por los siguientes atributos:
 *  Título, este campo representa el título de la película.
 *  Director, representando al director de la misma.
 *  Año, este atributo identifica el año de estreno de la película.
 *  Sinopsis, representa un breve resumen de la película.
 *  Género, este atributo permite almacenar el género de la película. Para simplificar el problema
 * asumiremos que este atributo únicamente puede tomar los valores: COMEDIA, ACCIÓN,
 * TERROR y CIENCIA FICCIÓN.
 * Además, un objeto de esta clase película nos debe permitir consultar y modificar todos estos campos a
 * través de una serie de métodos creados a tal efecto: por cada atributo debe haber dos métodos, uno para
 * consultar su valor y otro para modificarlo.
 * Por ejemplo, para el campo título tendremos los métodos getTitulo() y setTitulo() para
 * consultar su valor y modificarlo, respectivamente.
 * Asimismo, deberemos implementar un Iterardor que escriba por pantalla la información de una película
 * concreta, con un formato legible como, podemos hacer uso del método System.out.println().
 */
/**
 * @author Raúl Jiménez Martín
 */
public class Pelicula {
    private String titulo;
    private String director;
    private int anio;
    private String sinopsis;
    private Genero genero;
    
    public Pelicula(){   
    }
    
    public Pelicula(String titulo, String director, int anio, String sinopsis, Genero genero){
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.sinopsis = sinopsis;
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    public enum Genero {
        COMEDIA, ACCION, TERROR, CIENCIAFICCION
    }

}
