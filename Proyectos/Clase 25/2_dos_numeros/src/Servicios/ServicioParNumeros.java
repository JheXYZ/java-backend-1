/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.ParNumero;
/**
 * @author JheX
*/
public class ServicioParNumeros {
    public void newNumeros(ParNumero num){
        num.setNum1(Math.random()*(20)-9);
        num.setNum2(Math.random()*(20)-9);
    }
    
    public void mostrar(ParNumero num){
        System.out.println("Número 1: " + num.getNum1() + ", número 2: " + num.getNum2());
    }
    
    public int mayor(ParNumero num){
        if (num.getNum1() > num.getNum2()){
            System.out.println("El número 1 es mayor que número 2. " + num.getNum1() + " > " + num.getNum2());
            return 1;
        } else if (num.getNum1() < num.getNum2()){
            System.out.println("El número 2 es mayor que número 1. " + num.getNum2() + " > " + num.getNum2());
            return -1;
        } else {
            System.out.println("Son iguales");
            return 0;
        }
    }
    
    public void potencia(ParNumero num, int mayor){
        switch (mayor) {
            case 1:
                System.out.println("La potencia entra número 1 y número 2 es: " + Math.pow((int)num.getNum1(), (int)num.getNum2()));
                break;
            case 0:
                System.out.println("La potencia entre los números es: " + Math.pow((int)num.getNum1(), (int)num.getNum2()));
                break;
            case -1:
                System.out.println("La potencia entra número 2 y número 1 es: " + Math.pow((int)num.getNum2(), (int)num.getNum1()));
                break;
        }
    }
    
    public void raiz(ParNumero num){
        System.out.println("Raiz número 1: " + Math.sqrt(Math.abs(num.getNum1())) + "\nRaiz número 2: " + Math.sqrt(Math.abs(num.getNum2())));
    }
}
