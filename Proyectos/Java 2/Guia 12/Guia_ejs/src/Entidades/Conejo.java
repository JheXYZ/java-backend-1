/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author JheX
 */
public class Conejo implements NewInterface{
    @Override
    public void correr(){
        System.out.println("*Corre*");
    }
    @Override
    public void correr(int a){
        System.out.println("*Corre el gato*");
    }
    @Override
    public void correr(int a, int b){
        System.out.println("*Corre el gato*");
    }
    
    
}
