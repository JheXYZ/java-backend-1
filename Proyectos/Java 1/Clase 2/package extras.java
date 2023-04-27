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