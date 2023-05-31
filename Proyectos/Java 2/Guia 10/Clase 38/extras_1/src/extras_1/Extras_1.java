/*
    Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
    y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
    introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
    programa mostrará por pantalla el número de valores que se han leído, su suma y su
    media (promedio).
*/
package extras_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JheX
*/
public class Extras_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();
        int sum = 0;
        
        while(true){
            System.out.print("Ingrese un número: ");
            int n = leer.nextInt();
            if (n != -99){
                numeros.add(n);
                sum += n;
            } else{
                System.out.println("Los números son: " + numeros + "\nLa suma de todos es: " + sum + "\nEl promedio es: " + (float)sum/numeros.size());
                break;
            }
        }
    }
}
