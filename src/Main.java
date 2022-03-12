import java.util.ArrayList;

import models.CarroPackage.CarroCompra;
import models.ProductoPackage.Categorias.ComponentesPackage.*;
import models.ProductoPackage.Categorias.PCPackage.PC;
import models.ProductoPackage.Producto;
import models.Tienda.Tienda;
import models.Utils.Utilities;

public class Main {
    static ArrayList<CarroCompra> historialCompras = new ArrayList<>();
    static CarroCompra carro;

    public static void main(String[] args) {
        carro = crearCarro();
        init();
        menuMain();
    }

    private static void menuMain() {
        int menu = 0;
        do {
            menu = Utilities.leerIntLimites(
                    "Menu principal\n1. Comprar\n2. Personalizador de pc\n3. Historial de compras\n4. Salir", 1, 4);
            switch (menu) {
                case 1:
                    menuComprar();
                    break;
                case 2:
                    // TODO: menuPersonalizar();
                    break;
                case 3:
                    menuMostrarCompras();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (menu != 4);
    }

/*    Hacer metodo que tenga por parametro un arraylist de componentes.
    Dentro del metodo Clasificar por instancia con instanceOF

    Dentro del metodo crear una instancia de cada objeto vacia:
    Ejemplo-> DiscoDuro discoduro;

    Hacer For que recorra el arrayList, dentro del for condicional con if instance of DiscoDuro
            discoDuro = esa posicion del arraylist

    Esto con todos los componentes

            Luegoc

    Portatil portatilo = new portatil(TODOS LOS COMPONENTES)*/


    private static void menuComprar() {
        int menu = 0;
        do {
            menu = Utilities.leerIntLimites(
                    "Menu comprar\n1. Ver categorias\n2. Finalizar compra\n3. Ver carrito\n4. Quitar del carrito\n5. Atras",
                    1, 5);
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
                    menuQuitarPCarro();
                    break;
                case 5:
                    System.out.println("Volviendo atras...");
                    break;

            }
        } while (menu != 5);
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
                    //elegitPC();
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
        // El id no puede ser con contador static porque el constructor se usara muchas
        // veces y mas de una vez
        if (carro.getCarro().size() > 0) {
            historialCompras.add(carro);
            System.out.println("\tResumen de la compra numero " + (historialCompras.size()));
            mostrarProductos(carro.getCarro());
            System.out.println("Con el precio total de " + calcPrecioCarro(carro.getCarro()));
            carro = crearCarro();
        } else {
            System.out.println("Tu carrito esta vacio");
        }
    }
    
    private static void menuQuitarPCarro() {
        int iProducto = 0;
        if (carro.getCarro().size() > 0) {
            System.out.println("Tu carrito");
            mostrarProductos(carro.getCarro());
            iProducto = Utilities.leerIntLimites("Escribe el index del producto que quieres quitar del carro o 0 para volver atras", 0,
            carro.getCarro().size()) - 1;
            if (iProducto != -1) {
                carro.quitarDelCarro(iProducto);
            }
        } else {
            System.out.println("Tu carrito esta vacio");
        }
    }

    private static void menuVerCarrito() {
        if (carro.getCarro().size() > 0) {
            System.out.println("Tu carrito");
            mostrarProductos(carro.getCarro());
            System.out.println("Con el precio total de " + calcPrecioCarro(carro.getCarro()));
        } else {
            System.out.println("Tu carrito esta vacio");
        }
    }

    /* private static void elegitPC() {
        int iProducto = 0;
        System.out.println("Esto son todos los pc");
        mostrarProductos(Tienda.tienda.getPCs());
        iProducto = Utilities.leerIntLimites(
                "Escribe el indice del portatil o equipo sobre mesa premontado que quieres añadir al carrito o 0 para volver atras (Tambien puedes personalizarte un pc desde el menu principal)",
                0,
                Tienda.tienda.getPCs().size()) - 1;
        if (iProducto != -1) {
            carro.añadirAlCarro(Tienda.tienda.getPCs().get(iProducto));
        }
    } */

    private static void elegirPeriferico() {
        int iProducto = 0;
        boolean ctrl;
        do {
            ctrl = true;
            System.out.println("Esto son todos los perifericos");
            mostrarProductos(Tienda.tienda.getPerifericos());
            iProducto = Utilities.leerIntLimites(
                    "Escribe el indice del periferico que quieres añadir al carrito o 0 para volver atras", 0,
                    Tienda.tienda.getPerifericos().size()) - 1;
            if (iProducto != -1) {
                ctrl = añadirPerifericoAlCarro(iProducto);
            }
        } while (!ctrl);
    }

    private static boolean añadirPerifericoAlCarro(int iProducto) {
        System.out.println("Informacion del periferico elegido");
        System.out.println(Tienda.tienda.getPerifericos().get(iProducto).toString());
        int iComprar = Utilities.leerIntLimites("Si quieres añadir el producto al carrito escribe 1 o si quieres volver atras escribe 0", 0, 1);
        if (iComprar == 1) {
            carro.añadirAlCarro(Tienda.tienda.getPerifericos().get(iProducto));
            System.out.println("Gracias por añadir " + Tienda.tienda.getPerifericos().get(iProducto).getClass().getSimpleName() + " " + Tienda.tienda.getPerifericos().get(iProducto).getMarca());
            return true;
        }
        return false;
    }

    private static void elegitComponente() {
        int iProducto = 0;
        boolean ctrl;
        do {
            ctrl = true;
            System.out.println("Esto son todos los componentes");
            mostrarProductos(Tienda.tienda.getComponentes());
            iProducto = Utilities.leerIntLimites(
                    "Escribe el indice del componente del que quieres ver la informacion o 0 para volver atras", 0,
                    Tienda.tienda.getComponentes().size()) - 1;
            if (iProducto != -1) {
                ctrl = añadirComponenteAlCarro(iProducto);
            }
        } while (!ctrl);
    }

    private static boolean añadirComponenteAlCarro(int iProducto) {
        System.out.println("Informacion del perifgerico elegido");
        System.out.println(Tienda.tienda.getComponentes().get(iProducto).toString());
        int iComprar = Utilities.leerIntLimites("Si quieres añadir el producto al carrito escribe 1 o si quieres volver atras escribe 0", 0, 1);
        if (iComprar == 1) {
            carro.añadirAlCarro(Tienda.tienda.getComponentes().get(iProducto));
            System.out.println("Gracias por añadir " + Tienda.tienda.getComponentes().get(iProducto).getClass().getSimpleName() + " " + Tienda.tienda.getComponentes().get(iProducto).getMarca());
            return true;
        }
        return false;
    }

    private static void mostrarProductos(ArrayList<Producto> ap) {
        for (int i = 0; i < ap.size(); i++) {
            System.out.println((i + 1) + " " + ap.get(i).getClass().getSimpleName() + " " + ap.get(i).getMarca() + " " + ap.get(i).getPrecio() + "€");
        }
    }

    private static void menuMostrarCompras() {
        if (historialCompras.size() > 0) {
            System.out.println("Estos son tus ultimas compras");
            for (int i = 0; i < historialCompras.size(); i++) {
                System.out.println("\tCompra numero " + (i + 1));
                mostrarProductos(historialCompras.get(i).getCarro());
                System.out.println("Con el precio total de " + calcPrecioCarro(historialCompras.get(i).getCarro()));
            }
        } else {
            System.out.println("No tienes compras recientes");
        }
    }
    
        private static float calcPrecioCarro(ArrayList<Producto> carro) {
            float total = 0;
            for (Producto cc : carro) {
                total += cc.getPrecio();
            }
            return total;
        }

    private static CarroCompra crearCarro() {
        return new CarroCompra();
    }

    private static void init() {
        Tienda.tienda.initPC();
        Tienda.tienda.initPerifericos();
        Tienda.tienda.initComponentes();
    }
}
