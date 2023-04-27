/*
    Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice
    que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
    pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz 
    traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas 
    por columnas (o viceversa).
 */
package pkg5_matriz_antisimétrica;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tamaño = 3;
        int matriz[][] = new int [tamaño][tamaño];
        int tras[][] = new int [tamaño][tamaño];
        boolean antisimetrica = true;
        Random r = new Random();
        int min = -1, max = 2; 
        
        
        System.out.println("Matriz");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j] = r.nextInt(max-min)+min;
                tras[j][i] = matriz[i][j];
                if (matriz[i][j] >= 0) {
                    System.out.print(" " + matriz[i][j] + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
        
        System.out.println("Traspuesta Invertida");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (matriz[i][j] != -tras[i][j]) {
                    antisimetrica = false;
                }
                if (tras[i][j] >= 0) {
                    System.out.print(" " + -tras[i][j] + " ");
                } else {
                    System.out.print(" " + -tras[i][j] + " ");
                }
                
            }
            System.out.println();
        }
        
        if (antisimetrica == false) {
            System.out.println("La matriz no es antisimétrica");
        } else {
            System.out.println("La matriz Es antisimetrica");
        }
    }
}
