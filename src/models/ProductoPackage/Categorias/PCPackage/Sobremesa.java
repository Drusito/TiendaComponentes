package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;

import java.util.ArrayList;

public class Sobremesa extends PC implements accionesPC{
    private boolean refrigeracionLiquida;

    /**
     * Contructor
     * @param precio
     * @param descripcion
     * @param marca
     * @param componentesPC
     * @param refrigeracionLiquida
     */
    public Sobremesa(float precio, String descripcion, String marca, ArrayList<Componente> componentesPC, boolean refrigeracionLiquida) {
        super(precio, descripcion, marca, componentesPC);
        this.refrigeracionLiquida = refrigeracionLiquida;
        this.precio = obtenerPrecioTotal();
    }

    /**
     * Calcula el precio total del pc
     */
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
    
    /**
     * Cambia una pieza
     * @param componenteACambiar int de la posicion del viejo componente
     * @param nuevoComponente se aplica un nuevo componente a la posicion del viejo
     */
    @Override
    public boolean cambiarPieza(int componenteACambiar, Componente nuevoComponente) {
        if(this.componentesPC.get(componenteACambiar).getClass()==nuevoComponente.getClass()){
            this.componentesPC.set(componenteACambiar, nuevoComponente);
            precio = obtenerPrecioTotal();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Sobremesa{" +
                "MAX_SLOTS=" + MAX_SLOTS +
                ", componentesPC=" + componentesPC +
                ", refrigeracionLiquida=" + refrigeracionLiquida +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}