package models.ProductoPackage.Categorias.ComponentesPackage;

public class PlacaBase extends Componente{
    private int numMaxProcesadores;
    private int puertosRam;
    private int puertosDiscoDuro;
    private boolean aceptaSSD;
    private int puertosUSB;
    private int puertosJack;
    private boolean ethernet;
    private boolean wifi;

    /**
     * Constructor
     * @param precio
     * @param descripcion
     * @param marca
     * @param numMaxProcesadores
     * @param puertosRam
     * @param puertosDiscoDuro
     * @param aceptaSSD
     * @param puertosUSB
     * @param puertosJack
     * @param ethernet
     * @param wifi
     */
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
