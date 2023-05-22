/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;
/**
 * @author JheX
*/
public enum TipoVehiculo {
    SEDAN, HATCHBACK, SUV, PICKUP, COUPE, VAN, CAMION, FURGON, MOTOCICLETA;
    public TipoVehiculo contains(String tipo){
        for (TipoVehiculo aux : TipoVehiculo.values()) {
            if (aux.toString().equals(tipo)){
                return aux;
            }
        }
        return null;
    }
}
