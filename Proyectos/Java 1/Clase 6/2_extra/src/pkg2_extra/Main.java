/*
    Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
    diferente a cada una. A continuación, realizar las instrucciones necesarias
    para que: B tome el valor de C, C tome el valor de A, A tome el valor de D 
    y D tome el valor de B. Mostrar los valores iniciales y los valores finales
    de cada variable. Utilizar sólo una variable auxiliar.
 */
package pkg2_extra;

public class Main {

    public static void main(String[] args) {
        int a, b, c, d, aux;
        a = 10; b = 4; c = 6; d = 21;
        
        System.out.println("A:" + a + " B:" + b + " C:" + c + " D:" + d);
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.println("A:" + a + " B:" + b + " C:" + c + " D:" + d);
    }
}
