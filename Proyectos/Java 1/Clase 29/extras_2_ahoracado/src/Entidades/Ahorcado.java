/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
/**
 * @author JheX
*/
public class Ahorcado {
    private int jugadasMaximas, intentos;
    private String palabra;
    private char letrasEncontradas [], letras [];
    private boolean finJuego;

    public Ahorcado() {
    }

    public char[] getLetras() {
        return letras;
    }

    public void setLetras() {
        letras = palabra.toCharArray();
    }
    
    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    public boolean isFinJuego() {
        return finJuego;
    }

    public void setFinJuego(boolean finJuego) {
        this.finJuego = finJuego;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        intentos = jugadasMaximas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public int getLongitud() {
        return palabra.length();
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public char[] getLetrasEncontradas() {
        return letrasEncontradas;   
    }
   
    public void setLetraEncontradaAt(int pos, char letra){
        letrasEncontradas[pos] = letra;
    }

    public void setLetrasEncontradas(char[] letrasEncotradas) {
        this.letrasEncontradas = letrasEncotradas;
    }
    
    public char getLetraAt(int pos){
        return letrasEncontradas[pos];
    }
    
    public void setDimension(int dim){
        letrasEncontradas = new char [dim];
    }
}
