/*
    Realiza un programa en donde una clase Persona tenga como atributo nombre, 
    apellido y un objeto de clase Dni. La clase Dni tendrá como atributos la 
    serie (carácter) y número. Prueba acceder luego a los atributos del dni de 
    la persona creando objetos y jugando desde el main.
 */
package guia11;

import Entidades.DNI;
import Entidades.Persona;

/**
 * @author JheX
*/
public class Guia11 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan","Justo");
        DNI dni = new DNI('h',44640454);
        p1.setDni(dni);
        System.out.println(p1);
    }
}
