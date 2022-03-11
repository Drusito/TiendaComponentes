package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;
import models.ProductoPackage.Producto;

import java.util.ArrayList;

public abstract class PC extends Producto {
    protected int MAX_SLOTS = 2;

    protected ArrayList<Componente> discoDuro;
    protected MemoriaGrafica memoriaGrafica;
    protected PlacaBase placaBase;
    protected Procesador procesador;
    protected ArrayList<Componente> ram;
    protected ArrayList<Componente> componentesPC;

    public PC(float precio, String descripcion, String marca, ArrayList<Componente> discoDuro, MemoriaGrafica memoriaGrafica, PlacaBase placaBase, Procesador procesador, ArrayList<Componente> ram, ArrayList<Componente> componentesPC) {

        super(precio, descripcion, marca);
        this.discoDuro = discoDuro;
        this.memoriaGrafica = memoriaGrafica;
        this.placaBase = placaBase;
        this.procesador = procesador;
        this.ram = ram;
        this.componentesPC = componentesPC;
    }

    /**
     * Getters
     */
    public ArrayList<Componente> getDiscoDuro() {
        return discoDuro;
    }
    public MemoriaGrafica getMemoriaGrafica() {
        return memoriaGrafica;
    }
    public PlacaBase getPlacaBase() {
        return placaBase;
    }
    public Procesador getProcesador() {
        return procesador;
    }
    public ArrayList<Componente> getRam() {
        return ram;
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
    private ArrayList<Componente> addAllComponents (){
        this.componentesPC = addComponente(memoriaGrafica,placaBase,procesador);
        this.componentesPC = addArrayComponente(discoDuro);
        this.componentesPC = addArrayComponente(ram);
        return this.componentesPC;
    }
    @Override
    public abstract String toString();
    protected abstract float obtenerPrecioTotal();
    //public float sumaPrecioFinal(){};
}
