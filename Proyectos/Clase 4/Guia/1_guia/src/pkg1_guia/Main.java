/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_guia;

import java.util.Scanner;

/**
 *
 * @author JheX
 */
public class Main {

   public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numeros enteros: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if(num1>25 && num2>25){
        System.out.println("Ambos son mayores a 25");
      } else if (num1 > 25 || num2 > 25){
         System.out.println("Unos es mayor a 25");
      } else {
         System.out.println("Ninguno es mayor a 25");
      }
    }
}
