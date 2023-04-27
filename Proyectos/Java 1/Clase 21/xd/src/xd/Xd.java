/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xd;

import java.util.Scanner;

public class Xd {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float a, b, c;
    
        System.out.println("Ingrese A, B y C");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        
        if (Math.pow(b,2) - (4*a*c) == 0){
            System.out.println("La raiz tiene una solución");
        } else if (Math.pow(b,2) - (4*a*c) > 0){
            System.out.println("La raiz tiene dos soluciones");
        } else {
            System.out.println("La raiz tiene solucion compleja");
        }
    }
}
