/*
   Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima 
   el número ingresado seguido de tantos asteriscos como indique su valor. 
   Por ejemplo:
    5 *****
    3 ***
    11 ***********
    2 **
 */
package pkg5_guia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n;
        
        System.out.println("Ingrese 4 números");
        for (int i = 0 ; i <= 4 ; i++) {
            do {
                n = leer.nextInt();
            } while (n < 1 || n > 20);
            
            System.out.print(n + ": ");
            
            for (int j = n ; j >= 1 ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
