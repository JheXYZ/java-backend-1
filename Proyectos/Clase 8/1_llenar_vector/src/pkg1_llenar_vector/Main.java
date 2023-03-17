/*
    Realizar un algoritmo que llene un vector con los 100 primeros números enteros
    y los muestre por pantalla en orden descendente.
 */
package pkg1_llenar_vector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int vector[] = new int[100];
        for (int i = 99; i >= 0; i--) {
            vector[i] = i;
            System.out.println("Posicion: " + i + " = "+vector[i]);
        }
    }
}
