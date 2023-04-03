/*
    Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con
    los atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera)
    y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar
    constructor vacío y con parámetros así como setters y getters. Crear clase 
    CafeteraServicio en el paquete Servicios con los siguiente:
        Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
        Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
        Método vaciarCafetera(): pone la cantidad de café actual en cero. 
        Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
 */
package pkg2_cafetera;

import Entidades.Cafetera;
import Servicios.ServiceCafetera;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera cafe = new Cafetera();
        ServiceCafetera SC = new ServiceCafetera();
        boolean fin = false;
        
        SC.capacidaMaxima(cafe);
        SC.llenarCafetera(cafe);
        
        while (fin != true) {
            System.out.println("Cafetera\n1)Servir taza\n2)Agregar cafe\n3)Vaciar cafetera\n4)Salir");
            switch (leer.nextInt()) {
                case 1:
                    System.out.println("¿Cuanto desea servirse?");
                    SC.servirTaza(leer.nextInt(), cafe);
                    break;
                case 2:
                    System.out.println("¿Cuanto desea agregar?");
                    SC.agregarCafe(leer.nextInt(), cafe);
                    break;
                case 3:
                    SC.vaciarCafetera(cafe);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    fin = true;
                default:
                    System.out.println("Opción invalida");
                    break;
            }
        }
    }
}
