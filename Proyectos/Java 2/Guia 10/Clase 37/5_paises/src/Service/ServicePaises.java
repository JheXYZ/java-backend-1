/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author JheX
 */
public class ServicePaises {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public TreeSet<String> ingresarPaises() {
        TreeSet<String> paises = new TreeSet();
        boolean fin = false;
        while (!fin) {
            System.out.print("1)Ingresar un pais 2)Terminar | Acción: ");
            switch (leer.nextInt()) {
                case 1:
                    System.out.print("Ingrese un país: ");
                    paises.add(leer.next());
                    break;
                case 2:
                    System.out.println("Los países son (ordenados): " + paises);
                    fin = true;
                    break;
            }
        }
        return paises;
    }

    public void eliminarPais(TreeSet<String> Paises) {
        boolean encontro = false;
        while (!encontro) {
            System.out.print("Ingrese un país a eliminar: ");
            String pais = leer.next();
            Iterator<String> itPaises = Paises.iterator();
            while (itPaises.hasNext()) {
                if (itPaises.next().equals(pais)) {
                    itPaises.remove();
                    encontro = true;
                }
            }
            if (encontro){
                System.out.println("Nueva lista de países: " + Paises);
            } else {
                System.out.println("No está el país ingresado");
            }
        }
    }
}
