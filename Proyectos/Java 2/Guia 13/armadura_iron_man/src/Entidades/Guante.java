/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
/**
 * @author JheX
*/
public class Guante {
    private Repulsor repulsor;
    private int consumo;

    public Guante() {
    }
    
    public Guante(Repulsor repulsor, int consumo) {
        this.repulsor = repulsor;
        this.consumo = consumo;
    }
    
    public Repulsor getRepulsor() {
        return repulsor;
    }

    public void setRepulsor(Repulsor repulsor) {
        this.repulsor = repulsor;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    
    
}
