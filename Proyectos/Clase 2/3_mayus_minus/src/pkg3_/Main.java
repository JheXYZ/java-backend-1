/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/
package pkg3_;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase:");
        String palabra = leer.nextLine();
        System.out.println("Minusculas: " + palabra.toLowerCase());
        System.out.println("Mayuscualas: " + palabra.toUpperCase());
    }
    
}
