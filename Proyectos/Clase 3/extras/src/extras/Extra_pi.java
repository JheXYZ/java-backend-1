/*
Escribir un programa que calcule el volumen de un cilindro.
*/
package extras;

import java.util.Scanner;

public class Extra_pi {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el radio y la altura:");
        float radio = leer.nextFloat();
        float altura = leer.nextFloat();
        double volumen = Math.PI *(Math.pow(radio, 2)) * altura ;
        System.out.println("El volumen es: " + volumen);
        
        if (radio >= altura) {
            System.out.println("Radio mayor que altura");
        }else {
            System.out.println("Altura es mayor que el radio");
        }
        
        int i = 0;
        
        while (i <= 10) {
            System.out.print(i + ", ");
            i++;
        }
        
        System.out.println("");
        
        for (i = 10 ; i >= 0 ; i--) {
            System.out.print(i + ", ");
        }
        
    }
}
