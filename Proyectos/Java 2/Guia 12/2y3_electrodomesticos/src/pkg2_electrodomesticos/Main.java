/*
    Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
    para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
    Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
    deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
    televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
    precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
    2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
    electrodomésticos, 2000 para lavadora y 5000 para televisor.
*/
package pkg2_electrodomesticos;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 * @author JheX
*/
public class Main {
    public static void main(String[] args) {
        //punto 1
        /*
        Electrodomestico lavadora = new Lavadora();
        lavadora.crearElectrodomestico();
        
        Electrodomestico tele1 = new Televisor();
        tele1.crearElectrodomestico();
        
        System.out.println(lavadora);
        System.out.println(tele1);
        */
        
        //punto 2
        ArrayList<Electrodomestico> Electros = new ArrayList();
        /*
        Electros.add(tele1);
        Electros .add(lavadora);
        */
        
        Electros.add(new Lavadora(7, 78000, 42, "Rojo", 'A'));
        Electros.add(new Lavadora(31, 145000, 39, "Blanco", 'B'));
        Electros.add(new Lavadora(20, 130000, 40, "Azul", 'C'));
        Electros.add(new Televisor(65, true, 254000, 17, "Gris", 'D'));
        Electros.add(new Televisor(32, false, 66000, 10, "Blanco", 'B'));
        Electros.add(new Televisor(40, true, 102000, 13, "Verde", 'C'));
        
        int valLavadoras = 0, valTeles = 0;
        for(Electrodomestico electro : Electros){
            electro.precioFinal();
            if (electro instanceof Lavadora){
                valLavadoras += electro.getPrecio();
            } else {
                valTeles += electro.getPrecio();
            }
            System.out.println("Precio: $" + electro.getPrecio() + " | " + electro.getClass().getSimpleName());
        }
        System.out.println("Precio Total Lavadoras: $" + valLavadoras + "\nPrecio Total Televisores: $" + valTeles);
        System.out.println("Precio de Todo: $" + (valLavadoras + valTeles));
        
    }
}
