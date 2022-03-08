package models.ProductoPackage;

public abstract class Producto {
    protected static int contador;
    protected int id;
    protected float precio;
    protected String descripcion;
    protected String marca;

    public Producto(float precio, String descripcion, String marca) {
        Producto.contador++;
        this.id = Producto.contador;
        this.precio = precio;
        this.descripcion = descripcion;
        this.marca = marca;
    }

    /**
     * Getters
     * @return
     */
    public String getMarca() {
        return marca;
    }
    public static int getContador() {
        return contador;
    }

    public int getId() {
        return id;
    }

    public float getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Setters
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public abstract String toString();

}
