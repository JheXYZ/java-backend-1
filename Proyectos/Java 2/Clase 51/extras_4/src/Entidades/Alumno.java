/*
    El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:
    nombre completo, DNI y cantidad de votos.
*/
package Entidades;
/**
 * @author JheX
*/
public class Alumno {
    private String nombreCompleto;
    private int DNI, votos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, int DNI) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
    }
    
    public Alumno(String nombreCompleto, int DNI, int votos) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.votos = votos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
}
