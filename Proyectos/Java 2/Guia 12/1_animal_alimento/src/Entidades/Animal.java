/*
    La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
*/
package Entidades;
/**
 * @author JheX
*/
public class Animal {
    private String nombre, alimento, raza;
    private int edad;

    public Animal() {
    }

    public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void Alimentarse(){
        System.out.println(nombre + " come: " + alimento);
    }
}
