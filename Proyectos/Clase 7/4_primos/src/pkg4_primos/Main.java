/*
    Crea una aplicación que nos pida un número por teclado y con una función se
    lo pasamos por parámetro para que nos indique si es o no un número primo, 
    debe devolver true si es primo, sino false.
    Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por 
    ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package pkg4_primos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Ingrese un número entero positivo");
            num = leer.nextInt();
        } while(num <= 0);
        
        if (primo(num) == true) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }
    }
    public static boolean primo(int num) {
        int c = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                c++;
                if (c > 2) {
                    return false;
                }
            }
        }
        return true;
    }
}

    