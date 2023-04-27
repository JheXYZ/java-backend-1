/*
    Crea una clase en Java donde declares una variable de tipo array de Strings
    que contenga los doce meses del año, en minúsculas. A continuación, declara
    una variable mesSecreto de tipo String, y hazla igual a un elemento del array 
    (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que adivine
    el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, 
    pedir que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución
    del programa podría ser este:
        Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
        No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
        ¡Ha acertado!
*/
package extras_1_adivar_mes;

import Entidades.Meses;
import java.util.Scanner;

/**
 * @author JheX
*/
public class Extras_1_adivar_mes {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Meses mes = new Meses();
        boolean fin = false;
        
        System.out.println("Ingrese un mes para adivinar");
        System.out.println(mes.getMesSecreto());
        while (fin == false){
            if (mes.getMesSecreto().equals(leer.next().toLowerCase())){
                System.out.println("¡Correcto! El mes era: " + mes.getMesSecreto());
                fin = true;
            } else {
                System.out.println("Vuelva a intertarlo");
            }
        }
    }
}
