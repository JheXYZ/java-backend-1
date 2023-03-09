/*
Escriba un programa que pida 3 notas y valide si esas notas están entre 1 y 10. Si están
entre esos parámetros se debe poner en verdadero una variable de tipo lógico y si no
ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la
variable de tipo lógico.
*/
package extras;

import java.util.Scanner;

public class extra3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n1, n2, n3;
        boolean x;
        x = true;
        
        System.out.println("Ingrese tres notas");
        n1 = leer.nextInt(); n2 = leer.nextInt(); n3 = leer.nextInt();
        
        if (n1 < 0 || n1 > 10) {
            x = false;
        } else if (n2 < 0 || n2 > 10) {
            x = false;
        } else if (n3 < 0 || n3 > 10) {
            x = false;
        }
        
        if (x == true) {
            System.out.println("Todos las notas son entre 0 y 10");
        } else {
            System.out.println("No todas las notas son entre 0 y 10");
        }
    }
}
