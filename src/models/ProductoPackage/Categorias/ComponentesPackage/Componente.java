package models.ProductoPackage.Categorias.ComponentesPackage;

import models.ProductoPackage.Producto;

public abstract class Componente extends Producto {
    /**
     * Constructor
     * @param precio
     * @param descripcion
     * @param marca
     */
    public Componente(float precio, String descripcion, String marca) {
        super(precio, descripcion, marca);
    }
    /**
     * To string abstracto para que se desarolle en las clases hijas
     */
    @Override
    public abstract String toString();
}
