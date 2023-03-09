/*
Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
caracteres de largo, el programa le concatenara un signo de exclamación al final, y si no
es de 4 caracteres el programa le concatenara un signo de interrogación al final. El
programa mostrará después la frase final. Nota: investigar la función Longitud() y
Concatenar() de PseInt.
*/
package extras;

import java.util.Scanner;

public class extra2 {
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    
    System.out.println("Ingrese palabra");
    String palabra = leer.nextLine();
   
    if (palabra.length() == 4 ) {
        palabra = palabra.concat("!");
        System.out.println(palabra);
        } else {
        palabra = palabra.concat("?");
        System.out.println(palabra);
        }
    }
}
