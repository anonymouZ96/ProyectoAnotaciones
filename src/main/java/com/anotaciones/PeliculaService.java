package com.anotaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
// import org.springframework.stereotype.Service;

// @Service
// Podemos emplear esta anotación para ahorrarnos declarar el bean en el XML, además de especficar más la
// funcionalidad de esta clase que utilizando simplemente @Component
public class PeliculaService {
    
    // @Autowired
    private PeliculaDAO peliculaDAO;

    // @Autowired
    // public PeliculaService(PeliculaDAO peliculaDAO) {
    //     this.peliculaDAO = peliculaDAO;
    // }

    @Required
    @Autowired
    public void setPeliculaDAO(PeliculaDAO peliculaDAO) {
        this.peliculaDAO = peliculaDAO;
    }

    public List<Pelicula> pelisPorGenero(String genero) {
        return this.peliculaDAO
                    .findAll()
                    .stream()
                    .filter(p -> p.getGenero().equalsIgnoreCase(genero))
                    .collect(Collectors.toCollection(ArrayList::new));
    }

}