package models.ProductoPackage.Categorias.ComponentesPackage;

public class MemoriaGrafica extends Componente {
    private int memoriaDedicadaGB;

    /**
     * Constructor
     * @param precio
     * @param descripcion
     * @param marca
     * @param memoriaDedicadaGB
     */
    public MemoriaGrafica(float precio, String descripcion, String marca, int memoriaDedicadaGB) {
        super(precio, descripcion, marca);
        this.memoriaDedicadaGB = memoriaDedicadaGB;
    }

    @Override
    public String toString() {
        return "MemoriaGrafica{" +
                "memoriaDedicadaGB=" + memoriaDedicadaGB +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
