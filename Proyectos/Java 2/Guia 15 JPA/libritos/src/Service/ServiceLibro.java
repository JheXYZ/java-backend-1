/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persitance.LibroJpaController;
import Persitance.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JheX
 */
public class ServiceLibro {
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private LibroJpaController LJC = new LibroJpaController();
    
    public void crearLibro(Libro libro){
        try {
            LJC.create(libro);
        } catch (Exception ex) {
            System.out.println("Algo paso al crear el libro");
        }
    }
    
    public void crearLibro(List<Autor> autores, List<Editorial> editoriales){
        Libro libro = new Libro(); //Libro(long isbn, String titulo, int anio, int ejemplares, int ejemplaresPrestados, int ejemplaresRestantes, boolean alta, Autor autor, Editorial editorial)
        libro.setIsbn((long)(Math.random()*100000000000l));
        System.out.print("ISBN: " + libro.getIsbn() + "\nTitulo: ");
        libro.setTitulo(leer.next());
        System.out.print("Año: ");
        libro.setAnio(leer.nextInt());
        System.out.print("Ejemplares Prestados: ");
        libro.setEjemplaresPrestados(leer.nextInt());
        System.out.print("Ejemplares Restantes: ");
        libro.setEjemplaresRestantes(leer.nextInt());
        libro.setEjemplares(libro.getEjemplaresPrestados() + libro.getEjemplaresRestantes());
        
        if (!autores.isEmpty()){
            for (Autor autor : autores) {
                System.out.println("ID: " + autor.getId() + " | Nombre: " + autor.getNombre());
            }
            int id = leer.nextInt();
            while(libro.getAutor() == null){
                for (Autor autor : autores) {
                    if (autor.getId() == id){
                        libro.setAutor(autor);
                        break;
                    }
                }
                if (libro.getAutor() == null){
                    System.out.print("No se encontro tal ID del autor, intente de nuevo: ");
                    id = leer.nextInt();
                }
            }
        } else {
            System.out.println("No hay ningun autor");
            libro.setAutor(null);
        }
        
        if (!editoriales.isEmpty()){
            for (Editorial editorial : editoriales) {
                System.out.println("ID: " + editorial.getId() + " | Nombre: " + editorial.getNombre());
            }
            int id = leer.nextInt();
            while(libro.getEditorial() == null){
                for (Editorial editorial : editoriales) {
                    if (editorial.getId() == id){
                        libro.setEditorial(editorial);
                        break;
                    }
                }
                if (libro.getEditorial() == null){
                    System.out.print("No se encontro tal ID de editorial, intente de nuevo: ");
                    id = leer.nextInt();
                }
            }
        } else {
            System.out.println("No hay ninguna editorial");
            libro.setEditorial(null);
        }
        try {
            LJC.create(libro);
        } catch (Exception ex) {
            System.out.println("Algo paso al crear el libro");
        }
        
    }
    
    public void eliminarLibro(long id){
        if (LJC.findLibro(id) != null){
            try {
                LJC.destroy(id);
            } catch (NonexistentEntityException ex) {
                System.out.println("Algo paso al eliminar el libro");
            }
        }
    }
    
    public void darDeBaja(long id){
        Libro libro = LJC.findLibro(id);
        if (libro != null && libro.isAlta()){
            libro.setAlta(false);
            try {
                LJC.edit(libro);
            } catch (Exception ex) {
                System.out.println("Algo paso al darle de baja al libro");
            }
        } else {
            System.out.println("No se encontro el libro, o ya esta dado de baja");
        }
    }
    
    public void darDeAlta(long id){
        Libro libro = LJC.findLibro(id);
        if (libro != null && !libro.isAlta()){
            libro.setAlta(true);
            try {
                LJC.edit(libro);
            } catch (Exception ex) {
                System.out.println("Algo paso al darle de alta al libro");
            }
        } else {
            System.out.println("No se encontro el libro, o ya esta dado de alta");
        }
    }
    
    public void mostrar(){
        List<Libro> libros = LJC.findLibroEntities();
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
