/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
/**
 * @author JheX
*/
public class Consola {
    private int consumo;
    
    public Consola() {
    }

    public Consola(int consumo) {
        this.consumo = consumo;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    
    public void mostrarConsumo(int bateria, int bateriaMax, float consumo){
        System.out.println("Se consumió: " + (float)((consumo * 100)/bateria) + "%. Batería restante: " + (float)((bateria * 100)/bateriaMax) + "%");
    }
}
