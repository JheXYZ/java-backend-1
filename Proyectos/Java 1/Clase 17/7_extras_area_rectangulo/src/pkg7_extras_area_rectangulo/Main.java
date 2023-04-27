/*
    Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método
    "calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un
    objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el
    área del rectángulo.
*/
package pkg7_extras_area_rectangulo;

import pkg7_extras_area_rectangulo.entidades.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectan = new Rectangulo(4,6);
        rectan.calcular_rectangulo();
    }
}
