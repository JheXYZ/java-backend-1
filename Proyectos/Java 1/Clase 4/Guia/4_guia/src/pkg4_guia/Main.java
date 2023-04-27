/*
    Escriba un programa que lea 20 números. Si el número leído es igual a cero se 
    debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El programa 
    deberá calcular y mostrar el resultado de la suma de los números leídos, pero si
    el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package pkg4_guia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n;
        int sum = 0;
        int c = 0;
        
        System.out.println("Ingrese números");
        do {
            n = leer.nextInt();
            if (n == 0) {
                System.out.println("Se capturó el número 0");
                break;
            } else if (n > 0) {
                sum = sum + n;
                c++;
            }
        } while (c < 20);
        System.out.println("La suma es: " + sum);
    }
}
