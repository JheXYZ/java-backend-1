/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Editorial;
import Persistence.EditorialJpaController;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Scanner;

/**
 * @author JheX
*/

public class EditorialService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private EditorialJpaController EJC = new EditorialJpaController();
    
    public void crearEditorial(int id, String nombre){
        System.out.println("Nueva Editorial | ID: " + id + " | Nombre: " + nombre);
        if (EJC.findEditorial(id) == null){
            EJC.create(new Editorial(id, nombre));
        } else {
            System.out.println("Ya existe una Editorial con tal ID");
        }
    }
    
    public void crearEditorial(){
        int id = (EJC.findEditorialEntities().get(EJC.getEditorialCount()-1).getId()) + 1;
        while(EJC.findEditorial(id) != null){
            id++;
        }
        System.out.print("ID: " + id + "\nNombre: ");
        String nombre = leer.next();
        EJC.create(new Editorial(id, nombre));
    }
    
    public void crearEditorialAl(String nombre){
        List<Editorial> ed = EJC.findEditorialEntities();
        System.out.println("Nueva Editorial | Nombre: " + nombre);
        EJC.create(new Editorial(nombre));
    }
    
    public void eliminarEditorialID(){
        System.out.print("Eliminar Editorial | ID: ");
        try {
            EJC.destroy(leer.nextInt());
        } catch (NonexistentEntityException ex) {
            System.out.println("No existe tal ID");
        }
    }
    
    public void eliminarEditorialID(int id){
        System.out.print("Eliminar Editorial | ID: " + id);
        try {
            EJC.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.out.println("No existe tal ID");
        }
    }
    
    public void modificarEditorial(){
        System.out.print("Modificar Editorial | ID: ");
        int id = leer.nextInt();
        while (EJC.findEditorial(id) == null){
            System.out.print("No se encotro tal ID, intente de nuevo: ");
            id = leer.nextInt();
        }
        try {
            Editorial ed = EJC.findEditorial(id);
            System.out.println("ID: " +  ed.getId() + " | Nombre: " + ed.getNombre());
            System.out.println("Que desea modificar | 1) ID | 2) Nombre | 3) Alta/Baja | Any Key) Cancelar");
            int opcion;
            try {
                opcion = leer.nextInt();
            } catch (Exception e){
                opcion = 4;
            }
            switch (opcion){
                case 1 -> {
                    System.out.print("Nuevo ID: ");
                    int newID;
                    do {
                        newID = leer.nextInt();
                        if (EJC.findEditorial(newID) != null){
                            System.out.print("ID ya existente, intente de nuevo: ");  
                        }
                    } while (EJC.findEditorial(newID) != null);
                    ed.setId(newID);
                    EJC.create(ed);
                    EJC.destroy(id);
                }
                case 2 -> {
                    System.out.print("Nuevo Nombre: ");
                    ed.setNombre(leer.next());
                    EJC.edit(ed);
                }
                case 3 -> {
                    
                }
                default -> {
                    System.out.println("Terminando...");
                }
            }
        
            System.out.println("Operacion Exitosa!");
        } catch (Exception ex) {
            System.out.println("Algo paso al tratar de modificar la editorial D:");
        }
    }
    
    public void modificarEditorial(int id){
        mostrarEditorialesAll();
        while (EJC.findEditorial(id) == null){
            System.out.print("No se encotro tal ID, intente de nuevo: ");
            id = leer.nextInt();
        }
        try {
            Editorial ed = EJC.findEditorial(id);
            System.out.println("ID: " +  ed.getId() + " | Nombre: " + ed.getNombre());
            System.out.println("Que desea modificar | 1) ID | 2) Nombre | 3) Alta/Baja |Any Key) Cancelar");
            int opcion;
            try {
                opcion = leer.nextInt();
            } catch (Exception e){
                opcion = 3;
            }
            switch (opcion){
                case 1 -> {
                    int newID = id;
                    System.out.print("Nuevo ID: ");
                    do {
                        newID = leer.nextInt();
                        if (EJC.findEditorial(newID) != null){
                            System.out.print("ID ya existente, intente de nuevo: ");  
                        }
                    } while (EJC.findEditorial(newID) != null);
                    ed.setId(newID);
                    EJC.create(ed);
                    EJC.destroy(id);
                }
                case 2 -> {
                    System.out.print("Nuevo Nombre: ");
                    ed.setNombre(leer.next());
                    EJC.edit(ed);
                }
                case 3 -> {
                    EJC.edit(cambiarEstadoBaja(ed));
                }
                default -> {
                    System.out.println("Terminando...");
                }
            }
        
            System.out.println("Operacion Exitosa!");
        } catch (Exception ex) {
            System.out.println("Algo paso al tratar de modificar la editorial D:");
        }
    }
    
    public void mostrarEditoriales(){
        System.out.println("==== Editoriales ====");
        for (Editorial editorial : EJC.findEditorialEntities()) {
            if (editorial.isAlta()){
                System.out.println("ID: " + editorial.getId() + " | Nombre: " + editorial.getNombre());
            }
        }
        System.out.println("=====================\n");
    }
    
    public void mostrarEditorialesAll(){
        System.out.println("==== Editoriales ====");
        for (Editorial editorial : EJC.findEditorialEntities()) {
            System.out.println("ID: " + editorial.getId() + " | Alta: " + editorial.isAlta() + " | Nombre: " + editorial.getNombre());
        }
        System.out.println("=====================\n");
    }
    
    public void reorganizarIDs(){
        int c = 1;
        for (Editorial ed : EJC.findEditorialEntities()) {
            if (ed.getId() != c){
                int id = ed.getId();
                ed.setId(c);
                EJC.create(ed);
                try {
                    EJC.destroy(id);
                    System.out.println("Se han ordenado las IDs");
                } catch (NonexistentEntityException ex) {
                    System.out.println("Algo paso al reorganizar las IDs D:");
                }
            }
            c++;
        }
    }
    
    public void darDeBaja(Editorial editorial){
        if (editorial.isAlta()){
            editorial.setAlta(false);
            try {
                EJC.edit(editorial);
            } catch (Exception ex) {
                System.out.println("Algo paso al dar de Baja a la Editorial D:");
            }
        } else {
            System.out.println("La Editorial ya esta dada de Baja");
        }
    }
    
    public void darDeBaja(int id){
        if (EJC.findEditorial(id) != null && !EJC.findEditorial(id).isAlta()){
            Editorial ed = EJC.findEditorial(id);
            ed.setAlta(false);
            try {
                EJC.edit(ed);
            } catch (Exception ex) {
                System.out.println("Algo paso al dar de baja D:");
            }
        } else {
            System.out.println("No se encontro tal Editorial, o ya esta dada de Baja");
        }
    }
    
    public Editorial cambiarEstadoBaja(Editorial editorial){
        if (editorial.isAlta()){
            System.out.println("Se ha dado de baja a la Editorial");
            editorial.setAlta(false);
        } else {
            System.out.println("Se ha dado de alta a la Editorial");
            editorial.setAlta(true);
        }
        return editorial;
    }
    
    public List<Editorial> getEditoriales(){
        return EJC.findEditorialEntities();
    }
    
    public Editorial buscarEditorialID(int id){
        return EJC.findEditorial(id);
    }
    
    public void menuEditoriales(){
        System.out.println("==== Administrar Editoriales ==== \n1) Mostrar Editoriales | 2) Mostrar todas las Editoriales | 3) Nueva Editorial | 4) Modificar una Editorial | 5) Salir");
        switch(leer.nextInt()){
            case 1 -> {
                mostrarEditoriales();
            }
            case 2 -> {
                mostrarEditorialesAll();
            }
            case 3 -> {
                crearEditorial();
            }
            case 4 -> {
                modificarEditorial();
            }
            default -> {
                System.out.println("Saliendo...");
            }
        }
    }
}
