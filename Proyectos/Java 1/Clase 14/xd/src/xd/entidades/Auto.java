/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xd.entidades;

public class Auto {
    private int puertas;
    private int velocidad;
    private String motor;
    private String modelo;
    private String marca;

    public Auto(int puertas, int velocidad, String motor, String modelo) {
        this.puertas = puertas;
        this.velocidad = velocidad;
        this.motor = motor;
        this.modelo = modelo;
    }

    public Auto() {
    }
    
    public int getPuertas() {
        return puertas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMotor() {
        return motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void getMarca() {
        System.out.println("La marca es: " + marca);
    }
    
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
   
    
    
    
    
}
