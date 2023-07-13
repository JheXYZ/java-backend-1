/*
    Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
        • todos los alojamientos.
        • todos los hoteles de más caro a más barato.
        • todos los campings con restaurante
        • todos las residencias que tienen descuento.
*/
package extras_3_compania_viajes;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Hotel_4;
import Entidades.Hotel_5;
import Entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author JheX
*/
public class Extras_3_compania_viajes {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alojamiento> Alojamientos = new ArrayList();
        //Hotel_4(int capRestaurante, String nombreRestaurante, String Gimnasio, int habitaciones, int camas, int pisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente)
        Hotel_4 hotel4 = new Hotel_4(41, "Restaurante don Juan", "A", 23, 69, 4, 0, "Hoteleria Mar del Plata", "Mitre 912", "Mar del Plata", "Rigoberto"); 
        Hotel_4 hotel4_2 = new Hotel_4(51, "Restaurante don Juan Alberto", "A", 54, 162, 6, 0, "Hoteleria Mar del Plata Delux", "Mitre 913", "Mar del Plata", "Rigoberto Junior");
        hotel4.calcPrecioHabitacion();
        hotel4_2.calcPrecioHabitacion();
        
        //Hotel_5(int cantSalonConferencia, int cantSuites, int cantLimosinas, int capRestaurante, String nombreRestaurante, String Gimnasio, int habitaciones, int camas, int pisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        Hotel_5 hotel5 = new Hotel_5(2, 6, 15,65, "Alberto Juan don Restaurante", "B", 63, 264, 7, 0, "Hoteleria Mar del Plata Ultra Delux", "Mitre 914", "Mar del Plata", "Yun Lee");
        Hotel_5 hotel5_2 = new Hotel_5(3, 10, 34,72, "Royal Delux 1/4 libra", "A", 43, 120, 5, 0, "El Mejor Hotel", "Mitre 915", "Mar del Plata", "Yun Lee Junior");
        hotel5.calcPrecioHabitacion();
        hotel5_2.calcPrecioHabitacion();
        
        //Camping(int capMaxCarpas, int cantBanios, boolean restaurante, boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente)
        Camping camping = new Camping(38, 4, false, true, 150, "Camping del Sol", "Nitro 911", "Tierra del Fuego", "Dukki");
        Camping camping2 = new Camping(23, 4, true, false, 115, "Camping Luna", "San Luis 3253", "San Juan", "Luis del Monte");
        
        //Residencia(int cantHabitaciones, boolean descuentosGremios, boolean campoDeportivo, boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente)
        Residencia residencia = new Residencia(3, false,false, false, 41.3, "La Casa Linda", "Loma del Orto 154", "Tucuman","Don Domingo");
        Residencia residencia2 = new Residencia(4, true,true,true, 53, "La Casa Normal del Monte", "Nombre de Calle 1", "Chubut","Viejo de la Bolsa");
        
        Alojamientos.add(hotel4);
        Alojamientos.add(hotel4_2);
        Alojamientos.add(hotel5);
        Alojamientos.add(hotel5_2);
        Alojamientos.add(camping);
        Alojamientos.add(camping2);
        Alojamientos.add(residencia);
        Alojamientos.add(residencia2);
        
//      Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
//        • todos los alojamientos.
//        • todos los hoteles de más caro a más barato.
//        • todos los campings con restaurante
//        • todos las residencias que tienen descuento.
        boolean fin = false;
        while (!fin){
            System.out.println("===Menu Alojamientos==\n1)Mostrar todos los alojamientos \n2)Mostrar hoteles \n3)Mostrar Campings con Restaurante \n4)Mostrar Residencias con Descuento \n5)Fin");
            switch(leer.nextInt()){
                case 1 -> MostrarAlojamientos(Alojamientos);
                case 2 -> MostrarHotelesOrdenados(Alojamientos);
                case 3 -> MostrarCampingRestaurante(Alojamientos);
                case 4 -> MostrarResisdenciasDescuento(Alojamientos);
                case 5 -> fin = true;
            }
        }
    }
    
    public static void MostrarAlojamientos(ArrayList<Alojamiento> Alojamientos){
        for (Alojamiento alojamiento : Alojamientos) {
            System.out.println(alojamiento);
        }
    }
    
    public static void MostrarHotelesOrdenados(ArrayList<Alojamiento> Alojamientos){
        ArrayList<Hotel> hoteles = new ArrayList();
        for (Alojamiento hotel : Alojamientos) {
            if (hotel instanceof Hotel_5){
                hoteles.add((Hotel_5) hotel);
            } else if (hotel instanceof Hotel_4){
                hoteles.add((Hotel_4) hotel);
            }
        }
        Collections.sort(hoteles, new HotelComparator());
        for (Hotel hotel: hoteles){
            System.out.println(hotel);
        }
    }
    
    public static void MostrarCampingRestaurante(ArrayList<Alojamiento> Alojamientos){
        for (Alojamiento camping : Alojamientos) {
            if (camping instanceof Camping){
                if (((Camping) camping).isRestaurante()){
                    System.out.println(camping);
                }
            }
        }
    }
    
    public static void MostrarResisdenciasDescuento(ArrayList<Alojamiento> Alojamientos){
        for (Alojamiento residencia : Alojamientos) {
            if (residencia instanceof Residencia){
                if (((Residencia) residencia).isDescuentosGremios()){
                    System.out.println(residencia);
                }
            }
        }
    }
    
    public static class HotelComparator implements Comparator<Hotel> {
        @Override
        public int compare(Hotel hotel1, Hotel hotel2) {
            if (hotel1.getPrecioHabitacion()> hotel2.getPrecioHabitacion()) {
                return -1;
            } else if (hotel1.getPrecioHabitacion() < hotel2.getPrecioHabitacion()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
