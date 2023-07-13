/*
    Hotel 5 estrellas: Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
    Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
    Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
    agregado por gimnasio) + (valor agregado por limosinas).
 */
package Entidades;
/**
 * @author JheX
*/
public final class Hotel_5 extends Hotel_4{
    private int cantSalonConferencia, cantSuites, cantLimosinas;

    public Hotel_5() {
    }

    public Hotel_5(int cantSalonConferencia, int cantSuites, int cantLimosinas, int capRestaurante, String nombreRestaurante, String Gimnasio, int habitaciones, int camas, int pisos, int precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(capRestaurante, nombreRestaurante, Gimnasio, habitaciones, camas, pisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantSalonConferencia = cantSalonConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalonConferencia() {
        return cantSalonConferencia;
    }

    public void setCantSalonConferencia(int cantSalonConferencia) {
        this.cantSalonConferencia = cantSalonConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }
    
    @Override
    public void calcPrecioHabitacion(){
        super.calcPrecioHabitacion();
        precioHabitacion =+ cantLimosinas * 15;
    }

    @Override
    public String toString() {
        return super.toString() + "cantSalonConferencia=" + cantSalonConferencia + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }
    
}
