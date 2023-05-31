/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author JheX
 */
public class Gato extends Animal implements NewInterface{

    @Override
    public void hacerRuido() {
        System.out.println("Miua");
    }
    
    @Override
    public void correr(){
        System.out.println("*Corre el gato*");
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
