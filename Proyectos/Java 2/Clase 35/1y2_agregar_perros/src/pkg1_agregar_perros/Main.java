/*
    1) Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
    String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
    en la lista y después se le preguntará al usuario si quiere guardar otro perro
    o si quiere salir. Si decide salir, se mostrará todos los perros guardados 
    en el ArrayList.

    2) Continuando el ejercicio anterior, después de mostrar los perros, al usuario
    se le pedirá un perro y se recorrerá la lista con un Iterator, se buscará el
    perro en la lista. Si el perro está en la lista, se eliminará el perro que 
    ingresó el usuario y se mostrará la lista ordenada. Si el perro no se encuentra
    en la lista, se le informará al usuario y se mostrará la lista ordenada.
*/
package pkg1_agregar_perros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author JheX
*/
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas = new ArrayList();
        
        boolean fin = false;
        
        while (!fin){
            System.out.print("==Razas Perros==\n1)Ingresar 2)Terminar | Acción: ");
            switch(leer.nextInt()){
                case 1:
                    System.out.print("Ingrese una raza: ");
                    razas.add(leer.next());
                    break;
                case 2:
                    System.out.println("Las razas son: " + razas);
                    fin = true;
                    break;
            }
        }
        Iterator<String> itRazas = razas.iterator();
        System.out.print("Que raza desea eliminar: ");
        String eliminar = leer.next();
        
        while(itRazas.hasNext()){
            if (itRazas.next().equals(eliminar)){
                itRazas.remove();
            }
        }
        System.out.println("Las razas son: " + razas);
    }
}
