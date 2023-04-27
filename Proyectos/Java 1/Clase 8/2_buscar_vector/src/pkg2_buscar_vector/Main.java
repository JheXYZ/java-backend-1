/*
    Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
    y le pida al usuario un número a buscar en el vector. El programa mostrará 
    dónde se encuentra el numero y si se encuentra repetido
 */
package pkg2_buscar_vector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String pos = "";
        int c = 0;
        
        System.out.println("¿De que tamaño será?");
        int n = leer.nextInt();
        int vector[] = new int[n];
        
        System.out.print("Número a buscar: ");
        int num = leer.nextInt();
        
        for (int i = 0; i < n ; i++) {
            vector[i] = (int) (Math.random() * 100);
            System.out.println("Pos:" + i + " = " + vector[i]);
            if (vector[i] == num) {
                pos += "Pos: " + i + ", ";
                c++;
            }
        }
        if (pos.equals("")){
            System.out.println("\nNo se encontro dicho número");
        } else {
            System.out.println("\nSe encontro " + num + " en " + pos + c + " veces");
        }
    }
}
