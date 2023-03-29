/*
    Declarar una clase llamada Circunferencia que tenga como atributo privado el
    radio de tipo real. A continuación, se deben crear los siguientes métodos:
        Método constructor que inicialice el radio pasado como parámetro.
        Métodos get y set para el atributo radio de la clase Circunferencia.
        Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
        Método area(): para calcular el área de la circunferencia (Area=π*radio²).
        Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package pkg2_circunferencia.entidades;

public class Circunferencia {
    private double radio;
    private double area;
    private double perimetro;
    
    public double getRadio() {
        return radio;
    }
    
    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double x) {
        area = Math.PI * Math.pow(radio, 2);
    }

    public void setPerimetro(double x) {
        perimetro = 2 * Math.PI * radio;
    }
    
}
