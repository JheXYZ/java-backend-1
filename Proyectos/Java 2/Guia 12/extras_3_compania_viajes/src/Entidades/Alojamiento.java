/*
    Los alojamientos se identifican por un nombre, una dirección,
    una localidad y un gerente encargado del lugar.
*/
package Entidades;
/**
 * @author JheX
*/
public abstract class Alojamiento {
    protected String nombre, direccion, localidad, gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Direccion=" + direccion + ", Localidad=" + localidad + ", Gerente=" + gerente;
    }
    
}
