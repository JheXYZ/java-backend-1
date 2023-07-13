/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Libro;
import Persistence.LibroJpaController;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JheX
 */
public class LibroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final LibroJpaController LJC = new LibroJpaController();
    private final AutorService AS = new AutorService();
    private final EditorialService ES = new EditorialService();

    public void crearLibro() {
        Libro libro = new Libro();
        //Libro(long isbn, String titulo, int anio, int ejemplares, int ejemplaresPrestados, int ejemplaresRestantes, Autor autor, Editorial editorial)
        libro.setIsbn((long) (Math.random() * 100000000000l));
        System.out.println("==== Crear Libro ====");
        System.out.print("ISBN: " + libro.getIsbn() + "\nTitulo: ");
        libro.setTitulo(leer.next());
        System.out.print("Año: ");
        libro.setAnio(leer.nextInt());
        System.out.print("Ejemplares: ");
        libro.setEjemplares(leer.nextInt());
        libro.setEjemplaresPrestados(0);
        libro.setEjemplaresRestantes(libro.getEjemplares());
//        System.out.print("Ejemplares Prestados: ");
//        libro.setEjemplaresPrestados(leer.nextInt());
//        System.out.print("Ejemplares Restantes: ");
//        libro.setEjemplaresRestantes(leer.nextInt());
//        libro.setEjemplares(libro.getEjemplaresPrestados() + libro.getEjemplaresRestantes());

        if (!AS.getAutores().isEmpty()) {
            AS.mostrarAutores();
            System.out.print("Autor (ID): ");
            int id = leer.nextInt();
            while (libro.getAutor() == null) {
                if (AS.buscarAutorID(id) != null){
                    libro.setAutor(AS.buscarAutorID(id));
                    System.out.println("Autor Asignado");
                }
                if (libro.getAutor() == null) {
                    System.out.print("No se encontro tal ID, intente de nuevo: ");
                    id = leer.nextInt();
                }
            }
        } else {
            System.out.println("No hay ningún Autor");
        }

        if (!ES.getEditoriales().isEmpty()) {
            ES.mostrarEditoriales();
            System.out.print("Editorial (ID): ");
            int id = leer.nextInt();
            while (libro.getEditorial() == null) {
                if (ES.buscarEditorialID(id) != null){
                    libro.setEditorial(ES.buscarEditorialID(id));
                    System.out.println("Editorial Asignada");
                }
                if (libro.getEditorial() == null) {
                    System.out.print("No se encontro tal ID, intente de nuevo: ");
                    id = leer.nextInt();
                }
            }
        } else {
            System.out.println("No hay ningúna Editorial");
        }
        try {
            LJC.create(libro);
            System.out.println("Se ha añadido el libro correctamente");
        } catch (Exception ex) {
            System.out.println("No se pudo crear el libro D:");
            Logger.getLogger(LibroService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearLibro(Libro libro) {
        try {
            if (LJC.findLibro(libro.getIsbn()) == null) {
                LJC.create(libro);
            } else {
                System.out.println("Ya existe un libro con tal ISBN");
            }
        } catch (Exception ex) {
            System.out.println("Algo paso al crear el libro");
        }
    }

    public void modificarLibro() {
        mostrarLibrosAll();
        System.out.print("Modificar Libro | ISBN: ");
        long id = leer.nextLong();
        while (LJC.findLibro(id) == null) {
            System.out.print("No se encotro tal ID, intente de nuevo: ");
            id = leer.nextLong();
        }
        try {
            Libro libro = LJC.findLibro(id);
            System.out.println("ID: " + libro.getIsbn() + " | Nombre: " + libro.getTitulo());
            System.out.println("Que desea modificar | 1) ISBN | 2) Titulo | 3) Año | 4) Ejemplares | 5) Autor | 6) Editorial | 7) Alta/Baja | 8) Eliminar | Any Key) Cancelar");
            int opcion;
            try {
                opcion = leer.nextInt();
            } catch (Exception e) {
                opcion = 8;
            }
            switch (opcion) {
                case 1 -> {
                    long newID = id;
                    System.out.print("Nuevo ISBN: ");
                    do {
                        newID = leer.nextLong();
                        if (LJC.findLibro(newID) != null) {
                            System.out.print("ISBN ya existente, intente de nuevo: ");
                        }
                    } while (LJC.findLibro(newID) != null);
                    libro.setIsbn(newID);
                    LJC.create(libro);
                    LJC.destroy(id);
                }
                case 2 -> {
                    System.out.print("Nuevo Titulo: ");
                    libro.setTitulo(leer.next());
                    LJC.edit(libro);
                }
                case 3 -> {
                    System.out.print("Nuevo Año: ");
                    libro.setAnio(leer.nextInt());
                    LJC.edit(libro);
                }
                case 4 -> {
                    LJC.edit(cambiarEjemplares(libro));
                }
                case 5 -> {
                    LJC.edit(cambiarAutor(libro));
                }
                case 6 -> {
                    LJC.edit(cambiarEditorial(libro));
                }
                case 7 -> {
                    LJC.edit(cambiarEstadoBaja(libro));
                }
                default -> {
                    System.out.println("No se hicieron cambios...");
                }
            }
            System.out.println("Operacion Exitosa!");
        } catch (Exception ex) {
            System.out.println("Algo paso al tratar de modificar el libro D:");
            System.out.println(ex.getMessage());
        }
    }

    private Libro cambiarEjemplares(Libro libro) {
        System.out.println("1) Ejemplares Restantes | 2) Ejemplares Prestados | Any Key) Cancelar");
        int opcion;
        try {
            opcion = leer.nextInt();
        } catch (Exception e){
            opcion = 7;
        }
        switch (opcion) {
            case 1 -> {
                System.out.print("Nuevo Número de Ejemplares Restantes: ");
                do {
                    try {
                        if (libro.getEjemplaresRestantes() < 0) {
                            System.out.print("No puede haber números negativos, intente de nuevo: ");
                        }
                        libro.setEjemplaresRestantes(leer.nextInt());
                    } catch (Exception e) {
                        System.out.print("Número invalido, intente de nuevo: ");
                    }
                } while (libro.getEjemplaresRestantes() < 0);
                libro.setEjemplares(libro.getEjemplaresPrestados() + libro.getEjemplaresRestantes());
            }
            case 2 -> {
                System.out.print("Nuevo Número de Ejemplares Prestados: ");
                do {
                    try {
                        if (libro.getEjemplaresPrestados() < 0) {
                            System.out.print("No puede haber números negativos, intente de nuevo: ");
                        }
                        libro.setEjemplaresPrestados(leer.nextInt());
                    } catch (Exception e) {
                        System.out.print("Número invalido, intente de nuevo: ");
                    }
                } while (libro.getEjemplaresPrestados() < 0);
                libro.setEjemplares(libro.getEjemplaresPrestados() + libro.getEjemplaresRestantes());
            }
            default -> {
                System.out.println("No se hicieron cambios...");
            }
        }
        return libro;
    }

    private Libro cambiarAutor(Libro libro) {
        if (!AS.getAutores().isEmpty()) {
            AS.mostrarAutores();
            System.out.print("ID del Nuevo Autor: ");
            int idAutor = leer.nextInt();
            boolean existe = false;
            while (!existe){
                if (AS.buscarAutorID(idAutor) != null){
                    libro.setAutor(AS.buscarAutorID(idAutor));
                    existe = true;
                    System.out.println("Se cambio de Autor correctamente");
                }
                if (!existe){
                    System.out.print("No se encontro tal ID, intente de nuevo: ");
                    idAutor = leer.nextInt();
                }
            }
        } else {
            System.out.println("No hay autores.");
        }
        return libro;
    }

    private Libro cambiarEditorial(Libro libro) {
        if (!ES.getEditoriales().isEmpty()) {
            ES.mostrarEditoriales();
            System.out.print("ID de la Nueva Editorial: ");
            int idEdit = leer.nextInt();
            boolean existe = false;
            while (!existe){
                if (ES.buscarEditorialID(idEdit) != null){
                    libro.setEditorial(ES.buscarEditorialID(idEdit));
                    existe = true;
                }
                if (!existe){
                    System.out.print("No se encontro tal ID, intente de nuevo: ");
                    idEdit = leer.nextInt();
                }
            }
        } else {
            System.out.println("No hay editoriales.");
        }
        return libro;
    }

    public void darDeBaja(Libro libro) {
        libro.setAlta(false);
        try {
            LJC.edit(libro);
        } catch (Exception ex) {
            Logger.getLogger(LibroService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Algo paso al dar de Baja D:");
        }
    }

    public void darDeBaja(long id) {
        if (LJC.findLibro(id) != null && LJC.findLibro(id).isAlta()) {
            Libro libro = LJC.findLibro(id);
            libro.setAlta(false);
            try {
                LJC.edit(libro);
            } catch (Exception ex) {
                System.out.println("Algo paso al dar de Baja D:");
                Logger.getLogger(LibroService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("No se encontro tal ID de libro o ya esta dado de BAJA");
        }
    }

    public void darDeAlta(long id) {
        if (LJC.findLibro(id) != null && !LJC.findLibro(id).isAlta()) {
            Libro libro = LJC.findLibro(id);
            libro.setAlta(true);
            try {
                LJC.edit(libro);
            } catch (Exception ex) {
                System.out.println("Algo paso al dar de Alta D:");
                Logger.getLogger(LibroService.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("No se encontro tal ID de libro o ya esta de ALTA");
        }
    }
    
    private Libro cambiarEstadoBaja(Libro libro){
        if (libro.isAlta()){
            libro.setAlta(false);
            System.out.println("Se ha dado de baja al libro");
        } else {
            libro.setAlta(true);
            System.out.println("Se ha dado de alta al libro");
        }
        return libro;
    }

    public void mostrarLibros() {
        System.out.println("==== Libros ====");
        for (Libro libro : LJC.findLibroEntities()) {
            if (libro.isAlta()){
                System.out.println(libro);
            }
        }
        System.out.println("================\n");
    }
    
    public void mostrarLibrosAll() {
        System.out.println("==== Libros ====");
        for (Libro libro : LJC.findLibroEntities()) {
            System.out.println(libro);
        }
        System.out.println("================\n");
    }
    
    public List<Libro> getLibros(){
        return LJC.findLibroEntities();
    }
    
    public Libro actualizarLibro(Libro libro){
        try {
            LJC.edit(libro);
        } catch (Exception ex) {
            System.out.println("Algo paso al modificar el libro D:");
        }
        return LJC.findLibro(libro.getIsbn());
    }
    
    public boolean checkDisponibilidad(Libro libro, int cantidad){
        return libro.getEjemplaresRestantes() - cantidad >= 0;
    }
    
    public boolean checkDevolver(Libro libro, int cantidad){
        return libro.getEjemplaresPrestados() - cantidad >= 0;
    }
    
    public Libro prestarLibro(Libro libro, int cantidad){
        try {
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - cantidad);
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + cantidad);
            LJC.edit(libro);
        } catch (Exception ex) {
            System.out.println("Algo paso al prestar el libro D:");
        }
        return libro;
    }
    
    public void devolverLibro(Libro libro, int cantidad){  
        try {
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - cantidad);
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + cantidad);
            LJC.edit(libro);
        } catch (Exception ex) {
            System.out.println("Algo paso al devolver el libro D: ServiceLibro");
        }
    }
    
    public void eliminarLibro(long id){
        try {
            LJC.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.out.println("Algo paso al eliminar el libro");
        }
    }
    
    public Libro buscarPorTitulo(String titulo){
        for (Libro libro : LJC.findLibroEntities()) {
            if (libro.getTitulo().equals(titulo)){
                return libro;
            }
        }
        return null;
    }
    
    public Libro buscarPorID(long isbn){
        return LJC.findLibro(isbn);
    }
    
    public void menuLibros(){
        System.out.println("==== Administrar Libros ==== \n1) Mostrar Libros | 2) Mostrar Todos los Libros | 3) Añadir un Libro | 4) Modificar un Libro | 5) Salir");
        switch(leer.nextInt()){
            case 1 -> {
                mostrarLibros();
            }
            case 2 -> {
                mostrarLibrosAll();
            }
            case 3 -> {
                crearLibro();
            }
            case 4 -> {
                modificarLibro();
            }
            default -> {
                System.out.println("Saliendo...");
            }
        }
    }
}

