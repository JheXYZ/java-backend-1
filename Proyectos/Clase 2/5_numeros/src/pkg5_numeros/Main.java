/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
*/
package pkg5_numeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un número:");
        int n = leer.nextInt();
        float raiz = (float) Math.sqrt(n);
        System.out.println("Doble: " + 2*n + ", Triple: " + 3*n + ", Raiz: " + raiz);
    }
}
