/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 * @author JheX
*/
public class ServicePersona {
    Scanner leer = new Scanner(System.in);
    public void crearPersona(Persona persona){
        System.out.println("Ingrese su nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese su fecha de nacimiento (año, mes, día)");
        Date nacimiento = new Date(leer.nextInt()-1900, leer.nextInt()-1, leer.nextInt());
        System.out.println(nacimiento);
        persona.setNacimiento(nacimiento);
    }
    
    public void calcularEdad(Persona persona){
        Date actual = new Date();
        persona.setEdad(actual.getYear() - persona.getNacimiento().getYear());
        System.out.println("Edad: " + persona.getEdad());
    }
    
    public boolean menorQue(Persona persona){
        System.out.println("Ingrese una edad");
        return persona.getEdad() < leer.nextInt();
    }
    
    public void mostrar(Persona persona){
        System.out.println("Nombre: " + persona.getNombre() + "\nNacimiento: " + persona.getNacimiento() + "\nEdad: " + persona.getEdad());
    }
}
