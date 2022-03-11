package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;

import java.util.ArrayList;

public class Portatil extends PC implements accionesPC {
    private final float pulgadasPantalla;
    private boolean ventilacionExtra;
    private final boolean tieneHDMI;
    private final int puertosUSB;
    private final boolean tienePuertoAuriculares;

    public Portatil(float precio, String descripcion, String marca, ArrayList<Componente> discoDuro, MemoriaGrafica memoriaGrafica, PlacaBase placaBase, Procesador procesador, ArrayList<Componente> ram, float pulgadasPantalla, boolean ventilacionExtra, boolean tieneHDMI, int puertosUSB, boolean tienePuertoAuriculares) {
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
    public float sumaPrecio() {
        float precioTotal=0;
        for (Componente componente : this.componentesPc) {
            precioTotal += componente.getPrecio();
        }
        return precioTotal;
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

    @Override
    public void montarPc(ArrayList<Componente> componentes) {
        this.componentesPc.addAll(componentes);
    }

    @Override
    public void cambiarPieza(Componente componenteCambio) {
        for (Componente componente : this.componentesPc) {
            if (componente.getClass() == componenteCambio.getClass()) {
                componente = componenteCambio;
            }
        }
    }
}
