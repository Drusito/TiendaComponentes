package models.Tienda;

import java.util.ArrayList;

import models.ProductoPackage.Categorias.ComponentesPackage.Componente;
import models.ProductoPackage.Categorias.ComponentesPackage.DiscoDuro;
import models.ProductoPackage.Categorias.ComponentesPackage.MemoriaGrafica;
import models.ProductoPackage.Categorias.ComponentesPackage.PlacaBase;
import models.ProductoPackage.Categorias.ComponentesPackage.Procesador;
import models.ProductoPackage.Categorias.ComponentesPackage.RAM;
import models.ProductoPackage.Categorias.Perifericos.Auricular;
import models.ProductoPackage.Categorias.Perifericos.Mouse;
import models.ProductoPackage.Categorias.Perifericos.Pantalla;
import models.ProductoPackage.Categorias.Perifericos.Periferico;
import models.ProductoPackage.Categorias.Perifericos.Teclado;
import models.ProductoPackage.Categorias.PCPackage.Portatil;
import models.ProductoPackage.Categorias.PCPackage.PC;

public class Tienda {
    ArrayList<Componente> componentes;
    ArrayList<PC> pcs;
    ArrayList<Periferico> perifericos;

    private Tienda() {
        this.componentes = new ArrayList<>();
        this.pcs = new ArrayList<>();
        this.perifericos = new ArrayList<>();
    }

    private void initComponentes() {
        this.componentes.add(new DiscoDuro(87.10f,
                "Es un solución para el almacenamiento sustancial que ofrece velocidades de lectura/escritura1 de hasta 2.100/1.700 MB/s, que entre triplica y cuadriplica la de los discos SSD basados en SATA",
                "Kingston", 1000, true, "SSD", 1700));
        DiscoDuro disco2 = new DiscoDuro(35.90f,
                "Versátiles. Rápidos. Fiables. La unidad de disco duro más increíble que haya conocido.", "Seagate",
                500, true, "Sata", 275);

        MemoriaGrafica memoria1 = new MemoriaGrafica(2199.94f,
                "Ofrecen el máximo rendimiento para jugadores y creadores. Con tecnología de Ampere, la arquitectura RTX de la segunda generación de NVIDIA, con nuevos núcleos RT y Tensor y multiprocesadores de streaming para los gráficos de trazado de rayos más realistas y las funciones de inteligencia artificial más innovadoras.",
                "Nvidia", 12);
        MemoriaGrafica memoria2 = new MemoriaGrafica(1348.73f,
                "Diseñada para brindar un rendimiento ultra alto, una resolución ultra alta y juegos visualmente impresionantes para todos. Estamos impulsando la próxima generación de juegos.",
                "AMD", 12);

        PlacaBase placa1 = new PlacaBase(449.43f,
                "Ofrece suministro de energía y enfriamiento de primera calidad para liberar toda la fuerza de los procesadores Intel® Core ™ de 12.ª generación.",
                "Asus", 4, 4, 2, true, 2, 1, true, true);
        PlacaBase placa2 = new PlacaBase(561.23f,
                "Ofrece ofrece controles exhaustivos de iluminación RGB, así como efectos para los LED integrados y las tiras LED que conectes a los conectores RGB de la placa.",
                "Asus", 2, 2, 2, true, 2, 1, true, true);

        Procesador cpu1 = new Procesador(669.89f, "Un procesador que permite jugar así como crear.", "AMD", 16, 3.4f);
        Procesador cpu2 = new Procesador(299.90f,
                "Ofrece mejoras de rendimiento notables para conseguir una productividad mejorada y un entretenimiento impresionante",
                "Intel", 16, 5.1f);

        RAM ram1 = new RAM(37.30f,
                "Ofrece un potente aumento de rendimiento para juegos, edición de vídeo y renderización con velocidades de hasta 3733 MHz",
                "Kingston", 8);
        RAM ram2 = new RAM(76.15f,
                "El disipador de calor, fabricado en aluminio puro, permite una disipación térmica más rápida; la placa impresa de ocho capas administra el calor y proporciona una capacidad superior para incrementar el overclocking.",
                "Corsair", 16);

        // CREAR 2 COMPNENTES DE CADA TIPO
    }

    private void initPC() {
        // hacer 2 portatiles
        // hacer 2 sobremesa

    }

    private void initPerifericos() {
        // CREAR 2 COMPONENTES DE CADA TIPO

        Mouse mouse1 = new Mouse(29.90f, "Es un ratón inalámbrico para gaming LIGHTSPEED diseñado para un rendimiento excelente con las innovaciones tecnológicas más recientes a un precio asequible.", "Logitech", true, 4, true, 15000,(short)5);
        Mouse mouse2 = new Mouse(44.89f, "Sea cual sea tu estilo de gaming, puedes ajustar el raton fácilmente según tus requisitos de uso, con perfiles personalizados para tus juegos.", "Logitech", true, 6,true, 25000,(short)7);
        Auricular auricular1 = new Auricular(60.35f,
                "Facilitará tus comunicaciones con un uso sencillo gracias a su tecnología Plug&Play: conéctalo a tu ordenador y ya podrás empezar a chatear",
                "Logitech", false, true, true);
        Auricular auricular2 = new Auricular(48.50f,
                "Disfruta de llamadas claras con una simple conexión USB y un micrófono con supresión de ruido. Mediante controles integrados en el cable se puede controlar el volumen o silenciarlo sin interrumpir la llamada en curso.",
                "Logitech", false, true, true);
        /*
         * Mouse mouse1 = new Mouse(29.90f,
         * "Es un ratón inalámbrico para gaming LIGHTSPEED diseñado para un rendimiento excelente con las innovaciones tecnológicas más recientes a un precio asequible."
         * , "Logitech", true, 4, true, 15000,5);
         * Mouse mouse2 = new Mouse(44.89f,
         * "Sea cual sea tu estilo de gaming, puedes ajustar el raton fácilmente según tus requisitos de uso, con perfiles personalizados para tus juegos."
         * , "Logitech", true, 6,true, 25000,7);
         */
        Pantalla pantalla1 = new Pantalla(199.99f,
                "Equipado con una espectacular resolución 4K y HDR, garantiza imágenes con increíble nitidez y riqueza de detalles.",
                "Benq", false, 27, 1920, 1080, 16, true);
        Pantalla pantalla2 = new Pantalla(169.45f,
                "Destaca el rendimiento de las pantallas de cristal líquido. Se acortan los tiempos de respuesta, se mejora la reproducción del color y los usuarios pueden ver la pantalla en ángulos amplios.",
                "LG", false, 24, 3840, 2160, 16, true);

        Teclado teclado1 = new Teclado(19.99f,
                "Cuenta con fiable conexión inalámbrica hasta a 10 metros de distancia, que comparten un minúsculo receptor USB. Sin líos de emparejamiento ni de instalación de software.",
                "Logitech", true, true, true);
        Teclado teclado2 = new Teclado(29.98f,
                "Puedes personalizar con millones de colores y hasta 10 efectos de luz pre-definidos en 6 zonas.",
                "MSI", false, true, true);

    }
}
