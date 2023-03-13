/*
    Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
    programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
    Nota: investigar la función equals() en Java.
 */
package pkg2_frase_igual;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase");
        String palabra = leer.nextLine();
        if (palabra.equals("eureka") == true) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
