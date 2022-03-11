package models.ProductoPackage.Categorias.Perifericos;

public class Mouse extends Periferico{
    private final int numBotones;
    private final boolean esConfigurable;
    private final int dpi;
    private short sensibilidad; //condiguración desde el ordenador 1 (muy baja) a 11 (muy alta)
    private final short MIN_SENSIBILIDAD = 1;
    private final short MAX_SENSIBILIDAD = 11;

    /**
     * Constructor para crear objetos del tipo mouse
     * @param precio float con el precio del ratón
     * @param descripcion string con la descripción del ratón
     * @param marca string con la marca del ratón
     * @param esInalambrico boolean de si el ratón es inalámbrico (true) o no (false)
     * @param numBotones int con el número de botones del ratón
     * @param esConfigurable boolean de si el ratón es configurable (true) o no (false)
     * @param dpi int con el dpi que soporta el ratón
     * @param sensibilidad short con la sensibilidad configurada del ratón 1-11
     */
    public Mouse(float precio, String descripcion, String marca, boolean esInalambrico, int numBotones, boolean esConfigurable, int dpi, short sensibilidad) {
        super(precio, descripcion, marca, esInalambrico);
        this.numBotones = numBotones;
        this.esConfigurable = esConfigurable;
        this.dpi = dpi;
        this.sensibilidad = sensibilidad;
    }

    //GETTERS

    /**
     * Método para saber el número de botones del ratón
     * @return int con el número de botones del ratón
     */
    public int getNumBotones() {
        return numBotones;
    }

    /**
     * Método para saber si el ratón es configurable o no
     * @return boolean true (si es configurable) / false (si no lo es)
     */
    public boolean esConfigurable() {
        return esConfigurable;
    }

    /**
     * Método para saber el dpi que soporta el ratón
     * @return int con el valor del dpi
     */
    public int getDpi() {
        return dpi;
    }

    /**
     * Método para saber la sensibilidad del ratón
     * @return short con el valor de la sensibilidad (1-11)
     */
    public short getSensibilidad() {
        return sensibilidad;
    }

    //SETTERS

    /**
     * Método para cambiar la sensibiliad del ratón
     * @param sensibilidad short con la nueva sensibilidad del ratón (1-11)
     */
    public boolean setSensibilidad(short sensibilidad) {
        //System.out.println("Valores fuera de rango. Introduzca valores del 1 al 11");
        if(sensibilidad < MIN_SENSIBILIDAD || sensibilidad > MAX_SENSIBILIDAD){
            return false;
        }
        else{
            this.sensibilidad = sensibilidad;
            return true;
        }
    }

    /**
     * Método para mostrar los valores de los atributos del ratón
     * @return string con los valores de los atributos del ratón
     */
    @Override
    public String toString() {
        return "Mouse{" +
                "numBotones=" + numBotones +
                ", esConfigurable=" + esConfigurable +
                ", dpi=" + dpi +
                ", sensibilidad=" + sensibilidad +
                ", esInalambrico=" + esInalambrico +
                ", id=" + id +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
