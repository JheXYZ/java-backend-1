/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_ejs;

import Entidades.Animal;
import Entidades.Conejo;
import Entidades.Gato;
import Entidades.Perro;
import java.util.ArrayList;

/**
 * @author JheX
*/
public class Guia_ejs {
    public static void main(String[] args) {
        ArrayList<Animal> Animales = new ArrayList();
        
        Perro b = new Perro();
        Gato c = new Gato();
        Conejo con = new Conejo();
        Animales.add(b);
        Animales.add(c);
        
        for (Animal Animal : Animales) {
            Animal.hacerRuido();
        }
        con.correr();
        c.correr();
    }
    
}

