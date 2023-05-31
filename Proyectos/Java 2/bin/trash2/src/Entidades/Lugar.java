/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 * @author JheX
*/
public class Lugar {
    private String nombre;
    private ArrayList<Item> Items;

    public Lugar(String nombre, ArrayList<Item> Items) {
        this.nombre = nombre;
        this.Items = Items;
    }
    
    public Lugar() {
    }

    public Lugar(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Item> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Item> Items) {
        this.Items = Items;
    }
    
}
