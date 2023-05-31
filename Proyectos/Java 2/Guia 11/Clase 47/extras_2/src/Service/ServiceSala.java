/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Asiento;
import Entidades.Espectador;
import Entidades.Pelicula;
import Entidades.Sala;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author JheX
*/
public class ServiceSala {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Pelicula crearPelicula(){
        Pelicula peli = new Pelicula();
        //System.out.print("Ingrese el nombre de la pelicula: ");
        peli.setTitulo("Avengers: End Game"); //peli.setTitulo(leer.next());
        //System.out.print("Ingrese la duración (minutos): ");
        peli.setDuracion(120); //peli.setDuracion(leer.nextInt());
        //System.out.print("Ingrese la edad minima: ");
        peli.setEdadMin(12); //peli.setEdadMin(leer.nextInt());
        //System.out.print("Ingrese el nombre del Director: ");
        peli.setDirector("Hermanos Russo"); //peli.setDirector(leer.next());
        return peli;
    }
    
    public ArrayList<Espectador> ingresarEspectadores(){
        ArrayList<Espectador> espectadores = new ArrayList();
        for (int i = 1; i <= 48 ; i++) {
            Espectador espectador = new Espectador();
            espectador.setNombre("Espectador " + i);
            espectador.setEdad((int)(Math.random()*50 + 6));
            espectador.setDinero((int)(Math.ceil(Math.random()*1000 + 100)));
            espectadores.add(espectador);
        }
        return espectadores;
    }
    
    public void asignarAsientos(Sala sala){
        ArrayList<Asiento> asientos = new ArrayList();
        char letras [] = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 8 ; i > 0 ; i--) {
            for (int j = 0; j < 6; j++) {
                Asiento asiento = new Asiento(letras[j], i);
                asientos.add(asiento);
                //System.out.print(asiento.getNumero() + " " + asiento.getLetra() + " | ");
            }
            //System.out.println("");
        }
        Random asientoAzar = new Random();
        int noCumple = 0;
        for (Espectador espectador : sala.getEspectadores()){
            if (espectador.getDinero() >= sala.getPrecio() && espectador.getEdad() >= sala.getPelicula().getEdadMin()){
                int pos;
                do{
                    pos = asientoAzar.nextInt(asientos.size());
                } while (asientos.get(pos).getEspectador() != null);
                asientos.get(pos).setEspectador(espectador);
            } else {
                noCumple++;
            }
        }
        int cumple = 0;
        sala.setAsientos(asientos);
        for (Asiento asiento : sala.getAsientos()) {
            if (asiento.getEspectador() != null){
                System.out.println(asiento);
                cumple++;
            }
        }
        System.out.println("Hay " + noCumple + " que no cumplen y " + cumple + " que cumplen");
    }
    
    public Sala crearSala(){
        return new Sala(crearPelicula(), ingresarEspectadores(), 500);
    }
    
    public void mostrarAsientos(Sala sala) {
        ArrayList<Asiento> asientos = sala.getAsientos();
        int maxNumero = asientos.get(0).getNumero();
        int minNumero = asientos.get(asientos.size() - 1).getNumero();

        for (int num = maxNumero; num >= minNumero; num--) {
            for (char letra = 'A'; letra <= 'F'; letra++) {
                Asiento asiento = buscarAsiento(asientos, num, letra);
                if (asiento.getEspectador() != null) {
                    System.out.print(asiento.getNumero() + " " + asiento.getLetra() + " X | ");
                } else {
                    System.out.print(asiento.getNumero() + " " + asiento.getLetra() + "   | ");
                }
            }
            System.out.println();
        }
    }
    
    private Asiento buscarAsiento(ArrayList<Asiento> asientos, int numero, char letra) {
        for (Asiento asiento : asientos) {
            if (asiento.getNumero() == numero && asiento.getLetra() == letra) {
                return asiento;
            }
        }
        return null;
    }
    
}
