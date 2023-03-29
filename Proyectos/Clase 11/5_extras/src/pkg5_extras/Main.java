/*
    Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios
    y muestre la suma de sus elementos.
 */
package pkg5_extras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese largo: ");
        int n = leer.nextInt();
        System.out.print("Ingrese el ancho: ");
        int m = leer.nextInt();
        
        int matriz[][] = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int)(Math.random()*10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
