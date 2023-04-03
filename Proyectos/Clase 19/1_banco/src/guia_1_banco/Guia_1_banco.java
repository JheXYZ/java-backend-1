/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_1_banco;

import Servicios.CuentaBancariaServicio;
import entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Guia_1_banco {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();

        CuentaBancaria cuenta1 = cbs.crearCuenta();
        boolean fin = false;

        while (fin != true) {
            System.out.println("=====Cuenta Bancaria======\n1)Depositar\n2)Extracción\n3)Extracción Rápida\n4)Consultar Saldo\n5)Consultar Datos\n6)Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cbs.ingresar(cuenta1);
                    break;
                case 2:
                    cbs.retirar(cuenta1);
                    break;
                case 3:
                    cbs.extraccionRapida(cuenta1);
                    break;
                case 4:

                    cbs.consultarSaldo(cuenta1);
                    break;
                case 5:

                    cbs.consultarDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    fin = true;
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
            }
        }
    }
}
