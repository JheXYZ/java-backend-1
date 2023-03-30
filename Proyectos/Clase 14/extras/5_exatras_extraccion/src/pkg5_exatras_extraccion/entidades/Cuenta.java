/*
    Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
    crea un método "retirar_dinero" que permita retirar una cantidad de dinero 
    del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
    de realizar una transacción de retiro.
*/
package pkg5_exatras_extraccion.entidades;

public class Cuenta {
    private float saldo = 0;
    private String titular;

    public Cuenta(String titular, float saldo) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero(float retirar){
        if (retirar <= saldo) {
            saldo -= retirar;
            System.out.println("Se han retirado $" + retirar + " exitosamente\nNuevo saldo disponible: $" + saldo);
        } else {
            System.out.println("La extracción solicitada excede los fondos de la cuenta.");
        }
    }
    
    public void ingresar_dinero(float ingresar) {
        saldo += ingresar;
        System.out.println("Se han ingresado $" + ingresar + "\nNuevo saldo disponible: $" + saldo);
    }
}
