package models.ProductoPackage.Categorias.Perifericos;

public class Teclado extends Periferico{

    protected boolean mecanico;
    protected boolean lucesRGB;
    protected boolean tecladoEspañol;

    public Teclado(float precio, String descripcion, String marca, boolean esInalambrico, boolean mecanico, boolean lucesRGB, boolean tecladoEspañol) {
        super(precio, descripcion, marca, esInalambrico);
        this.mecanico = mecanico;
        this.lucesRGB = lucesRGB;
        this.tecladoEspañol = tecladoEspañol;
    }

    public boolean isMecanico() {
        return mecanico;
    }

    public void setMecanico(boolean mecanico) {
        this.mecanico = mecanico;
    }

    public boolean isLucesRGB() {
        return lucesRGB;
    }

    public void setLucesRGB(boolean lucesRGB) {
        this.lucesRGB = lucesRGB;
    }

    public boolean isTecladoEspañol() {
        return tecladoEspañol;
    }

    public void setTecladoEspañol(boolean tecladoEspañol) {
        this.tecladoEspañol = tecladoEspañol;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "esInalambrico=" + esInalambrico +
                ", mecanico=" + mecanico +
                ", lucesRGB=" + lucesRGB +
                ", tecladoEspañol=" + tecladoEspañol +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
