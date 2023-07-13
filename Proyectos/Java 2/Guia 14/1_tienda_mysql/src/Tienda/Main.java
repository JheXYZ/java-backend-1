/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tienda;

import Persistencia.ProductoDAO;
import Servicios.ProductoService;

/**
 * @author JheX
 */
public class Main {
    public static void main(String[] args) {
        ProductoDAO productos = new ProductoDAO();
        ProductoService PS = new ProductoService();
        productos.obtenerNombre();
        System.out.println("\nNombres y precios");
        productos.obtenerPrecio();
        System.out.println("\nProductos entre 120 y 202");
        productos.obtenerPrecioEntre();
        System.out.println("\nMostrar portatiles");
        productos.obtenerPortatiles();
        System.out.println("\nMostrar producto más barato");
        productos.obtenerProdMasBarato();
        System.out.println("\nCrear producto nuevo");
        PS.crearProducto("AirPods", 400, 9);
    }  
}
