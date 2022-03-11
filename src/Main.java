import java.util.ArrayList;

import models.CarroPackage.CarroCompra;
import models.ProductoPackage.Producto;
import models.Utils.Utilities;

public class Main {
    public static void main(String[] args) {
        menuMain();
    }

    private static void menuMain() {
        int menu = 0;
        do {
            menu = Utilities.leerIntLimites("Menu principal\n1. Comprar\n2. Personalizador de pc\n3. Historial de compras\n4. Ver carrito\n5. Salir", 1, 5);
            switch(menu) {
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
                    System.out.println("Tu carrito");
                    mostrarProductos(CarroCompra.carrito.getCarro());
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                }
            }
        } while(menu != 5);
    }
    
    private static void menuComprar() {
        int menu = 0;
        do {
            menu = Utilities.leerIntLimites("Menu comprar\n\tEscoge una categoria para\n1. Ver categorias\n2. \n3. Atras", 1, 3);
            switch(menu) {
                case 1 -> {
                    System.out.println("Comprar");
                }
                case 2 -> {
                    System.out.println("Personalizar");
                }
                case 3 -> {
                    System.out.println("Volviendo atras...");
                }
            }
        } while(menu != 3);
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
