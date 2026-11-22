package com.edugen.edugen_api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.edugen.edugen_api.models.Contenido;





@RestController 
@RequestMapping("/api/contenidos")
public class ContenidoController {

    //@RequestMapping(path = "contenidos", method = RequestMethod.GET)
    @GetMapping("")
    
    

    public List<Contenido> devolverLista(){
        Contenido contenido1 = new Contenido(1, "titulo", "test", "2");
        List<Contenido> respuesta = new ArrayList<>();
        respuesta.add(contenido1);
        return respuesta;
    }

}
