/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
*/
package pkg2_nombre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     String nombre;
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("Su nombre es " + nombre);
    }
    
}
