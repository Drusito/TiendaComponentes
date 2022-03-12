package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.Componente;
import models.ProductoPackage.Categorias.ComponentesPackage.DiscoDuro;
import models.ProductoPackage.Categorias.ComponentesPackage.RAM;

import java.util.ArrayList;

public interface accionesPC {
    void montarPc(ArrayList<Componente> componentes);

    void cambiarPieza(Componente componenteCambio);
//
//    boolean addRam(RAM ram);
//
//    boolean addDiscoDuro(DiscoDuro discoDuro);
}
