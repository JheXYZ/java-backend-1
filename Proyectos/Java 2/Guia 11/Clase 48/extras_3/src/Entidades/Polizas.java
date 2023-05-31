/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.LinkedHashMap;

/**
 *
 * @author JheX
 */
public class Polizas {
    LinkedHashMap<Integer, Poliza> Polizas = new LinkedHashMap();
    int numeroPolizas = 0;

    public Polizas() {
    }
    
    public Polizas(int numeroPolizas) {
        this.numeroPolizas = numeroPolizas;
    }

    public LinkedHashMap<Integer, Poliza> getPolizas() {
        return Polizas;
    }

    public void setPolizas(LinkedHashMap<Integer, Poliza> Polizas) {
        this.Polizas = Polizas;
    }

    public int getNumeroPolizas() {
        return numeroPolizas;
    }

    public void setNumeroPolizas(int numeroPolizas) {
        this.numeroPolizas = numeroPolizas;
    }
    
    public void addNumeroPolizas(){
        numeroPolizas++;
    }
    
    public void restNumeroPolizas(){
        numeroPolizas--;
    }
    
    
}
