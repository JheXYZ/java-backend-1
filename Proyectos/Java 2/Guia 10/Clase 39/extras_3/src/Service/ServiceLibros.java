/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author JheX
 */
public class ServiceLibros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        Libro libro = new Libro();

        System.out.print("Titulo: ");
        libro.setTitulo(leer.next());
        System.out.print("Autor: ");
        libro.setAutor(leer.next());
        do {
            System.out.print("Ejemplares: ");
            libro.setEjemplares(leer.nextInt());
        } while (libro.getEjemplares() < 0);
        do {
            System.out.print("Ejemplares Prestados: ");
            libro.setEjemplaresPrestados(leer.nextInt());
        } while (libro.getEjemplaresPrestados() > libro.getEjemplares() || libro.getEjemplaresPrestados() < 0);
        return libro;
    }

    public void prestamoLibro(HashSet<Libro> Libreria) {
        System.out.println("¿Que libro desea prestar?");
        String libro = leer.next();
        boolean encontrado = false;

        for (Libro libroActual : Libreria) {
            if (libroActual.getTitulo().equals(libro)) {
                System.out.println("¿Cuantos libros desea prestar? ");
                int cantidad = leer.nextInt();

                if (libroActual.prestarLibro(libro, cantidad)) {
                    System.out.println("Se han prestado " + cantidad + " del libro " + libro);
                    encontrado = true;
                    mostrarLibros(Libreria);
                } else {
                    System.out.println("No hay suficientes libros para prestar");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("No se encuentra tal libro");
        }
    }

    public void devolverLibro(HashSet<Libro> Libreria) {
        System.out.println("¿Que libro desea devolver?");
        String libro = leer.next();
        boolean encontrado = false;

        for (Libro libroActual : Libreria) {
            if (libroActual.getTitulo().equals(libro)) {
                System.out.println("¿Cuantos libros desea devolver? ");
                int cantidad = leer.nextInt();

                if (libroActual.devolverLibro(libro, cantidad)) {
                    System.out.println("Se han devuelto " + cantidad + " del libro " + libro);
                    encontrado = true;
                    mostrarLibros(Libreria);
                } else {
                    System.out.println("No se pueden devolver mas libros de los que se poseen");
                    encontrado = true;
                }
            }
            
        }
        if (!encontrado) {
                System.out.println("No se encuentra tal libro");
            }
    }

    public void mostrarLibros(HashSet<Libro> Libreria) {
        System.out.println("===Libros===\n");
        Libreria.forEach((libro) -> {
            System.out.println(libro);
        });
        System.out.println();
    }
}
