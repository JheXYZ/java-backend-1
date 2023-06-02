/*
   • Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
        identificación y su estado civil.
   El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
   continuación, debe programar las clases definidas en las que, además de los constructores,
   hay que desarrollar los métodos correspondientes a las siguientes operaciones:
    • Cambio del estado civil de una persona.
    • Cambio de departamento de un profesor.
    • Traslado de sección de un empleado del personal de servicio.
    • Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
        que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
*/
package Entidades;

import java.util.Scanner;

/**
 * @author JheX
*/
public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombres, apellidos, estadoCivil;
    protected int numIdentificacion;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, String estadoCivil, int numIdentificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.estadoCivil = estadoCivil;
        this.numIdentificacion = numIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(int numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }
    
    public void cambioEstadoCivil(){
        System.out.print("Nuevo Estado Civil: ");
        this.estadoCivil = leer.next();
    }
    
    public void crearPersona(){
        System.out.print("Nombre: ");
        nombres = leer.next();
        System.out.print("Apellido: ");
        apellidos = leer.next();
        System.out.print("Estado Civil: ");
        estadoCivil = leer.next();
        System.out.print("Número Identificacion: ");
        numIdentificacion = leer.nextInt();
    }
    
    @Override
    public String toString() {
        return "Nombres=" + nombres + ", Apellidos=" + apellidos + ", EstadoCivil=" + estadoCivil + ", N° Identificacion=" + numIdentificacion;
    }
    
    
}
