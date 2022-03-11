import java.util.ArrayList;

import models.CarroPackage.CarroCompra;
import models.ProductoPackage.Producto;
import models.Tienda.Tienda;
import models.Utils.Utilities;

public class Main {
    public static void main(String[] args) {
        menuMain();
    }

    private static void menuMain() {
        int menu = 0;
        do {
            menu = Utilities.leerIntLimites(
                    "Menu principal\n1. Comprar\n2. Personalizador de pc\n3. Historial de compras\n4. Salir", 1, 4);
            switch (menu) {
                case 1 -> {
                    menuComprar();
                }
                case 2 -> {
                    System.out.println("Personalizar");
                }
                case 3 -> {
                    mostrarCompras();
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                }
            }
        } while (menu != 4);
    }

    private static void menuComprar() {
        int menu = 0;
        do {
            menu = Utilities.leerIntLimites(
                    "Menu comprar\n1. Ver categorias\n2. Finalizar compra\n3. Ver carrito\n4. Atras", 1, 4);
            switch (menu) {
                case 1 -> {
                    menuCategorias();
                }
                case 2 -> {
                    menuFinCompra();
                }
                case 3 -> {
                    System.out.println("Tu carrito");
                    mostrarProductos(CarroCompra.carrito.getCarro());
                }
                case 4 -> {
                    System.out.println("Volviendo atras...");
                }
            }
        } while (menu != 4);
    }

    private static void menuCategorias() {
        int menu = 0;
        do {
            menu = Utilities.leerIntLimites(
                    "Categorias\n\tEscoge una categoria\n1. Perifericos\n2. PCs\n3. Componentes\n4. Atras", 1, 4);
            switch (menu) {
                case 1 -> {
                    elegirPeriferico();
                }
                case 2 -> {
                    int iProducto = 0;
                    System.out.println("Esto son todos los perifericos");
                    mostrarProductos(Tienda.tienda.getPCs());
                    iProducto = Utilities.leerIntLimites(
                            "Escribe el indice del pc que quieres comprar o -1 para volver atras", -1,
                            Tienda.tienda.getPerifericos().size() - 1);
                    CarroCompra.carrito.añadirAlCarro(Tienda.tienda.getPerifericos().get(iProducto));
                }
                case 3 -> {
                    // TODO: mostrar Componentes
                }
                case 4 -> {
                    System.out.println("Volviendo atras...");
                }
            }
        } while (menu != 4);
    }

    private static void elegirPeriferico() {
        int iProducto = 0;
        System.out.println("Esto son todos los perifericos");
        mostrarProductos(Tienda.tienda.getPerifericos());
        iProducto = Utilities.leerIntLimites(
                "Escribe el indice del periferico que quieres comprar o -1 para volver atras", -1,
                Tienda.tienda.getPerifericos().size() - 1);
        CarroCompra.carrito.añadirAlCarro(Tienda.tienda.getPerifericos().get(iProducto));
    }

    private static void menuFinCompra() {
        if (CarroCompra.carrito.finCompra()) {
            System.out
                    .println("La compra se ha finalizado el precio total ha sido " + CarroCompra.carrito.precioTotal());
            System.out.println("Resumen de la compra");
            System.out.println("Compra numero " + CarroCompra.carrito.getId());
            mostrarProductos(CarroCompra.getCompras().get(CarroCompra.getCompras().size() - 1).getCarro());
        } else {
            System.out.println("No tienes ningun producto en el carrito");
        }
    }

    private static void mostrarProductos(ArrayList<Producto> ap) {
        for (int i = 0; i < ap.size(); i++) {
            System.out.println(i + ap.get(i).toString());
        }
    }

    private static void mostrarCompras() {
        System.out.println("Estos son tus ultimas compras");

        for (CarroCompra cc : CarroCompra.getCompras()) {
            System.out.println("Compra numero " + cc.getId());
            mostrarProductos(cc.getCarro());
        }
    }

}
