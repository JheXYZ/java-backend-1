/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
/**
 * @author JheX
*/
public class Ascensor {
    private int pActual;
    private int pisos;

    public Ascensor(int pActual, int pisos) {
        this.pActual = pActual;
        this.pisos = pisos;
    }
    
    public int getpActual() {
        return pActual;
    }

    public void setpActual(int pActual) {
        this.pActual = pActual;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
}
