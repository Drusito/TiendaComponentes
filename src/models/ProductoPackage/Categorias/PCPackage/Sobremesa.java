package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;
import models.ProductoPackage.Categorias.Perifericos.Mouse;
import models.ProductoPackage.Categorias.Perifericos.Pantalla;
import models.ProductoPackage.Categorias.Perifericos.Teclado;

import java.util.ArrayList;

public class Sobremesa extends PC implements accionesPC{
    private Pantalla pantalla;
    private Teclado teclado;
    private Mouse mouse;
    private boolean refrigeracionLiquida;

    public Sobremesa(float precio, String descripcion, String marca, ArrayList<Componente> discoDuro, MemoriaGrafica memoriaGrafica, PlacaBase placaBase, Procesador procesador, ArrayList<Componente> ram, Pantalla pantalla, Teclado teclado, Mouse mouse, boolean refrigeracionLiquida) {
        super(precio, descripcion, marca, discoDuro, memoriaGrafica, placaBase, procesador, ram);
        this.pantalla = pantalla;
        this.teclado = teclado;
        this.mouse = mouse;
        this.refrigeracionLiquida = refrigeracionLiquida;
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
    public ArrayList<Componente> montarPc(ArrayList<Componente> componentes) {
    return null;
    }
    @Override
    public Componente cambiarPieza(Componente componenteCambio) {
        return null;
    }
}
