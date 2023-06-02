/*
    • Sobre el personal de servicio, hay que conocer a qué sección están asignados
        (biblioteca, decanato, secretaría, ...).
    • Traslado de sección de un empleado del personal de servicio.
*/
package Entidades;
/**
 * @author JheX
*/
public class PersonalDeServicio extends Empleado{
    protected String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, int anioIncorporacion, int despacho, String nombres, String apellidos, String estadoCivil, int numIdentificacion) {
        super(anioIncorporacion, despacho, nombres, apellidos, estadoCivil, numIdentificacion);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    public void cambiarSeccion(){
        System.out.print("Nueva Seccion: ");
        this.seccion = leer.next();
    }

    @Override
    public void crearPersona() {
        super.crearPersona();
        System.out.print("Seccion: ");
        seccion = leer.next();
    }
    
    @Override
    public String toString() {
        return "PersonalDeServicio{" + super.toString() + ", Seccion=" + seccion + '}';
    }
            
}
