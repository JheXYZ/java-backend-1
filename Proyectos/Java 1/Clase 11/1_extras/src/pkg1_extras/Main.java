/*
    Realizar un algoritmo que calcule la suma de todos los elementos de un vector
    de tamaño N, con los valores ingresados por el usuario.
 */
package pkg1_extras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el tamaño");
        int n = leer.nextInt();
        int vector[] = new int [n];
        System.out.println("Ingrese los números");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
            sum += vector[i];
        }
        System.out.println("La suma es " + sum);
    }
}
