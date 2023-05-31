/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author JheX
 */
public class Item {
    private String nombre;
    private float compra, venta, peso;
    private int cantidad;

    public Item(String nombre, float compra, float venta, float peso, int cantidad) {
        this.nombre = nombre;
        this.compra = compra;
        this.venta = venta;
        this.peso = peso;
        this.cantidad = cantidad;
    }
    
    public Item() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCompra() {
        return compra;
    }

    public void setCompra(float compra) {
        this.compra = compra;
    }

    public float getVenta() {
        return venta;
    }

    public void setVenta(float venta) {
        this.venta = venta;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
