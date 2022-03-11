package models.ProductoPackage.Categorias.PCPackage;

import models.ProductoPackage.Categorias.ComponentesPackage.Componente;

import java.util.ArrayList;

public interface accionesPC {
    ArrayList<Componente> montarPc(ArrayList<Componente> componentes);
    Componente cambiarPieza(Componente componenteCambio);
}
