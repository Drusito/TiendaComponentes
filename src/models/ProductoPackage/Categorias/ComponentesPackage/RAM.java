package models.ProductoPackage.Categorias.ComponentesPackage;

public class RAM extends Componente {
    private int memoriaGB;

    /**
     * Constructor
     * @param precio
     * @param descripcion
     * @param marca
     * @param memoriaGB
     */
    public RAM(float precio, String descripcion, String marca, int memoriaGB) {
        super(precio, descripcion, marca);
        this.memoriaGB = memoriaGB;
    }

    /**
     * Getter
     */
    public int getMemoriaGB() {
        return memoriaGB;
    }

    //No hace falta Setter

    @Override
    public String toString() {
        return "RAM{" +
                "memoriaGB=" + memoriaGB +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
