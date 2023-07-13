/*
    Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
    debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
    ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
    número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
    consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
    ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
    controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
    carácter fallido como un intento.
 */
package pkg5_numero_random;

import java.util.Scanner;

/**
 * @author JheX
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero = (int) (Math.random() * 501);
        //System.out.println("Numero Secreto: " + numero);      //debug
        int num = 0;

        while (num != numero) {
            if (num != 0) {
                int dif = Math.abs(num - numero);
                if (numero < num) {
                    if (dif > 100) {
                        System.out.println("¡Leeejos! El número es mucho más chico");
                    } else {
                        System.out.println("¡Rayos! El número es algo más chico");
                    }
                } else {
                    if (dif > 100) {
                        System.out.println("¡Oh no! El número es mucho más alto");
                    } else {
                        System.out.println("¡Rocorcholis! El número es algo más alto");
                    }
                }
                num = 0;
            }
            try {
                System.out.print("Su número: ");
                num = leer.nextInt();
            } catch (Exception a) {
                System.out.println("No ingresaste un número válido");
                leer.nextLine();
            }
        }
        System.out.println("¡Felicitaciones has encontrado al número! " + numero);
    }
}
