package com.edugen.edugen_api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.edugen.edugen_api.models.Contenido;
import com.edugen.edugen_api.dto.ContenidoDTO;





@RestController 
@RequestMapping("/api/contenidos")
public class ContenidoController {

    //@RequestMapping(path = "contenidos", method = RequestMethod.GET)
    // TODO: devolver contenidoDTO para no exponer la contraseña
    @GetMapping("")
    public List<Contenido> devolverLista(){
        Contenido contenido1 = new Contenido(1, "titulo", "test", "2");
        List<Contenido> respuesta = new ArrayList<>();
        respuesta.add(contenido1);
        return respuesta;
    }

    @GetMapping("/destacado")
    public Contenido devolverDestacado(){
        Contenido destacado = new Contenido(2, "destacado", "test", "2");
        return destacado;
    }

    @GetMapping("/DTO")
    public List<ContenidoDTO> devolverDTO(){
        ContenidoDTO contenido1 = new ContenidoDTO("titulo", "2");
        ContenidoDTO contenido2 = new ContenidoDTO("titulo2", "3");
        List<ContenidoDTO> respuesta = new ArrayList<>();
        respuesta.add(contenido1);
        respuesta.add(contenido2);
        return respuesta;
    }

}

