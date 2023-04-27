/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xd;

import java.util.Scanner;
import xd.entidades.Auto;

public class Xd {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Auto auto = new Auto();
        String x;
        
        System.out.println("Ingrese el modelo: ");
        auto.setModelo(leer.next());
        System.out.println("Modelo: " + auto.getModelo());
        
        System.out.print("Ingrese la marca: ");
        x = leer.next();
        
        auto.setMarca(x);
        auto.getMarca();
    }
    
}
