package com.edugen.edugen_api.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.edugen.edugen_api.models.Usuario;

@RestController 
@RequestMapping("/api/usuarios")
public class UsuarioController {

    //@RequestMapping(path = "contenidos", method = RequestMethod.GET)
    @GetMapping("")
    public List<Usuario> devolverLista(){
        Usuario u1 = new Usuario(1, "pedro", "test", "alumno");
        Usuario u2 = new Usuario(2, "jose", "test", "profesor");
        Usuario u3 = new Usuario(3, "juan", "test", "alumno");
        
        List<Usuario> respuesta = new ArrayList<>();
        respuesta.add(u1);
        respuesta.add(u2);
        respuesta.add(u3);
        return respuesta;
    }

}