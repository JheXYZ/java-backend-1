/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
/**
 * @author JheX
 */
public class ServiceRaices {
    public double getDiscriminante(Raices raiz) {
        return Math.pow(raiz.getB(), 2) - (4 * raiz.getA() * raiz.getC());
    }

    public boolean tieneRaices(double discriminante) {
        return discriminante >= 0;
    }
    
    public boolean tieneRaiz(double discriminante){
        return discriminante == 0;
    }
    
    public void obtenerRaices(double discriminante, Raices raiz){
        double x1 = (-1*(raiz.getB()) + Math.sqrt(discriminante)) / (2 * raiz.getA());
        double x2 = (-1*(raiz.getB()) - Math.sqrt(discriminante)) / (2 * raiz.getA());
        System.out.println("Solucion 1: " + x1 + "\nSolucion 2: " + x2);
    }
    
    public void obtenerRaiz(Raices raiz){
        double x = -1*(raiz.getB())/ (2 * raiz.getA());
        System.out.println("Unica solución: " + x);
    }
    
    public void calcular(boolean hayRaices, boolean hayRaiz, double discriminante, Raices raiz){
        if (hayRaiz){
            obtenerRaiz(raiz);
        } else if (hayRaices){
           obtenerRaices(discriminante, raiz);
        } else {
            System.out.println("No se puede calcular la solución");
        }
    }
}
