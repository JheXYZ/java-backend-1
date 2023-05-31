/*
    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
    multiplicando por 10 los metros de eslora).
    En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
    sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
    en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
    el número de camarotes.
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoAMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JheX
 */
public class ServiceAlquiler {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler nuevoAlquiler() {
        Alquiler alquiler = new Alquiler(); //Alquiler(String nombre, int DNI, int posAmarre, Calendar FechaAlquiler, Calendar FechaDevolucion, Barco barco, float precioAlquiler)
        System.out.print("===Nuevo Alquiler=== \nNombre del titular: ");
        alquiler.setNombre(leer.next());
        System.out.print("DNI: ");
        alquiler.setDNI(leer.nextInt());
        System.out.print("Posición del amarre: ");
        alquiler.setPosAmarre(leer.nextInt());
        System.out.print("Fecha del amarre: (dd/mm/aaaa): ");
        String fecha = leer.next();
        String partes[] = fecha.split("/");
        alquiler.setFechaAlquiler(LocalDate.of(Integer.parseInt(partes[2]), Integer.parseInt(partes[1]), Integer.parseInt(partes[0])));
        System.out.print("Fecha de devolucion (dd/mm/aaaa): ");
        fecha = leer.next();
        String partes2[] = fecha.split("/");
        alquiler.setFechaDevolucion(LocalDate.of(Integer.parseInt(partes2[2]), Integer.parseInt(partes2[1]), Integer.parseInt(partes2[0])));
        alquiler.setBarco(crearBarco());
        int dias = alquiler.getFechaAlquiler().until(alquiler.getFechaDevolucion()).getDays();

        alquiler.setPrecioAlquiler(dias * (alquiler.getBarco().getEslora() * 10));
        switch(alquiler.getBarco().getClass().getSimpleName()){
            case "Velero" -> {
                Velero velero = (Velero) alquiler.getBarco();
                alquiler.setPrecioAlquiler(alquiler.getPrecioAlquiler() * velero.getMastiles());
            }
            case "Yate" -> {
                Yate yate = (Yate) alquiler.getBarco();
                alquiler.setPrecioAlquiler(alquiler.getPrecioAlquiler() + yate.getCV() + (yate.getCamarotes() * 10));
            }
            case "BarcoAMotor" -> {
                BarcoAMotor barcoAMotor = (BarcoAMotor) alquiler.getBarco();
                alquiler.setPrecioAlquiler(alquiler.getPrecioAlquiler() + barcoAMotor.getCV());
            }
        }
        return alquiler;
    }

    private Barco crearBarco() {
        String tipo;
        Barco barco;
        do {
            System.out.println("¿Que tipo de barco es? (Barco, Velero, Barco a Motor, Yate): ");
            tipo = leer.next().toLowerCase();
        } while (!tipo.equals("barco") && !tipo.equals("velero") && !tipo.equals("barco a motor") && !tipo.equals("yate"));

        switch (tipo) {
            case "barco" ->
                barco = new Barco();
            case "velero" ->
                barco = new Velero();
            case "barco a motor" ->
                barco = new BarcoAMotor();
            case "yate" ->
                barco = new Yate();
            default ->
                barco = new Barco();
        }
        barco.crearBarco();
        return barco;
    }

    public void mostrarAlquileres(ArrayList<Alquiler> Puerto) {
        System.out.println("===Alquileres===");
        for (Alquiler alquiler : Puerto) {
            System.out.println(alquiler);
        }
    }

    public void eliminarAlquiler(ArrayList<Alquiler> Puerto) {
        System.out.println("¿Que alquiler quiere eliminar?");
        for (Alquiler alquiler : Puerto) {
            System.out.println("Posición: " + alquiler.getPosAmarre() + " | Dueño: " + alquiler.getNombre() + " | Matricula: " + alquiler.getBarco().getMatricula());
        }
        System.out.print("Elija la posición: ");
        int eliminar = leer.nextInt();
        boolean estaba = false;
        for (Alquiler alquiler : Puerto) {
            if (alquiler.getPosAmarre() == eliminar) {
                Puerto.remove(alquiler);
                System.out.println("Se ha eliminado el alquiler del barco: " + alquiler.getBarco().getMatricula());
                estaba = true;
                break;
            }
        }
        if (!estaba) System.out.println("No se encontro dicha posición"); 
    }
}
