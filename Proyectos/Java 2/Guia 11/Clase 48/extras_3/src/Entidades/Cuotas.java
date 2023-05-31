/*
    Se registrarán y podrán consultar las cuotas generadas en cada póliza. Esas 
    cuotas van a contener la siguiente información: número de cuota, monto total
    de la cuota, si está o no pagada, fecha de vencimiento, forma de pago 
    (efectivo, transferencia, etc.).
*/
package Entidades;

import Enums.FormaDePago;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author JheX
*/
public class Cuotas {
    private int numCuota;
    private float montoCuota;
    private boolean pagado;
    private Calendar fechaVencimiento;
    private FormaDePago formaDePago;

    public Cuotas() {
    }

    public Cuotas(int numCuota, float montoCuota, boolean pagado, Calendar fechaVencimiento, FormaDePago formaDePago) {
        this.numCuota = numCuota;
        this.montoCuota = montoCuota;
        this.pagado = pagado;
        this.fechaVencimiento = fechaVencimiento;
        this.formaDePago = formaDePago;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public float getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(float montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    public String getFechaVencimientoSimple(){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formatoFecha.format(fechaVencimiento.getTime());
        return fechaFormateada;
    }

    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        return "Número de Cuotas=" + numCuota + ", Monto de Cada Cuota=" + montoCuota + ", Pagado=" + pagado + ", Fecha de Vencimiento=" + getFechaVencimientoSimple() + ", Forma de Pago=" + formaDePago;
    }
    
    
    
}
