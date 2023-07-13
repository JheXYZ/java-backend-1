/*
    Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
    Pisos, Precio de Habitaciones.
    El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
    agregado por gimnasio) + (valor agregado por limosinas).
*/
package Entidades;

/**
 * @author JheX
*/
public class Hotel extends Alojamiento{
    protected int habitaciones, camas, pisos, precioHabitacion;

    public Hotel() {
    }

    public Hotel(int habitaciones, int camas, int pisos, int precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precioHabitacion = precioHabitacion;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(int precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitaciones=" + habitaciones + ", Camas=" + camas + ", Pisos=" + pisos + ", PrecioHabitacion=" + precioHabitacion + " ";
    }
    
    
}
