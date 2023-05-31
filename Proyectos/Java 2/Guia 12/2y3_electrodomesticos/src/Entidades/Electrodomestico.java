/*
    Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
    consumo energético (letras entre A y F) y peso.
    Los constructores que se deben implementar son los siguientes:
        • Un constructor vacío.
        • Un constructor con todos los atributos pasados por parámetro.
    Los métodos a implementar son:
        • Métodos getters y setters de todos los atributos.
        • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
            sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
            objeto y no será visible.
        • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
            usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
            blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
            minúsculas. Este método se invocará al crear el objeto y no será visible.
        • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
            precio. Esta es la lista de precios:
 */
package Entidades;

import java.util.Scanner;

/**
 * @author JheX
*/

public class Electrodomestico {
    protected Scanner leer = new Scanner(System.in);
    private double precio = 1000, peso;
    private String color;
    private char consumoElectrico = 'F';

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, double peso, String color, char consumoElectrico) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumoElectrico = consumoElectrico;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(char consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    protected void comprobarConsumoEnergetico(char letra){
        if (letra >= 'A' && letra <= 'F'){
            this.consumoElectrico = letra;
        }
    }
    
    protected void comprobarColor(String color){
        switch (color.toLowerCase()){
            case "blanco", "negro", "rojo", "azul", "gris" -> this.color = color.toLowerCase();
            default -> this.color = "blanco";
        }
    }
    
    public void precioFinal(){
        switch (consumoElectrico){
            case 'A' -> this.precio += 1000;
            case 'B' -> this.precio += 800;
            case 'C' -> this.precio += 600;
            case 'D' -> this.precio += 500;
            case 'E' -> this.precio += 300;
            case 'F' -> this.precio += 100;
        }
        if (peso >= 1 && peso < 20) this.precio += 100; 
        else if (peso >= 20 && peso < 50) this.precio += 500;
        else if (peso >= 50 && peso < 80) this.precio += 800;
        else if (peso > 80) this.precio += 1000;
    }
    
    public void crearElectrodomestico(){
        System.out.print("Precio: ");
        this.precio = leer.nextDouble();
        System.out.print("Color: ");
        comprobarColor(leer.next());
        System.out.print("Consumo: ");
        comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0));
        do{
            System.out.print("Peso: ");
            this.peso = leer.nextDouble();
        } while (this.peso < 0);
        precioFinal();
    }

    @Override
    public String toString() {
        return "Precio=" + precio + ", Peso=" + peso + ", Color=" + color + ", ConsumoElectrico=" + consumoElectrico;
    }
    
}
