package com.edugen.edugen_api.models;

public class Usuario {
    private String nombre, email, rol, password;
    private long id;

    public Usuario(long id, String nombre, String email, String rol, String password) {
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
        this.id = id;
        this.password=password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
