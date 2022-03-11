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
                case 1 :
                    menuComprar();
                    break;
                case 2 :
                    //TODO: menuPersonalizar();
                    break;
                case 3 :
                    break;
                
                case 4 :
                    System.out.println("Saliendo...");
                    break;
            }
        } while (menu != 4);
    }

    private static void menuComprar() {
        int menu = 0;
        do {
            menu = Utilities.leerIntLimites(
                    "Menu comprar\n1. Ver categorias\n2. Finalizar compra\n3. Ver carrito\n4. Atras", 1, 4);
            switch (menu) {
                case 1:
                    menuCategorias();
                    break;

                case 2:
                    menuFinCompra();
                    break;

                case 3:
                    menuVerCarrito();
                    break;

                case 4:
                    System.out.println("Volviendo atras...");
                    break;

            }
        } while (menu != 4);
    }

    private static void menuCategorias() {
        int menu = 0;
        do {
            menu = Utilities.leerIntLimites(
                    "Categorias\n\tEscoge una categoria\n1. Perifericos\n2. PCs\n3. Componentes\n4. Atras", 1, 4);
            switch (menu) {
                case 1:
                    elegirPeriferico();
                    break;
                case 2:
                    elegitPC();
                    break;
                case 3:
                    elegitComponente();
                    break;
                case 4:
                    System.out.println("Volviendo atras...");
                    break;
            }
        } while (menu != 4);
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

    private static void menuVerCarrito() {
        if (CarroCompra.carrito.getCarro().size() > 0) {
            System.out.println("Tu carrito");
            mostrarProductos(CarroCompra.carrito.getCarro());
        } else {
            System.out.println("Tu carrito esta vacio");
        }
    }

    private static void elegitPC() {
        int iProducto = 0;
        System.out.println("Esto son todos los pc");
        mostrarProductos(Tienda.tienda.getPCs());
        iProducto = Utilities.leerIntLimites(
                "Escribe el indice del portatil o equipo sobre mesa premontado que quieres añadir al carrito o -1 para volver atras (Tambien puedes personalizarte un pc desde el menu principal)",
                -1,
                Tienda.tienda.getPCs().size() - 1);
        if (iProducto != -1) {
            CarroCompra.carrito.añadirAlCarro(Tienda.tienda.getPCs().get(iProducto));
        }
    }

    private static void elegirPeriferico() {
        int iProducto = 0;
        System.out.println("Esto son todos los perifericos");
        mostrarProductos(Tienda.tienda.getPerifericos());
        iProducto = Utilities.leerIntLimites(
                "Escribe el indice del periferico que quieres añadir al carrito o -1 para volver atras", -1,
                Tienda.tienda.getPerifericos().size() - 1);
        if (iProducto != -1) {
            CarroCompra.carrito.añadirAlCarro(Tienda.tienda.getPerifericos().get(iProducto));
        }
    }

    private static void elegitComponente() {
        int iProducto = 0;
        System.out.println("Esto son todos los componentes");
        mostrarProductos(Tienda.tienda.getComponentes());
        iProducto = Utilities.leerIntLimites(
                "Escribe el indice del componente que quieres añadir al carrito o -1 para volver atras", -1,
                Tienda.tienda.getPerifericos().size() - 1);
        if (iProducto != -1) {
            CarroCompra.carrito.añadirAlCarro(Tienda.tienda.getPerifericos().get(iProducto));
        }
    }

    private static void mostrarProductos(ArrayList<Producto> ap) {
        for (int i = 0; i < ap.size(); i++) {
            System.out.println(i + ap.get(i).toString());
        }
    }

    private static void mostrarCompras() {
        if (CarroCompra.getCompras().size() > 0) {
            System.out.println("Estos son tus ultimas compras");

            for (CarroCompra cc : CarroCompra.getCompras()) {
                System.out.println("Compra numero " + cc.getId());
                mostrarProductos(cc.getCarro());
            }
        } else {
            System.out.println("No tienes compras recientes");
        }
    }

}
