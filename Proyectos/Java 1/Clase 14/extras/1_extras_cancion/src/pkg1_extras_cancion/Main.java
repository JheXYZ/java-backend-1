/*
    Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
    Se deberá́ definir además dos constructores: uno vacío que inicializa el título
    y el autor a cadenas vacías y otro que reciba como parámetros el título y el
    autor de la canción. Se deberán además definir los métodos getters y setters
    correspondientes.
 */
package pkg1_extras_cancion;

import java.util.Scanner;
import pkg1_extras_cancion.entidades.Cancion;

public class Main {

    public static void main(String[] args) {
        Cancion cancion = new Cancion();

        ingresar(cancion);
        cancion.getAutor();
        cancion.getTitulo();
    }
    
    public static void ingresar(Cancion cancion) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Ingrese el nombre del Autor: ");
        cancion.setAutor(leer.next());
        System.out.print("Ingrese el nombre de la canción: ");
        cancion.setTitulo(leer.next());
    }
}
