/*
    Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
    página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la 
    letra, solo el numero.
    • Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
    • Muestra por pantalla los datos introducidos
    • Pide un código postal y muestra la ciudad asociada si existe sino avisa al
        usuario.
    • Muestra por pantalla los datos
    • Agregar una ciudad con su código postal correspondiente más al HashMap.
    • Elimina 3 ciudades existentes dentro del HashMap
 */
package Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author JheX
 */
public class ServiceCiudades {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearCiudad(HashMap<Integer, String> ciudades) {
        int codigo;
        do {
            System.out.print("Codigo: ");
            codigo = leer.nextInt();
            if (ciudades.containsKey(codigo)) {
                System.out.println("Ya hay una ciudad con el mismo codigo");
            }
        } while (ciudades.containsKey(codigo));

        System.out.print("Ciudad: ");
        String ciudad = leer.next();
        ciudades.put(codigo, ciudad);
        mostrarCiudades(ciudades); //mostrar ciudades

    }

    public void mostrarCiudades(HashMap<Integer, String> ciudades) {
        TreeMap<Integer, String> ciudOrdenadas = new TreeMap(ciudades);

        System.out.println("\n===Ciudades===");
        ciudOrdenadas.entrySet().forEach((ciudad) -> {
            System.out.println(ciudad.getKey() + " | " + ciudad.getValue());
        });
        System.out.println();
    }

    public void buscarCiudad(HashMap<Integer, String> ciudades) {
        System.out.print("Buscar por Codigo: ");
        int codigo = leer.nextInt();

        if (ciudades.containsKey(codigo)) {
            System.out.println("Codigo: " + codigo + "| Ciudad: " + ciudades.get(codigo));
        } else {
            System.out.println("No se encuentra tal ciudad");
        }
    }

    public void eliminarCiudad(HashMap<Integer, String> ciudades) {
        Iterator<HashMap.Entry<Integer, String>> itCiudades = ciudades.entrySet().iterator();
        boolean hay = false;
        String ciudad;

        do {
            System.out.print("Eliminar Ciudad: ");
            ciudad = leer.next();
            if (ciudades.containsValue(ciudad)) {
                hay = true;
                while (itCiudades.hasNext()) {
                    HashMap.Entry<Integer, String> ciudadActual = itCiudades.next();
                    if (ciudadActual.getValue().equals(ciudad)) {
                        itCiudades.remove();
                        break;
                    }
                }
                System.out.println("Ciudad: " + ciudad + " Ha sido eliminada");
            } else {
                System.out.println("No se encuentra tal ciudad");
            }
        } while (!hay);
    }
}
