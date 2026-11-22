package com.edugen.edugen_api.dto;

public class ContenidoDTO {
    private String titulo, nivel;

    public ContenidoDTO(String titulo, String nivel) {
        this.titulo = titulo;
        this.nivel = nivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
