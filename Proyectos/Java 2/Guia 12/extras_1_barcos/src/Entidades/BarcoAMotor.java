/*
    Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
        • Potencia en CV para barcos a motor.
*/
package Entidades;

import java.time.LocalDate;

/**
 * @author JheX
*/
public class BarcoAMotor extends Barco{
    private int CV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int CV, String matricula, float eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.CV = CV;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }
    
    @Override
    public void crearBarco() {
        System.out.print("Matricula: ");
        super.setMatricula(leer.next());
        System.out.print("Eslora: ");
        super.setEslora(leer.nextFloat());
        System.out.print("Fecha del Fabricación: (dd/mm/aaaa): ");
        String fecha = leer.next();
        String[] partes = fecha.split("/");
        super.setAnioFabricacion(LocalDate.of(Integer.parseInt(partes[2]),Integer.parseInt(partes[1]),Integer.parseInt(partes[0])));
        System.out.print("Caballos Vapor: ");
        this.CV = leer.nextInt();
    }
    
    @Override
    public String toString() {
        return "[Matricula=" + super.getMatricula() + ", Eslora=" + super.getEslora() + ", Año de Fabricacion=" + super.getAnioFabricacion() 
                + ", Caballos Vapor=" + CV + ']';
    }
}
