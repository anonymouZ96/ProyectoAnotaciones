package com.anotaciones;

// import org.springframework.beans.factory.annotation.Qualifier;

// import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//Se emplea esta anotación para que esta clase sea candidata en lugar de declararse como bean en el XML
public class PeliculaDAOImplMemory implements PeliculaDAO {

    private List<Pelicula> peliculas;
    
    // @Autowired
    // private Set<CatalogoPeliculas> catalogoPeliculas;

    @Autowired
    // @Qualifier("catalogoActuales")
    @Epoca("clasicas")
    private CatalogoPeliculas catalogoPeliculas;

    public PeliculaDAOImplMemory() {
        this.peliculas = new ArrayList<>();
    }

    @Override
    public Pelicula findById(int id) {
        return this.peliculas.get(id);
    }

    @Override
    public Collection<Pelicula> findAll() {
        return this.peliculas;
    }

    @Override
    public void insert(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }

    @Override
    public void delete(Pelicula pelicula) {
        this.peliculas.remove(pelicula);

    }

    @Override
    public void edit(Pelicula antigua, Pelicula nueva) {
        this.peliculas.remove(antigua);
        this.peliculas.add(nueva);
    }

    // public void init() {
    //     this.insert(new Pelicula("La guerra de las galaxias", "1977", "Ciencia ficción"));
    //     this.insert(new Pelicula("La lista de Schindler", "1993", "Drama"));
    //     this.insert(new Pelicula("El Padrino", "1972", "Drama"));
    //     this.insert(new Pelicula("Apocalypse Now", "1979", "Bélico"));
    //     this.insert(new Pelicula("Gladiator", "2000", "Acción"));
    //     this.insert(new Pelicula("El Gran Dictador", "1940", "Comedia"));
    // }

    // public void init() {
    //     for (CatalogoPeliculas c: catalogoPeliculas) {
    //         peliculas.addAll(c.getPeliculas());
    //     }
    // }

    public void init() {
        peliculas.addAll(catalogoPeliculas.getPeliculas());
    }

}