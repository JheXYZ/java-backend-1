/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidades.Item;
import Entidades.Lugar;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JheX
*/
public class ServiceGeneral {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Lugar crearLugar(){
        System.out.print("Nombre: ");
        Lugar lugar = new Lugar(leer.next(),template());
        for(var item : lugar.getItems()){
            System.out.print(item.getNombre() + "\nCompra: $");
            item.setCompra(leer.nextFloat());
            System.out.print("Venta: $");
            item.setVenta(leer.nextFloat());
            System.out.print("Peso: ");
            item.setPeso(leer.nextFloat());
            System.out.print("Cantidad: ");
            item.setCantidad(leer.nextInt());
            System.out.println("");
        }
        return lugar;
    }
    
    public ArrayList<Item> template(){
        String nombres[] = {"Anime Scultures", "Bait", "Boxes", "Cactus Flowers", "Car Parts", "Fish", "Freshwater Fish", "Guitar", "Heavy Equipment", "Instant Ramen", "Kittens", "Koichan Posters", "Mission_Item", "Newspapers", "Paper Maps", "Peanuts", "Pinecones", "Pizza", "Saltwater Fish", "Spare Tires", "Toilet Paper", "Toiletries", "Tropical Fruit", "Water Bottle", "Wood Planks"};
        ArrayList<Item> Items = new ArrayList();
        for (String nombre : nombres) {
            Items.add(new Item(nombre, 0, 0, 0, 0));
        }
        return Items;
    }
}
