/*
    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
    Título, Autor, Número de páginas, y un constructor con todos los atributos 
    pasados por parámetro y un constructor vacío. Crear un método para cargar un
    libro pidiendo los datos al usuario y luego informar mediante otro método el
    número de ISBN, el título, el autor del libro y el número de páginas.
 */
package pkg1_libros;

import java.util.Scanner;
import pkg1_libros.entidades.Libro;

public class Main {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro();
        llenar(libro1);
        mostrar(libro1);
    }
    
    public static void llenar(Libro libro) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("ISBN: ");
        libro.ISBN = leer.nextInt();
        System.out.print("Titulo: ");
        libro.Titulo = leer.next();
        System.out.print("Paginas: ");
        libro.Paginas = leer.nextInt();
        System.out.print("Autor: ");
        libro.Autor = leer.next();
    }
    
    public static void mostrar(Libro libro) {
        System.out.println("ISBN: " + libro.ISBN + "\nTitulo: " + libro.Titulo + "\nPaginas: " + libro.Paginas + "\nAutor: " + libro.Autor);
    }
}
