/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Estudiante;
import java.util.Arrays;

/**
 * @author JheX
*/
public class ServiceEstudiantes {
    public void generarNotas(Estudiante est []){
        //System.out.println("==Debug=="); // debug, no mostrar
        for (int i = 0; i < 8; i++) {
            est[i].setNota((float) Math.random() * 10);
            est[i].setNombre("" + (i + 1));
            //System.out.println("Nota " + (i + 1) + ": "+ est[i].getNota()); // debug, no mostrar
        }
        //System.out.println("========="); // debug, no mostrar
    }
    
    public float promedioCurso(Estudiante est []){
        float prom = 0;
        for (int i = 0; i < 8; i++) {
            prom += est[i].getNota();
        }
        prom = prom/8;
        System.out.println("El promedio del curso es: " + prom);
        return prom;
    }
    
    public String[] mayorPromedio(Estudiante est[], float prom){
        String alumnos [] = new String [8] ;
        int c = 0;
        for (int i = 0; i < 8; i++) {
            if (est[i].getNota() >= prom){
                alumnos[c] = est[i].getNombre();
                c++;
            }
        }
        
        String alMaxProm[] = new String [c];
        System.arraycopy(alumnos, 0, alMaxProm, 0, c);
        return alMaxProm;
    }
    
    public void mostarPromMayores(String[] alumnos){
        System.out.println("Los alumnos con mayor promedio son: " + Arrays.toString(alumnos));
    }
}
