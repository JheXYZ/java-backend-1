/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author JheX
*/
public class Alumno {
    private String nombre;
    private float notas[] = new float[3];

    public Alumno() {
    }
    
    public Alumno(String nombre, float notas[]) {
        this.nombre = nombre;
        this.notas = notas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "{" + nombre + ", Notas=" + Arrays.toString(notas) +'}'; //To change body of generated methods, choose Tools | Templates.
    }

}

