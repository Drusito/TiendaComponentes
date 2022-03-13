import java.util.ArrayList;

import models.CarroPackage.CarroCompra;
import models.ProductoPackage.Categorias.ComponentesPackage.*;
import models.ProductoPackage.Categorias.PCPackage.PC;
import models.ProductoPackage.Categorias.PCPackage.Sobremesa;
import models.ProductoPackage.Categorias.PCPackage.accionesPC;
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
                    menuPersonalizar();
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
                    menuPc();
                    break;
                case 3:
                    elegirComponente();
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
    private static void menuPc(){
        int menu = 0;
        do {
            menu = Utilities.leerIntLimites(
                    "Menu PC\n\tEscoge una Opcion\n1. Elegir PC montado.\n2. Montar PC\n3. Atras", 1, 3);
            switch (menu) {
                case 1:
                    elegirPc();
                    break;
                case 2:
                    montarPC();
                    break;
                case 4:
                    System.out.println("Volviendo atras...");
                    break;
            }
        } while (menu != 3);
    }
    private static void montarPC(){
        ArrayList<Componente> componentesPcMontar = new ArrayList<>();
        int numeroMaximoComponentes = 5;
        int numeroComponentes = 0;
        int iComponente;
        boolean duplicado = false;
        while (numeroComponentes<numeroMaximoComponentes){
            System.out.println("Tienes "+numeroComponentes+"/"+numeroMaximoComponentes+" componentes.");
            System.out.println();
            mostrarProductos(Tienda.tienda.getComponentes());
            iComponente = Utilities.leerIntLimites("Elige un componente: ", 1, Tienda.tienda.getComponentes().size()-1);
            iComponente--;
            if(componentesPcMontar.size() != 0) {
                for (int i = 0; i < componentesPcMontar.size(); i++) {
                    if(Tienda.tienda.getComponentes().get(iComponente).getClass() == componentesPcMontar.get(i).getClass()/* && i != componentesPcMontar.size()-1*/){
                        System.out.println("ERROR: Ya tienes un componente de este tipo.");
                        duplicado = true;
                    }
                    else {
                        duplicado=false;
                    }
                }
                if(!duplicado){
                    componentesPcMontar.add((Componente) Tienda.tienda.getComponentes().get(iComponente));
                    numeroComponentes++;
                }
            }
            else {
                componentesPcMontar.add((Componente) Tienda.tienda.getComponentes().get(iComponente));
                numeroComponentes++;
            }

        }
        añadirPcAlCarro(new Sobremesa(0, "Pc Montado por ti mismo campeon!", "ASUS", componentesPcMontar,false));
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

    private static void elegirComponente() {
        int iProducto = 0;
        boolean ctrl;
        do {
            ctrl = true;
            System.out.println("Componentes:");
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

    private static void elegirPc() {
        ArrayList<Producto> pcs = new ArrayList<>();
        for (int i = 0; i < Tienda.tienda.getPortatiles().size(); i++) {
            pcs.add(Tienda.tienda.getPortatiles().get(i));
        }
        for (int i = 0; i < Tienda.tienda.getSobremesas().size(); i++) {
            pcs.add(Tienda.tienda.getSobremesas().get(i));
        }
        int iProducto = 0;
        boolean ctrl;
        do {
            ctrl = true;
            System.out.println("PCs:");
            mostrarProductos(pcs);
            iProducto = Utilities.leerIntLimites(
                    "Escribe el indice del pc del que quieres ver la informacion o 0 para volver atras", 0,
                    pcs.size()) - 1;
            if (iProducto != -1) {
                ctrl = añadirPcAlCarro(pcs.get(iProducto));
            }
        } while (!ctrl);
    }

    private static boolean añadirPcAlCarro(Producto pc) {
        System.out.println("Informacion del pc elegido");
        System.out.println(pc);
        int iComprar = Utilities.leerIntLimites("Si quieres añadir el producto al carrito escribe 1 o si quieres volver atras escribe 0", 0, 1);
        if (iComprar == 1) {
            carro.añadirAlCarro(pc);
            System.out.println("Gracias por añadir " + pc.getClass().getSimpleName() + " " + pc.getMarca());
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

    private static void menuPersonalizar(){
        ArrayList<Producto> pcs = new ArrayList<>();
        for (Producto p : carro.getCarro()) {
            if(p instanceof PC){
                pcs.add(p);
            }
        }
        if(pcs.size() == 0){
            System.out.println("No tienes ordenadores para personalizar.");
            menuMain();
        }
        else{
            System.out.println("Escoge el ordenador que quieras personalizar.");
            for (int i = 0; i < pcs.size(); i++) {
                System.out.println(i + " " + pcs.get(i));
            }
            int pcAPersonalizar = Utilities.leerIntLimites("Escribe el indice del pc o -1 para volver atrás", -1,pcs.size()-1);
            if(pcAPersonalizar != -1){
                personalizarOdenador((accionesPC) pcs.get(pcAPersonalizar));
            }
            else{
                menuMain();
            }
        }
    }

    private static void personalizarOdenador(accionesPC pc){
        Componente componenteACambiar;
        Componente nuevoComponente;
        System.out.println("Elige el componente que quieras cambiar");
        for (int i = 0; i < ((PC) pc).getComponentesPC().size(); i++) {
            System.out.println(i + " " + ((PC) pc).getComponentesPC().get(i));
        }
        int indice1 = Utilities.leerIntLimites("Escribe el índice del componente o -1 para volver atrás", -1, ((PC) pc).getComponentesPC().size() - 1);
        if(indice1 != -1){
            System.out.println("Elige un nuevo componente");
            for (int i = 0; i < Tienda.tienda.getComponentes().size(); i++) {
                if(((PC) pc).getComponentesPC().get(indice1).getClass() == Tienda.tienda.getComponentes().get(i).getClass())
                System.out.println(i + " " + Tienda.tienda.getComponentes().get(i));
            }
            int indice2 = Utilities.leerIntLimites("Escribe el índice del nuevo componente o -1 para volver atrás", -1, Tienda.tienda.getComponentes().size() - 1);
            if(indice2 != -1 ){
                nuevoComponente = (Componente) Tienda.tienda.getComponentes().get(indice2);
                if(!pc.cambiarPieza(indice1, nuevoComponente)){
                    System.out.println("ERROR. Los componentes no son del mismo tipo.");
                    menuPersonalizar();
                }
            }
            menuPersonalizar();
        }
        else{
            menuPersonalizar();
        }
    }
}
