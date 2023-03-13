/*
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
   * * * *
   *     *
   *     *
   * * * *
 */
package pkg7_cuadrado_asteriscos;

public class Main {
    public static void main(String[] args) {
        
        int n = 6;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("* ");
                } else if (j == 1 || j == n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
