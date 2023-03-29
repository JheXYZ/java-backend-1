/*
    Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
    sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un 
    objeto puntos usando un método crearPuntos() que le pide al usuario los dos 
    números y los ingresa en los atributos del objeto. Después, a través de otro 
    método calcular y devolver la distancia que existe entre los dos puntos que 
    existen en la clase Puntos. Para conocer como calcular la distancia entre dos
    puntos consulte el siguiente link:
    https://goo.su/LDpl7
 */
package pkg2_extras_dist_puntos;

import java.util.Scanner;
import pkg2_extras_dist_puntos.entidades.Punto;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Punto punto = new Punto();
        
        System.out.println("Ingrese la primera coordenada (x1 e y1)");
        punto.setX1(leer.nextInt());
        punto.setY1(leer.nextInt());
        System.out.println("Ingrese la segundo coordenada (x2 e y2)");
        punto.setX2(leer.nextInt());
        punto.setY2(leer.nextInt());
        System.out.println("La distancia entre (" + punto.getX1() + "," + punto.getY1() + ") y (" + punto.getX2() + "," + punto.getY2() + ") es: " + punto.distancia());
    }
    
}
