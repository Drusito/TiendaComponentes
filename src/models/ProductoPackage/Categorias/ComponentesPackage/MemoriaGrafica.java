package models.ProductoPackage.Categorias.ComponentesPackage;

public class MemoriaGrafica extends Componente{
    protected String chip;
    protected String memoria;
    protected String velocidadRelog;
    protected String maximaResolucion;

    public MemoriaGrafica(float precio, String descripcion, String marca, String chip, String memoria, String velocidadRelog, String maximaResolucion) {
        super(precio, descripcion, marca);
        this.chip = chip;
        this.memoria = memoria;
        this.velocidadRelog = velocidadRelog;
        this.maximaResolucion = maximaResolucion;
    }

    public String getChip() {return chip;}

    public String getMemoria() {return memoria;}

    public String getVelocidadRelog() {return velocidadRelog;}

    public String getMaximaResolucion() {return maximaResolucion;}


    public void setChip(String chip) {this.chip = chip;}

    public void setMemoria(String memoria) {this.memoria = memoria;}

    public void setVelocidadRelog(String velocidadRelog) {this.velocidadRelog = velocidadRelog;}

    public void setMaximaResolucion(String maximaResolucion) {this.maximaResolucion = maximaResolucion;}


    @Override
    public String toString() {
        return "MemoriaGrafica{" +
                "chip='" + chip + '\'' +
                ", memoria='" + memoria + '\'' +
                ", velocidadRelog='" + velocidadRelog + '\'' +
                ", maximaResolucion='" + maximaResolucion + '\'' +
                '}';
    }
}
