/*
    Realizar una clase llamada ParDeNumeros que tenga como atributos dos números
    reales con los cuales se realizarán diferentes operaciones matemáticas. La 
    clase debe tener un constructor vacío, getters y setters.  En el constructor
    vacío se usará el Math.random para generar los dos números. 
    Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá 
    además implementar los siguientes métodos:
        -Método mostrarValores que muestra cuáles son los dos números guardados.
        -Método devolverMayor para retornar cuál de los dos atributos tiene el 
            mayor valor
        -Método calcularPotencia para calcular la potencia del mayor valor de la
            clase elevado al menor número. Previamente se deben redondear ambos 
            valores.
        -Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos
            valores. Antes de calcular la raíz cuadrada se debe obtener el valor 
            absoluto del número.
*/
package pkg2_dos_numeros;

import Entidades.ParNumero;
import Servicios.ServicioParNumeros;

/**
 * @author Jhex
*/
public class Main {
    public static void main(String[] args) {
        ParNumero num = new ParNumero();
        ServicioParNumeros SPN = new ServicioParNumeros();
        
        SPN.newNumeros(num);
        SPN.mostrar(num);
        int mayor = SPN.mayor(num);
        SPN.potencia(num, mayor);
        SPN.raiz(num);
    }
}
