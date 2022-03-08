package models.ProductoPackage.Categorias.ComponentesPackage;

import models.ProductoPackage.Producto;

public class DiscoDuro extends Componente {

    protected float memoriaGB;
    protected boolean esPortatil;
    protected String tipo;
    protected float velocidadEscritura;

    public DiscoDuro(float precio, String descripcion, String marca, float memoriaGB, boolean esPortatil, String tipo, float velocidadEscritura) {
        super(precio, descripcion, marca);
        this.memoriaGB = memoriaGB;
        this.esPortatil = esPortatil;
        this.tipo = tipo;
        this.velocidadEscritura = velocidadEscritura;
    }

    /**
     * Getters
     * @return
     */
    public float getMemoriaGB() {
        return memoriaGB;
    }

    public boolean isEsPortatil() {
        return esPortatil;
    }

    public String getTipo() {
        return tipo;
    }

    public float getVelocidadEscritura() {
        return velocidadEscritura;
    }

    /**
     * Setters
     * @param memoriaGB
     */
    public void setMemoriaGB(float memoriaGB) {
        this.memoriaGB = memoriaGB;
    }

    public void setEsPortatil(boolean esPortatil) {
        this.esPortatil = esPortatil;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidadEscritura(float velocidadEscritura) {
        this.velocidadEscritura = velocidadEscritura;
    }

    @Override
    public String toString() {
            return "DiscoDuro{" +
                    "id=" + id +
                    ", precio=" + precio +
                    ", marca=" + marca +
                    ", descripcion='" + descripcion + '\'' +
                    ", memoriaGB=" + memoriaGB +
                    ", tipo=" + tipo +
                    ", esPortatil=" + esPortatil +
                    ", velocidadEscritura=" + velocidadEscritura +
                    '}';
    }
}
