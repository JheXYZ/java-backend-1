/*
    Las armaduras de Stark se encuentran definidas por un color primario y un color secundario. Se
    encuentran compuestas de dos propulsored, uno en cada bota; y dos repulsores, uno en cada
    guante (los repulsores se utilizan también como armas). Tony los utiliza en su conjunto para volar.
 */
package Entidades;

/**
 *
 * @author JheX
 */
public class Armadura {
    private String colorPrimario, colorSecundario;
    private int salud, dureza, bateria, bateriaMax;
    private Bota botaIzq, botaDer;
    private Guante guanteIzq, guanteDer;
    private Consola consola;
    private Reactor reactor;

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, int salud, int dureza, int bateria, Bota botaIzq, Bota botaDer, Guante guanteIzq, Guante guanteDer) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.salud = salud;
        this.dureza = dureza;
        this.bateria = bateria;
        this.botaIzq = botaIzq;
        this.botaDer = botaDer;
        this.guanteIzq = guanteIzq;
        this.guanteDer = guanteDer;
        this.bateriaMax = bateria;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getBateriaMax() {
        return bateriaMax;
    }

    public void setBateriaMax(int bateriaMax) {
        this.bateriaMax = bateriaMax;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }
    
    
    public Bota getBotaIzq() {
        return botaIzq;
    }

    public void setBotaIzq(Bota botaIzq) {
        this.botaIzq = botaIzq;
    }

    public Bota getBotaDer() {
        return botaDer;
    }

    public void setBotaDer(Bota botaDer) {
        this.botaDer = botaDer;
    }

    public Guante getGuanteIzq() {
        return guanteIzq;
    }

    public void setGuanteIzq(Guante guanteIzq) {
        this.guanteIzq = guanteIzq;
    }

    public Guante getGuanteDer() {
        return guanteDer;
    }

    public void setGuanteDer(Guante guanteDer) {
        this.guanteDer = guanteDer;
    }
    
    public void caminar(int tiempo){
        int consumo = (botaIzq.getConsumo() + botaDer.getConsumo()) * tiempo;
        bateria -= consumo + consola.getConsumo();
        consola.mostrarConsumo(bateria, bateriaMax,consumo);
    }
    
    public void correr(int tiempo){
        int consumo = ((botaIzq.getConsumo() + botaDer.getConsumo()) * 2) * tiempo;
        bateria -= consumo + consola.getConsumo();
        consola.mostrarConsumo(bateria, bateriaMax,consumo);
    }
    
    public void propulsarse(int tiempo){
        int consumo = ((botaIzq.getConsumo() + botaDer.getConsumo()) * 3) * tiempo;
        bateria -= consumo + consola.getConsumo();
        consola.mostrarConsumo(bateria, bateriaMax,consumo);
    }
    
    public void volar(int tiempo){
        int consumo = (((botaIzq.getConsumo() + botaDer.getConsumo()) * 3) +
                ((guanteIzq.getConsumo() + guanteDer.getConsumo()) * 2)) * tiempo;
        bateria -= consumo + consola.getConsumo();
        consola.mostrarConsumo(bateria, bateriaMax,consumo);
    }
    
    public void atacarGuantes(int tiempo){
        int consumo = ((guanteIzq.getConsumo() + guanteDer.getConsumo()) * 3) * tiempo;
        bateria -= consumo + consola.getConsumo();
        consola.mostrarConsumo(bateria, bateriaMax, consumo);
    }
    
    public float porcentajeBateria(){
        return (float)((bateria * 100)/bateriaMax);
    }
    
}
