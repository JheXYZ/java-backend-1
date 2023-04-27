/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5.Ej01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fede2
 */
public class Extra06 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        armadoStringSopa();  
    
    }

    
    
    public static String[][] armadoStringSopa() {
        Scanner leer = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        Random random = new Random(); // Crear un objeto Random para generar valores aleatorios
        int aleatorio = 0; // Crear una variable para almacenar el valor aleatorio
        String[][] sopaLetras = new String[20][20]; // Crear una matriz de Strings para la sopa de letras
        int[] guarda = new int[5]; // Crear un array para almacenar los índices de las palabras en la matriz
        String palabra = null; // Crear una variable para almacenar la palabra ingresada por el usuario
        int contador = 0; // Crear una variable para llevar la cuenta de las palabras ingresadas

        // Este ciclo while se utiliza para seleccionar 5 índices aleatorios para las palabras
        while (contador < 5) {
            int numeroAleatorio = random.nextInt(20); // Generar un número aleatorio entre 0 y 19
            if (Arrays.binarySearch(guarda, numeroAleatorio) < 0) { // Verificar si el número aleatorio ya se ha seleccionado antes
                guarda[contador] = numeroAleatorio; // Agregar el número aleatorio al array guarda
                contador++; // Incrementar el contador
            }
        }

        // Este ciclo for se utiliza para solicitar al usuario 5 palabras de 5 letras cada una
        for (int j = 0; j < 5; j++) {
            System.out.println("Ingrese la palabra " + (j + 1) + " de 5 caracteres de su sopa de letras."); // Solicitar al usuario una palabra
            palabra = leer.nextLine(); // Leer la palabra ingresada por el usuario desde la entrada estándar
            while (palabra.length() != 5) { // Verificar que la palabra tenga exactamente 5 caracteres
                System.out.println("La palabra debe tener exactamente 5 caracteres. Ingrese una nueva palabra."); // Solicitar al usuario una nueva palabra
                palabra = leer.nextLine(); // Leer la nueva palabra ingresada por el usuario desde la entrada estándar
            }
            aleatorio = random.nextInt(20); // Generar un número aleatorio entre 0 y 19 para el índice de la palabra
            while (sopaLetras[aleatorio][0] != null) { // Verificar si el índice ya está en uso por otra palabra
                aleatorio = random.nextInt(20); // Generar un nuevo número aleatorio para el índice de la palabra
            }
            for (int n = 0; n < 5; n++) { // Este ciclo for se utiliza para almacenar cada letra de la palabra en la matriz
                sopaLetras[aleatorio][n] = palabra.substring(n, n + 1); // Almacenar la letra n de la palabra en la posición [aleatorio][n] de la matriz
            }
        }

        // Este ciclo for se utiliza para generar letras aleatorias en las posiciones de la matriz que no tienen palabras
        for (int i = 0; i < 20; i++) {
            for (int w = 0; w < 20; w++) {
                if (sopaLetras[i][w] == null) { // Verificar si la posición está vacía
                    int randomNumber = random.nextInt(26);//Genera un numero Random.
                    char randomChar = (char) (randomNumber + 'a'); //Genera una letra aleatoria
                    sopaLetras[i][w] = Character.toString(randomChar); // Convierte a string la letra random.
                }
            }
        }

        for (int i = 0; i < 20; i++) {// Usamos este bucle para mostrar la sopa de letras
            for (int w = 0; w < 20; w++) {
                System.out.print("[" + sopaLetras[i][w] + "]");
            }
            System.out.println(" ");
        }

        return sopaLetras; //Retornamos el valor de sopa de letras.
    }
}


/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación
de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se 
utilizan las siguientes funciones de Java substring(), Length() y Math.random().

*/