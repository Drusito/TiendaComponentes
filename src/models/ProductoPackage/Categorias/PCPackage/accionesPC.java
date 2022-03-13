package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.Componente;
import models.ProductoPackage.Categorias.ComponentesPackage.DiscoDuro;
import models.ProductoPackage.Categorias.ComponentesPackage.RAM;

import java.util.ArrayList;

public interface accionesPC {
    void montarPc(ArrayList<Componente> componentes);

    boolean cambiarPieza(int componenteACambiar, Componente nuevoComponente);
//
//    boolean addRam(RAM ram);
//
//    boolean addDiscoDuro(DiscoDuro discoDuro);
}
