/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author JheX
 */
public class ServiceAhorcado {

    Scanner leer = new Scanner(System.in);

    public void crearJuego(Ahorcado ahorcado) {
        System.out.print("Ingrese la palabra a jugar: ");
        ahorcado.setPalabra(leer.next());
        ahorcado.setLetras();
        System.out.print("Ingrese la cantidad de intentos: ");
        ahorcado.setJugadasMaximas(leer.nextInt());
        ahorcado.setFinJuego(false);
    }

    public void longitud(Ahorcado ahorcado) {
        System.out.println("Longitud de la palabra: " + ahorcado.getPalabra().length());
        ahorcado.setDimension(ahorcado.getLongitud());
    }

    public void juego(Ahorcado ahorcado) {
        boolean encontrado = false;
        while (ahorcado.isFinJuego() == false) {
            System.out.print("Intentos: " + ahorcado.getIntentos() + "\nIngrese una letra: ");
            char letra = leer.next().charAt(0);

            for (int i = 0; i < ahorcado.getLongitud(); i++) {
                if (ahorcado.getPalabra().charAt(i) == letra) {
                    ahorcado.setLetraEncontradaAt(i, letra);
                    encontrado = true;
                }
            }
            System.out.println("Letras encontradas: " + Arrays.toString(ahorcado.getLetrasEncontradas()));

            encontrado = checks(ahorcado, encontrado);
        }
    }

    private boolean checks(Ahorcado ahorcado, boolean encontrado) {
        if (Arrays.equals(ahorcado.getLetrasEncontradas(), ahorcado.getLetras())) {
            ahorcado.setFinJuego(true);
        }
        
        if (ahorcado.getIntentos() > 1) {
            if (ahorcado.isFinJuego() && encontrado){
                System.out.println("¡Felicidades ha encontrado la palabra!");
                ahorcado.setFinJuego(true);
            }
        } else if (encontrado == false) {
            System.out.println("¡Lastima! La palabra era: " + ahorcado.getPalabra());
            ahorcado.setFinJuego(true);
        }
        
        if (encontrado == false) {
            ahorcado.setIntentos(ahorcado.getIntentos() - 1);
        }

        return false;
    }
}
