package models.ProductoPackage.Categorias.ComponentesPackage;

public class Procesador extends Componente{
    private int numeroDeNucleos;
    private float frecuenciaHz;

    /**
     * Constructor
     * @param precio
     * @param descripcion
     * @param marca
     * @param numeroDeNucleos
     * @param frecuenciaHz
     */
    public Procesador(float precio, String descripcion, String marca, int numeroDeNucleos, float frecuenciaHz) {
        super(precio, descripcion, marca);
        this.numeroDeNucleos = numeroDeNucleos;
        this.frecuenciaHz = frecuenciaHz;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "numeroDeNucleos=" + numeroDeNucleos +
                ", frecuenciaHz=" + frecuenciaHz +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
