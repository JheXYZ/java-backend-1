/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package pkg4_centigrados_fahrenheit;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los grados centigrados");
        float c = leer.nextFloat();
        float f = 32 + (9 * c / 5);
        System.out.println("F° = " + f);
        
    }
}
