package models.ProductoPackage.Categorias.ComponentesPackage;

import models.ProductoPackage.Producto;

public class DiscoDuro extends Componente {

    private float memoriaGB;
    private boolean esPortatil;
    private String tipo;
    private float velocidadEscritura;

    /**
     * Constructor
     * @param precio
     * @param descripcion
     * @param marca
     * @param memoriaGB
     * @param esPortatil
     * @param tipo
     * @param velocidadEscritura
     */
    public DiscoDuro(float precio, String descripcion, String marca, float memoriaGB, boolean esPortatil, String tipo, float velocidadEscritura) {
        super(precio, descripcion, marca);
        this.memoriaGB = memoriaGB;
        this.esPortatil = esPortatil;
        this.tipo = tipo;
        this.velocidadEscritura = velocidadEscritura;
    }

    /**
     * Getters
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
