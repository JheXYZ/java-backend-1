/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
/**
 * @author JheX
*/
public class Persona {
    private String nombre, apellido;
    private int edad, documento;
    private Perro perro;
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, Perro perro, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.perro = perro;
        this.edad = edad;
        this.documento = documento;
    }
    
    public Persona(String nombre, String apellido,int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
    
    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad + ", Documento=" + documento + ", Perro=" + perro;
    }
    
}
