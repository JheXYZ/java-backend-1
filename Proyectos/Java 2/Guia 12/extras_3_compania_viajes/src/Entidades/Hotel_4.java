/*
    Hotel 4 estrellas: Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
    Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
    PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
    agregado por gimnasio) + (valor agregado por limosinas).
    Valor agregado por el restaurante:
        • $10 si la capacidad del restaurante es de menos de 30 personas.
        • $30 si está entre 30 y 50 personas.
        • $50 si es mayor de 50.
    Valor agregado por el gimnasio:
        • $50 si el tipo del gimnasio es A.
        • $30 si el tipo del gimnasio es B.
*/
package Entidades;
/**
 * @author JheX
*/
public class Hotel_4 extends Hotel{
    protected int capRestaurante;
    protected String nombreRestaurante;
    protected char Gimnasio;

    public Hotel_4() {
    }

    public Hotel_4(int capRestaurante, String nombreRestaurante, String Gimnasio, int habitaciones, int camas, int pisos, int precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.capRestaurante = capRestaurante;
        this.nombreRestaurante = nombreRestaurante;
        this.Gimnasio = Gimnasio.toUpperCase().charAt(0);
    }

    public char getGimnasio() {
        return Gimnasio;
    }

    public void setGimnasio(char Gimnasio) {
        this.Gimnasio = Gimnasio;
    }
 
    public int getCapRestaurante() {
        return capRestaurante;
    }

    public void setCapRestaurante(int capRestaurante) {
        this.capRestaurante = capRestaurante;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }
    
    public void calcPrecioHabitacion(){
        if (capRestaurante < 30){
            precioHabitacion += 10;
        } else if (capRestaurante >= 30 && capRestaurante < 50){
            precioHabitacion += 30;
        } else {
            precioHabitacion += 50;
        }
        if (Gimnasio == 'A'){
            precioHabitacion += 50;
        } else {
            precioHabitacion += 30;
        }
        precioHabitacion += 50 + (habitaciones * 3);
    }
    
    @Override
    public String toString() {
        return super.toString() + "capRestaurante=" + capRestaurante + ", nombreRestaurante=" + nombreRestaurante + ", Gimnasio=" + Gimnasio + '}';
    }
    
    
}
