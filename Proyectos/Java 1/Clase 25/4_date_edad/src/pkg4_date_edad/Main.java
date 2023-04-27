/*
    Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService,
    en paquete Servicios, que tenga los siguientes métodos:
        -Método fechaNacimiento que pregunte al usuario día, mes y año de su 
            nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El
            método debe retornar el objeto Date. 
            Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
        -Método fechaActual que cree un objeto fecha con el día actual. Para esto 
            usaremos el constructor vacío de la clase Date. 
            Ejemplo: Date fechaActual = new  Date();
            El método debe retornar el objeto Date.
        -Método diferencia que reciba las dos fechas por parámetro y retorna la 
            diferencia de años entre una y otra (edad del usuario).
    Si necesiten acá tienen más información en clase Date: Documentacion Oracle
*/
package pkg4_date_edad;

import Service.ServiceDate;
import java.util.Date;

/**
 * @author JheX
*/
public class Main {
    public static void main(String[] args) {
        ServiceDate SD = new ServiceDate();
        
        Date nacimiento = SD.fechaNacimiento();
        System.out.println("Edad actual: " + SD.diferencia(SD.fechaActual(), nacimiento));
    }
}
