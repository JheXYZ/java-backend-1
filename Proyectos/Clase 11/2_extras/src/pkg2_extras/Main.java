/*
    Escriba un programa que averigüe si dos vectores de N enteros son iguales 
    (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre
    los elementos).
 */
package pkg2_extras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Tamaño:");
        int n = leer.nextInt();
        int vec1[] = new int[n];
        int vec2[] = new int[n];
        boolean iguales = true;
        
        for (int i = 0; i < n; i++) {
            vec1[i] = (int) (Math.random()*10);
            vec2[i] = (int) (Math.random()*10);
            if (vec1[i] != vec2[i]) {
                iguales = false;
                break;
            }
        }
        if (iguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }
}
