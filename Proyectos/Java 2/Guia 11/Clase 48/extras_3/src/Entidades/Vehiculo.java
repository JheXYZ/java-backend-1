/*
    Gestión de vehículos. Se registra la información de cada vehículo asegurado.
    Marca, modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
*/
package Entidades;

import Enums.TipoVehiculo;

/**
 * @author JheX
*/
public class Vehiculo {
    String marca, modelo, numeroMotor, numeroChasis, color;
    TipoVehiculo tipo;

    public Vehiculo() {
    }
    
    public Vehiculo(String marca, String modelo, String numeroMotor, String numeroChasis, String color, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroMotor = numeroMotor;
        this.numeroChasis = numeroChasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Marca=" + marca + ", Modelo=" + modelo + ", NumeroMotor=" + numeroMotor + ", NumeroChasis=" + numeroChasis + ", Color=" + color + ", Tipo=" + tipo;
    }
    
}
