/*
    Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea
    métodos para agregar nuevas recetas a la lista, para buscar una receta por 
    nombre y para obtener la lista de recetas que se pueden preparar con los 
    ingredientes disponibles en la cocina.
*/
package pkg4_extras_cocina;

import java.util.Scanner;
import pkg4_extras_cocina.entidades.Cocina;

/**
 *
 * @author bruno
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese la cantidad de recetas ha ingresar: ");
        int n = leer.nextInt();
        
        Cocina cocina = new Cocina(n);
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la receta " + (i+1));
            cocina.setRecetas(leer.next(), i);
        }
        
        //cocina.getRecetas();
        cocina.setIngredientes();
        cocina.buscarReceta("asado");
        cocina.buscarIngredientes("papas", "cebollas", "pollo");
    }
}
