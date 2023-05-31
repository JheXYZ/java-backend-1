/*
    Gestión Integral de clientes. En este módulo vamos a registrar la 
    información personal de cada cliente que posea pólizas en nuestra 
    empresa. Nombre y apellido, documento, mail, domicilio, teléfono.
*/
package Entidades;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * @author JheX
*/
public class Cliente {
    private String nombres, apellidos, email, domicilio;
    private int documento, telefono;
    private LinkedHashSet<Vehiculo> vehiculos = new LinkedHashSet();
    private LinkedHashSet<Poliza> polizas = new LinkedHashSet();
    private LinkedHashMap<Poliza,Cuotas> cuotas = new LinkedHashMap();

    public Cliente() {
    }

    public Cliente(String nombres, String apellidos, String email, String domicilio, int documento, int telefono, LinkedHashSet<Vehiculo> vehiculos, LinkedHashSet<Poliza> polizas, LinkedHashMap<Poliza,Cuotas> cuotas) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.domicilio = domicilio;
        this.documento = documento;
        this.telefono = telefono;
        this.vehiculos = vehiculos;
        this.polizas = polizas;
        this.cuotas = cuotas;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public LinkedHashSet<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    public void setVehiculos(LinkedHashSet<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public LinkedHashSet<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(LinkedHashSet<Poliza> polizas) {
        this.polizas = polizas;
    }

    public LinkedHashMap<Poliza,Cuotas> getCuotas() {
        return cuotas;
    }

    public void setCuotas(LinkedHashMap<Poliza,Cuotas> cuotas) {
        this.cuotas = cuotas;
    }
    
    public void anadirVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public void anadirPoliza(Poliza poliza){
        polizas.add(poliza);
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombres=" + nombres + ", Apellidos=" + apellidos + ", email=" + email + ", Domicilio=" + domicilio + ", Documento=" + documento + ", Telefono=" + telefono + ", vehiculos=" + vehiculos + ", polizas=" + polizas + ", cuotas=" + cuotas + '}';
    }

}
