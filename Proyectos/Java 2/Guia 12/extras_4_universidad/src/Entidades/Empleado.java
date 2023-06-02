/*
    Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
        incorporación a la facultad y qué número de despacho tienen asignado.
    • Reasignación de despacho a un empleado.
 */
package Entidades;
/**
 * @author JheX
*/
public class Empleado extends Persona{
    protected int anioIncorporacion, despacho;

    public Empleado() {
    }

    public Empleado(int anioIncorporacion, int despacho, String nombres, String apellidos, String estadoCivil, int numIdentificacion) {
        super(nombres, apellidos, estadoCivil, numIdentificacion);
        this.anioIncorporacion = anioIncorporacion;
        this.despacho = despacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int despacho) {
        this.despacho = despacho;
    }
    
    public void cambioDesacho(){
        System.out.print("Nuevo Despacho: ");
        this.despacho = leer.nextInt();
    }

    @Override
    public void crearPersona() {
        super.crearPersona(); 
        System.out.print("Año de Ingreso: ");
        anioIncorporacion = leer.nextInt();
        System.out.print("Despacho: ");
        despacho = leer.nextInt();
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Año Incorporacion=" + anioIncorporacion + ", Despacho=" + despacho + '}';
    }
    
    
}
