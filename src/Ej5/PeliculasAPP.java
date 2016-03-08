package Ej5;

import java.util.ArrayList;

/**
 * @author Raúl Jiménez Martín
 */
public class PeliculasAPP {
    
    static ArrayList<Pelicula> peliculasArrayList = new ArrayList<>();
    
    public static void main (String[] args){
        
        Pelicula conan;
        conan = new Pelicula();
        conan.setAnio(1982);
        conan.setDirector("John Milius");
        conan.setSinopsis("A vengeful barbarian warrior sets off to avenge his "
                + "tribe and his parents whom were slain by an evil sorcerer "
                + "and his warriors when he was a boy.");
        conan.setTitulo("Conan the Barbarian ");
        conan.setGenero(Pelicula.Genero.ACCION);
        
                
        peliculasArrayList.add(conan);
        
        Pelicula deadpool;
        deadpool = new Pelicula();
        deadpool.setAnio(2016);
        deadpool.setDirector("Tim Miller");
        deadpool.setSinopsis("A former Special Forces operative turned mercenary"
                + " is subjected to a rogue experiment that leaves him with"
                + " accelerated healing powers, adopting the alter ego Deadpool.");
        deadpool.setTitulo("Deadpool");
        deadpool.setGenero(Pelicula.Genero.COMEDIA);
                
        
        peliculasArrayList.add(deadpool);
        
        Pelicula existenz;
        existenz = new Pelicula();
        existenz.setAnio(1999);
        existenz.setDirector("David Cronenberg");
        existenz.setSinopsis("A game designer on the run from assassins must "
                + "play her latest virtual reality creation with a marketing "
                + "trainee to determine if the game has been damaged.");
        existenz.setTitulo("ExistenZ");
        existenz.setGenero(Pelicula.Genero.CIENCIAFICCION);
        
        peliculasArrayList.add(existenz);
        
        Pelicula casablanca;
        casablanca = new Pelicula("Casablanca", "Michael Curtiz", 1942, "Narra un drama romantico en la ciudad marroqui de Casablanca bajo", Pelicula.Genero.ACCION);
        peliculasArrayList.add(casablanca);
        
        
        // ITERADOR
        for (Pelicula film : peliculasArrayList) {
            System.out.print("The film " + film.getTitulo());
            System.out.print(" was directed by " + film.getDirector());
            System.out.println(" in the year " + film.getAnio());
            System.out.println("Storyline: " + film.getSinopsis());
            System.out.println("Genre: " + film.getGenero());
            System.out.println("\n");
        }
    }
}
