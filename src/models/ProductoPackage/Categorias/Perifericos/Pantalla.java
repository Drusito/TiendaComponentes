package models.ProductoPackage.Categorias.Perifericos;

public class Pantalla extends Periferico{

    protected int pulgada;
    protected String tipoPanel;
    protected int tiempoRespuesta;
    protected int tasaRefresco;

    public Pantalla(float precio, String descripcion, String marca, boolean esInalambrico, int pulgada, String tipoPanel, int tiempoRespuesta, int tasaRefresco) {
        super(precio, descripcion, marca, esInalambrico);
        this.pulgada = pulgada;
        this.tipoPanel = tipoPanel;
        this.tiempoRespuesta = tiempoRespuesta;
        this.tasaRefresco = tasaRefresco;
    }

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }

    public String getTipoPanel() {
        return tipoPanel;
    }

    public void setTipoPanel(String tipoPanel) {
        this.tipoPanel = tipoPanel;
    }

    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(int tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public int getTasaRefresco() {
        return tasaRefresco;
    }

    public void setTasaRefresco(int tasaRefresco) {
        this.tasaRefresco = tasaRefresco;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "pulgada=" + pulgada +
                ", tipoPanel='" + tipoPanel + '\'' +
                ", tiempoRespuesta=" + tiempoRespuesta +
                ", tasaRefresco=" + tasaRefresco +
                ", esInalambrico=" + esInalambrico +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
