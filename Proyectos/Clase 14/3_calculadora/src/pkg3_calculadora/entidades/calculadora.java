/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_calculadora.entidades;

public class calculadora {
    private int numero1;
    private int numero2;

    public calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public calculadora() {
    }
    
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public int suma() {
        return numero1 + numero2;
    }
    
    public int resta() {
        return numero1 - numero2;
    }
    
    public int multiplicion() {
        return numero1 * numero2;
    }
    
    public float division() {
        return (float)numero1 / (float)numero2;
    }
}
