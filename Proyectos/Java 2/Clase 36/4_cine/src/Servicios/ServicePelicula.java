/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author JheX
*/
public class ServicePelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Pelicula> IngresarPeliculas(){
        ArrayList<Pelicula> Peliculas = new ArrayList();
        boolean fin = false;
        
        while(!fin){
            System.out.print("1)Ingresar una pelicula 2)Terminar | Acción: ");
            switch(leer.nextInt()){
                case 1:
                    Pelicula peli = new Pelicula();
                    System.out.print("Ingrese el titulo de la Pelicula: ");
                    peli.setTitulo(leer.next());
                    System.out.print("Ingrese la duración (primero horas luego minutos): \nHoras: ");
                    int horas = leer.nextInt();
                    System.out.print("Minutos: ");
                    double min = leer.nextInt();
                    peli.setDuracion(horas + (float) Math.round((min/60)*100)/100);
                    System.out.print("Ingrese el nombre del Director: ");
                    peli.setDirector(leer.next());
                    Peliculas.add(peli);
                    break;
                case 2:
                    System.out.println("Ingreso de peliculas exitoso\n");
                    fin = true;
                    break;
            }
        }
        return Peliculas;
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> Peliculas){
        System.out.println("Las peliculas ingresadas son:\n");
        Peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println();
    }
    
    public void mostrarPelisMax1(ArrayList<Pelicula> Peliculas){
        System.out.println("Las peliculas mayores a 1 hora son:\n");
        Peliculas.forEach((pelicula) -> {
            if(pelicula.getDuracion() >= 1){
                System.out.println(pelicula);
            }
        });
        System.out.println();
    }
    
    public void mostrarPelisMayorMenor(ArrayList<Pelicula> Peliculas){
        System.out.println("Peliculas de Mayor a Menor duración:\n");
        Collections.sort(Peliculas, (Pelicula p1, Pelicula p2) -> new Float(p2.getDuracion()).compareTo(p1.getDuracion()));
        Peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println();
    }
    
    public void mostrarPelisAlfaTitulo(ArrayList<Pelicula> Peliculas){
        System.out.println("Peliculas oredenadas Alfabeticamente por Titulo:\n");
        Collections.sort(Peliculas, (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo()));
        Peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println();
    }
    
    public void mostrarPelisAlfaDirector(ArrayList<Pelicula> Peliculas){
        System.out.println("Peliculas oredenadas Alfabeticamente por Director:\n");
        Collections.sort(Peliculas, (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector()));
        Peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        System.out.println();
    }
}
