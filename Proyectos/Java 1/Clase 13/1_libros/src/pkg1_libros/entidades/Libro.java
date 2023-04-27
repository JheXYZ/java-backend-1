/*
    Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
    Título, Autor, Número de páginas, y un constructor con todos los atributos 
    pasados por parámetro y un constructor vacío. Crear un método para cargar un
    libro pidiendo los datos al usuario y luego informar mediante otro método el
    número de ISBN, el título, el autor del libro y el número de páginas.
 */

package pkg1_libros.entidades;

public class Libro {
    public int ISBN;
    public String Autor;
    public int Paginas;
    public String Titulo;
    
    public Libro(){}
    
    
    
    public Libro(int ISBN, String Autor, int paginas, String titulo) {
        this.ISBN = ISBN;
        this.Autor = Autor;
        this.Paginas = paginas;
        this.Titulo = titulo;
    }
    
}
