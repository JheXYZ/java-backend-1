/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 * @author JheX
*/
public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void newPersona(Persona person){
        do {
            System.out.print("Nombre: ");
            person.setNombre(leer.next());
        } while (person.getNombre().isEmpty());
        do {
            System.out.print("Edad: ");
            person.setEdad(leer.nextInt());
        } while (person.getEdad() <= 0);
        do {
            System.out.print("Sexo: ");
            person.setSexo(leer.next().toUpperCase());
        } while (!person.getSexo().equals("H") && !person.getSexo().equals("M") && !person.getSexo().equals("O"));
        do {
            System.out.print("Peso: ");
            person.setPeso(leer.nextFloat());
        } while (person.getPeso() <= 0);
        do {
            System.out.print("Altura: ");
            person.setAltura(leer.nextFloat());
        } while(person.getAltura() <= 0);
    }
    
    public boolean esMayorDeEdad(Persona person){
        return person.getEdad() > 17;
    }
    
    public int calcularIMC(Persona person){
        float imc = (person.getPeso() / (float) Math.pow(person.getAltura(), 2));
        System.out.println("IMC: " + imc);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25){
            return 0;
        } else {
            return 1;
        }
    }
    
}
