/*
    13) Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
        de equipo y define su tipo de dato de tal manera que te permita alojar sus 
        nombres más adelante.

    14) Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus 
        compañeros de equipo
 */
package pkg13_guia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("¿Cuantos compañeros son?");
        int n = leer.nextInt();
        String Equipo[] = new String [n];
        
        System.out.println("Ingrese sus nombres");
        for (int i = 0; i < n; i++) {
            System.out.print("Compañero " + (i+1) + ": ");
            Equipo[i] = leer.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + Equipo[i]);
        }
    }
}
