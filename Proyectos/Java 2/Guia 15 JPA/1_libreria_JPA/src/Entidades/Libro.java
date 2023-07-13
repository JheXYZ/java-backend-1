/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author JheX
 */
@Entity
public class Libro implements Serializable {
    @Id
    private long isbn;

    @Basic
    private String titulo = null;
    private int anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes;
    private boolean alta = true;

    @ManyToOne
    private Autor autor = null;

    @ManyToOne
    private Editorial editorial = null;

    public Libro() {
    }

    public Libro(long isbn, String titulo, int anio, int ejemplares, int ejemplaresPrestados, int ejemplaresRestantes, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
        this.ejemplaresRestantes = ejemplaresRestantes;
        this.autor = autor;
        this.editorial = editorial;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
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

    public int getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(int ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        if (getEditorial() != null && getAutor() != null) {
            return "ISBN: " + isbn + " | Alta: " + alta + " | Titulo: " + titulo + " | Año=" + anio + " | Ejemplares=" + ejemplares + " | Ejemplares Prestados=" + ejemplaresPrestados + " | Ejemplares Restantes=" + ejemplaresRestantes + " | Autor: [ID:" + autor.getId() + ", Nombre: " + autor.getNombre() + "] | Editorial: [ID:" + editorial.getId() + ", Nombre: " + editorial.getNombre() + ']';
        } else if (getEditorial() != null && getAutor() == null) {
            return "ISBN: " + isbn + " | Alta: " + alta + " | Titulo: " + titulo + " | Año=" + anio + " | Ejemplares=" + ejemplares + " | Ejemplares Prestados=" + ejemplaresPrestados + " | Ejemplares Restantes=" + ejemplaresRestantes + " | Autor: null | Editorial: [ID:" + editorial.getId() + ", Nombre: " + editorial.getNombre() + ']';
        } else if (getEditorial() == null && getAutor() != null) {
            return "ISBN: " + isbn + " | Alta: " + alta + " | Titulo: " + titulo + " | Año=" + anio + " | Ejemplares=" + ejemplares + " | Ejemplares Prestados=" + ejemplaresPrestados + " | Ejemplares Restantes=" + ejemplaresRestantes + " | Autor: [ID:" + autor.getId() + ", Nombre: " + autor.getNombre() + "] | Editorial: null";
        } else {
            return "ISBN: " + isbn + " | Alta: " + alta + " | Titulo: " + titulo + " | Año=" + anio + " | Ejemplares=" + ejemplares + " | Ejemplares Prestados=" + ejemplaresPrestados + " | Ejemplares Restantes=" + ejemplaresRestantes + " | Autor: null | Editorial: null";
        }
    }

}
