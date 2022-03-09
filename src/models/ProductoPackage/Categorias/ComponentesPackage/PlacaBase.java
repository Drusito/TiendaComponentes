package models.ProductoPackage.Categorias.ComponentesPackage;

public class PlacaBase extends Componente{
    protected int numMaxProcesadores;
    protected int puertosRam;
    protected int puertosDiscoDuro;
    protected boolean aceptaSSD;
    protected int puertosUSB;
    protected int puertosJack;
    protected boolean ethernet;
    protected boolean wifi;

    public PlacaBase(float precio, String descripcion, String marca, int numMaxProcesadores, int puertosRam, int puertosDiscoDuro, boolean aceptaSSD, int puertosUSB, int puertosJack, boolean ethernet, boolean wifi) {
        super(precio, descripcion, marca);
        this.numMaxProcesadores = numMaxProcesadores;
        this.puertosRam = puertosRam;
        this.puertosDiscoDuro = puertosDiscoDuro;
        this.aceptaSSD = aceptaSSD;
        this.puertosUSB = puertosUSB;
        this.puertosJack = puertosJack;
        this.ethernet = ethernet;
        this.wifi = wifi;
    }

    /**
     * Getters
     */
    public int getNumMaxProcesadores() {
        return numMaxProcesadores;
    }

    public int getPuertosRam() {
        return puertosRam;
    }

    public int getPuertosDiscoDuro() {
        return puertosDiscoDuro;
    }

    public boolean isAceptaSSD() {
        return aceptaSSD;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    public int getPuertosJack() {
        return puertosJack;
    }

    public boolean isEthernet() {
        return ethernet;
    }

    public boolean isWifi() {
        return wifi;
    }
    /**
     * Setters
     */
    public void setEthernet(boolean ethernet) {
        this.ethernet = ethernet;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    @Override
    public String toString() {
        return "PlacaBase{" +
                "numMaxProcesadores=" + numMaxProcesadores +
                ", puertosRam=" + puertosRam +
                ", puertosDiscoDuro=" + puertosDiscoDuro +
                ", aceptaSSD=" + aceptaSSD +
                ", puertosUSB=" + puertosUSB +
                ", puertosJack=" + puertosJack +
                ", ethernet=" + ethernet +
                ", wifi=" + wifi +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
