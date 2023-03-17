/*
    Escribir un programa que procese una secuencia de caracteres ingresada por
    teclado y terminada en punto, y luego codifique la palabra o frase ingresada
    de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
    en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
    se mantienen sin cambios.
    
    Realice un subprograma que reciba una secuencia de caracteres y retorne la 
    codificación correspondiente. Utilice la estructura “según” para la transformación. 
    Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
    La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package pkg1_guia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    System.out.println("Ingrese una frase");
    String frase = leer.nextLine();
    String retorno = intercambio(frase);
    System.out.print(retorno);
    System.out.println(" ");
}

public static String intercambio(String frase) {
    int largo = frase.length();
    String fraseNueva = "";
    for (int i = 0; i < largo; i++) {
        char letra = frase.charAt(i);
        switch (letra) {
            case 'A':
                fraseNueva += "@";
                break;
            case 'E':
                fraseNueva += "#";
                break;
            case 'I':
                fraseNueva += "$";
                break;
            case 'O':
                fraseNueva += "%";
                break;
            case 'U':
                fraseNueva += "*";
                break;
            default:
                fraseNueva += letra;
                break;
        }
    }
    System.out.println("");
    return fraseNueva;
    }
}

