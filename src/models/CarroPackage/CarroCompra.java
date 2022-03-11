package models.CarroPackage;

import java.util.ArrayList;

import models.ProductoPackage.Producto;

public class CarroCompra {
    private final ArrayList<Producto> carro;

    /**
     * Constructor
     * 
     */
    public CarroCompra() {
        this.carro = new ArrayList<>();
    }

    /**
     * Añadir un producto al carro
     * @param p producto que se pasa por parametro para añadir al carro
     */
    public void añadirAlCarro(Producto p) {
        this.carro.add(p);
    }
    /**
     * Quitar un producto de la array list carro
     * @param i el iterador de la array list del producto que se va a quitar
     */
    public void quitarDelCarro(int i) {
        this.carro.remove(i);
    }

    /**
     * Precio total de todos los productos del carrito
     * @return el precio final
     */
    public float precioTotal() {
        float total = 0;
        if(this.carro.size() > 0) {
            for (Producto p : this.carro) {
                total += p.getPrecio();
            }
        }
        return total;
    }
    
    /* Getters */
    /**
     * Getter de carro
     * @return array list de carro
     */
    public ArrayList<Producto> getCarro() {
        return this.carro;
    }

}
