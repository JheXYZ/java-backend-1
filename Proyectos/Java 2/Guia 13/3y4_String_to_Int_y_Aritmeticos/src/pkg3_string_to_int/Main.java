/*
    3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
        números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
        para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
        una división con los dos numeros y mostrar el resultado.
    4. Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
        causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
        no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
        número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
        utilizando bloques try/catch para las distintas excepciones
 */
package pkg3_string_to_int;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JheX
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //3
        int num, num2;

        try {
            System.out.print("Número 1: ");
            num = Integer.parseInt(leer.next());
            System.out.print("Número 2: ");
            num2 = leer.nextInt();
            System.out.println("División: " + (num / num2));
        } catch (InputMismatchException a) {
            System.out.println("Error: No se ingresó un número entero. Motivo: " + a.toString());
        } catch (NumberFormatException a) {
            System.out.println("Error: No se ingresó un valor válido. Motivo: " + a.getMessage());
        } catch (ArithmeticException a) {
            System.out.println("No se puede hacer division por 0");
        }

    }
}
