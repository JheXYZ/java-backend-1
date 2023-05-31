/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author JheX
*/
public class ServiceCartas {
    private int posicion = 0, restantes = 40;
    private ArrayList<Carta> Cartas;
    
    public ServiceCartas() {
    }

    public ArrayList<Carta> getCartas() {
        return Cartas;
    }

    public void setCartas(ArrayList<Carta> Cartas) {
        this.Cartas = Cartas;
    }
    
    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public void barajar(){
        Collections.shuffle(Cartas);
    }
    
    public void siguienteCarta(){
        if (posicion < 40){
            System.out.println(Cartas.get(posicion));
            posicion++;
            restantes--;
        } else {
            System.out.println("No hay más cartas");
        }
    }
    
    public int cartasDisponibles(){
        return restantes;
    }
    
    public void darCartas(int cantidad){
        if (cantidad <= restantes){
            for (int i = 0; i < cantidad; i++) {
                siguienteCarta();
            }
        } else {
            System.out.println("No hay suficientes cartas");
        }
    }
    
    public void cartasMonton(){
        if(restantes != 40){
            for (int i = 0; i < posicion; i++) {
                System.out.println(Cartas.get(i));
            }
        } else {
            System.out.println("No ha sacado ningúna carta");
        }
    }
    
    public void mostrarBaraja(){
        for (int i = posicion; i < 40; i++) {
            System.out.println(Cartas.get(i));
        }
    }
}
