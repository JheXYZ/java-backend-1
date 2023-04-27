/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;

public class ArregloService {
    public void inicializarA(float [] arreglo){
        for (int i = 0; i < 50; i++) {
            arreglo[i] = (float) Math.random()*10;
        }
    }
    public void mostrar(float [] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
    public float[] ordenar(float [] arreglo){
        Arrays.sort(arreglo); //menor a mayor
        float [] aux= new float [50];
        
        for (int i=49; i>=0; i--) {
           aux[i]=arreglo[i];
        }
        return aux;
    }
    public float[] inicializarB(float [] arreglo1, float [] arreglo2){
        System.arraycopy(arreglo1, 0, arreglo2, 0, 10);
        Arrays.fill(arreglo2, 10, 20, (float)(0.5));
        return arreglo2;
    }
}