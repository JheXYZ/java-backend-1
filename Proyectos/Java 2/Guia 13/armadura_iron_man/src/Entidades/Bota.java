/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
/**
 * @author JheX
*/
public class Bota {
    private Propulsor propulsor;
    private int consumo;

    public Bota() {
    }

    public Bota(Propulsor propulsor, int consumo) {
        this.propulsor = propulsor;
        this.consumo = consumo;
    }

    public Propulsor getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(Propulsor propulsor) {
        this.propulsor = propulsor;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    
}
