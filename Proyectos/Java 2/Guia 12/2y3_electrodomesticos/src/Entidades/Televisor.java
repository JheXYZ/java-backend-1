/*
    Se debe crear también una subclase llamada Televisor con los siguientes atributos:
    resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
    heredados.
    Los constructores que se implementarán serán:
        • Un constructor vacío.
        • Un constructor con la resolución, sintonizador TDT y el resto de los atributos
            heredados. Recuerda que debes llamar al constructor de la clase padre.
    Los métodos que se implementara serán:
        • Método get y set de los atributos resolución y sintonizador TDT.
        • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
            padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
            los atributos del televisor.
        • Método precioFinal(): este método será heredado y se le sumará la siguiente
            funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
            incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
            $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
            también deben afectar al precio.
*/
package Entidades;

/**
 * @author JheX
 */
public class Televisor extends Electrodomestico{
    private float tamanioPantalla;
    private boolean DTV;

    public Televisor() {
    }
    
    public Televisor(float tamanioPantalla, boolean DTV, double precio, double peso, String color, char consumoElectrico) {
        super(precio, peso, color, consumoElectrico);
        this.tamanioPantalla = tamanioPantalla;
        this.DTV = DTV;
    }

    public float getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(float tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public boolean isDTV() {
        return DTV;
    }

    public void setDTV(boolean DTV) {
        this.DTV = DTV;
    }
    
    @Override
    public void crearElectrodomestico() {
        System.out.print("Precio: ");
        setPrecio(leer.nextDouble());
        System.out.print("Color: ");
        comprobarColor(leer.next());
        System.out.print("Consumo: ");
        comprobarConsumoEnergetico(leer.next().toUpperCase().charAt(0));
        do{
            System.out.print("Peso: ");
            setPeso(leer.nextDouble());
        } while (getPeso() < 0);
        System.out.println("==Televisor==");
        System.out.print("Tamaño: ");
        this.tamanioPantalla = leer.nextFloat();
        System.out.print("¿Posee DTV? (S/N): ");
        this.DTV = leer.next().toUpperCase().charAt(0) == 'S';
        precioFinal();
    }
    @Override
    public void precioFinal() {
        switch (getConsumoElectrico()){
            case 'A' -> setPrecio(getPrecio() + 1000);
            case 'B' -> setPrecio(getPrecio() + 800);
            case 'C' -> setPrecio(getPrecio() + 600);
            case 'D' -> setPrecio(getPrecio() + 500);
            case 'E' -> setPrecio(getPrecio() + 300);
            case 'F' -> setPrecio(getPrecio() + 100);
        }
        if (getPeso() >= 1 && getPeso() < 20) setPrecio(getPrecio() + 100); 
        else if (getPeso() >= 20 && getPeso() < 50) setPrecio(getPrecio() + 500);
        else if (getPeso() >= 50 && getPeso() < 80) setPrecio(getPrecio() + 800);
        else if (getPeso() > 80) setPrecio(getPrecio() + 1000);
        if (this.tamanioPantalla > 40) this.setPrecio(this.getPrecio() * 1.3);
        if (this.DTV) this.setPrecio(this.getPrecio() + 500);
    }

    @Override
    public String toString() {
        return "Televisor{"+ super.toString() + ", TamanioPantalla=" + tamanioPantalla + ", DTV=" + DTV + '}';
    }

}
