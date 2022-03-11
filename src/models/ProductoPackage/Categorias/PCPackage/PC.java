package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;
import models.ProductoPackage.Producto;

import java.util.ArrayList;

public abstract class PC extends Producto {
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
    /*HOLAAAAAAAAAAAAAAAAAAAAAAAA PRUEBAAAAAAAAAAAA*/
    @Override
    public abstract String toString();

    //public float sumaPrecioFinal(){};
}
