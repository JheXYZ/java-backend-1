/*
    Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
        • Número de mástiles para veleros.
 */
package Entidades;

import java.time.LocalDate;


/**
 * @author JheX
*/
public final class Velero extends Barco{
    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, String matricula, float eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
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
        System.out.print("Mastiles: ");
        this.mastiles = leer.nextInt();
    }
    
    @Override
    public String toString() {
        return "[Matricula=" + super.getMatricula() + ", Eslora=" + super.getEslora() + ", Año de Fabricacion=" + super.getAnioFabricacion() 
                + ", Mastiles=" + mastiles + ']';
    }
}
