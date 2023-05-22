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
package extras_4;

import Service.ServiceCiudades;
import java.util.HashMap;

/**
 * @author JheX
*/
public class Extras_4 {
    public static void main(String[] args) {
        HashMap<Integer, String> Ciudades = new HashMap();
        ServiceCiudades SC = new ServiceCiudades();
        
        for (int i = 0; i < 5; i++) {
            SC.crearCiudad(Ciudades);
        }
        SC.buscarCiudad(Ciudades);
        SC.mostrarCiudades(Ciudades);
        SC.crearCiudad(Ciudades);
        for (int i = 0; i < 3; i++) {
            SC.eliminarCiudad(Ciudades);
        }
        SC.mostrarCiudades(Ciudades);
    }
}
