package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;
import models.ProductoPackage.Categorias.Perifericos.Mouse;
import models.ProductoPackage.Categorias.Perifericos.Pantalla;
import models.ProductoPackage.Categorias.Perifericos.Teclado;

import java.util.ArrayList;

public class Sobremesa extends PC {
    protected Pantalla pantalla;
    protected Teclado teclado;
    protected Mouse mouse;
    protected boolean refrigeracionLiquida;

    public Sobremesa(float precio, String descripcion, String marca, ArrayList<DiscoDuro> discoDuro, MemoriaGrafica memoriaGrafica, PlacaBase placaBase, Procesador procesador, ArrayList<RAM> ram, Pantalla pantalla, Teclado teclado, Mouse mouse, boolean refrigeracionLiquida) {
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
}
