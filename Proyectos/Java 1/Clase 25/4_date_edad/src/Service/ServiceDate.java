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
package Service;

import java.util.Date;
import java.util.Scanner;

/**
 * @author JheX
*/
public class ServiceDate {
    Scanner leer = new Scanner(System.in);
    
    public Date fechaActual(){
        Date actual = new Date();
        return actual;
    }
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese el año, mes y día de nacimiento");
        Date fechaN = new Date(leer.nextInt()-1900,leer.nextInt()-1,leer.nextInt());
        return fechaN;
    }
    
    public int diferencia(Date actual, Date fechaN){
        return actual.getYear() - fechaN.getYear();
    }
}
