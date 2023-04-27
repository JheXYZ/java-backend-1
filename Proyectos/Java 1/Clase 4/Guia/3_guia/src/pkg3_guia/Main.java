/*
    Escriba un programa que valide si una nota está  entre 0 y 10, sino está  entre 
    0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package pkg3_guia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);

        System.out.println("Ingrese notas");
        int nota = 11;
        while (nota < 0 || nota > 10){
            nota = leer.nextInt();
            System.out.println("Ingrese nota valida");
        }
        System.out.println("Fin");
    }
}
