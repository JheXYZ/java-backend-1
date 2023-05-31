/*
    Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
    edificio tendrá como métodos:
        • Método calcularSuperficie(): calcula la superficie del edificio.
        • Método calcularVolumen(): calcula el volumen del edifico.
    Estos métodos serán abstractos y los implementarán las siguientes clases:
        • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
            Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
        • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
            por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
            los atributos del padre.
*/
package Entidades;
/**
 * @author JheX
*/
public abstract class Edificio {
    private double ancho, alto, largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    public double calcularSuperficie(){
        return ancho * largo;
    }
    
    public double calcularVolumen(){
        return ancho * largo * alto;
    }
    
}
