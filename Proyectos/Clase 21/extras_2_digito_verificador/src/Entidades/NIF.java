/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package Entidades;
/**
 * @author JheX
*/
public class NIF {
    private long DNI;
    private char letra;
    
    public NIF() {
    }

    public long getDNI() {
        return DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
}
