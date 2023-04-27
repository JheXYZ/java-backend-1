/*
    Crea una aplicación que a través de una función nos convierta una cantidad 
    de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
    yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
    moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará
    un mensaje indicando el cambio (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €
 */
package pkg3_convertir_currency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String continuar;
        
        do {
            System.out.println("Ingrese el monto (€)");
            float monto = leer.nextFloat();
            System.out.println("¿A que moneda desea convertir?");
            String moneda = leer.next();
            convertir(monto,moneda);
            System.out.println("¿Intentar otra conversión? (S/N)");
            continuar = leer.next();
        } while (continuar.equalsIgnoreCase("N") == false);
    }
    
    public static void convertir(float monto, String moneda) {
        switch (moneda.toLowerCase()) {
            case "dolares":
                System.out.println("€" + monto + " en dolares serían: U$D " + Math.ceil((monto * 1.28611)*100)/100); //redondea hacia arriba (ceil) y dos decimales ((monto*x)100)/100
                break;
            case "yenes":
                System.out.println("€" + monto + " en yenes serían: ¥ " + Math.ceil((monto * 129.852)*100)/100);
                break;
            case "libras":
                System.out.println("€" + monto + " en libras serían: £ " + Math.ceil((monto * 0.86)*100)/100); 
                break;
            default:
                System.out.println("Tipo de moneda invalida");
                break;
        }
    }
}
