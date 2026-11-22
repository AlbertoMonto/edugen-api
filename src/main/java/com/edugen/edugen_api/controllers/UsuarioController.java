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

    //@RequestMapping(path = "contenidos", method = RequestMethod.GET)

    // TODO: devolver UsuarioDTO para no exponer la contraseña
    @GetMapping("")
    public List<Usuario> devolverLista(){
        Usuario u1 = new Usuario(1, "pedro", "test", "alumno", "aaa");
        Usuario u2 = new Usuario(2, "jose", "test", "profesor", "bbb");
        Usuario u3 = new Usuario(3, "juan", "test", "alumno", "ccc");
        
        List<Usuario> respuesta = new ArrayList<>();
        respuesta.add(u1);
        respuesta.add(u2);
        respuesta.add(u3);
        return respuesta;
    }

    @GetMapping("/pruebaDTO")
    public UsuarioDTO devolverDTO(){
        Usuario u1 = new Usuario(1, "pedro", "test", "alumno", "aaa");
        UsuarioDTO respuesta = new UsuarioDTO(u1.getId(), u1.getNombre(), u1.getEmail(), u1.getRol());
        
        return respuesta;
    }
    

}