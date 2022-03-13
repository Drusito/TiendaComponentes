package models.ProductoPackage.Categorias.Perifericos;

public class Auricular extends Periferico{
    private final boolean tieneMicro;
    private final boolean tieneConexionUSB;

    /**
     * Constructor para crear objetos de la clase auricular
     * @param precio float con el precio del auricular
     * @param descripcion string con la descripción del auricular
     * @param marca string con la marca del auricular
     * @param esInalambrico boolean de si el auricular es inalámbrico (true) o no (false)
     * @param tieneMicro boolean de si el auricular tiene micro integrado (true) o no (false)
     * @param tieneConexionUSB boolean de si el auricular tiene conexión USB (true) o no (false)
     */
    public Auricular(float precio, String descripcion, String marca, boolean esInalambrico, boolean tieneMicro, boolean tieneConexionUSB) {
        super(precio, descripcion, marca, esInalambrico);
        this.tieneMicro = tieneMicro;
        this.tieneConexionUSB = tieneConexionUSB;
    }

    /**
     * Método para mostrar los valores de los atributos del auricular
     * @return string con los valores de los atributos del auricular
     */
    @Override
    public String toString() {
        return "Auricular{" +
                "tieneMicro=" + tieneMicro +
                ", tieneConexionUSB=" + tieneConexionUSB +
                ", esInalambrico=" + esInalambrico +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
