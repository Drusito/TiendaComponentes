package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.*;

import java.util.ArrayList;

public class Portatil extends PC implements accionesPC{

    private final float pulgadasPantalla;
    private final boolean tieneHDMI;
    private final int puertosUSB;
    private final boolean tienePuertoAuriculares;

    /**
     * Contructor
     * @param precio
     * @param descripcion
     * @param marca
     * @param componentesPC
     * @param pulgadasPantalla
     * @param tieneHDMI
     * @param puertosUSB
     * @param tienePuertoAuriculares
     */
    public Portatil(float precio, String descripcion, String marca, ArrayList<Componente> componentesPC, float pulgadasPantalla, boolean tieneHDMI, int puertosUSB, boolean tienePuertoAuriculares) {
        super(precio, descripcion, marca, componentesPC);
        this.pulgadasPantalla = pulgadasPantalla;
        this.tieneHDMI = tieneHDMI;
        this.puertosUSB = puertosUSB;
        this.tienePuertoAuriculares = tienePuertoAuriculares;
        this.precio = obtenerPrecioTotal();
    }
    
    /**
     * Calcula el precio total del de todos los componentes
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
            return "Portatil{" +
                    "MAX_SLOTS=" + MAX_SLOTS +
                    ", componentesPC=" + componentesPC +
                    ", pulgadasPantalla=" + pulgadasPantalla +
                    ", tieneHDMI=" + tieneHDMI +
                    ", puertosUSB=" + puertosUSB +
                    ", tienePuertoAuriculares=" + tienePuertoAuriculares +
                    ", id=" + id +
                    ", precio=" + precio +
                    ", descripcion='" + descripcion + '\'' +
                    ", marca='" + marca + '\'' +
                    '}';
        }
}
