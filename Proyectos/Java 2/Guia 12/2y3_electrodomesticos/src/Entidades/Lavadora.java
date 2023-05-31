/*
    A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
    además de los atributos heredados.
    Los constructores que se implementarán serán:
        • Un constructor vacío.
        • Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
            llamar al constructor de la clase padre.
    Los métodos que se implementara serán:
        • Método get y set del atributo carga.
        • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
            padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
            el atributo propio de la lavadora.
        • Método precioFinal(): este método será heredado y se le sumará la siguiente
            funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
            carga es menor o igual, no se incrementará el precio. Este método debe llamar al
            método padre y añadir el código necesario. Recuerda que las condiciones que hemos
            visto en la clase Electrodoméstico también deben afectar al precio.
*/
package Entidades;
/**
 * @author JheX
*/
public class Lavadora extends Electrodomestico{
    private float carga;

    public Lavadora() {
    }

    public Lavadora(float carga, double precio, double peso, String color, char consumoElectrico) {
        super(precio, peso, color, consumoElectrico);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
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
        System.out.println("==Lavadora==");
        System.out.print("Carga: ");
        this.carga = leer.nextFloat();
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
        if (carga > 30) setPrecio(getPrecio() + 500);
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + ", Carga=" + carga + '}';
    }
    
}
