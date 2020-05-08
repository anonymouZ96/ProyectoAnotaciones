package com.anotaciones;

import java.util.ArrayList;
import java.util.List;

public class CatalogoPeliculas {
    
    List<Pelicula> peliculas;

    public CatalogoPeliculas() {
        this.peliculas = new ArrayList<>();
    }

    public List<Pelicula> getPeliculas() {
        return this.peliculas;
    }
}