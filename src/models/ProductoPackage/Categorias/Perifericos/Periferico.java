package models.ProductoPackage.Categorias.Perifericos;

import models.ProductoPackage.Producto;

public abstract class Periferico extends Producto {
    protected boolean esInalambrico;

    /**
     * Contructor
     * @param precio
     * @param descripcion
     * @param marca
     * @param esInalambrico
     */
    public Periferico(float precio, String descripcion, String marca, boolean esInalambrico) {
        super(precio, descripcion, marca);
        this.esInalambrico = esInalambrico;
    }

    /**
     * toString abstract para que se defina en las clases hijas
     */
    @Override
    public abstract String toString();
}
