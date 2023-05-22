/*
    Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a 
    contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y 
    tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento 
    y Perro.
    Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos 
    a tener que pensar la lógica necesaria para asignarle a cada Persona un Perro
    y por ultimo, mostrar desde la clase Persona, la información del Perro y de 
    la Persona.
 */
package Principal;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JheX
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> Personas = new ArrayList();
        ArrayList<Perro> Perros = new ArrayList();
        char fin = 's';

        System.out.println("Ingresar Perros:");
        while (fin == 's') {
            Perro perro = new Perro();
            System.out.print("Nombre: ");
            perro.setNombre(leer.next());
            System.out.print("Raza: ");
            perro.setRaza(leer.next());
            System.out.print("Edad: ");
            perro.setEdad(leer.nextInt());
            System.out.print("Tamaño: ");
            perro.setTamano(leer.next());
            Perros.add(perro);
            System.out.println("¿Ingresar otro perro? (S/N)");
            fin = leer.next().charAt(0);
        }
        fin = 's';
        System.out.println("Ingresar Personas:");
        while (fin == 's') {
            Persona persona = new Persona();
            System.out.print("Nombres: ");
            persona.setNombre(leer.next());
            System.out.print("Apellidos: ");
            persona.setApellido(leer.next());
            System.out.print("Edad: ");
            persona.setEdad(leer.nextInt());
            System.out.print("DNI: ");
            persona.setDocumento(leer.nextInt());
            Personas.add(persona);
            System.out.println("¿Ingresar otra persona? (S/N)");
            fin = leer.next().charAt(0);
        }

        for (int i = 0; i < Perros.size(); i++) {
            if (i == Personas.size() - 1) {
                break;
            }
            Personas.get(i).setPerro(Perros.get(i));
        }

        System.out.println("Personas con sus perros: ");
        for (Persona persona : Personas) {
            if (persona.getPerro() == null) {
                System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido()
                        + ", Edad: " + persona.getEdad() + ", DNI: " + persona.getDocumento() + ", Perro: No posee");
            } else {
                System.out.println(persona);
            }
        }
    }
}
