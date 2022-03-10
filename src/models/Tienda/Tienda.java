package models.Tienda;

import models.ProductoPackage.Categorias.ComponentesPackage.DiscoDuro;
import models.ProductoPackage.Categorias.ComponentesPackage.MemoriaGrafica;
import models.ProductoPackage.Categorias.ComponentesPackage.PlacaBase;
import models.ProductoPackage.Categorias.Perifericos.Auricular;
import models.ProductoPackage.Categorias.Perifericos.Mouse;
import models.ProductoPackage.Categorias.Perifericos.Pantalla;
import models.ProductoPackage.Categorias.Perifericos.Teclado;

public class Tienda {

    private void initComponentes(){





        //CREAR 2 COMPNENTES DE CADA TIPO
    }
    private void initPC(){
        //hacer 2 portatiles
        //hacer 2 sobremesa

    }
    private void initPerifericos(){
        //CREAR 2 COMPONENTES DE CADA TIPO
        Auricular auricular1 = new Auricular(60.35f, "Facilitará tus comunicaciones con un uso sencillo gracias a su tecnología Plug&Play: conéctalo a tu ordenador y ya podrás empezar a chatear", "Sony", true,120, true, false, false);
        Auricular auricular2 = new Auricular(48.50f, "Disfruta de llamadas claras con una simple conexión USB y un micrófono con supresión de ruido. Mediante controles integrados en el cable se puede controlar el volumen o silenciarlo sin interrumpir la llamada en curso.", "Logitech", false, 140, true, false, true);

        Mouse mouse1 = new Mouse(29.90f, "Es un ratón inalámbrico para gaming LIGHTSPEED diseñado para un rendimiento excelente con las innovaciones tecnológicas más recientes a un precio asequible.", "Logitech", true, true, 12000, true, 4);
        Mouse mouse2 = new Mouse(44.89f, "Sea cual sea tu estilo de gaming, puedes ajustar el raton fácilmente según tus requisitos de uso, con perfiles personalizados para tus juegos,", "Logitech", true, true, 25600, true, 6);

        Pantalla pantalla1 = new Pantalla(199.99f, "Equipado con una espectacular resolución 4K y HDR, garantiza imágenes con increíble nitidez y riqueza de detalles.", "Benq", false, 27, "HDR", 1, 60);
        Pantalla pantalla2 = new Pantalla(169.45f, "Destaca el rendimiento de las pantallas de cristal líquido. Se acortan los tiempos de respuesta, se mejora la reproducción del color y los usuarios pueden ver la pantalla en ángulos amplios.", "LG", false, 24, "IPS", 1, 144);

        Teclado teclado1 = new Teclado(19.99f, "Cuenta con fiable conexión inalámbrica hasta a 10 metros de distancia, que comparten un minúsculo receptor USB. Sin líos de emparejamiento ni de instalación de software.", "Logitech", true, false, false, true);
        Teclado teclado2 = new Teclado(29.98f, "Puedes personalizar con millones de colores y hasta 10 efectos de luz pre-definidos en 6 zonas.", "MSI", false, false, true, true);

    }
}
