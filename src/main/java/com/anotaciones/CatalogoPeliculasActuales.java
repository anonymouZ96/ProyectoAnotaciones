package com.anotaciones;

// import org.springframework.stereotype.Repository;

// @Repository("actuales")
// Al igual que empleamos el @Qualifier en el XML para definirla como actual podemos emplear esta eqtiqueta
public class CatalogoPeliculasActuales extends CatalogoPeliculas {
    
    public void init() {
        this.peliculas.add(new Pelicula("2012", "2012", "Naturaleza"));
        this.peliculas.add(new Pelicula("Le Mans", "2017", ""));
    }

}