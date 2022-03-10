package models.CarroPackage;

import java.util.ArrayList;

import models.ProductoPackage.Producto;

public class CarroCompra {
    public static CarroCompra carrito = new CarroCompra();

    private int id;
    private ArrayList<Producto> carro;
    private static int contador = 1;
    private static ArrayList<CarroCompra> compras = new ArrayList<>();
    /**
     * Constructor
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
        for (Producto p : this.carro) {
            total += p.getPrecio();
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
    public boolean finCompra() {
        if (this.carro.size() < 1) {
            return false;
        } else {
            this.id = CarroCompra.contador;
            CarroCompra.contador++;
            CarroCompra.compras.add(this);
            this.carro.clear();
            return true;
        }
    }
    
    /* Getters */

    /**
     * El historial de compras
     * @return compras es la array list de todas las compras
     */
    public ArrayList<CarroCompra> getCompras() {
        return CarroCompra.compras;
    }

    /**
     * Getter de carro
     * @return array list de carro
     */
    public ArrayList<Producto> getCarro() {
        return this.carro;
    }
}
