/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trash;

import java.util.Scanner;

/**
 *
 * @author JheX
 */
public class Trash {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x = leer.nextInt();
        float Sd = 0;
        float Xc = x;
        while(Xc != 0){
            int d = (int)Xc/10;
            if (x % d == 0){
                Sd = Sd + d;
            }
            Xc = (int)Xc/10;
        }
        if(Sd>0){
            System.out.println(x + " x multiplo de Sd" + Sd);
        }
    }
    
}
