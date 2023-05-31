/*
    Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
    Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
        • Número de mástiles para veleros.
        • Potencia en CV para barcos a motor.
        • Potencia en CV y número de camarotes para yates de lujo.
 */
package Entidades;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author JheX
*/
public class Barco{
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String matricula;
    private float eslora;
    private LocalDate anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, float eslora, LocalDate anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void crearBarco() {
        System.out.print("Matricula: ");
        this.matricula = leer.next();
        System.out.print("Eslora: ");
        this.eslora = leer.nextFloat();
        System.out.print("Fecha del Fabricación: (dd/mm/aaaa): ");
        String fecha = leer.next();
        String[] partes = fecha.split("/");
        this.anioFabricacion = LocalDate.of(Integer.parseInt(partes[2]),Integer.parseInt(partes[1]),Integer.parseInt(partes[0]));
    }

    @Override
    public String toString() {
        return "[Matricula=" + matricula + ", Eslora=" + eslora + ", Año de Fabricacion=" + anioFabricacion + ']';
    }
    
}
