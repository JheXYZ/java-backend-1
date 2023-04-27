/*
    Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
    del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo
    sustituya por una E. Ejemplo:
 */
package pkg12_extras;

public class Main {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 999; i++) {
            String numero = String.format("%03d", i); // Convertimos el número a una cadena de tres dígitos con ceros a la izquierda
            numero = numero.replace('3', 'E'); // Reemplazamos el 3 por una E en la cadena
            System.out.println(numero.charAt(0) + "-" + numero.charAt(1) + "-" + numero.charAt(2)); // Mostramos la cadena con guiones entre los dígitos
        }
    }
}




