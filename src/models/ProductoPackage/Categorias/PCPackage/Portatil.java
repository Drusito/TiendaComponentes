package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;

import java.util.ArrayList;

public class Portatil extends PC implements accionesPC{

    protected final float pulgadasPantalla;
    protected final boolean tieneHDMI;
    protected final int puertosUSB;
    protected final boolean tienePuertoAuriculares;

    public Portatil(float precio, String descripcion, String marca, ArrayList<Componente> componentesPC, float pulgadasPantalla, boolean tieneHDMI, int puertosUSB, boolean tienePuertoAuriculares) {
        super(precio, descripcion, marca, componentesPC);
        this.pulgadasPantalla = pulgadasPantalla;
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
    public boolean isTieneHDMI() {
        return tieneHDMI;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    public boolean isTienePuertoAuriculares() {
        return tienePuertoAuriculares;
    }

    @Override
    public String toString() {
        return "Portatil{" +
                "MAX_SLOTS=" + MAX_SLOTS +
                ", componentesPC=" + componentesPC +
                ", pulgadasPantalla=" + pulgadasPantalla +
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
    protected float obtenerPrecioTotal() {
        float precioTotal = 0;
        if(this.componentesPC.size() > 0){
            for (Componente componente : componentesPC) {
                precioTotal += componente.getPrecio();
            }
        }
        return precioTotal;
    }
    @Override
    public void montarPc(ArrayList<Componente> componentes) {
        this.componentesPC.addAll(componentes);
    }
    @Override
    public void cambiarPieza(Componente componenteCambiar) {
        for (Componente componente : this.componentesPC){
            if(componente.getClass()==componenteCambiar.getClass()){
                componente = componenteCambiar;
            }
        }
    }

}
