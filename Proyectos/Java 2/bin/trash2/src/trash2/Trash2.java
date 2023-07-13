/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trash2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author JheX
*/
public class Trash2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int matriz[][] = new int [7][7];
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                matriz[i][j] = (int)(Math.random()*10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        for (int i = 1; i <= 6; i+=3) {
            for (int j = 1; j <= 6; j+=3) {
                int fil = i + 2;
                int col = j + 2;
                System.out.println("submatriz:" + i + ", " + j);
                for (int k = i; k <= fil; k++) {
                    for (int l = j; l <= col; l++) {
                        System.out.print(matriz[k][l] + " ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("\nAleatorios");
        int n = 10;   
        int vector[] = new int [n+1];
        for (int i = 1; i <= n ; i++) {
            vector[i] = (int)(Math.random()*100);
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        int c = 0;
        Arrays.sort(vector);
        System.out.println("Ordenados");
        mostrarCor(vector);

        vector = desordenar(vector);
        mostrarCor(vector);
        System.out.println("Intercambio burbuja"); 
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i ; j--) {
                if (vector[j] < vector[j - 1]) {
                    vector[0] = vector[j];
                    vector[j] = vector[j - 1];
                    vector[j - 1] = vector[0];
                }
                c++;
            }
        }
        mostrar(vector);
        System.out.println("c:" + c);
        c = 0;
        vector = desordenar(vector);
        mostrarCor(vector);
        System.out.println("Insercion baraja");
        for (int i = 2; i <= n; i++) {
            vector[0] = vector[i];
            int j = i-1;
            while (vector[0] < vector[j]) {
                vector[j + 1] = vector[j];
                j--;
                c++;
            }   
            vector[j + 1] = vector[0];
        }
        mostrar(vector);
        System.out.println("c:" + c);
        vector = desordenar(vector);
        mostrarCor(vector);
        c = 0;
        
        System.out.println("Insercion ordenada baraja");
        int v2[] = new int[vector.length];
        v2[1] = vector[1];
        for (int i = 2; i <= n; i++) {
            v2[0] = vector[i];
            int j = i-1;
            while (v2[0] < v2[j]) {
                v2[j + 1] = v2[j];
                j--;
                c++;
            }   
            v2[j + 1] = v2[0];
        }
        mostrar(v2);
        System.out.println("c:" + c);
        
        mostrarCor(vector);
        c = 0;
        System.out.println("Seleccion Directa");
        for (int i = 1; i <= n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= n; j++) {
                if (vector[j] < vector[minIndex]) {
                    minIndex = j;
                    c++;
                }
            }
            vector[0] = vector[i];
            vector[i] = vector[minIndex];
            vector[minIndex] = vector[0];
        }
        mostrar(vector);
        System.out.println("c:" + c);
        
        vector = desordenar(vector);
        mostrarCor(vector);
        c = 0;
        System.out.println("Ingresar ordenadamente sin n");
        int v3[] = new int [20];
        v3[1] = vector[1];
        v3[0] = vector[2];
        int m = 1;
        while(v3[0] >= 0){
            int j = m;
            while (v3[0] < v3[j]) {
                v3[j + 1] = v3[j];
                j--;
                c++;
            }
            v3[j + 1] = v3[0];
            m++;
            if(m < vector.length){
                v3[0] = vector[m];
            } else {
                v3[0] = -1;
            }
            
        }
        mostrar(v3);
        System.out.println("c:" + c);
    }
    
    public static int[] desordenar(int[] vector){
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1 ; i < vector.length ; i++) {
            lista.add(vector[i]);
        }
        int vec [] = new int [vector.length];
        Collections.shuffle(lista);
        
        for (int i = 0; i < lista.size(); i++) {
            vec[i+1] = lista.get(i);
        }
        return vec;
    }
    
    public static void mostrar(int vector[]){
        for (int i = 1; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }
    
    public static void mostrarCor(int vector[]){
        System.out.print("[");
        for (int i = 1; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("]");
    }
}
