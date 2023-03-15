/*
    Una obra social tiene tres clases de socios:
    Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
        en todos los tipos de tratamientos.
    Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
        para los mismos tratamientos que los socios del tipo A.
    Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
        dichos tratamientos.
    Solicite una letra (carácter) que representa la clase de un socio, y luego 
        un valor real que represente el costo del tratamiento (previo al descuento)
        y determine el importe en efectivo a pagar por dicho socio.
 */
package pkg5_extra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el monto");
        int monto = leer.nextInt();
        System.out.println("¿Que tipo de socio?");
        String tipo = leer.next();
        
        switch (tipo.toUpperCase()) {
            case "A":
                System.out.println("50% descuento, total: " + monto * 0.5);
                break;
            case "B":
                System.out.println("35% descuento, total: " + monto * 0.65);
                break;
            case "C":
                System.out.println("No ofrece descuento, total: " + monto);
                break;
            default:
                System.out.println("Socio invalido");
        }
    }
}
