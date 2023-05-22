/*
    Realiza un programa en donde exista una clase Jugador que contenga nombre, 
    apellido, posición y número. Luego otra clase Equipo que contenga una colección
    de jugadores. Una vez hecho esto, desde el main recorreremos el equipo 
    mostrando la información de cada jugador.
 */
package guia11_2;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JheX
*/
public class Guia11_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Jugador> jugadores = new ArrayList();
        Equipo equipo = new Equipo();
        char fin = 's';
        
        while (fin == 's'){
            Jugador jugador = new Jugador();
            System.out.print("Nombres: ");
            jugador.setNombre(leer.next());
            System.out.print("Apellidos: ");
            jugador.setApellido(leer.next());
            System.out.print("Posicion: ");
            jugador.setPosicion(leer.next());
            System.out.print("Número: ");
            jugador.setNumero(leer.nextInt());
            jugadores.add(jugador);
            System.out.println("¿Añadir otro jugador? (S/N)");
            fin = leer.next().toLowerCase().charAt(0);
        }
        equipo.setJugadores(jugadores);
        
        System.out.println("Jugadores del equipo: \n");
        for (Jugador jugadore : jugadores) {
            System.out.println(jugadore);
        }
    }
}
