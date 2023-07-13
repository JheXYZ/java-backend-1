/*
   
 */
package trash;

import java.util.Scanner;

/**
 * @author JheX
 */
public class Trash {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        long inicio = System.currentTimeMillis();
        System.out.println(inicio);
        double v[][] = new double[30][6];
        System.out.println("Día |  00hs  |  4hs  |  8hs  |  12hs  |  16h  |  20hs");
        for (int i = 0; i < 30; i++) {
            if (i < 9){
                System.out.print((i+1) + "     ");
            } else {
                System.out.print((i+1) + "    ");
            }
            for (int j = 0; j < 6; j++) {
                v[i][j] = Math.round((Math.random()*31)*100d)/100d;
                System.out.print(v[i][j] + "    ");
            }
            System.out.println("");
        }
        double minT[] = {v[1][1], 1, 1};
        double maxT[] = {0, 0, 0};
        double tem[][] = new double [30][4];
        for (int i = 0; i < 30; i++) {
            tem[i][0] = 0;
            tem[i][1] = v[i][1];
            tem[i][2] = 0;
            for (int j = 0; j < 6; j++) {
                tem[i][2] += v[i][j];
                if(v[i][j] > tem[i][0]){
                    tem[i][0] = v[i][j];
                    if (tem[i][0] > maxT[0]){
                        maxT[0] = tem[i][0];
                        maxT[1] = 4 * j;
                        maxT[2] = i + 1;
                    }
                } else if (v[i][j] < tem[i][1]){
                    tem[i][1] = v[i][j];
                    if (tem[i][1] < minT[0]){
                        minT[0] = tem[i][1];
                        minT[1] = 4 * j;
                        minT[2] = i + 1;
                    } 
                }
            }
            tem[i][2] = (Math.round((tem[i][2]*100)/6)) / 100d;
            tem[i][3] = Math.round((tem[i][0] - tem[i][1]) * 100d) / 100d;
        }
        
        System.out.println("\nDia |  Max  |  Min  |  Prom  |  APT");
        for (int i = 0; i < 30; i++) {
            if (i < 9){
                System.out.print((i+1) + "    ");
            } else {
                System.out.print((i+1) + "   ");
            }
            
            for (int j = 0; j < 4; j++) {
                System.out.print(tem[i][j] + "    ");
            }
            System.out.println("");
        }
        System.out.println("El día con mayor temperatura: Día: " + (int)maxT[2] + ", C°: "+ maxT[0] + " a hs: " + maxT[1]);
        System.out.println("El día con menor temperatura: Día: " + (int)minT[2] + ", C°: "+ minT[0] + " a hs: " + minT[1]);
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo ejecucion: " + (fin - inicio));
    }
}
