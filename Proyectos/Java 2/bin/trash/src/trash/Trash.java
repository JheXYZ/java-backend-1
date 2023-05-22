/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trash;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author JheX
 */
public class Trash {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num [] = new int [10];
        int i = 1, digs = 0, c = 0;
        System.out.print("Ingrese num: ");
        num[1] = leer.nextInt();
        while(num[i] > 0){
            int aux = num[i];
            while(aux != 0){
                aux = aux /10;
                c++;
            }
            if (c > digs){
                digs = c;
            }
            i++;
            c = 0;
            System.out.print("Ingrese num: ");
            num[i] = leer.nextInt();
        }
        System.out.println("c: " +  c + ", digs: " + digs);
        i--;
        while (i > 0){
            if ((int) (num[i] / (Math.pow(10, digs) / 10)) != 0){
                System.out.println(num[i]);
            }
            i--;
        }
    }
}
