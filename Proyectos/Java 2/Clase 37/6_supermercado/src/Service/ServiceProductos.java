/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author JheX
 */
public class ServiceProductos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void Programa(HashMap<String, Float> Productos) {
        boolean fin = false;
        while (!fin) {
            System.out.println("====Menu Productos====\n1)Crear Producto \n2)Modificar Precio \n3)Eliminar Producto \n4)Salir");
            switch (leer.nextInt()) {
                case 1:
                    crearProducto(Productos);
                    break;
                case 2:
                    modificar(Productos);
                    break;
                case 3:
                    eliminarProducto(Productos);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    fin = true;

            }
        }
    }

    public void mostrarProductos(HashMap<String, Float> Productos) {
        TreeMap<String, Float> prodOrdenados = new TreeMap<>(Productos);
        
        System.out.println("===Productos===");
        prodOrdenados.entrySet().forEach((producto) -> {
            System.out.println("$" + producto.getValue() + " | " + producto.getKey());
        });
    }

    public void crearProducto(HashMap<String, Float> Productos) {
        System.out.print("Nombre: ");
        String nombre = leer.next();
        
        if (Productos.containsKey(nombre)) {
            System.out.println("Ya hay un producto con el mismo nombre");
        } else {
            System.out.print("Precio: ");
            float precio = leer.nextFloat();
            Productos.put(nombre, precio);
            mostrarProductos(Productos);
        }
    }

    public void modificar(HashMap<String, Float> Productos) {
        mostrarProductos(Productos);
        System.out.print("Ingrese el producto a modificar: ");
        String produc = leer.next();
        
        if (Productos.containsKey(produc)) {
            System.out.print("Ingrese el nuevo precio: ");
            Productos.put(produc, leer.nextFloat());
            mostrarProductos(Productos);
            System.out.println("Precio modificado correctamente");
        } else {
            System.out.println("No se encuentra dicho producto");
        }
    }

    public void eliminarProducto(HashMap<String, Float> Productos) {
        mostrarProductos(Productos);
        System.out.print("Ingrese el producto a eliminar: ");
        String produc = leer.next();
        
        if (Productos.containsKey(produc)) {
            Productos.remove(produc);
            mostrarProductos(Productos);
            System.out.println("Se ha eliminado correctamente");
        } else {
            System.out.println("No se encuentra dicho producto");
        }
    }

}
