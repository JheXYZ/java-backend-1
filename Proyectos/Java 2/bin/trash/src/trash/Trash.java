/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trash;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JheX
 */
public class Trash {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//        Una automotriz está por lanzar al mercado un nuevo automóvil, pero aún no decidió su 
//        nombre. Desde Mercadotecnia, le sugieren a la Gerencia que use el nombre de un animal. Para 
//        resolver dicho problema, el Departamento de Sistemas planea desarrollar un programa que contenga 
//        en un vector los nombres de todos los animales y en otro, los nombres ya utilizados en el mercado, 
//        por ellos y otras compañías. ¿Cómo debería proceder Sistemas para informar los posibles nombres a 
//        la Gerencia?

        String nombresUsados[] = new String[10];//{"", "Vaca", "Perro", "Gato", "Loro", "Chita", "Toro", "Caballo"};
        String nombre;
        int n = 1, i = 1;
        
        nombresUsados[n] = leer.next();
        while(!nombresUsados[n].equals("0")){
            n++;
            nombresUsados[n] = leer.next();
        }
        nombre = leer.next();
        while (!nombre.equals("0")){
            while (i < n){
                if (nombresUsados[i].equalsIgnoreCase(nombre)){
                    System.out.println("Este nombre ya existe: " + nombre);
                    i = n;
                }
                i++;
            } 
            if (i == n){
                System.out.println("Este nombre esta disponible: " + nombre);
            }
            i = 1;
            nombre = leer.next();
        }
    }
    
}
