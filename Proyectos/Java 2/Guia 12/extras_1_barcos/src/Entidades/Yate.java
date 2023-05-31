/*
    Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
        • Potencia en CV y número de camarotes para yates de lujo.
 */
package Entidades;

import java.time.LocalDate;

/**
 * @author JheX
*/
public final class Yate extends BarcoAMotor{
    private int camarotes;

    public Yate() {
    }

    public Yate(int camarotes, int CV, String matricula, float eslora, LocalDate anioFabricacion) {
        super(CV, matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
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
        super.setCV(leer.nextInt());
        System.out.print("Camarotes: ");
        this.camarotes = leer.nextInt(); 
    }
    
    @Override
    public String toString() {
        return "[Matricula=" + super.getMatricula() + ", Eslora=" + super.getEslora() + ", Año de Fabricacion=" + super.getAnioFabricacion() 
                + ", Caballos Vapor=" + super.getCV() + ", Camarotes=" + camarotes + ']';
    }
}
