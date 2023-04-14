/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 * @author JheX
 */
public class ServicioCadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void ingresarFrase(Cadena cadena){
        System.out.print("Ingrese una frase: ");
        cadena.setCadena(leer.next());
        cadena.setLongitud(cadena.getCadena().length());
    }
    
    public void mostrarVocales(Cadena cadena) {
        int vocales = 0;
        char letra;
        
        for (int i = 0; i < cadena.getLongitud(); i++){
            letra = cadena.getCadena().toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                vocales++;
            }
        }
        System.out.println("Hay " + vocales + " vocales");
    }
    
    public void invertirFrase(Cadena cadena){
        System.out.print("Invertido: ");
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            System.out.print(cadena.getCadena().charAt(i));
        }
        System.out.println();
    }
    
    public void vecesRepetido(Cadena cadena){
        System.out.print("Caracter a buscar: ");
        char letra = leer.next().charAt(0);
        int veces = 0;
        
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getCadena().charAt(i) == letra){
                veces++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + veces + " veces" );
    }
    
    public void compararCadena(Cadena cadena){
        System.out.print("Ingrese una frase para comparar: ");
        String frase = leer.next();
        
        if (frase.length() == cadena.getLongitud()){
            System.out.println("Las frases tienen la misma longitud: " + frase.length());
        } else {
            System.out.println("Las frases no tienen la misma longitud. Frase ingresada: " + frase.length() + ", frase anterior: " + cadena.getLongitud());
        }
    }
    
    public void unirFrases(Cadena cadena){
        System.out.print("Ingrese una frase para unir: ");
        String frase = leer.next();
        System.out.println(cadena.getCadena() + frase);
    }
    
    public void remplazarAesCon(Cadena cadena){
        System.out.print("Ingrese un caracter para remplazar las 'a': ");
        char letra = leer.next().charAt(0);
        
        for (int i = 0; i < cadena.getLongitud() ; i++) {
            if (cadena.getCadena().charAt(i) == 'a'){
                System.out.print(letra);
            } else {
                System.out.print(cadena.getCadena().charAt(i));
            }
        }
        System.out.println();
    }
    
    public void contiene(Cadena cadena){
        System.out.print("Ingrese un caracter a buscar: ");
        String letra = leer.next().substring(0, 1);
        
        if (cadena.getCadena().contains(letra)){
            System.out.println("La frase si contiene el caracter '" + letra.charAt(0) + "'");
        } else {
            System.out.println("La frase no contiene el caracter '" + letra.charAt(0) + "'");
        }
    }
}
