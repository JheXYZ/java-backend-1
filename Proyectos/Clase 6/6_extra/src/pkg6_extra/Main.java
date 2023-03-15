/*
    Leer la altura de N personas y determinar el promedio de estaturas que se 
    encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package pkg6_extra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("¿Cuantas personas?");
        int n = leer.nextInt();
        int promMen = 0;
        int promMax = 0;
        int c = 0;
        
        System.out.println("Ingrese las estaturas (cm)");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " persona:");
            int altura = leer.nextInt();
            if (altura < 160) {
                promMen = promMen + altura;
                c++;
            } else {
                promMax = promMax + altura;
            }
        }
        System.out.println("Promedio menor a 1.6 mt: " + promMen / c + "\nPromedio mayor a 1.6 mt: " + promMax / (n - c) + "\nPromedio general: " + (promMen + promMax)/n);
    }
}
