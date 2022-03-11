package models.ProductoPackage.Categorias.Perifericos;

public class Pantalla extends Periferico{
    private final float pulgadasPantalla;
    private final int resolucionAnchura;
    private final int resolucionAltura;
    private final int bitsColor;
    private final boolean esAntireflectante;

    /**
     * Constructor para crear objetos de la clase pantalla
     * @param precio float con el precio de la pantalla
     * @param descripcion string con la descripción de la pantalla
     * @param marca string con la marca de la pantalla
     * @param esInalambrico boolean de si la pantalla es inalámbrica (true) o no (false)
     * @param pulgadasPantalla int con las pulgadas de la pantalla
     * @param resolucionAnchura int con la resolución de la anchura de la pantalla
     * @param resolucionAltura int con la resolución de la altura de la pantalla
     * @param bitsColor int con los bits de color que soporta la pantalla
     * @param esAntireflectante boolean de si la pantalla es antireflectante (true) o no (false)
     */
    public Pantalla(float precio, String descripcion, String marca, boolean esInalambrico, float pulgadasPantalla, int resolucionAnchura, int resolucionAltura, int bitsColor, boolean esAntireflectante) {
        super(precio, descripcion, marca, esInalambrico);
        this.pulgadasPantalla = pulgadasPantalla;
        this.resolucionAnchura = resolucionAnchura;
        this.resolucionAltura = resolucionAltura;
        this.bitsColor = bitsColor;
        this.esAntireflectante = esAntireflectante;
    }

    //GETTERS

    /**
     * Método para saber las pulgadas de la pantalla
     * @return float con las pulgadas de la pantalla
     */
    public float getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    /**
     * Método para saber la resolución de la anchura de la pantalla
     * @return int con la resolución de la anchura de la pantalla
     */
    public int getResolucionAnchura() {
        return resolucionAnchura;
    }

    /**
     * Método para saber la resolución de la altura de la pantalla
     * @return int con la resolución de la altura de la pantalla
     */
    public int getResolucionAltura() {
        return resolucionAltura;
    }

    /**
     * Método para saber los bits de color que soporta la pantalla
     * @return int con la cantidad de bits de color que soporta la pantalla
     */
    public int getBitsColor() {
        return bitsColor;
    }

    /**
     * Método para saber si la pantalla es antireflectante o no
     * @return boolean true (si es antireflectante) / false (si no lo es)
     */
    public boolean esAntireflectante() {
        return esAntireflectante;
    }

    /**
     * Método para mostrar los valores de los atributos de la pantalla
     * @return string con los valores de los atributos de la pantalla
     */
    @Override
    public String toString() {
        return "Pantalla{" +
                "pulgadasPantalla=" + pulgadasPantalla +
                ", resolucionAnchura=" + resolucionAnchura +
                ", resolucionAltura=" + resolucionAltura +
                ", bitsColor=" + bitsColor +
                ", esAntireflectante=" + esAntireflectante +
                ", esInalambrico=" + esInalambrico +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
