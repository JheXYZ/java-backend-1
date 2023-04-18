/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
/**
 * @author JheX
*/
public class Curso {
    private String nombre, turno, alumnos[] = new String[5];
    private int horasDiarias, diasSemanales;
    private float precioHora;

    public Curso() {
    }

    public Curso(String nombre, String turno, int horasDiarias, int diasSemanales, float precioHora) {
        this.nombre = nombre;
        this.turno = turno;
        this.horasDiarias = horasDiarias;
        this.diasSemanales = diasSemanales;
        this.precioHora = precioHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    public int getHorasDiarias() {
        return horasDiarias;
    }

    public void setHorasDiarias(int horasDiarias) {
        this.horasDiarias = horasDiarias;
    }

    public int getDiasSemanales() {
        return diasSemanales;
    }

    public void setDiasSemanales(int diasSemanales) {
        this.diasSemanales = diasSemanales;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }
}
