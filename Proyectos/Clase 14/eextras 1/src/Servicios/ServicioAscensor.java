/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ascensor;
import java.util.Scanner;

/**
 * @author JheX
*/
public class ServicioAscensor {
    Scanner leer = new Scanner(System.in);
    
    public void subir(Ascensor ascensor){
        if (ascensor.getpActual() < ascensor.getPisos()){
            ascensor.setpActual(ascensor.getpActual() + 1);
        } else {
            System.out.println("Ya se encuantra en el ultimo piso");
        }
    }
    
    public void bajar(Ascensor ascensor){
        if (ascensor.getpActual() > 0){
            ascensor.setpActual(ascensor.getpActual() - 1);
        } else {
            System.out.println("Ya se encuentra en planta baja");
        }
    }
    
    public void irA(Ascensor ascensor){
        int piso = -1;
        while (piso < 0 || piso > ascensor.getPisos()){
            System.out.print("Piso a ir: ");
            piso = leer.nextInt();
        }
        ascensor.setpActual(piso);
    }
}
