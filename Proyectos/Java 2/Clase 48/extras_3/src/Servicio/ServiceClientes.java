/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Cliente;
import Entidades.Cuotas;
import Entidades.Poliza;
import Entidades.Polizas;
import Entidades.Vehiculo;
import Enums.FormaDePago;
import Enums.TipoVehiculo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * @author JheX
 */
public class ServiceClientes {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void gestionarClientes() {   
    }

    public Cliente nuevoCliente(Polizas Polizas) {
        Cliente cliente = new Cliente();
        System.out.print("Nombres: ");
        cliente.setNombres(leer.next());
        System.out.print("Apellidos: ");
        cliente.setApellidos(leer.next());
        System.out.print("Documento: ");
        cliente.setDocumento(leer.nextInt());
        System.out.print("Domicilio: ");
        cliente.setDomicilio(leer.next());
        System.out.print("Telefono: ");
        cliente.setTelefono(leer.nextInt());
        System.out.print("E-Mail: ");
        cliente.setEmail(leer.next());
        System.out.println("Datos Vehiculo: ");
        cliente.anadirVehiculo(nuevoVehiculo());
        System.out.println("Datos Poliza: ");
        Poliza poliza = nuevaPoliza(cliente, Polizas);
        cliente.anadirPoliza(poliza);
        System.out.print("Cuotas: ");
        LinkedHashMap<Poliza, Cuotas> cuotas = new LinkedHashMap();
//        Poliza poliza = cliente.getPolizas().stream()
//                .skip(cliente.getPolizas().size() - 1)
//                .findFirst()
//                .orElse(null);
        Cuotas cuota = crearCuotas(poliza);
        cuotas.put(poliza, cuota);
        System.out.println(poliza.getCuotas());
        cliente.setCuotas(cuotas);
        return cliente;
    }

    public Vehiculo nuevoVehiculo() {
        Vehiculo vehiculo = new Vehiculo();
        System.out.print(" Marca: ");
        vehiculo.setMarca(leer.next());
        System.out.print(" Modelo: ");
        vehiculo.setModelo(leer.next());
        System.out.print(" Número de Motor: ");
        vehiculo.setNumeroMotor(leer.next());
        System.out.print(" Número de Chasis: ");
        vehiculo.setNumeroChasis(leer.next());
        System.out.print(" Color: ");
        vehiculo.setColor(leer.next());
        System.out.println("Tipos de Vehiculos:");
        for (var tipo : TipoVehiculo.values()) {
            System.out.println( "  " + tipo.toString());
        }
        String tip;
        do {
            System.out.print("Tipo: ");
            tip = leer.next().toUpperCase();
            for (var tipo : TipoVehiculo.values()) {
                if (tipo.toString().equals(tip)) {
                    vehiculo.setTipo(tipo);
                    break;
                }
            }
        } while (vehiculo.getTipo() == null);
        return vehiculo;
    }

    public Poliza nuevaPoliza(Cliente cliente, Polizas Polizas) {
        Poliza poliza = new Poliza();
        poliza.setCliente(cliente);
        System.out.println(" Poliza del Cliente: Nombre:" + poliza.getCliente().getNombres() + ", Apellido:" + poliza.getCliente().getApellidos()
                            + ", Documento:" + poliza.getCliente().getDocumento());
        Vehiculo vehiculo = cliente.getVehiculos().stream()
                .skip(cliente.getVehiculos().size() - 1)
                .findFirst()
                .orElse(null);
        poliza.setVehiculo(vehiculo);
        System.out.println(" Vehiculo: " + poliza.getVehiculo());
        poliza.setNumeroPoliza(Polizas.getNumeroPolizas());
        Polizas.addNumeroPolizas();
        System.out.println(" Número de poliza: " + poliza.getNumeroPoliza());
        System.out.print(" Cuantas cuotas hay: ");
        poliza.setCantidadCuotas(leer.nextInt());
        poliza.setFechaInicio(Calendar.getInstance());
        System.out.println(" Fecha de Inicio Poliza: " + poliza.getFechaInicioSimple());
            Calendar fin = poliza.getFechaInicio();
            fin.add(Calendar.MONTH, poliza.getCantidadCuotas());
        poliza.setFechaFin(fin);
        System.out.println(" Fecha de Fin Poliza: " + poliza.getFechaFinSimple());
        System.out.println(" Formas de Pago: ");
        for (var formaPago: FormaDePago.values()) {
            System.out.println("  " + formaPago);
        }
        String formaP;
        do{
            System.out.print(" Forma de Pago: ");
            formaP = leer.next();
            for(var formaPago : FormaDePago.values()){
                if (formaPago.toString().equals(formaP)){
                    poliza.setFormaDePago(formaPago);
                    break;
                }
            }
        }while(poliza.getFormaDePago() == null);
        System.out.print(" Monto Asegurado: ");
        poliza.setMontoAsegurado(leer.nextFloat());
        System.out.println(" ¿Incluye seguro contra granizo? (S/N)");
        if (leer.next().toUpperCase().charAt(0) == 'S'){
            poliza.setIncluyeGranizo(true);
            System.out.println(" ¿Cuanto desea asegurar contra el granizo?");
            poliza.setMontoMaxGranizo(leer.nextFloat());
        }
        System.out.print(" Tipo de cobertura: ");
        poliza.setTipoCobertura(leer.next());
        return poliza;
    }
    
    public void mostrarCliente(Cliente cliente){
        System.out.println("===Mostrar Cliente===");
        System.out.println("Nombres: " + cliente.getNombres());
        System.out.println("Apellidos: " + cliente.getApellidos());
        System.out.println("Documento: " + cliente.getDocumento());
        System.out.println("Domicilio: " + cliente.getDomicilio());
        System.out.println("Telefono: " + cliente.getTelefono() );
        System.out.println("E-Mail: " + cliente.getEmail());
        System.out.println("Vehiculo/s: ");
        int i = 1;
        for (var vehiculo : cliente.getVehiculos()){
            System.out.println(i +") " + vehiculo);
            i++;
        }
        System.out.println("Poliza/s: ");
        //mostrarPolizas(cliente.getPolizas());
        for(var poliza : cliente.getPolizas()){
            System.out.println(" " + poliza);
        }
        System.out.println("Cuotas: ");
        for (Map.Entry<Poliza, Cuotas> entry : cliente.getCuotas().entrySet()) {
            System.out.println(" Cuota: " + entry.getValue()); //buscar por que tiene cuotas = null
        }
    }
    
    public Cuotas crearCuotas(Poliza poliza){
        Cuotas cuotas = new Cuotas();
        float montoCuota = poliza.getMontoAsegurado() + poliza.getMontoMaxGranizo();
            Calendar fechaVencimiento = poliza.getFechaInicio();
            fechaVencimiento.add(Calendar.MONTH, 1);
        cuotas.setFechaVencimiento(fechaVencimiento);
        cuotas.setMontoCuota(montoCuota);
        cuotas.setNumCuota(1);
        cuotas.setPagado(true);
        cuotas.setFormaDePago(poliza.getFormaDePago());
        poliza.setCuotas(cuotas);
        return cuotas;
    }
    
    public String formatearFechas(Calendar fecha){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formatoFecha.format(fecha.getTime());
        return fechaFormateada;
    }
    
    public void mostrarPolizas(LinkedHashSet<Poliza> Polizas){
        for (var poliza : Polizas){
            System.out.println(" Vehiculo: " + poliza.getVehiculo());
            System.out.println(" Cliente: " + poliza.getCliente().getNombres() + ", " + poliza.getCliente().getApellidos() + ", DNI=" + poliza.getCliente().getDocumento());
            System.out.println(" Número Poliza: " + poliza.getNumeroPoliza());
            System.out.println(" Cantidad Cuotas: " + poliza.getCantidadCuotas());
            System.out.println(" Fecha Inicio: " + poliza.getFechaInicioSimple());
            System.out.println(" Fecha Fin Poliza: " + poliza.getFechaFinSimple());
            System.out.println(" Forma de Pago: " + poliza.getFormaDePago());
            System.out.println(" Monto Asegurado: " + poliza.getMontoAsegurado());
            if (poliza.isIncluyeGranizo()){
                System.out.println(" Incluye Seguro Granizo: SI");
                System.out.println(" Monto Asegurado Granizo: " + poliza.getMontoMaxGranizo());
            } else {
                System.out.println(" Incluye Seguro Granizo: NO");
            }
            System.out.println(" Cobertura: " + poliza.getTipoCobertura());
        }
    }
}
