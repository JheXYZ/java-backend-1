/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_9_a_11;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Practica_ejercicio5 {

    /**
     * @param args the command line arguments
     * Realice un programa que compruebe si una matriz dada es antisimétrica. 
     * Se dice que una matriz A es antisimétrica cuando ésta es igual a su 
     * propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica 
     * si A = -AT. La matriz traspuesta de una matriz A se denota por AT y 
     * se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1,num2;
        System.out.println("Indique las dimensiones de las matrices");
        num1=leer.nextInt();
        num2=leer.nextInt();
        int [] [] matriz1= new int [num1] [num2];
        int [] [] matriz2= new int [num2] [num1];
        for (int i=0; i<num1;i++){
            for (int j=0; j<num2; j++){
                System.out.println("Indique el valor de la primera matriz [" + i + "] [" + j + "].");
                matriz1 [i] [j] = leer.nextInt();
            }
        }
        
        for (int i=0; i<num2;i++){
            for (int j=0; j<num1; j++){
                System.out.println("Indique el valor de la segunda matriz [" + i + "] [" + j + "].");
                matriz2 [i] [j] = leer.nextInt();
            }
        }
        int identi = 0;
        
       for (int k=0; k<num1;k++){
           for (int j=0; j<num2;j++){
            if (matriz2 [k] [j]!= (matriz1[j][k]*-1)){
                System.out.println("Las matrices no son antisimetricas");
                break;
            } else if (matriz2 [k] [j] == (matriz1[j][k]*-1)){
                identi++;
            }
           }
        if (identi==num1*num2){
            System.out.println("Las matrices son antisimetricas.");
        }   
       } 
    }
    
}
