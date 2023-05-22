/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
/**
 * @author JheX
*/
public class Libro {
    String titulo, autor;
    int ejemplares, ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Libro(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }
    
    public boolean prestarLibro(String libro, int cantidad){
        if (ejemplaresPrestados + cantidad <= ejemplares){
            ejemplaresPrestados += cantidad;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean devolverLibro(String libro, int cantidad){
        if (ejemplaresPrestados - cantidad >= 0){
            ejemplaresPrestados -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Titulo=" + titulo + ", Autor=" + autor + ", Ejemplares=" + ejemplares + ", EjemplaresPrestados=" + ejemplaresPrestados + ", Disponibles: " + (ejemplares-ejemplaresPrestados);
    }
    
    
}
