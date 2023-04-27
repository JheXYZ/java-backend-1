/*
    Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
    a medida que el usuario las va ingresando, construya una “sopa de letras para
    niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
    horizontal en una fila que será seleccionada de manera aleatoria. Una vez concluida
    la ubicación de las palabras, rellene los espacios no utilizados con un número
    aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.

    Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
    funciones de Java substring(), Length() y Math.random().
*/
package pkg6_extras;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String matriz[][] = new String[20][20];
        String palabra;
        Random r = new Random();
        int fila, pos, c = 0;
        int posiciones[] = new int[5];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = "*";//(r.nextInt(9) + 1);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Ingrese una palabra entre 3 y 5 caracteres: ");
                palabra = leer.next();
            } while (palabra.length() < 3 || palabra.length() > 5);
            posiciones(posiciones,r);
            pos = posiciones[i];
            fila = r.nextInt(15)+1;
            
            for (int j = pos; j < pos + palabra.length(); j++) {
                matriz[fila][j] = palabra.substring(c,c+1);
                c++;
            }
            c=0;
            mostrar(matriz);
        }
    }
    public static void mostrar(String matriz[][]) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void posiciones(int posiciones[], Random r) {
        for (int i = 0; i < 5; i++) {
            posiciones[i] = r.nextInt(15)+1;
            if (i != 0) {
                if (posiciones[i-1] == posiciones[i]) {
                    posiciones[i] = r.nextInt(15)+1;
                }
            }
//            System.out.println(posiciones[i] + " ");
        }
//        System.out.println();
    }
}
