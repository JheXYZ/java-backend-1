/*
    Crear un programa que dado un número determine si es par o impar.
 */
package pkg1_par_impar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n;
        String c;
        System.out.println("Ingrese números");
        do {
            n = leer.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + " es par");
            } else {
                System.out.println(n + " es impar");
            }
            System.out.println("¿Fin? (S/N)");
            c = leer.next();
        } while (c.equalsIgnoreCase("s") == false);
    }
}

