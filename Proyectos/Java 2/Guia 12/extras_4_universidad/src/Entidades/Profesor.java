/*
    • Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
        pertenecen (lenguajes, matemáticas, arquitectura, ...).
    • Cambio de departamento de un profesor.
 */
package Entidades;
/**
 * @author JheX
*/
public class Profesor extends Empleado{
    protected String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anioIncorporacion, int despacho, String nombres, String apellidos, String estadoCivil, int numIdentificacion) {
        super(anioIncorporacion, despacho, nombres, apellidos, estadoCivil, numIdentificacion);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void cambioDepartamento(){
        System.out.print("Nuevo Departamento: ");
        this.departamento = leer.next();
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.print("Departamento: ");
        departamento = leer.next();
    }
    
    
    @Override
    public String toString() {
        return "Profesor{" + super.toString() + ", Departamento=" + departamento + '}';
    }
    
}
