/*
    Escriba un programa que pida una frase o palabra y valide si la primera letra
    de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir
    un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
    “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package pkg4_letra_inicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase");
        String palabra = leer.nextLine();
        if (palabra.substring(0,1).equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
