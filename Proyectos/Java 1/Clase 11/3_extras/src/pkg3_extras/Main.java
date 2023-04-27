/*
    Crear una función rellene un vector con números aleatorios, pasándole un arreglo
    por parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package pkg3_extras;

public class Main {
    public static void main(String[] args) {
        int vector[] = new int [5];
        rellenar(vector);
        imprimir(vector);
    }
    
    public static void rellenar(int vector[]) {
        for (int i = 0; i < 5; i++) {
            vector[i] = (int)(Math.random()*10);
        }
    }
    public static void imprimir(int vector[]) {
        System.out.println("El vector es: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vector[i] + ", ");
        }
    }
}
