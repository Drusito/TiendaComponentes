package models.ProductoPackage.Categorias.ComponentesPackage;

public class MemoriaGrafica extends Componente {
    protected int memoriaDedicadaGB;

    public MemoriaGrafica(float precio, String descripcion, String marca, int memoriaDedicadaGB) {
        super(precio, descripcion, marca);
        this.memoriaDedicadaGB = memoriaDedicadaGB;
    }

    /**
     * Getters
     */
    public int getMemoriaDedicadaGB() {
        return memoriaDedicadaGB;
    }
    /**
     * Setters
     */
    public void setMemoriaDedicadaGB(int memoriaDedicadaGB) {
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
