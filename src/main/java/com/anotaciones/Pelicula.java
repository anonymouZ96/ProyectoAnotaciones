package com.anotaciones;

public class Pelicula {
    private String titulo;
    private String anio;
    private String genero;

    public Pelicula() {
    }

    public Pelicula(String titulo, String anio, String genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
    }
    

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio() {
        return this.anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", anio='" + getAnio() + "'" +
            ", genero='" + getGenero() + "'" +
            "}";
    }


}