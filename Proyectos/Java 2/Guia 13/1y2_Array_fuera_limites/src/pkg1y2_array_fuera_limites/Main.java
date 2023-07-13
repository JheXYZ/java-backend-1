/*
    1. Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
        método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
        try-catch para probar la nueva excepción que debe ser controlada.
    2. Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
        generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
        de rango).
*/
package pkg1y2_array_fuera_limites;

import Entidades.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JheX
*/
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona Persona = new Persona();
        
        //1
        
        try{
            Persona.setEdad(leer.nextInt());
            System.out.println("¿Es mayor?: " + Persona.isMayor());
        } catch (InputMismatchException a){
            System.out.println("Error: No se ingreso una edad válida");
        }
        
        //2
        int vector[] = new int[10];
        try{
            for (int i = 0; i <= 10; i++) {
                vector[i] = i;
                System.out.print(vector[i] + ", ");
            }
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("\nError: Se intentó acceder fuera del Array");
        }
    }   
}
