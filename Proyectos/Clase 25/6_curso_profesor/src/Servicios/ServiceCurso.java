/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 * @author JheX
*/
public class ServiceCurso {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearCurso(Curso curso){
        System.out.print("Nombre del curso: ");
        curso.setNombre(leer.next());
        System.out.print("Turno: ");
        curso.setTurno(leer.next());
        System.out.print("Horas diarias: ");
        curso.setHorasDiarias(leer.nextInt());
        System.out.print("Veces por semana: ");
        curso.setDiasSemanales(leer.nextInt());
        System.out.print("Precio por hora: ");
        curso.setPrecioHora(leer.nextFloat());
    }
    
    public void cargarAlumnos(Curso curso){
        System.out.println("Ingrese los nombres de los alumnos");
        String alumnos[] = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + (i+1) + ": ");
            alumnos[i] = leer.next();
        }
        curso.setAlumnos(alumnos);
    }
    
    public void gananciaSemanal(Curso curso){
        System.out.println("Ganancias semanales: " + curso.getHorasDiarias() * curso.getPrecioHora() * curso.getDiasSemanales() * 5);
    }
}
