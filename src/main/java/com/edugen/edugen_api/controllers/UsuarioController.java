package com.edugen.edugen_api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edugen.edugen_api.dto.UsuarioDTO;
import com.edugen.edugen_api.models.Usuario;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private List<Usuario> crearUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1, "pedro", "pedro@edugen.com", "alumno", "aaa"));
        usuarios.add(new Usuario(2, "jose", "jose@edugen.com", "profesor", "bbb"));
        usuarios.add(new Usuario(3, "juan", "juan@edugen.com", "alumno", "ccc"));
        return usuarios;
    }

    @GetMapping
    public List<UsuarioDTO> devolverLista() {
        List<UsuarioDTO> respuesta = new ArrayList<>();
        for (Usuario u : crearUsuarios()) {
            respuesta.add(new UsuarioDTO(u));
        }
        return respuesta;
    }

    @GetMapping("/primero")
    public UsuarioDTO devolverPrimero() {
        return new UsuarioDTO(crearUsuarios().get(0));
    }
}