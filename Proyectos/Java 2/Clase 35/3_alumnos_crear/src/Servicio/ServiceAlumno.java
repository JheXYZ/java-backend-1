/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JheX
 */
public class ServiceAlumno {
    Scanner leer = new Scanner(System.in);

    public ArrayList<Alumno> crearAlumnos() {
        boolean fin = false;
        ArrayList<Alumno> alumnos = new ArrayList();

        while (!fin) {
            Alumno al = new Alumno();
            System.out.print("1)Ingresar un alumno 2)Terminar | Acción: ");
            switch (leer.nextInt()) {
                case 1:
                    System.out.print("Ingrese nombre del alumno: ");
                    al.setNombre(leer.next());
                    System.out.println("Ingrese las 3 notas: ");
                    float notas[] = {leer.nextFloat(), leer.nextFloat(), leer.nextFloat()};
                    al.setNotas(notas);
                    alumnos.add(al);
                    break;
                case 2:
                    System.out.println("Los alumnos son: " + alumnos);
                    fin = true;
                    break;
            }
        }
        return alumnos;
    }

    public void notaFinal(ArrayList<Alumno> Alumnos) {
        boolean encontrado = false, fin = false;
        
        while (!fin){
            System.out.print("¿Que alumno desea buscar? | Alumno: ");
            String al = leer.next();
            for (Alumno alumno: Alumnos) {
                if (alumno.getNombre().equals(al)){
                    float notas[] = alumno.getNotas();
                    System.out.println("El promedio del alumno '" + al + "' es: " + (notas[0] + notas[1] + notas[2])/3);
                    encontrado = true;
                    fin = true;
                }
            }
            if (!encontrado){
                System.out.println("No se encuentra dicho alumno");
            }
        }
    }
}
