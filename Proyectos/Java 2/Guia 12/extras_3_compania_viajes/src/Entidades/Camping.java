/*
    Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
    disponibles y si posee o no un restaurante dentro de las instalaciones.
*/
package Entidades;
/**
 * @author JheX
*/
public final class Camping extends Extrahoteleros{
    private int capMaxCarpas, cantBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int capMaxCarpas, int cantBanios, boolean restaurante, boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return super.toString() + "capMaxCarpas=" + capMaxCarpas + ", cantBanios=" + cantBanios + ", restaurante=" + restaurante + '}';
    }
    
    
}
