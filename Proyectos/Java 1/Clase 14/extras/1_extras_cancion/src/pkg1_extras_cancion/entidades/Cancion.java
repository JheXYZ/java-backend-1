/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_extras_cancion.entidades;

public class Cancion {
    private String autor;
    private String titulo;

    public Cancion() {
    }

    public Cancion(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public void getAutor() {
        System.out.println("El autor es: " + autor);
    }

    public void getTitulo() {
        System.out.println("El titulo es: " + titulo);
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
