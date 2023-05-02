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
        ArrayList<Map.Entry<String, Float>> listaProductos = new ArrayList<>(Productos.entrySet());
        Collections.sort(listaProductos, (Map.Entry<String, Float> p1, Map.Entry<String, Float> p2) -> p1.getKey().compareTo(p2.getKey())); //extra para ordenar alfabeticamente
        
        System.out.println("===Productos===");
        listaProductos.forEach((producto) -> {
            System.out.println("$" + producto.getValue() + " | " + producto.getKey());
        });
    }

    public void crearProducto(HashMap<String, Float> Productos) {
        boolean existe = false;
        System.out.print("Nombre: ");
        String nombre = leer.next();
        for (Map.Entry<String, Float> producto : Productos.entrySet()) {
            if (producto.getKey().equals(nombre)){
                System.out.println("Ya hay un producto con el mismo nombre");
                existe = true;
            }
        }
        if (!existe){
            System.out.print("Precio: ");
            float precio = leer.nextFloat();
            Productos.put(nombre, precio);
            mostrarProductos(Productos);
        }
    }

    public void modificar(HashMap<String, Float> Productos) {
        boolean encontrado = false;
        mostrarProductos(Productos);

        System.out.print("Ingrese el producto a modificar: ");
        String produc = leer.next();
        for (Map.Entry<String, Float> producto : Productos.entrySet()) {
            if (producto.getKey().equals(produc)) {
                System.out.print("Ingrese el nuevo precio: ");
                producto.setValue(leer.nextFloat());
                mostrarProductos(Productos);
                System.out.println("Precio modificado correctamente");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encuentra dicho producto");
        }
    }

    public void eliminarProducto(HashMap<String, Float> Productos) {
        Iterator<Map.Entry<String, Float>> itProductos = Productos.entrySet().iterator();
        boolean encontrado = false;
        mostrarProductos(Productos);

        System.out.print("Ingrese el producto a eliminar: ");
        String produc = leer.next();

        while (itProductos.hasNext()) {
            Map.Entry<String, Float> producto = itProductos.next();
            if (producto.getKey().equals(produc)) {
                itProductos.remove();
                encontrado = true;
                mostrarProductos(Productos);
                System.out.println("Se ha eliminado correctamente");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encuentra dicho producto");
        }
    }

}
