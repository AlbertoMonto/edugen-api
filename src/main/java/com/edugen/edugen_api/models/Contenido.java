package com.edugen.edugen_api.models;



public class Contenido {
    private long id;
    private String titulo, tipo, nivel;


    public Contenido(long id, String titulo, String tipo, String nivel) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.nivel = nivel;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getNivel() {
        return nivel;
    }


    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    
    

}



