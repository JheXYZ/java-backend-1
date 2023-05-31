/*
    Los asientos son etiquetados por una letra y un número la fila A1 empieza al
    final del mapa como se muestra en la tabla. También deberemos saber si el 
    asiento está ocupado por un espectador o no, si esta ocupado se muestra una 
    X, sino un espacio vacío.
*/
package Entidades;
/**
 * @author JheX
*/
public class Asiento {
    private char letra;
    private int numero;
    private Espectador espectador;

    public Asiento() {
    }

    public Asiento(char letra, int numero, Espectador espectador) {
        this.letra = letra;
        this.numero = numero;
        this.espectador = espectador;
    }

    public Asiento(char letra, int numero) {
        this.letra = letra;
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Letra=" + letra + ", Numero=" + numero + ", Espectador=" + espectador;
    }
}
