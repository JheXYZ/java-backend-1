/*
    Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos
    jugadores jugar un juego de adivinanza de números. El primer jugador elige un
    número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un 
    número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
    después de cada intento. El juego termina cuando el segundo jugador adivina 
    el número o se queda sin intentos. Registra el número de intentos necesarios
    para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package pkg3_extras_juego.entidades;

public class Juego {
    private int num;
    private int jugador2;
    
    public int getNum() {
        return num;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }
    
    public int iniciarJuego() {
        if (num == jugador2) {
            System.out.println("¡Correcto! El número era " +  num);
            return 3;
        } else {
            System.out.println("¡Incorrecto!");
            if (jugador2 > num) {
                System.out.println("Pista: El número es menor");
            } else {
                System.out.println("Pista: El número es mayor");
            }
            return 1;
        }
    }
}
