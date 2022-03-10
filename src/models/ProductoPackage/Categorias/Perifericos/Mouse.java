package models.ProductoPackage.Categorias.Perifericos;

import models.ProductoPackage.Producto;

public class Mouse extends Periferico {

    protected boolean botonesLatrales;
    protected int maxDPI;
    protected boolean lucesRGB;
    protected int numeroBotones;

    public Mouse(float precio, String descripcion, String marca, boolean esInalambrico, boolean botonesLatrales, int maxDPI, boolean lucesRGB, int numeroBotones) {
        super(precio, descripcion, marca, esInalambrico);
        this.botonesLatrales = botonesLatrales;
        this.maxDPI = maxDPI;
        this.lucesRGB = lucesRGB;
        this.numeroBotones = numeroBotones;
    }


    public boolean isBotonesLatrales() {
        return botonesLatrales;
    }

    public void setBotonesLatrales(boolean botonesLatrales) {
        this.botonesLatrales = botonesLatrales;
    }

    public int getMaxDPI() {
        return maxDPI;
    }

    public void setMaxDPI(int maxDPI) {
        this.maxDPI = maxDPI;
    }

    public boolean isLucesRGB() {
        return lucesRGB;
    }

    public void setLucesRGB(boolean lucesRGB) {
        this.lucesRGB = lucesRGB;
    }

    public int getNumeroBotones() {
        return numeroBotones;
    }

    public void setNumeroBotones(int numeroBotones) {
        this.numeroBotones = numeroBotones;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "botonesLatrales=" + botonesLatrales +
                ", maxDPI=" + maxDPI +
                ", lucesRGB=" + lucesRGB +
                ", numeroBotones=" + numeroBotones +
                ", esInalambrico=" + esInalambrico +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
