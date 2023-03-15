/*
    Dado un tiempo en minutos, calcular su equivalente en días y horas. 
    Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
    su equivalente: 1 día, 2 horas.
 */
package pkg1_extra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int tiempo;
        int horas = 0;
        int dias = 0;
        int años = 0;
        
        System.out.println("Ingrese minutos");
        tiempo = leer.nextInt();
        int tiempoA = tiempo;
        
        while (tiempo >= 60) {
            tiempo = tiempo - 60;
            horas++;
            if (horas >= 24) {
                horas = horas - 24;
                dias++;
            } else if (dias >= 365) {
                dias = dias - 365;
                años++;
            }
        }
        if (dias >= 1) {
            System.out.println("En " + tiempoA + " minutos hay " + horas + " horas y " + dias + " dias");
            if (años >= 1) {
                 System.out.println("En " + tiempoA + " minutos hay " + horas + " horas, " + dias + " dias y " + años + " años");
            }
        } else {
            System.out.println("En " + tiempoA + " minutos hay " + horas + " horas");
        }
    }
}
