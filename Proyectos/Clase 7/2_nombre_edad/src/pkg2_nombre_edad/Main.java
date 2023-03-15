/*
    Diseñe una función que pida el nombre y la edad de N personas e imprima los
    datos de las personas ingresadas por teclado e indique si son mayores o menores
    de edad. Después de cada persona, el programa debe preguntarle al usuario si
    quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package pkg2_nombre_edad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String continuar;
        
        do {
            analizar();
            System.out.println("¿Continuar? (S/N)");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("N") == false);
        
    }
    public static void analizar() {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre y la edad");
        String nombre = leer.nextLine();
        int edad = leer.nextInt();
        
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " no es mayor de edad");
        }
    }
}
