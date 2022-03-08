package models.ProductoPackage.Categorias.Perifericos;

import models.ProductoPackage.Producto;

public abstract class Periferico extends Producto {
    protected boolean esInalambrico;

    public Periferico(float precio, String descripcion, String marca, boolean esInalambrico) {
        super(precio, descripcion, marca);
        this.esInalambrico = esInalambrico;
    }

    @Override
    public abstract String toString();
}
