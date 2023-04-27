/*
    Declarar una clase llamada Circunferencia que tenga como atributo privado el
    radio de tipo real. A continuación, se deben crear los siguientes métodos:
        Método constructor que inicialice el radio pasado como parámetro.
        Métodos get y set para el atributo radio de la clase Circunferencia.
        Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
        Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
        Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package pkg2_circunferencia;

import java.util.Scanner;
import pkg2_circunferencia.entidades.Circunferencia;

public class Main {
    public static void main(String[] args) { 
        Circunferencia circulo = new Circunferencia();
        crearCirc(circulo);
        area(circulo);
        perimetro(circulo);
    }
    
    public static void crearCirc(Circunferencia circulo) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Radio: ");
        circulo.setRadio(leer.nextDouble());
    }
    
    public static void area(Circunferencia circulo) {
        circulo.setArea(circulo.getRadio());
        System.out.println("El área del circulo es: " + circulo.getArea());
    }
    
    public static void perimetro(Circunferencia circulo) {
        circulo.setPerimetro(circulo.getRadio());
        System.out.println("El perímetro del circulo es: " + circulo.getPerimetro());
    }
}
