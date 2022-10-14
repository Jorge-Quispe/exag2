package com.example.exag2.service;

public class apis {
    public static final String URL_001="http://192.168.1.4:3000/libros/";
    public static final String URL_002="http://172.17.7.4:3000/editorial/";

    public static com.example.exag2.service.LibroService getLibroService(){
        return  Cliente.getClient(URL_001).create(com.example.exag2.service.LibroService.class);
    }
    public static com.example.exag2.service.EditorialService getEditorialService(){
        return  Cliente.getClient(URL_002).create(com.example.exag2.service.EditorialService.class);
    }
}
