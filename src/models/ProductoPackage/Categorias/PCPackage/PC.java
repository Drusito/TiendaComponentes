package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;
import models.ProductoPackage.Producto;

import java.util.ArrayList;

public abstract class PC extends Producto {
    protected int MAX_SLOTS = 2;

    protected ArrayList<Componente> componentesPC;

    /**
     * Constructor
     * @param precio
     * @param descripcion
     * @param marca
     * @param componentesPC
     */
    public PC(float precio, String descripcion, String marca, ArrayList<Componente> componentesPC) {
        super(precio, descripcion, marca);
        this.componentesPC = componentesPC;
    }

    /**
     * Getter de componentes del pc
     * @return los componentes del pc
     */
    public ArrayList<Componente> getComponentesPC() {
        return componentesPC;
    }

    // metodos abstractos
    @Override
    public abstract String toString();
    protected abstract float obtenerPrecioTotal();
}
