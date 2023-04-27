/*
    Los profesores del curso de programación de Egg necesitan llevar un registro
    de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
    aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 
    4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
    Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
    Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
    Al final del programa los profesores necesitan obtener por pantalla la cantidad
    de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
    con promedio mayor o igual al 7 de sus notas del curso.

 */
package pkg4_extras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        float primer_prac, segun_prac, primer_int, segun_int;
        float notas[] = new float [10];
        int apro = 0, desapro = 0;
        
        System.out.println("Ingrese las notas de los alumnos");
        for (int i = 0; i < 10; i++) {
                System.out.print("Alumno " + (i+1) + "\nPrimer Practico: ");
                primer_prac = (float) (leer.nextFloat() * 0.1);
                System.out.print("Segundo Practico: ");
                segun_prac = (float) (leer.nextFloat() * 0.15);
                System.out.print("Primer Integrador: ");
                primer_int = (float) (leer.nextFloat() * 0.25);
                System.out.print("Segundo Integrador: ");
                segun_int = (float) (leer.nextFloat() * 0.5);
                notas[i] = primer_prac + segun_prac + primer_int + segun_int;
                System.out.println("Promedio: " + notas[i]);
                if (notas[i] >= 7) {
                    apro++;
                } else {
                    desapro++;
                }
        }
        System.out.println("\nAprobaron: " + apro + "\nDesaprobados: " + desapro + "\nEl " + (apro*100)/10 + "% aprobó");
    }
}
