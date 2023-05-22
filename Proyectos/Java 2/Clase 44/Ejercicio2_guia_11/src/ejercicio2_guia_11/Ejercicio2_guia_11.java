/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_guia_11;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;

/**
 * @author George
*/
public class Ejercicio2_guia_11 {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList();
        Revolver pistola = new Revolver();
        pistola.llenarRevolver();

        for (int i = 1; i < 7; i++) {
            Jugador j1 = new Jugador(i, " Jugador", false);
            jugadores.add(j1);
        }

        Juego ruletaRusa = new Juego();
        ruletaRusa.llenarJuego(jugadores, pistola);
        boolean fin;
        
        do {
            fin = ruletaRusa.ronda();
        } while (!fin);
    }
}
