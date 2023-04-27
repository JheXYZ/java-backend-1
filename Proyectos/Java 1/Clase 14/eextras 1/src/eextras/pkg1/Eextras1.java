/*
    Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
    Crea un constructor para inicializar los valores de las propiedades.
    Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual" si aún no se ha alcanzado el "maximoPisos".
    Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si no se ha alcanzado el piso "0".
    Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir y que modifique la propiedad "pisoActual" para que tenga ese valor.
    Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. Simula el comportamiento del ascensor moviéndolo hacia arriba y hacia abajo, yendo a un piso específico, y mostrando en pantalla el piso actual después de cada movimiento.
*/
package eextras.pkg1;

import Entidades.Ascensor;
import Servicios.ServicioAscensor;
import java.util.Scanner;

/**
 * @author JheX
*/
public class Eextras1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ascensor ascensor = new Ascensor(0,10);
        ServicioAscensor SA = new ServicioAscensor();
        boolean fin = false;
        
        while (fin == false){
            System.out.println("====Ascensor Piso: " + ascensor.getpActual() + "====\n1)Subir 1 piso\n2)Bajar 1 piso\n3)Ir a piso\n4)Salir Ascensor");
            switch (leer.nextInt()){
                case 1:
                    SA.subir(ascensor);
                    break;
                case 2:
                    SA.bajar(ascensor);
                    break;
                case 3:
                    SA.irA(ascensor);
                    break;
                case 4:
                    fin = true;
                    break;
                default:
                    System.out.println("Opción iválida");
                    break;
            }
        }
    }
}
