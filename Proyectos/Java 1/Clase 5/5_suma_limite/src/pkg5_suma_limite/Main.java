/*
    Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
    solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package pkg5_suma_limite;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese un valor máximo");
        int max = leer.nextInt();
        int sum = 0;
        System.out.println("Ingrese números a sumar");
        while (sum < max) {
            int n = leer.nextInt();
            sum = n + sum;
            System.out.println("Suma: " + sum);
        }
        System.out.println("Se ha superado el límite inicial " + sum + " > " + max);
    }
}
