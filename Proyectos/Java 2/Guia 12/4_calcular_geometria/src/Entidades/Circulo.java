/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Interfaces.CalculoFormas;

/**
 * @author JheX
*/
public class Circulo implements CalculoFormas{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Área circulo: PI * radio ^ 2.
    @Override
    public double area() {
        return PI * (radio * radio);
    }
    // Perímetro circulo: PI * diámetro.
    @Override
    public double perimetro() {
        return PI * (2 * radio);
    }
}
