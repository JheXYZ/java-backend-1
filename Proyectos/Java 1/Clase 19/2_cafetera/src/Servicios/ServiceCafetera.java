/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class ServiceCafetera {
    Scanner leer = new Scanner(System.in);
    
    public void capacidaMaxima(Cafetera cafe){
        System.out.print("Capacidad Máxima: ");
        cafe.setCapacidadMaxima(leer.nextInt());
    }
    
    public void llenarCafetera(Cafetera cafe){
        cafe.setCapacidadActual(cafe.getCapacidadMaxima());
    }
    
    public void servirTaza(int ml, Cafetera cafe){
        if (ml < cafe.getCapacidadActual()) {
            cafe.setCapacidadActual(cafe.getCapacidadActual() - ml);
            System.out.println("Se sirvió " + ml + " ml a una taza\nCafetera: " + cafe.getCapacidadActual() + " ml");
        } else {
            System.out.println("Solo se sirvió " + cafe.getCapacidadActual() + " ml y faltaron " + Math.abs(cafe.getCapacidadActual() - ml));
            cafe.setCapacidadActual(0);
        }
    }
    
    public void vaciarCafetera(Cafetera cafe){
        cafe.setCapacidadActual(0);
        System.out.println("Se vació la cafetera");
    }
    
    public void agregarCafe(int ml, Cafetera cafe) {
        if (ml + cafe.getCapacidadActual() > cafe.getCapacidadMaxima()) {
            cafe.setCapacidadActual(cafe.getCapacidadMaxima());
            System.out.println("Se lleno la cafetera\nCafetera: " + cafe.getCapacidadActual() + " ml");  
        } else {
            cafe.setCapacidadActual(cafe.getCapacidadActual() + ml);
            System.out.println("La cafetera tiene " + cafe.getCapacidadActual() + " ml de cafe, le faltan " + (cafe.getCapacidadMaxima() - cafe.getCapacidadActual() + "ml"));
        }
    }
}
