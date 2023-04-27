/*
    Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
    debe detener la lectura y mostrar la cantidad de números leídos, la cantidad 
    de números pares y la cantidad de números impares. Al igual que en el ejercicio
    anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
    sentencia break.
 */
package pkg8_extra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n, nums = 0, par = 0, impar = 0, prom = 0;
        
        System.out.println("Ingrese números");
        do {
            do {
                n = leer.nextInt();
                if (n <= 0) {
                    System.out.println("Número debe ser mayor a 0");
                }
            } while (n <= 0);
            
            if (n % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            nums++;
            prom = prom + n;
        } while (n % 5 != 0);
        System.out.println("Números pares: " + par + "\nNúmeros Impares: " + impar + "\nPromedio: " + prom/nums);
    }
}
