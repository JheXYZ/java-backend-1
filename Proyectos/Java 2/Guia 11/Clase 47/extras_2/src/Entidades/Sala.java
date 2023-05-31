/*
    De Sala nos interesa conocer la película que se está reproduciendo, la
    sala con los espectadores y el precio de la entrada. 
 */
package Entidades;

import java.util.ArrayList;

/**
 * @author JheX
*/
public class Sala {
    private Pelicula pelicula;
    private ArrayList<Espectador> espectadores;
    private ArrayList<Asiento> asientos;
    private int precio;

    public Sala() {
    }

    public Sala(Pelicula pelicula, ArrayList<Espectador> espectadores, int precio) {
        this.pelicula = pelicula;
        this.espectadores = espectadores;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }
    
}
