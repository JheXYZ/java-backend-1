/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author George
 */
public class Revolver {

    private int posicionActual;
    private int posicionBala;

    public Revolver() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    public void llenarRevolver() {
        posicionActual = (int) (Math.random() * 6 + 1);
        posicionBala = (int) (Math.random() * 6 + 1);
        System.out.println("Posicion ACTUAL: " + posicionActual);
        System.out.println("Posicion BALA: " + posicionBala);
    }

    public boolean mojar() {
        return posicionActual == posicionBala;
    }

    public void siquienteChorro() {
        /* if(posicionActual == 6){
        posicionActual = 1;
        } else {
        posicionActual++;
        }*/
        posicionActual = (int) (Math.random() * 6 + 1);
        System.out.println("Posicion ACTUAL: " + posicionActual);
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionBala=" + posicionBala + '}';
    }
}
