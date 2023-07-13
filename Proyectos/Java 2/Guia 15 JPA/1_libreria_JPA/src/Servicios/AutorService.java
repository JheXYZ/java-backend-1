/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Autor;
import Persistence.AutorJpaController;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Scanner;

/**
 * @author JheX
*/

public class AutorService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private AutorJpaController AJC = new AutorJpaController();

    public void crearAutor() {
        int id = (AJC.findAutorEntities().get(AJC.getAutorCount() - 1).getId()) + 1;
        while (AJC.findAutor(id) != null) {
            id++;
        }
        System.out.print("ID: " + id + "\nNombre: ");
        AJC.create(new Autor(id, leer.next()));
    }

    public void crearAutor(int id, String nombre) {
        if (AJC.findAutor(id) == null) {
            System.out.println("ID: " + id + " | Nombre: " + nombre);
            AJC.create(new Autor(id, nombre));
        } else {
            System.out.println("Ya existe un autor con tal ID");
        }
    }

    public void eliminarAutorID() {
        try {
            AJC.destroy(leer.nextInt());
        } catch (NonexistentEntityException ex) {
            System.out.println("No exite tal ID");
        }
    }

    public void eliminarAutorID(int id) {
        try {
            AJC.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.out.println("No exite tal ID");
        }
    }

    public void modificarAutor() {
        mostrarAutoresAll();
        System.out.print("Modificar Autor | ID: ");
        int id = leer.nextInt();
        while (AJC.findAutor(id) == null) {
            System.out.print("No se encontro tal ID, intente de nuevo: ");
            id = leer.nextInt();
        }
        try {
            Autor autor = AJC.findAutor(id);
            System.out.println("ID: " + autor.getId() + " | Nombre: " + autor.getNombre());
            System.out.println("Que desea modificar | 1) ID | 2) Nombre | 3) Alta/Baja | 4) Reorganizar IDs |Any Key) Cancelar");
            int opcion;
            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                opcion = 5;
            }
            switch (opcion) {
                case 1 -> {
                    int newID = id;
                    System.out.print("Nuevo ID: ");
                    do {
                        newID = leer.nextInt();
                        if (AJC.findAutor(newID) != null) {
                            System.out.print("ID ya existente, intente de nuevo: ");
                        }
                    } while (AJC.findAutor(newID) != null);
                    autor.setId(newID);
                    AJC.create(autor);
                    AJC.destroy(id);
                }
                case 2 -> {
                    System.out.print("Nuevo Nombre: ");
                    autor.setNombre(leer.next());
                    AJC.edit(autor);
                }
                case 3 -> {
                    AJC.edit(cambiarEstadoBaja(autor));
                }
                case 4 -> {
                    reorganizarIDs();
                }
                default -> {
                    System.out.println("Terminando...");
                }
            }

            System.out.println("Operacion Exitosa!");
        } catch (Exception ex) {
            System.out.println("Algo paso al tratar de modificar el autor D:");
        }
    }

    public Autor cambiarEstadoBaja(Autor autor){
        if (autor.isAlta()){
            System.out.println("Se ha dado de baja al Autor");
            autor.setAlta(false);
        } else {
            System.out.println("Se ha dado de alta al Autor");
            autor.setAlta(true);
        }
        return autor;
    }
    
    public void mostrarAutores() {
        System.out.println("===== Autores =====");
        for (Autor autor : AJC.findAutorEntities()) {
            if (autor.isAlta()) {
                System.out.println("ID: " + autor.getId() + " | Nombre: " + autor.getNombre());
            }
        }
        System.out.println("===================\n");
    }

    public void mostrarAutoresAll() {
        List<Autor> autores = AJC.findAutorEntities();
        System.out.println("===== Autores =====");
        for (Autor autor : autores) {
            System.out.println("ID: " + autor.getId() + " | Alta: " + autor.isAlta() + " | Nombre: " + autor.getNombre());
        }
        System.out.println("===================\n");
    }
    
    public void reorganizarIDs(){
        int c = 1;
        for (Autor autor : AJC.findAutorEntities()) {
            if (autor.getId() != c){
                int id = autor.getId();
                autor.setId(c);
                AJC.create(autor);
                try {
                    AJC.destroy(id);
                } catch (NonexistentEntityException ex) {
                    System.out.println("Algo paso al reorganizar las IDs D:");
                }
            }
            c++;
        }
    }
    
    public List<Autor> getAutores(){
        return AJC.findAutorEntities();
    }
    
    public Autor buscarAutorID(int id){
        return AJC.findAutor(id);
    }
    
    public void menuAutores(){
        System.out.println("==== Administrar Autores ==== \n1) Mostrar Autores | 2) Mostrar todos los Autores | 3) Nuevo Autor | 4) Modificar un Autor | 5) Salir");
        switch(leer.nextInt()){
            case 1 -> {
                mostrarAutores();
            }
            case 2 -> {
                mostrarAutoresAll();
            }
            case 3 -> {
                crearAutor();
            }
            case 4 -> {
                modificarAutor();
            }
            default -> {
                System.out.println("Saliendo...");
            }
        }
    }
}
