package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;
import models.ProductoPackage.Producto;

import java.util.ArrayList;

public abstract class PC extends Producto {
    protected ArrayList<DiscoDuro> discoDuro;
    protected MemoriaGrafica memoriaGrafica;
    protected PlacaBase placaBase;
    protected Procesador procesador;
    protected ArrayList<RAM> ram;

    public PC(float precio, String descripcion, String marca, ArrayList<DiscoDuro> discoDuro, MemoriaGrafica memoriaGrafica, PlacaBase placaBase, Procesador procesador, ArrayList<RAM> ram) {
        super(precio, descripcion, marca);
        this.discoDuro = discoDuro;
        this.memoriaGrafica = memoriaGrafica;
        this.placaBase = placaBase;
        this.procesador = procesador;
        this.ram = ram;
    }

    /**
     * Getters
     */
    public ArrayList<DiscoDuro> getDiscoDuro() {
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
    public ArrayList<RAM> getRam() {
        return ram;
    }

    @Override
    public abstract String toString();

    //public float sumaPrecioFinal(){};
}
