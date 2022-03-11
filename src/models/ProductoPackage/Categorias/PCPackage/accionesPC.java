package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.Componente;

import java.util.ArrayList;

public interface accionesPC {
    void montarPc(ArrayList<Componente> componentes);
    void cambiarPieza(Componente componente);
}
