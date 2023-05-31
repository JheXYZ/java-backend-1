/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejs_guia10;

import Entidades.Libro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author JheX
 */
public class Ejs_guia10 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosA = new ArrayList();
        TreeSet<Integer> numerosB = new TreeSet();
        HashMap<Integer, String> alumnos = new HashMap();
        
        //Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
        int num = 0;
        for (int i = 0; i < 5; i++) {
            num = (int) (Math.random() * 100);
            numerosA.add(num);                  //Lista (ArrayList)

            num = (int) (Math.random() * 100);
            numerosB.add(num);                  //Conjunto (TreeSet)

            num = (int) (Math.random() * 10000);
            alumnos.put(num, "Persona " + i);   //Mapa (HashMap)
        }
        System.out.println(numerosA + " ; " + numerosB + " ; " + alumnos);

        //Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina 
        //en cada uno un objeto de cada forma que aprendiste.
        numerosA.remove(0);
        numerosB.remove(0);
        alumnos.remove(num);
        System.out.println(numerosA + " ; " + numerosB + " ; " + alumnos);

        //Deteccion errores
        HashMap<String, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.put(n1, n2);

        //Deteccion errores
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }
        
        //Crea una lista de Libros y muestra el título de cada uno con un bucle.
        Libro libro1 = new Libro("Peter Pan");
        Libro libro2 = new Libro("Alicia en el país de las maravillas");
        ArrayList<Libro> Libros = new ArrayList();
        Libros.add(libro1);
        Libros.add(libro2);
        
        for (Libro i: Libros) {     //mejor usar Libros.forEach((i) -> {
            System.out.println(i);
        }
        
        
    }
}
