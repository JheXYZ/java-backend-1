/*
    Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
    edificio tendrá como métodos:
        • Método calcularSuperficie(): calcula la superficie del edificio.
        • Método calcularVolumen(): calcula el volumen del edifico.
    Estos métodos serán abstractos y los implementarán las siguientes clases:
        • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
            Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
        • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
            por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
            los atributos del padre.
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
    usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
    (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
    cuantas personas entrarían en un piso y cuantas en todo el edificio.
    Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
    dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
    métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
    superficie y el volumen de cada edificio.
    Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
    techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
    cantPersonas() y mostrar los resultados de cada edificio de oficinas.
*/
package extras_2_edificios;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JheX
*/
public class Extras_2_edificios {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Edificio> Edificios = new ArrayList();
        Edificio Poli1 = new Polideportivo("GyT", "Abierto", 123, 30, 56); //Polideportivo(String nombre, String tipo, double ancho, double alto, double largo)
        Edificio Poli2 = new Polideportivo("Delmi", "Cerrado", 230, 50, 190);
        Edificio Ofice1 = new EdificioDeOficinas(4, 4, 3, 20,7,40); //EdificioDeOficinas(int cantOficinas, int cantPersonXofi, int cantPisos, double ancho, double alto, double largo)
        Edificio Ofice2 = new EdificioDeOficinas(8, 20, 12, 40,36,60);
        Edificios.add(Poli1);
        Edificios.add(Poli2);
        Edificios.add(Ofice1);
        Edificios.add(Ofice2);
        
        int PolisCerrados = 0, PolisAbiertos = 0;
        for (Edificio edificio : Edificios) {
            
            if (edificio instanceof Polideportivo){
                System.out.println("Este Polideportivo tiene: " + edificio.calcularSuperficie() + " m² y ocupa " + edificio.calcularVolumen() + " m³");
                if (((Polideportivo) edificio).getTipo().equals("Abierto")){
                    PolisAbiertos++;
                } else {
                    PolisCerrados++;
                }
            } else {
                System.out.println("Este Edificio de Oficinas tiene: " + edificio.calcularSuperficie() + " m² y ocupa " + edificio.calcularVolumen() + " m³");
                ((EdificioDeOficinas) edificio).cantPersonas();
            }
        }
        System.out.println("Hay " + PolisAbiertos + " Polideportivos Abiertos y " + PolisCerrados + " Polideportivos Cerrados");
    } 
}
