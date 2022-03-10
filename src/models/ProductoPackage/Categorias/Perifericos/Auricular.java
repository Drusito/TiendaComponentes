package models.ProductoPackage.Categorias.Perifericos;

public class Auricular extends Periferico{

    protected int maxVolum;
    protected boolean tieneMicro;
    protected boolean lucesRGB;
    protected boolean insonorizacion;

    public Auricular(float precio, String descripcion, String marca, boolean esInalambrico, int maxVolum, boolean tieneMicro, boolean lucesRGB, boolean insonorizacion) {
        super(precio, descripcion, marca, esInalambrico);
        this.maxVolum = maxVolum;
        this.tieneMicro = tieneMicro;
        this.lucesRGB = lucesRGB;
        this.insonorizacion = insonorizacion;
    }

    public int getMaxVolum() {
        return maxVolum;
    }

    public boolean isTieneMicro() {
        return tieneMicro;
    }

    public boolean isLucesRGB() {
        return lucesRGB;
    }

    public boolean isInsonorizacion() {
        return insonorizacion;
    }


    public void setMaxVolum(int maxVolum) {
        this.maxVolum = maxVolum;
    }

    public void setTieneMicro(boolean tieneMicro) {
        this.tieneMicro = tieneMicro;
    }

    public void setLucesRGB(boolean lucesRGB) {
        this.lucesRGB = lucesRGB;
    }

    public void setInsonorizacion(boolean insonorizacion) {
        this.insonorizacion = insonorizacion;
    }

    @Override
    public String toString() {
        return "Auricular{" +
                "maxVolum=" + maxVolum +
                ", tieneMicro=" + tieneMicro +
                ", lucesRGB=" + lucesRGB +
                ", insonorizacion=" + insonorizacion +
                ", esInalambrico=" + esInalambrico +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
