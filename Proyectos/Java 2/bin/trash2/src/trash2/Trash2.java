/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trash2;

import Entidades.Lugar;
import Service.ServiceGeneral;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JheX
*/
public class Trash2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Lugar> Lugares = new ArrayList();
        ServiceGeneral SG = new ServiceGeneral();
        boolean fin = false;
        while(!fin){
            System.out.println("Carp \n1)Nuevo Lugar: \n2)Modificar un Lugar \n3)Calcular más Profit \n4)Fin");
            switch(leer.nextInt()){
                case 1 -> Lugares.add(SG.crearLugar());
                case 4 -> fin = true;
            }
        }
    }
    
}
