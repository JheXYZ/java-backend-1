/*
    Por cada Alojamiento Extrahotelero se indica si es privado o no, así como la
    cantidad de metros cuadrados que ocupa.
 */
package Entidades;
/**
 * @author JheX
*/
public class Extrahoteleros extends Alojamiento{
    protected boolean privado;
    protected double metrosCuadrados;

    public Extrahoteleros() {
    }

    public Extrahoteleros(boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    
}
