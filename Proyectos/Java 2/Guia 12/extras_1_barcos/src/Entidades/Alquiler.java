/*
    Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha de 
    alquiler, fecha de devolución, la posición del amarre y el barco que lo ocupará.
    
*/
package Entidades;

import java.time.LocalDate;

/**
 * @author JheX
*/
public final class Alquiler {
    private String nombre;
    private int DNI, posAmarre;
    private LocalDate FechaAlquiler, FechaDevolucion;
    private Barco barco;
    private float precioAlquiler;

    public Alquiler() {
    }

    public Alquiler(String nombre, int DNI, int posAmarre, LocalDate FechaAlquiler, LocalDate FechaDevolucion, Barco barco, float precioAlquiler) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.posAmarre = posAmarre;
        this.FechaAlquiler = FechaAlquiler;
        this.FechaDevolucion = FechaDevolucion;
        this.barco = barco;
        this.precioAlquiler = precioAlquiler;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public LocalDate getFechaAlquiler() {
        return FechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate FechaAlquiler) {
        this.FechaAlquiler = FechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate FechaDevolucion) {
        this.FechaDevolucion = FechaDevolucion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public float getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(float precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler de: " + nombre + ", DNI=" + DNI + ", Sitio del Amarre=" + posAmarre + ", FechaAlquiler=" + FechaAlquiler + ", FechaDevolucion=" + FechaDevolucion + ", Barco=" + barco + ", Precio del Alquiler=" + precioAlquiler;
    }
    
    
    
}
