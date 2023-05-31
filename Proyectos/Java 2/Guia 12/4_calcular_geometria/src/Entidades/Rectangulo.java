/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Interfaces.CalculoFormas;

/**
 *
 * @author JheX
 */
public class Rectangulo implements CalculoFormas{
    private double base, altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //Área rectángulo: base * altura.
    @Override
    public double area() {
        return Math.abs(base * altura);
    }
    //Perímetro rectángulo: (base + altura) * 2.
    @Override
    public double perimetro() {
        return Math.abs(2 * (base + altura));
    }
    
}
