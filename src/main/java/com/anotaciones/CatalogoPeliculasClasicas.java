package com.anotaciones;

import javax.annotation.PostConstruct;

public class CatalogoPeliculasClasicas extends CatalogoPeliculas {
    
    @PostConstruct      //En lugar de utilizar 'init' digo que se inicie a través de esta anotación
    public void inicio() {
        this.peliculas.add(new Pelicula("El día de mañana", "1995", "Naturaleza"));
        this.peliculas.add(new Pelicula("La guerra de las galaxias", "1977", "Ciencia ficción"));
        this.peliculas.add(new Pelicula("La lista de Schindler", "1993", "Drama"));
        this.peliculas.add(new Pelicula("El Padrino", "1972", "Drama"));
        this.peliculas.add(new Pelicula("Apocalypse Now", "1979", "Bélico"));
        this.peliculas.add(new Pelicula("Gladiator", "2000", "Acción"));
        this.peliculas.add(new Pelicula("El Gran Dictador", "1940", "Comedia"));
    }

}