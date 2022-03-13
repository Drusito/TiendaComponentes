package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;
import models.ProductoPackage.Categorias.Perifericos.Mouse;
import models.ProductoPackage.Categorias.Perifericos.Pantalla;
import models.ProductoPackage.Categorias.Perifericos.Teclado;

import java.util.ArrayList;

public class Sobremesa extends PC implements accionesPC{
    protected boolean refrigeracionLiquida;

    public Sobremesa(float precio, String descripcion, String marca, ArrayList<Componente> componentesPC, boolean refrigeracionLiquida) {
        super(precio, descripcion, marca, componentesPC);
        this.refrigeracionLiquida = refrigeracionLiquida;
        this.precio = obtenerPrecioTotal();
    }

    /**
     * Getters
     */


    public boolean isRefrigeracionLiquida() {
        return refrigeracionLiquida;
    }
    /**
     * Setters
     */


    public void setRefrigeracionLiquida(boolean refrigeracionLiquida) {
        this.refrigeracionLiquida = refrigeracionLiquida;
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

    @Override
    public void montarPc(ArrayList<Componente> componentes) {
        this.componentesPC.addAll(componentes);
    }

    @Override
    public boolean cambiarPieza(int componenteACambiar, Componente nuevoComponente) {
        if(this.componentesPC.get(componenteACambiar).getClass()==nuevoComponente.getClass()){
            this.componentesPC.set(componenteACambiar, nuevoComponente);
            return true;
        }
        return false;
    }


}