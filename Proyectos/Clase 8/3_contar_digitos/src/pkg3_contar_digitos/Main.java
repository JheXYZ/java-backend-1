/*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
    cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package pkg3_contar_digitos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int d5 = 0, d4 = 0, d3 = 0, d2 = 0, d1 = 0, j;
        String largo;
        
        System.out.println("Ingrese el tamaño");
        int n = leer.nextInt();
        int vector[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random() * 100000);
            largo = vector[i] + "";
            System.out.println(largo);
            switch (largo.length()) {
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
                case 4:
                    d4++;
                    break;
                case 5:
                    d5++;
                    break;
            }
        }
        System.out.println("Hay " + d1 + " número de 1 digito");
        System.out.println("Hay " + d2 + " número de 2 digito");
        System.out.println("Hay " + d3 + " número de 3 digito");
        System.out.println("Hay " + d4 + " número de 4 digito");
        System.out.println("Hay " + d5 + " número de 5 digito");
    }
}
