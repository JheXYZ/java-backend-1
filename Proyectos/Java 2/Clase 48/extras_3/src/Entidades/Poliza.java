/*
    Se registrará una póliza, donde se guardará los datos tanto de un vehículo,
    como los datos de un solo cliente. Los datos incluidos en ella son: número 
    de póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de 
    pago, monto total asegurado, incluye granizo, monto máximo granizo, tipo de 
    cobertura (total, contra terceros, etc.)
*/
package Entidades;

import Enums.FormaDePago;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author JheX
*/
public class Poliza {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int numeroPoliza, cantidadCuotas;
    private Calendar fechaInicio, fechaFin;
    private FormaDePago formaDePago;
    private float montoAsegurado = 0, montoMaxGranizo = 0;
    private boolean incluyeGranizo = false;
    private String tipoCobertura;
    private Cuotas cuotas;

    public Poliza() {
    }
    
    public Poliza(Vehiculo vehiculo, Cliente cliente, int numeroPoliza, int cantidadCuotas, Calendar fechaInicio, Calendar fechaFin, FormaDePago formaDePago, float montoAsegurado, float montoMaxGranizo, boolean incluyeGranizo, String tipoCobertura, Cuotas cuotas) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numeroPoliza = numeroPoliza;
        this.cantidadCuotas = cantidadCuotas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.formaDePago = formaDePago;
        this.montoAsegurado = montoAsegurado;
        this.montoMaxGranizo = montoMaxGranizo;
        this.incluyeGranizo = incluyeGranizo;
        this.tipoCobertura = tipoCobertura;
        this.cuotas = cuotas;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }
    
    public String getFechaInicioSimple(){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaInicioSimple = formatoFecha.format(fechaInicio.getTime());
        return fechaInicioSimple;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaFin() {
        return fechaFin;
    }
    
    public String getFechaFinSimple(){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFinSimple = formatoFecha.format(fechaFin.getTime());
        return fechaFinSimple;
    }

    public void setFechaFin(Calendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    public FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public float getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(float montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public float getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(float montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Cuotas getCuotas() {
        return cuotas;
    }

    public void setCuotas(Cuotas cuotas) {
        this.cuotas = cuotas;
    }
    
    @Override
    public String toString() {
        return "Vehiculo=" + vehiculo + ", Cliente=" + cliente.getNombres() + ", " + cliente.getApellidos() + ", DNI=" + cliente.getDocumento() + ", Numero Poliza=" + numeroPoliza + ", Cantidad Cuotas=" + cantidadCuotas + ", Fecha Inicio=" + getFechaInicioSimple() + ", Fecha Fin=" + getFechaFinSimple() + ", Forma de Pago=" + formaDePago + ", Monto Asegurado=" + montoAsegurado + ", Incluye Seguro Granizo=" + incluyeGranizo + ", Monto Asegurado Granizo=" + montoMaxGranizo + ", Cobertura=" + tipoCobertura;
    }
    
    
}
