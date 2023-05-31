/*
    Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
    Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package Entidades;
/**
 * @author JheX
*/
public class Polideportivo extends Edificio{
    private String nombre, tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipo, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
