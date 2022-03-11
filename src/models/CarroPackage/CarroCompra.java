package models.CarroPackage;

import java.util.ArrayList;

import models.ProductoPackage.Producto;

public class CarroCompra {
    /**
     * Crear objeto estatico 
     */

    private int id;
    private final ArrayList<Producto> carro;
    private static int contador = 1;

    /**
     * Constructor
     * 
     * privado porque el objeto es estatico y el mismo para todos
     * 
     */
    public CarroCompra() {
        this.id = CarroCompra.contador;
        this.carro = new ArrayList<>();
        CarroCompra.contador++;
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
    
    /**
     * Final de compra 
     * Sobre escribe el indice autoincremental 
     * Añade todo el objeto a la array list de las compras 
     * Y vacia la array list de productos 
     * 
     * Vacia la array list de productos para poder reutilizar el mismo objeto de CarroCompra
     * 
     * @return un boolean por si se puede añadir o no
     */
/*    public boolean finCompra() {
        if (this.carro.size() < 1) {
            return false;
        } else {
            return true;
        }
    }*/
    
    /* Getters */

    /**
     * El historial de compras
     * @return compras es la array list de todas las compras
     */
    /**
     * Getter de carro
     * @return array list de carro
     */
    public ArrayList<Producto> getCarro() {
        return this.carro;
    }

    public int getId() {
        return this.id;
    }

}
