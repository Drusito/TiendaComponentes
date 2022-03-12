package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;
import models.ProductoPackage.Producto;

import java.util.ArrayList;

public abstract class PC extends Producto {
    protected int MAX_SLOTS = 2;

    protected ArrayList<Componente> componentesPC;

    public PC(float precio, String descripcion, String marca, ArrayList<Componente> componentesPC) {
        super(precio, descripcion, marca);
        this.componentesPC = componentesPC;
    }
    /**
     * Getters
     */
    public DiscoDuro getDiscoDuro() {
        for (Componente componente : this.componentesPC){
            if(componente instanceof DiscoDuro) return (DiscoDuro) componente;
        }
        return null;
    }
    public MemoriaGrafica getMemoriaGrafica() {
        for (Componente componente : this.componentesPC){
            if(componente instanceof MemoriaGrafica) return (MemoriaGrafica) componente;
        }
        return null;
    }
    public PlacaBase getPlacaBase() {
        for (Componente componente : this.componentesPC){
            if(componente instanceof PlacaBase) return (PlacaBase) componente;
        }
        return null;
    }
    public Procesador getProcesador() {
        for (Componente componente : this.componentesPC){
            if(componente instanceof Procesador) return (Procesador) componente;
        }
        return null;
    }
    public RAM getRam() {
        for (Componente componente : this.componentesPC){
            if(componente instanceof RAM) return (RAM) componente;
        }
        return null;
    }
    private ArrayList<Componente> addComponente(MemoriaGrafica memoriaGrafica, PlacaBase placaBase, Procesador procesador){
        ArrayList<Componente> componentesNuevos = new ArrayList<>();
        componentesNuevos.add(memoriaGrafica);
        componentesNuevos.add(placaBase);
        componentesNuevos.add(procesador);
        return componentesNuevos;
    }
    private ArrayList<Componente> addArrayComponente(ArrayList<Componente> componentes){
        this.componentesPC.addAll(componentes);
        return this.componentesPC;
    }
/*    private ArrayList<Componente> addAllComponents (){
        this.componentesPC = addComponente(memoriaGrafica,placaBase,procesador);
        this.componentesPC = addArrayComponente(discoDuro);
        this.componentesPC = addArrayComponente(ram);
        return this.componentesPC;
    }*/
    @Override
    public abstract String toString();
    protected abstract float obtenerPrecioTotal();
    //public float sumaPrecioFinal(){};
}
