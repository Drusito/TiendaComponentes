package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;

import java.util.ArrayList;

public class Portatil extends PC {
    protected final float pulgadasPantalla;
    protected boolean ventilacionExtra;
    protected final boolean tieneHDMI;
    protected final int puertosUSB;
    protected final boolean tienePuertoAuriculares;

    public Portatil(float precio, String descripcion, String marca, ArrayList<DiscoDuro> discoDuro, MemoriaGrafica memoriaGrafica, PlacaBase placaBase, Procesador procesador, ArrayList<RAM> ram, float pulgadasPantalla, boolean ventilacionExtra, boolean tieneHDMI, int puertosUSB, boolean tienePuertoAuriculares) {
        super(precio, descripcion, marca, discoDuro, memoriaGrafica, placaBase, procesador, ram);
        this.pulgadasPantalla = pulgadasPantalla;
        this.ventilacionExtra = ventilacionExtra;
        this.tieneHDMI = tieneHDMI;
        this.puertosUSB = puertosUSB;
        this.tienePuertoAuriculares = tienePuertoAuriculares;
    }

    /**
     * Getters
     */
    public float getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    public boolean isVentilacionExtra() {
        return ventilacionExtra;
    }

    public boolean isTieneHDMI() {
        return tieneHDMI;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    public boolean isTienePuertoAuriculares() {
        return tienePuertoAuriculares;
    }

    /**
     * Setters
     */
    public void setVentilacionExtra(boolean ventilacionExtra) {
        this.ventilacionExtra = ventilacionExtra;
    }

    @Override
    public String toString() {
        return "Portatil{" +
                "discoDuro=" + discoDuro +
                ", memoriaGrafica=" + memoriaGrafica +
                ", placaBase=" + placaBase +
                ", procesador=" + procesador +
                ", ram=" + ram +
                ", pulgadasPantalla=" + pulgadasPantalla +
                ", ventilacionExtra=" + ventilacionExtra +
                ", tieneHDMI=" + tieneHDMI +
                ", puertosUSB=" + puertosUSB +
                ", tienePuertoAuriculares=" + tienePuertoAuriculares +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
