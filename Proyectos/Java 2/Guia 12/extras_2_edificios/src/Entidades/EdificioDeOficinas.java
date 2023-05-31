/*
    Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
    por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
    los atributos del padre.
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
    usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
    (suponiendo que en cada piso hay una oficina). 
        • Crear el método cantPersonas(), que muestre cuantas personas entrarían en un piso
            y cuantas en todo el edificio.
*/
package Entidades;
/**
 * @author JheX
*/
public class EdificioDeOficinas extends Edificio{
    private int cantOficinas, cantPersonXofi, cantPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int cantOficinas, int cantPersonXofi, int cantPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.cantOficinas = cantOficinas;
        this.cantPersonXofi = cantPersonXofi;
        this.cantPisos = cantPisos;
    }
    
    public int getCantoficinas() {
        return cantOficinas;
    }

    public void setCantoficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    public int getCantPersonXofi() {
        return cantPersonXofi;
    }

    public void setCantPersonXofi(int cantPersonXofi) {
        this.cantPersonXofi = cantPersonXofi;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }
    
    public void cantPersonas(){
        System.out.println("En un piso entran: " + (cantPersonXofi * cantOficinas) + "personas, y en el edificio: " + (cantPersonXofi * cantOficinas) * cantPisos);
    }
    
}
