package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;
import models.ProductoPackage.Categorias.Perifericos.Mouse;
import models.ProductoPackage.Categorias.Perifericos.Pantalla;
import models.ProductoPackage.Categorias.Perifericos.Teclado;

import java.util.ArrayList;

public class Sobremesa extends PC implements accionesPC{
    protected Pantalla pantalla;
    protected Teclado teclado;
    protected Mouse mouse;
    protected boolean refrigeracionLiquida;

    public Sobremesa(float precio, String descripcion, String marca, ArrayList<Componente> discoDuro, MemoriaGrafica memoriaGrafica, PlacaBase placaBase, Procesador procesador, ArrayList<Componente> ram, ArrayList<Componente> componentesPC, Pantalla pantalla, Teclado teclado, Mouse mouse, boolean refrigeracionLiquida) {
        super(precio, descripcion, marca, discoDuro, memoriaGrafica, placaBase, procesador, ram, componentesPC);
        this.pantalla = pantalla;
        this.teclado = teclado;
        this.mouse = mouse;
        this.refrigeracionLiquida = refrigeracionLiquida;
        this.precio = obtenerPrecioTotal();
    }

    /**
     * Getters
     */
    public Pantalla getPantalla() {
        return pantalla;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public boolean isRefrigeracionLiquida() {
        return refrigeracionLiquida;
    }
    /**
     * Setters
     */
    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setRefrigeracionLiquida(boolean refrigeracionLiquida) {
        this.refrigeracionLiquida = refrigeracionLiquida;
    }

    @Override
    public String toString() {
        return "Sobremesa{" +
                "discoDuro=" + discoDuro +
                ", memoriaGrafica=" + memoriaGrafica +
                ", placaBase=" + placaBase +
                ", procesador=" + procesador +
                ", ram=" + ram +
                ", pantalla=" + pantalla +
                ", teclado=" + teclado +
                ", mouse=" + mouse +
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
    public void cambiarPieza(Componente componenteCambiar) {
        for (Componente componente : this.componentesPC){
            if(componente.getClass()==componenteCambiar.getClass()){
                componente = componenteCambiar;
            }
        }
    }
}
