package com.anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        PeliculaService peliculaService;
        ApplicationContext appContext;
        appContext = new ClassPathXmlApplicationContext("beans.xml");
        peliculaService = appContext.getBean(PeliculaService.class);
        peliculaService.pelisPorGenero("Naturaleza").forEach(System.out::println);
        ((ClassPathXmlApplicationContext) appContext).close();
    }
}
