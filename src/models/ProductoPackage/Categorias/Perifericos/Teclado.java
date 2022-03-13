package models.ProductoPackage.Categorias.Perifericos;

public class Teclado extends Periferico{
    private final boolean tieneLuz;
    private final boolean tieneTeclasProgramables;

    /**
     * Constructor para crear objetos de la clase teclado
     * @param precio float con el precio del teclado
     * @param descripcion string con la descripción del teclado
     * @param marca string con la marca del teclado
     * @param esInalambrico boolean de si el teclado es inalámbrico (true) o no (false)
     * @param tieneLuz boolean de si el teclado tiene luz (true) o no (false)
     * @param tieneTeclasProgramables boolean de si se pueden programar las teclas (true) o no (false)
     */
    public Teclado(float precio, String descripcion, String marca, boolean esInalambrico, boolean tieneLuz, boolean tieneTeclasProgramables) {
        super(precio, descripcion, marca, esInalambrico);
        this.tieneLuz = tieneLuz;
        this.tieneTeclasProgramables = tieneTeclasProgramables;
    }

     //GETTERS

    /**
     * Método para saber si el teclado tiene luz o no
     * @return boolean true (si tiene luz) / false (si no tiene)
     */
    public boolean tieneLuz() {
        return tieneLuz;
    }

    /**
     * Método para saber si se pueden programar las teclas del teclado o no
     * @return boolean true (si tiene teclas programables) / false (si no tiene)
     */
    public boolean tieneTeclasProgramables() {
        return tieneTeclasProgramables;
    }

    /**
     * Método para mostrar los valores de los atributos del teclado
     * @return string con los valores de los atributos del teclado
     */
    @Override
    public String toString() {
        return "Teclado{" +
                "esInalambrico=" + esInalambrico +
                ", tieneLuz=" + tieneLuz +
                ", tieneTeclasProgramables=" + tieneTeclasProgramables +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
