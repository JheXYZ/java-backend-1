/*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
    donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear
    un programa que permita introducir un cuadrado por teclado y determine si este
    cuadrado es mágico o no. El programa deberá comprobar que los números introducidos
    son correctos, es decir, están entre el 1 y el 9.
 */
package pkg6_matriz_magica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int tamaño = 3, n;
        int matriz[][] = new int [tamaño][tamaño];
        boolean magica = true;
        
        
        System.out.println("Ingrese los valores de la matriz");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("Fila: " + (i+1) + ", Columna: " + (j+1) + ": ");
                n = leer.nextInt();
                matriz[i][j] = n;
            }
        }
        mostrar(matriz,tamaño);
        if (magica(matriz,tamaño)) {
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz no es magica");
        }
        
    }
    public static void mostrar(int matriz[][], int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean magica(int matriz[][], int tamaño) {
    int sum = 0;
    //chequeamos la primer fila cuanto es, de ahí comparamos con lo demas si es igual
    for (int i = 0; i < tamaño; i++) {
        sum += matriz[0][i];
    }
    //chequeamos la otras filas
    for (int i = 1; i < tamaño; i++) {
        int filaSum = 0;
        for (int j = 0; j < tamaño; j++) {
            filaSum += matriz[i][j];
        }
        if (filaSum != sum) {
            return false;
        }
    }
    //chequamos las columnas
    for (int j = 0; j < tamaño; j++) {
        int colSum = 0;
        for (int i = 0; i < tamaño; i++) {
            colSum += matriz[i][j];
        }
        if (colSum != sum) {
            return false;
        }
    }
    //chequeamos la diagonal 1
    int diagSum1 = 0;
    for (int i = 0; i < tamaño; i++) {
        diagSum1 += matriz[i][i];
    }
    //chequeamos la diagonal 2
    int diagSum2 = 0;
    for (int i = tamaño - 1; i >= 0; i--) {
        diagSum2 += matriz[i][i];
    }
    if (diagSum1 != sum || diagSum2 != sum) {
        return false;
    }
    return true;
    }
}
