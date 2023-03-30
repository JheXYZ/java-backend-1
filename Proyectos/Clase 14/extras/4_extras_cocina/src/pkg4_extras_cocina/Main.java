/*
    Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea
    métodos para agregar nuevas recetas a la lista, para buscar una receta por 
    nombre y para obtener la lista de recetas que se pueden preparar con los 
    ingredientes disponibles en la cocina.
*/
package pkg4_extras_cocina;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Receta {
    String nombre;
    List<String> ingredientes;

    public Receta(String nombre, List<String> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }
}

class Cocina {
    List<Receta> recetas;

    public Cocina() {
        this.recetas = new ArrayList<>();
    }

    public void agregarReceta(Receta receta) {
        this.recetas.add(receta);
    }

    public Receta buscarReceta(String nombre) {
        for (Receta receta : this.recetas) {
            if (receta.nombre.equals(nombre)) {
                return receta;
            }
        }
        return null;
    }

    public List<Receta> recetasDisponibles(List<String> ingredientesDisponibles) {
        List<Receta> recetasDisponibles = new ArrayList<>();
        for (Receta receta : this.recetas) {
            boolean disponible = true;
            for (String ingrediente : receta.ingredientes) {
                if (!ingredientesDisponibles.contains(ingrediente)) {
                    disponible = false;
                    break;
                }
            }
            if (disponible) {
                recetasDisponibles.add(receta);
            }
        }
        return recetasDisponibles;
    }
}

public class Main {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();

        // Agregar nuevas recetas
        cocina.agregarReceta(new Receta("Torta de chocolate", Arrays.asList("harina", "azúcar", "huevos", "chocolate")));
        cocina.agregarReceta(new Receta("Pizza margarita", Arrays.asList("harina", "tomate", "queso")));

        // Buscar una receta por nombre
        Receta tortaDeChocolate = cocina.buscarReceta("Torta de chocolate");
        System.out.println(tortaDeChocolate.nombre);

        // Obtener la lista de recetas que se pueden preparar con los ingredientes disponibles en la cocina
        List<String> ingredientesDisponibles = Arrays.asList("harina", "azúcar", "huevos", "chocolate");
        List<Receta> recetasDisponibles = cocina.recetasDisponibles(ingredientesDisponibles);
        for (Receta receta : recetasDisponibles) {
            System.out.println(receta.nombre);
        }
    }
}

