/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package Servicios;

import Entidades.NIF;
import java.util.Scanner;
/**
 * @author JheX
*/
public class ServiceNIF {
    Scanner leer = new Scanner(System.in);
    char letra [] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
    public void setDNI(NIF nif){
        System.out.print("DNI: ");
        nif.setDNI(leer.nextLong());
    }

    public void setNIF(NIF nif){
        nif.setLetra(letra[(int)nif.getDNI() % 23]);
    }
    
    public void mostrar(NIF nif){
        System.out.println("NIF: " + nif.getDNI() + "-" + nif.getLetra());
    }
}
