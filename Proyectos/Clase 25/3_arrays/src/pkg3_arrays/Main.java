/*
    Crear en el Main dos arreglos. El arreglo A de 50 números reales y
    el arreglo B de 20 números reales. Crear la clase ArregloService, en el paquete
    servicio, con los siguientes métodos:
    1.	Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    2.	Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    3.	Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    4.	Método inicializarB copia los primeros 10 números del arreglo A en el
    arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
    mostrar A y B.
*/

package pkg3_arrays;

import Servicio.ArregloService;

public class Main {

    public static void main(String[] args) {
        float [] arreglo1= new float[50];
        float [] arreglo2= new float[20];
        ArregloService as= new ArregloService();
        
        as.inicializarA(arreglo1);
        System.out.println("Arreglo 1");
        as.mostrar(arreglo1);
        arreglo1= as.ordenar(arreglo1);
        arreglo2= as.inicializarB(arreglo1, arreglo2);
        System.out.println("Nuevo Arreglo 1");
        as.mostrar(arreglo1);
        System.out.println("Arreglo 2");
        as.mostrar(arreglo2);
    }
}