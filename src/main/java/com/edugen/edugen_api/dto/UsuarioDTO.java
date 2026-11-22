package com.edugen.edugen_api.dto;

public class UsuarioDTO {
    private String nombre, email, rol;
    private long id;

    public UsuarioDTO(long id, String nombre, String email, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
