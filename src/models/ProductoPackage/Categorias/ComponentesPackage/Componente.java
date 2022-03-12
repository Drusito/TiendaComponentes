package models.ProductoPackage.Categorias.ComponentesPackage;

import models.ProductoPackage.Producto;

public abstract class Componente extends Producto {
    public Componente(float precio, String descripcion, String marca) {
        super(precio, descripcion, marca);
    }

    @Override
    public abstract String toString();
}
