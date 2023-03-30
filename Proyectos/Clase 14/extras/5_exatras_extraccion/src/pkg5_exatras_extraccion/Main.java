/*
    Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
    crea un método "retirar_dinero" que permita retirar una cantidad de dinero 
    del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
    de realizar una transacción de retiro.
*/
package pkg5_exatras_extraccion;

import java.util.Scanner;
import pkg5_exatras_extraccion.entidades.Cuenta;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean fin = false;
        int opcion;
        
        System.out.println("Ingrese el Nombre del Titular y el dinero disponible");
        Cuenta cuenta = new Cuenta(leer.next(),leer.nextFloat());
        while(fin != true) {
            System.out.println("====Cuenta de " + cuenta.getTitular() + "====\n1)Ingresar Monto\n2)Retirar Monto\n3)Dinero Disponible\n4)Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a ingresar: $");
                    cuenta.ingresar_dinero(leer.nextFloat());
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: $");
                    cuenta.retirar_dinero(leer.nextFloat());
                    break;
                case 3:
                    System.out.println("Saldo Disponible: $" + cuenta.getSaldo());
                    break;
                case 4:
                    fin = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
           }
        }
    }
}
