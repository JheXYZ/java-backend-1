/*
    Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene
    un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, 
    bastos, oros y copas). Esta clase debe contener un método toString() que 
    retorne el número de carta y el palo. La baraja estará compuesta por un 
    conjunto de cartas, 40 exactamente.
    Las operaciones que podrá realizar la baraja son:
    • barajar(): cambia de posición todas las cartas aleatoriamente.
    • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando
        no haya más o se haya llegado al final, se indica al usuario que no hay 
        más cartas.
    • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese 
        número de cartas. En caso de que haya menos cartas que las pedidas, no 
        devolveremos nada, pero debemos indicárselo al usuario.
    • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
        ninguna indicárselo al usuario
    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se 
        saca una carta y luego se llama al método, este no mostrara esa primera carta.
 */
package pkg3_cartas_espanolas;

import Entidades.Carta;
import Entidades.ServiceCartas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JheX
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Carta> Cartas = new ArrayList();
        ServiceCartas CartasServ = new ServiceCartas();
        String palo[] = {"Oro", "Espada", "Copa", "Basto"};
        int i = 0, c = 0;

        while (i < 11 && c < 4) {
            if (i > 6) {
                Carta carta = new Carta(i + 3, palo[c]);
                Cartas.add(carta);
            } else {
                Carta carta = new Carta(i + 1, palo[c]);
                Cartas.add(carta);
            }
            i++;
            if (i == 10) {
                i = 0;
                c++;
            }
        }
        
        CartasServ.setCartas(Cartas);
        System.out.println("Cartas: ");
        CartasServ.mostrarBaraja();
        CartasServ.barajar();
        System.out.println("Cartas Disponibles: " + CartasServ.cartasDisponibles());
        System.out.print("Cuantas cartas quiera dar: ");
        CartasServ.darCartas(leer.nextInt());
        System.out.println("\nCartas Disponibles: " + CartasServ.cartasDisponibles());
        CartasServ.cartasDisponibles();
        System.out.println("\nCartas Dadas: ");
        CartasServ.cartasMonton();
        System.out.println("\nCartas Baraja: ");
        CartasServ.mostrarBaraja();
        System.out.println("\nCuantas cartas quiera dar: ");
        CartasServ.darCartas(leer.nextInt());
    }
}
