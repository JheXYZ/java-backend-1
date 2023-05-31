/*
    Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
    La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
    Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
    mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
    siguiente:
    }
*/
package pkg1_animal_alimento;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 * @author JheX
*/
public class Main {
    public static void main(String[] args) {
        Animal perro1 = new Perro("Doki", "Alimento de Perro", "Caniche", 4);
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("Mancha", "Sobras de Comida", "Dogo", 5);
        perro2.Alimentarse();
        
        Animal gato = new Gato("Dylan", "Alimento de Gato", "Bengal", 3);
        gato.Alimentarse();
        
        Animal caballo = new Caballo("Spirit", "Cesped", "Semental", 10);
        caballo.Alimentarse();
    }
}
