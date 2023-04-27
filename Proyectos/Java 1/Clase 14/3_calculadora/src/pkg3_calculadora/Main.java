/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y 
numero2. A continuación, se deben crear los siguientes métodos:
    *Método constructor con todos los atributos pasados por parámetro.
    *Método constructor sin los atributos pasados por parámetro.
    *Métodos get y set.
    *Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    *Método sumar(): calcular la suma de los números y devolver el resultado al main.
    *Método restar(): calcular la resta de los números y devolver el resultado al main
    *Método multiplicar(): primero valida que no se haga una multiplicación por 
        cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa
        al usuario el error. Si no, se hace la multiplicación y se devuelve el 
        resultado al main
    *Método dividir(): primero valida que no se haga una división por cero, si 
        fuera a pasar una división por cero, el método devuelve 0 y se le informa
        al usuario el error se le informa al usuario. Si no, se hace la división
        y se devuelve el resultado al main.
 */
package pkg3_calculadora;

import java.util.Scanner;
import pkg3_calculadora.entidades.calculadora;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean fin = false;
        int opcion;
        calculadora calc = new calculadora();
        
        do {
            System.out.println("Ingrese dos números a operar");
            calc.crearOperacion(leer.nextInt(), leer.nextInt());
            System.out.println("==Operación==\n1)SUMA\n2)RESTA\n3)MULTILPLICACION\n4)DIVISION\n5)FIN");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + calc.suma());
                    break;
                case 2:
                    System.out.println("La resta es: " + calc.resta());
                    break;
                case 3:
                    if (calc.getNumero1() == 0 || calc.getNumero2() == 0) {
                        System.out.println("La multiplición por cero resulta 0");
                    } else {
                        System.out.println("La multiplicación es: " + calc.multiplicion());
                    }
                    break;
                case 4:
                    if (calc.getNumero2() == 0) {
                        System.out.println("La division por cero resulta imposible");
                    } else {
                        System.out.println("La división es: " + calc.division());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    fin = true;
                    break;
                default:
                    System.out.println("Intente otra vez");
                    break;
            }
            System.out.println("============");
        } while (fin != true);
    }
}
