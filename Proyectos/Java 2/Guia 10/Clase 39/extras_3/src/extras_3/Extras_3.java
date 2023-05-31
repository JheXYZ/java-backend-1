/*
    Implemente un programa para una Librería haciendo uso de un HashSet para evitar
    datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
    información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
    el título del libro, autor, número de ejemplares y número de ejemplares prestados.
    También se creará en el main un HashSet de tipo Libro que guardará todos los libros
    creados.
    En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
    sus datos y seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
    se le pregunta al usuario si quiere crear otro Libro o no.
    La clase Librería contendrá además los siguientes métodos:
    • Constructor por defecto.
    • Constructor con parámetros.
    • Métodos Setters/getters
    • Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
        busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
        método. El método se incrementa de a uno, como un carrito de compras, el
        atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
        cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
        que no queden ejemplares disponibles para prestar. Devuelve true si se ha
        podido realizar la operación y false en caso contrario.
    • Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
        lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
        El método decrementa de a uno, como un carrito de compras, el atributo
        ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
        vez que se produzca la devolución de un libro. No se podrán devolver libros
        donde que no tengan ejemplares prestados. Devuelve true si se ha podido
        realizar la operación y false en caso contrario.
    • Método toString para mostrar los datos de los libros.
*/
package extras_3;

import Entidades.Libro;
import Service.ServiceLibros;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author JheX
*/
public class Extras_3 {
    Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashSet<Libro> Libreria = new HashSet();
        ServiceLibros SL = new ServiceLibros();
        boolean terminar = false;

        while (!terminar){
            System.out.println("=====Librería=====");
            System.out.println("1)Ingresar libro \n2)Prestamo de libro \n3)Devolver libro \n4)Terminar");
            switch(leer.nextInt()){
                case 1:
                    Libreria.add(SL.crearLibro());
                    SL.mostrarLibros(Libreria);
                    break;
                case 2:
                    SL.prestamoLibro(Libreria);
                    break;
                case 3:
                    SL.devolverLibro(Libreria);
                    break;
                case 4:
                    System.out.println("Terminando");
                    terminar = true;
                    break;
            }
        }
    }
    
}



