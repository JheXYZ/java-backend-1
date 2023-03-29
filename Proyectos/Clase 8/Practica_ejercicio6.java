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
public class Practica_ejercicio6 {

    /**
     * @param args the command line arguments
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1
     * al 9 donde la suma de sus filas, sus columnas y sus diagonales son 
     * idénticas. Crear un programa que permita introducir un cuadrado por 
     * teclado y determine si este cuadrado es mágico o no. El programa deberá 
     * comprobar que los números introducidos son correctos, es decir, están 
     * entre el 1 y el 9.

     */
    public static void main(String[] args) {
        int i, j;
        Scanner leer =new Scanner (System.in);
        System.out.println("Indique la dimension de la matriz cuadrada");
        int dim = leer.nextInt();
           
        int [][] matriz = new int [dim][dim];
       
        for (i = 0; i <dim; i++) {
            for (j = 0; j <dim; j++) {
                do {
                System.out.println("Ingrese número del 1 al 9 para guardar en posicion matriz ["+i+"]["+j+"]");
                matriz [i][j]=leer.nextInt();
                } while (matriz [i] [j] <0 && matriz [i] [j]>10);
            }
        
        }
        for (i=0;i<dim;i++) {
            for (j=0;j<dim;j++){
                System.out.print( matriz [i] [j] + " ");    
            }
            System.out.println("");
        }
        int fila;
        int columna;
        int diag1=0;
        int diag2=0;
        boolean magica=true;   
       for (i=0;i<dim;i++){
           diag1+=matriz [i] [i];
           diag2+=matriz [i] [dim-i-1];
       }
       if (diag1==diag2){
           for (i=0;i<dim;i++){
           fila=0;
           columna=0;
              for (j=0;j<dim;j++){
              fila+=matriz[i] [j];
              columna+= matriz [j] [i];
              }
              if (fila!=diag1 || columna!=diag1){
                  magica=false;
                 break;
              }
           } 
       } else magica=false;
       if (magica==true) {
            System.out.println("La matriz es magica");
        } else System.out.println("La matriz no es magica");
       }
    }

        
